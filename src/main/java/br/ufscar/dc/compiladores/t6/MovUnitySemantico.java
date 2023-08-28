package br.ufscar.dc.compiladores.t6;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.adicionarErroSemantico;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.adicionarErro;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosTeclado;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarTemplate;
import static br.ufscar.dc.compiladores.t6.TabelaDeValores.RetornarAtributoFaltando;
import static br.ufscar.dc.compiladores.t6.TabelaDeValores.VerificarTabela;
import java.util.HashMap;
import java.util.List;

public class MovUnitySemantico extends MovUnityBaseVisitor {
    HashMap<String, String> tabela;
    
    @Override
    public Object visitGameobject(MovUnityParser.GameobjectContext ctx) {
        String template = verificarTemplate(ctx.templates());
        if(template.equals("")) 
            adicionarErroSemantico(ctx.templates().getStart(),"Template não declarado");
        
        if(template.equals("side-scrolling")) 
        {
            tabela = TabelaDeValores.TemplateSideScrolling();
        }
        else if(template.equals("top-down"))
        {
            tabela = TabelaDeValores.TemplateTopDown();
        }
        tabela.put("nome", ctx.NOME().getText());
        
        return super.visitGameobject(ctx); 
    }

    @Override
    public Object visitDef_atributos(MovUnityParser.Def_atributosContext ctx) {
        // Velocidade é o único atributo obrigatório
        String vel = ctx.vel.getText();
        tabela.put("velocidade", vel);
        
        // TESTES COM OS ATRIBUTOS NUMÉRICOS
        
        if(!ctx.GRAVIDADE().isEmpty()){
            if(tabela.get("template").equals("top-down")){
                adicionarErroSemantico(ctx.GRAVIDADE().get(0).getSymbol(), "O template escolhido não possui o atributo gravidade");
            }
            else if(ctx.GRAVIDADE().size() > 1){
                adicionarErroSemantico(ctx.GRAVIDADE().get(1).getSymbol(), "O atributo gravidade já foi definido");
            }
            else{
                String grav = ctx.grav.getText();
                tabela.put("gravidade", grav);
            }
        }
       
        
        if(!ctx.ACELERACAO().isEmpty()){
            if(ctx.ACELERACAO().size() > 1){
                adicionarErroSemantico(ctx.ACELERACAO().get(1).getSymbol(), "O atributo aceleracao já foi definido");
            }
            else if(ctx.controles().CONTROLES().getText().equals("mouse")){
                adicionarErroSemantico(ctx.ACELERACAO().get(1).getSymbol(), "O atributo aceleracao não funciona com esse tipo de controle");
            }
            else{
                String ac = ctx.ac.getText();
                tabela.put("aceleracao", ac);
            }
        }
        
        if(!ctx.DESACELERACAO().isEmpty()){
            if(ctx.DESACELERACAO().size() > 1){
                adicionarErroSemantico(ctx.DESACELERACAO().get(1).getSymbol(), "O atributo desaceleracao já foi definido");
            }
            else if(ctx.controles().CONTROLES().getText().equals("mouse")){
                adicionarErroSemantico(ctx.DESACELERACAO().get(1).getSymbol(), "O atributo desaceleracao não funciona para esse tipo de controle");
            }
            else{
                String desac = ctx.desac.getText();
                tabela.put("desaceleracao", desac);
            }
        }
        
        if(!ctx.PULOIMPULSO().isEmpty()){
            if(ctx.PULOIMPULSO().size() > 1){
                adicionarErroSemantico(ctx.PULOIMPULSO().get(1).getSymbol(), "O atributo puloImpulso já foi definido");
            }
            else if(tabela.get("template").equals("top-down")){
                adicionarErroSemantico(ctx.PULOIMPULSO().get(0).getSymbol(), "O template escolhido não possui o atributo puloImpulso");
            }else{
                String puloIm = ctx.puloIm.getText();
                tabela.put("puloImpulso", puloIm);
            }
        }
        
        if(!ctx.CORRIDAVEL().isEmpty()){
            if(ctx.CORRIDAVEL().size() > 1){
                adicionarErroSemantico(ctx.CORRIDAVEL().get(1).getSymbol(), "O atributo corridaVelocidade já foi definido");
            }
            else{
                String corrvel = ctx.corrvel.getText();
                tabela.put("corridaVelocidade", corrvel);
                tabela.put("corridaControle", "");
            }
        }
        
        if(!ctx.ESQUIVAVEL().isEmpty() || !ctx.ESQUIVADUR().isEmpty() || !ctx.ESQUIVAESP().isEmpty()){
            tabela.put("esquivaVelocidade", "");
            tabela.put("esquivaDuracao", "");
            tabela.put("esquivaEspera", "");
            tabela.put("esquivaControle", "");
        }
        
        if(!ctx.ESQUIVAVEL().isEmpty()){
            if(ctx.ESQUIVAVEL().size() > 1){
                adicionarErroSemantico(ctx.ESQUIVAVEL().get(1).getSymbol(), "O atributo esquivaVelocidade já foi definido");
            }
            else{
                String esqvel = ctx.esqvel.getText();
                tabela.put("esquivaVelocidade", esqvel);
            }
        }
        
        if(!ctx.ESQUIVADUR().isEmpty()){
            if(ctx.ESQUIVADUR().size() > 1){
                adicionarErroSemantico(ctx.ESQUIVADUR().get(1).getSymbol(), "O atributo esquivaDuracao já foi definido");
            }
            else{
                String esqdur = ctx.esqdur.getText();
                tabela.put("esquivaDuracao", esqdur);
            }
        }
        
        if(!ctx.ESQUIVAESP().isEmpty()){
            if(ctx.ESQUIVAESP().size() > 1){
                adicionarErroSemantico(ctx.ESQUIVAESP().get(1).getSymbol(), "O atributo esquivaEspera já foi definido");
            }
            else{
                String esqesp = ctx.esqesp.getText();
                tabela.put("esquivaEspera", esqesp);
            }
        }
        
        return super.visitDef_atributos(ctx);
    }

