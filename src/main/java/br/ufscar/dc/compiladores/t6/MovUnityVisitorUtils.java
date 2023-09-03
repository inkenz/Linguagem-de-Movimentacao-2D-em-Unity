
package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t6.MovUnityParser;
import java.util.Arrays;

public class MovUnityVisitorUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    private static String[] strTeclas = {"SHIFTESQ", "ESPACO","TAB","ENTER","CTRLESQ"};
    private static List<String> possiveisTeclas = Arrays.asList(strTeclas);
    
    public static void adicionarErroSemantico(Token t, String mensagem) 
    {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    public static void adicionarErro(String mensagem) 
    {
        errosSemanticos.add(String.format("Erro: %s", mensagem));
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
            return "FLECHAS";
        }
        else if(ctx.custom() != null){
            return "CUSTOM";
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
    
    public static String ConverterParaKeyCode(String key)
    {
        return "KeyCode."+key;
    }
    
    public static String ConverterParaKeyCode(MovUnityParser.Botoes_tecladoContext ctx)
    {
        
        if(ctx.LETRA() != null)
            return "KeyCode."+ctx.LETRA().getText();

        String key = ctx.TECLA().getText();
        switch(key)
        {
            case "ESPACO":
                return "KeyCode.Space";
            case "SHIFTESQ":
                return "KeyCode.LeftShift";
            case "TAB":
                return "KeyCode.Tab";
            case "ENTER":
                return "KeyCode.KeypadEnter";
            case "CTRLESQ":
                return "KeyCode.LeftControl";
            case "ALTESQ":
                return "KeyCode.LeftAlt";
            case "ALTDIR":
                return "KeyCode.RightAlt";
            case "SHIFTDIR":
                return "KeyCode.RightShift";
            case "CTRLDIR":
                return "KeyCode.RightControl";
            case "ESC":
                return "KeyCode.Escape";
            default:
                return "ERRO";
        }

       
    }
}
