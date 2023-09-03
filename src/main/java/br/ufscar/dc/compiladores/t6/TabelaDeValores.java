package br.ufscar.dc.compiladores.t6;


import java.util.HashMap;

public class TabelaDeValores {
    public static HashMap<String, String> TemplateTopDown(){
        //Valores que precisam ter caso escolha o template TOP-DOWN
        HashMap<String, String> tabela = new HashMap<>();
        tabela.put("template", "top-down");
        tabela.put("nome", null);
        tabela.put("velocidade", null);
        tabela.put("modo", null);
        tabela.put("cima", null);
        tabela.put("baixo", null);
        tabela.put("esquerda", null);
        tabela.put("direita", null);
        tabela.put("diagonal", "verdadeiro");
        
        
        return tabela;
    }
    
    public static HashMap<String, String> TemplateSideScrolling(){
        //Valores que precisam ter caso escolha o template SIDE-SCROLLING
        HashMap<String, String> tabela = new HashMap<>();
        tabela.put("template", "side-scrolling");
        tabela.put("nome", null);
        tabela.put("velocidade", null);
        tabela.put("gravidade", null);
        tabela.put("modo", null);
        tabela.put("esquerda", null);
        tabela.put("direita", null);
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

    public static boolean letraJaUsada(HashMap<String, String> tabela, String letra){
        if(tabela.get("puloControle") != null && tabela.get("puloControle").equals(letra)){
            return true;
        }
        if(tabela.get("esquivaControle") != null && tabela.get("esquivaControle").equals(letra)){
            return true;
        }
        if(tabela.get("corridaControle") != null && tabela.get("corridaControle").equals(letra)){
            return true;
        }
        if(tabela.get("cima") != null && tabela.get("cima") != null && tabela.get("cima").equals(letra)){
            return true;
        }
        if(tabela.get("baixo") != null && tabela.get("baixo").equals(letra)){
            return true;
        }
        if(tabela.get("esquerda") != null && tabela.get("esquerda").equals(letra)){
            return true;
        }
        if(tabela.get("direita") != null && tabela.get("direita").equals(letra)){
            return true;
        }
        

        return false;
    }
}