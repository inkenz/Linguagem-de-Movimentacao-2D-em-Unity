package br.ufscar.dc.compiladores.t6;

import br.ufscar.dc.compiladores.t6.MovUnityParser.GameobjectContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
/*
import br.ufscar.dc.compiladores.t5.LALexer;
import br.ufscar.dc.compiladores.t5.LAParser;
import br.ufscar.dc.compiladores.t5.LAParser.ProgramaContext;
*/
public class MovUnity 
{
    public static void main( String[] args )
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))){
            
            //Recebendo argumentos com arquivos de entrada e saída
            CharStream cs = CharStreams.fromFileName(args[0]);

            MovUnityLexer lex = new MovUnityLexer(cs);
            Boolean lexError = false;
            Token t = null;

            //Montagem do vocabulário
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String nomeToken = MovUnityLexer.VOCABULARY.getDisplayName(t.getType());

                if(nomeToken.equals("ERRO")) {
                    pw.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                    lexError = true;
                    break;
                } else if(nomeToken.equals("COMENTARIO_NAO_FECHADO")) {
                    pw.println("Linha "+t.getLine()+": comentario nao fechado");
                    lexError = true;
                    break;
                } else if(nomeToken.equals("CHAVE_NAO_FECHADA")){
                    pw.println("Linha "+t.getLine()+": chave nao fechada");
                    lexError = true;
                } else if(nomeToken.equals("NEGATIVO")){
                    pw.println("Linha "+t.getLine()+": valor negativo");
                    lexError = true;
                }/*else {
                    pw.println("<'" + t.getText() + "'," + nomeToken + ">");
                } */
               
            }
            
            //Análise Sintática após verificação Léxica
            if(!lexError){
                cs = CharStreams.fromFileName(args[0]);

                lex = new MovUnityLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lex);
                MovUnityParser parser = new MovUnityParser(tokens);

                parser.removeErrorListeners();
                MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
                parser.addErrorListener(mcel);

                parser.gameobject();
            }
           
            cs = CharStreams.fromFileName(args[0]);
            lex = new MovUnityLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            MovUnityParser parser = new MovUnityParser(tokens);

            parser.removeErrorListeners();

            GameobjectContext arvore = parser.gameobject();
            MovUnitySemantico as = new MovUnitySemantico();

            as.visitGameobject(arvore);
            MovUnityVisitorUtils.errosSemanticos.forEach((s) -> pw.println(s));
          
            if(MovUnityVisitorUtils.errosSemanticos.isEmpty()) {
                MovUnityGeradorScript agc = new MovUnityGeradorScript();
                agc.visitGameobject(arvore);
                pw.print(agc.saida.toString());
            }

            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