    @Override
    public Object visitAttr_mouse(MovUnityParser.Attr_mouseContext ctx) {
        String modo = verificarModosMouse(ctx.modos_mouse());
        tabela.put("modo", modo);
        if(modo.equals("clique")){
            if(ctx.BOTAO() != null){
                tabela.put("botao", verificarBotoesMouse(ctx.botoes_mouse()));
            }
        }
        
        if(tabela.containsKey("esquivaControle") || tabela.containsKey("corridaControle")){
            String erro = "Não é possível atribuir ";
            if(tabela.containsKey("esquivaControle"))
                erro += "'esquiva' ";
            if(tabela.containsKey("corridaControle"))
                erro += "'corrida' ";
            erro += "para o tipo de controle mouse";
            
            adicionarErro(erro);
        }
           
        if(!VerificarTabela(tabela)){
            adicionarErro("Atributo "+RetornarAtributoFaltando(tabela)+" não declarado");
        }
        
        return super.visitAttr_mouse(ctx); 
    }
    
    

    
 
    @Override
    public Object visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx) {
        String template = tabela.get("template");
        tabela.put("modo", verificarModosTeclado(ctx.modos_teclado()));
        

        if(!ctx.DIAGONAL().isEmpty()){
            if(ctx.DIAGONAL().size() > 1){
                adicionarErroSemantico(ctx.DIAGONAL().get(1).getSymbol(), "O atributo diagonal já foi definido");
            }
            else{
                tabela.put("diagonal", ctx.parcela_logica().get(0).getText());
            }
        }
            
        if(!ctx.PULOCONTROLE().isEmpty()){
            if(ctx.PULOCONTROLE().size() > 1){
                adicionarErroSemantico(ctx.PULOCONTROLE().get(1).getSymbol(), "O atributo puloControle já foi definido");
            }
            else{
                tabela.put("puloControle", ctx.pulo.getText());
            }
        }
        
        if(!ctx.CORRIDACON().isEmpty()){
            if(ctx.CORRIDACON().size() > 1){
                adicionarErroSemantico(ctx.CORRIDACON().get(1).getSymbol(), "O atributo corridaControle já foi definido");
            }
            else{
                tabela.put("corridaControle", ctx.corrida.getText());
                if(!tabela.containsKey("corridaVelocidade"))
                    adicionarErroSemantico(ctx.getStart(),"Atribulo corridaVelocidade não declarado");
            }
        }
        
        if(!ctx.ESQUIVACON().isEmpty()){
            if(ctx.ESQUIVACON().size() > 1){
                adicionarErroSemantico(ctx.ESQUIVACON().get(1).getSymbol(), "O atributo esquivaControle já foi definido");
            }
            else{
                tabela.put("esquivaControle", ctx.esquiva.getText());
                if(!tabela.containsKey("esquivaVelocidade") && 
                !tabela.containsKey("esquivaDuracao") && 
                !tabela.containsKey("esquivaEspera")){
                    adicionarErroSemantico(ctx.getStart(),"Atribulo esquivaVelocidade não declarado");
                    adicionarErroSemantico(ctx.getStart(),"Atribulo esquivaDuracao não declarado");
                    adicionarErroSemantico(ctx.getStart(),"Atribulo esquivaEspera não declarado");
                }
            }
        }
        
        if(template.equals("side-scrolling") && tabela.containsKey("diagonal"))
            adicionarErroSemantico(ctx.parcela_logica().get(0).getStart(),"Atribulo diagonal não pertence a este template");
                
               
        
        
        if(!VerificarTabela(tabela)){
            adicionarErroSemantico(ctx.getStart(),"Atribulo "+RetornarAtributoFaltando(tabela)+" não declarado");
        }
        
        return super.visitAttr_teclado(ctx);
    }


   
    
}
