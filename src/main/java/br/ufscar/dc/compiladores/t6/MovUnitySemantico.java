package br.ufscar.dc.compiladores.t6;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.adicionarErroSemantico;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarParcelaLogica;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarTemplate;
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
        
        return super.visitGameobject(ctx); 
    }

    @Override
    public Object visitDef_topdown(MovUnityParser.Def_topdownContext ctx) {
        String vel = ctx.NUM().getText();
        if(parseFloat(vel) <= 0)
            adicionarErroSemantico(ctx.NUM().getSymbol(), "A velocidade só pode assumir valores positivos maiores que 0");
        tabela.put("velocidade", vel);
        
        return super.visitDef_topdown(ctx); 
    }

    @Override
    public Object visitDef_sidescrolling(MovUnityParser.Def_sidescrollingContext ctx) {
        String vel = ctx.vel.getText();
        if(parseFloat(vel) <= 0)
            adicionarErroSemantico(ctx.VELOCIDADE().getSymbol(), "A velocidade só pode assumir valores positivos maiores que 0");
        tabela.put("velocidade", vel);
        
        String grav = ctx.grav.getText();
        if(parseFloat(grav) < 0)
            adicionarErroSemantico(ctx.GRAVIDADE().getSymbol(), "A gravidade só pode assumir valores positivos");
        tabela.put("gravidade", grav);
        
        
        return super.visitDef_sidescrolling(ctx);
    }

    @Override
    public Object visitAttr_mouse(MovUnityParser.Attr_mouseContext ctx) {
        String modo = verificarModosMouse(ctx.modos_mouse());
        tabela.put("modo", modo);
        if(modo.equals("clique")){
            tabela.put("botao", verificarBotoesMouse(ctx.botoes_mouse()));
        }
        
        return super.visitAttr_mouse(ctx); 
    }
    
    

    
 
    @Override
    public Object visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx) {
        String template = tabela.get("template");
        tabela.put("modo", verificarModosTeclado(ctx.modos_teclado()));
        switch(template){
            case "top-down":
                if(ctx.DIAGONAL() != null) 
                    tabela.put("diagonal", verificarParcelaLogica(ctx.parcela_logica()));
            case "side-scrolling":
                if(ctx.PULO() != null)
                    tabela.put("pulo", verificarBotoesTeclado(ctx.botoes_teclado()));
                
        }
        return super.visitAttr_teclado(ctx);
    }


   
    
}
