
package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t6.MovUnityParser;

public class MovUnityVisitorUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) 
    {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    public static String verificarTemplate(MovUnityParser.TemplatesContext ctx)
    {
        if(ctx.SIDESCROLLING() != null){
            return "side-scrolling";
        }
        else if(ctx.TOPDOWN() != null){
            return "top-down";
        }
        
        
        return "";
    }
    
    public static String verificarModosTeclado(MovUnityParser.Modos_tecladoContext ctx)
    {
        if(ctx.WASD() != null){
            return "WASD";
        }
        else if(ctx.FLECHAS() != null){
            return "flechas";
        }
        
        return "";
    }
    
    public static String verificarModosMouse(MovUnityParser.Modos_mouseContext ctx)
    {
        if(ctx.CLIQUE() != null){
            return "clique";
        }
        else if(ctx.SEGUIR() != null){
            return "seguir";
        }
        
        return "";
    }
    
    public static String verificarParcelaLogica(MovUnityParser.Parcela_logicaContext ctx)
    {
        if(ctx.VERDADEIRO() != null){
            return "verdadeiro";
        }
        else if(ctx.FALSO() != null){
            return "falso";
        }
        
        return "";
    }
    
    public static String verificarBotoesTeclado(MovUnityParser.Botoes_tecladoContext ctx)
    {
        if(ctx.ESPACO() != null){
            return "espaco";
        }
        else if(ctx.FLECHA() != null){
            return "flecha";
        }
        else if(ctx.W() != null){
            return "W";
        }
        return "";
    }
    
    
    public static String verificarBotoesMouse(MovUnityParser.Botoes_mouseContext ctx)
    {
        if(ctx.DIREITO() != null){
            return "direito";
        }
        else if(ctx.ESQUERDO() != null){
            return "esquerdo";
        }
       
        return "";
    }
}
