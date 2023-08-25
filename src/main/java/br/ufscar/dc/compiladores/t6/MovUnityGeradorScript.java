package br.ufscar.dc.compiladores.t6;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.ConverterParaKeyCode;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarParcelaLogica;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarTemplate;
import java.util.HashMap;


public class MovUnityGeradorScript extends MovUnityBaseVisitor{
    HashMap<String, String> tabela;
    StringBuilder saida;
    String template;
    boolean existeAc, existeDesac;
    
    public MovUnityGeradorScript() {
        saida = new StringBuilder();
        existeAc = existeDesac = false;
    }
    
    @Override
    public Object visitGameobject(MovUnityParser.GameobjectContext ctx) {
        saida.append("using System.Collections;\n" +
                    "using System.Collections.Generic;\n" +
                    "using UnityEngine;\n" +
                    "\n" +
                    "public class " +ctx.NOME().getText()+ ": MonoBehaviour\n" +
                    "{"+
                "    private Rigidbody2D rb;\n" +
                "    private Vector2 move;\n" +
                "    private int vertical, horizontal;\n");
        this.template = verificarTemplate(ctx.templates());
        return super.visitGameobject(ctx); 
    }

    @Override
    public Object visitDef_atributos(MovUnityParser.Def_atributosContext ctx) {
        saida.append("    public float speed="+ctx.vel.getText()+"f;\n");
        if(ctx.GRAVIDADE() != null)
            saida.append("    public float gravity="+ctx.grav.getText()+"f;\n");
        else
            saida.append("    public float gravity=0;\n");  
        
        if(ctx.PULOIMPULSO() != null)
            saida.append("    public float jump="+ctx.puloIm.getText()+"f;\n");
        
        if(ctx.ACELERACAO() != null || ctx.DESACELERACAO() != null){
            saida.append("    private Vector2 currentVelocity = Vector2.zero;\n");
            if(ctx.ACELERACAO() != null){
                existeAc = true;
                saida.append("    public float acceleration="+ctx.ac.getText()+"f;\n");
            }

            if(ctx.DESACELERACAO() != null){
                existeDesac = true;
                saida.append("    public float acceleration="+ctx.desac.getText()+"f;\n");
            }
        
        }
        
  
        
        saida.append("\n\n");
        saida.append("    void Start()\n" +
                    "    {\n" +
                    "        rb = gameObject.GetComponent<Rigidbody2D>();\n" +
                    "        if(rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;\n" +
                    "\n" +
                    "        rb.gravityScale =gravity;\n" +
                    "    }" 
        );
        saida.append("\n\n");
        saida.append("void Update()\n" +
                    "    {\n" +
                    "        Movement();\n" +
                    "    }"
                    );
        saida.append("\n\n");
        return super.visitDef_atributos(ctx); 
    }

