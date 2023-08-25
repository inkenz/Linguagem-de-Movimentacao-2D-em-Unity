package br.ufscar.dc.compiladores.t6;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.adicionarErroSemantico;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.adicionarErro;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarParcelaLogica;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarTemplate;
import static br.ufscar.dc.compiladores.t6.TabelaDeValores.RetornarAtributoFaltando;
import static br.ufscar.dc.compiladores.t6.TabelaDeValores.VerificarTabela;
import static java.lang.Float.parseFloat;
import java.util.HashMap;

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
        if(parseFloat(vel) <= 0)
            adicionarErroSemantico(ctx.VELOCIDADE().getSymbol(), "A velocidade só pode assumir valores positivos maiores que 0");
        tabela.put("velocidade", vel);
        
        // TESTES COM OS ATRIBUTOS NUMÉRICOS
        
        if(ctx.GRAVIDADE() != null){
            if(tabela.get("template").equals("top-down")){
                adicionarErroSemantico(ctx.GRAVIDADE().get(0).getSymbol(), "O template escolhido não possui o atributo gravidade");
            }
            else if(ctx.GRAVIDADE().size() > 1){
                adicionarErroSemantico(ctx.GRAVIDADE().get(1).getSymbol(), "O atributo gravidade já foi definido");
            }
            else{
                String grav = ctx.grav.getText();
                if(parseFloat(grav) < 0)
                    adicionarErroSemantico(ctx.GRAVIDADE().get(0).getSymbol(), "O atributo gravidade só pode assumir valores positivos");
                tabela.put("gravidade", grav);
            }
        }
       
        
        if(ctx.ACELERACAO() != null){
            if(ctx.ACELERACAO().size() > 1){
                adicionarErroSemantico(ctx.ACELERACAO().get(1).getSymbol(), "O atributo aceleracao já foi definido");
            }
            else{
                String ac = ctx.ac.getText();
                if(parseFloat(ac) < 0)
                    adicionarErroSemantico(ctx.ACELERACAO().get(0).getSymbol(), "O atributo aceleracao só pode assumir valores positivos");
                tabela.put("aceleracao", ac);
            }
        }
        
        if(ctx.DESACELERACAO() != null){
            if(ctx.DESACELERACAO().size() > 1){
                adicionarErroSemantico(ctx.DESACELERACAO().get(1).getSymbol(), "O atributo desaceleracao já foi definido");
            }
            else{
                String desac = ctx.desac.getText();
                if(parseFloat(desac) < 0)
                    adicionarErroSemantico(ctx.DESACELERACAO().get(0).getSymbol(), "O atributo desaceleracao só pode assumir valores positivos");
                tabela.put("desaceleracao", desac);
            }
        }
        
        if(ctx.PULOIMPULSO() != null){
            if(ctx.PULOIMPULSO().size() > 1){
                adicionarErroSemantico(ctx.PULOIMPULSO().get(1).getSymbol(), "O atributo puloImpulso já foi definido");
            }
            else if(tabela.get("template").equals("top-down")){
                adicionarErroSemantico(ctx.GRAVIDADE().get(0).getSymbol(), "O template escolhido não possui o atributo puloImpulso");
            }else{
                String puloIm = ctx.puloIm.getText();
                if(parseFloat(puloIm) < 0)
                    adicionarErroSemantico(ctx.DESACELERACAO().get(0).getSymbol(), "O atributo puloImpulso só pode assumir valores positivos");
                tabela.put("puloImpulso", puloIm);
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
        
        if(!VerificarTabela(tabela)){
            adicionarErro("Atributo "+RetornarAtributoFaltando(tabela)+" não declarado");
        }
        
        return super.visitAttr_mouse(ctx); 
    }
    
    

    
 
    @Override
    public Object visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx) {
        String template = tabela.get("template");
        tabela.put("modo", verificarModosTeclado(ctx.modos_teclado()));
        

        if(ctx.DIAGONAL() != null) 
            tabela.put("diagonal", verificarParcelaLogica(ctx.parcela_logica()));
        if(ctx.PULOCONTROLE() != null)
            tabela.put("puloControle", verificarBotoesTeclado(ctx.botoes_teclado()));
        
        if(template.equals("side-scrolling") && tabela.containsKey("diagonal"))
            adicionarErroSemantico(ctx.parcela_logica().getStart(),"Atribulo diagonal não pertence a este template");
                
               
        
        
        if(!VerificarTabela(tabela)){
            adicionarErroSemantico(ctx.getStart(),"Atribulo "+RetornarAtributoFaltando(tabela)+" não declarado");
        }
        
        return super.visitAttr_teclado(ctx);
    }


   
    
}
