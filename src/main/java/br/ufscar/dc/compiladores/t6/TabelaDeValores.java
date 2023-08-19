package br.ufscar.dc.compiladores.t6;


import java.util.HashMap;

public class TabelaDeValores {
    public static HashMap<String, String> TemplateTopDown(){
        HashMap<String, String> tabela = new HashMap<>();
        tabela.put("template", "top-down");
        tabela.put("nome", null);
        tabela.put("velocidade", null);
        tabela.put("modo", null);
        tabela.put("diagonal", null);
        
        
        return tabela;
    }
    
    public static HashMap<String, String> TemplateSideScrolling(){
        HashMap<String, String> tabela = new HashMap<>();
        tabela.put("template", "side-scrolling");
        tabela.put("nome", null);
        tabela.put("velocidade", null);
        tabela.put("gravidade", null);
        tabela.put("modo", null);
        tabela.put("puloControle", null);
        tabela.put("puloImpulso", null);
        
        
        return tabela;
    }
    
    
    public static boolean VerificarTabela(HashMap<String, String> tabela){
        for (String value : tabela.values()) {
            if (value == null || value.isEmpty()) {
                return false;
            }
        }
        return true;
    } 
    
    public static String RetornarAtributoFaltando(HashMap<String, String> tabela) {
        for (String atributo : tabela.keySet()) {
            String valor = tabela.get(atributo);
            if (valor == null || valor.isEmpty()) {
                return atributo;
            }
        }
        return null; 
    }
}