    @Override
    public Object visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx) {
        saida.append("void Movement()\n{\n");

        if(template.equals("top-down")){
            saida.append("        horizontal = 0;\n" +
                        "        vertical = 0;\n");
            
            String modo = verificarModosTeclado(ctx.modos_teclado());
            boolean diagonal = verificarParcelaLogica(ctx.parcela_logica()).equals("verdadeiro");
            if(modo.equals("WASD"))
            { 
                saida.append("if(Input.GetKey(KeyCode.A)){\n" +
                            "            horizontal = -1;\n" +
                            "        } else if(Input.GetKey(KeyCode.D)){\n" +
                            "            horizontal =1;\n" +
                            "        }\n" +
                            "\n" +
                            "        if(Input.GetKey(KeyCode.S)){\n" +
                            "            vertical = -1;\n");
                if(diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        } else if(Input.GetKey(KeyCode.W)){\n" +
                            "            vertical =1;\n");
                
                if(diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        }\n" +
                            "        move = new Vector2(horizontal, vertical);"
                );
            } else if(modo.equals("FLECHAS"))
            { 
                saida.append("if(Input.GetKey(KeyCode.LeftArrow)){\n" +
                            "            horizontal = -1;\n" +
                            "        } else if(Input.GetKey(KeyCode.RightArrow)){\n" +
                            "            horizontal =1;\n" +
                            "        }\n" +
                            "\n" +
                            "        if(Input.GetKey(KeyCode.DownArrow)){\n" +
                            "            vertical = -1;\n");
                if(diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        } else if(Input.GetKey(KeyCode.UpArrow)){\n" +
                            "            vertical =1;\n");
                
                if(diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        }\n" +
                            "        move = new Vector2(horizontal, vertical);\n"
                );
            }
        } else if(template.equals("side-scrolling"))
        {
            saida.append("        horizontal = 0;\n");
            
            String modo = verificarModosTeclado(ctx.modos_teclado());
            if(modo.equals("WASD"))
            {
                saida.append("        if (Input.GetKey(KeyCode.A))\n" +
                            "        {\n" +
                            "            horizontal = -1;\n" +
                            "        }\n" +
                            "        else if (Input.GetKey(KeyCode.D))\n" +
                            "        {\n" +
                            "            horizontal = 1;\n" +
                            "        }\n");
            } else if(modo.equals("FLECHAS"))
            {
                saida.append("        if (Input.GetKey(KeyCode.LeftArrow))\n" +
                            "        {\n" +
                            "            horizontal = -1;\n" +
                            "        }\n" +
                            "        else if (Input.GetKey(KeyCode.RightArrow))\n" +
                            "        {\n" +
                            "            horizontal = 1;\n" +
                            "        }\n");
            }
            saida.append("        move = new Vector2(horizontal*speed, rb.velocity.y);\n" +
                        "        rb.velocity = move;\n");
            
            saida.append("        if (Input.GetKeyDown("+ConverterParaKeyCode(ctx.botoes_teclado())+"))\n" +
                        "        {\n" +
                        "            rb.AddForce(Vector2.up * jump, ForceMode2D.Impulse);\n" +
                        "        }\n");
        }
        saida.append("        move.Normalize();\n" +
                    "        rb.velocity = move * speed;\n");
        saida.append("}\n}");
        return super.visitAttr_teclado(ctx);
    }

    @Override
    public Object visitAttr_mouse(MovUnityParser.Attr_mouseContext ctx) {
       
        
        String modo = verificarModosMouse(ctx.modos_mouse());
        
        if(modo.equals("clique")) 
            saida.append("private Vector3 targetPosition;");
        
        saida.append("void Movement()\n{\n");
        if(modo.equals("seguir"))
        {
            saida.append
            ("Vector3 mousePosition = Camera.main.ScreenToWorldPoint(Input.mousePosition);\n" +
"           Vector3 moveDirection = (mousePosition - transform.position).normalized;\n" +
"           transform.position += moveDirection * speed * Time.deltaTime;\n"
            );
        }
        else if(modo.equals("clique"))
        {
            saida.append("if (Input.GetMouseButtonDown(");
         
            if(verificarBotoesMouse(ctx.botoes_mouse()).equals("esquerdo"))
            {
                saida.append("0");
            }
            else if(verificarBotoesMouse(ctx.botoes_mouse()).equals("direito"))
            {
                saida.append("1");
            }
            saida.append(")\n{\n");
            saida.append
            ("            targetPosition = Camera.main.ScreenToWorldPoint(Input.mousePosition);\n" +
            "            targetPosition.z = transform.position.z;\n" +
            "            isMoving = true;\n" +
            "        }");
            
            saida.append("if (isMoving)\n" +
"        {");
            saida.append
            ("        Vector3 moveDirection = (targetPosition - transform.position).normalized; // Calcula a direção para a posição alvo\n" +
            "        transform.position += moveDirection * speed * Time.deltaTime; // Move o objeto na direção da posição alvo\n" +
            "        if (Vector3.Distance(transform.position, targetPosition) < 0.1f) // Verifica se chegou perto o suficiente da posição alvo\n" +
            "        {\n" +
            "            isMoving = false; // Para o movimento\n" +
            "        }");
            saida.append("}");
        }   
        
        saida.append("}");
        return super.visitAttr_mouse(ctx);
    }
    
    
}
