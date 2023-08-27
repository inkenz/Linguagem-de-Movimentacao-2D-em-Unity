package br.ufscar.dc.compiladores.t6;

import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.ConverterParaKeyCode;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarBotoesMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosMouse;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarModosTeclado;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarParcelaLogica;
import static br.ufscar.dc.compiladores.t6.MovUnityVisitorUtils.verificarTemplate;
import java.util.HashMap;


public class MovUnityGeradorScript extends MovUnityBaseVisitor{
    HashMap<String, String> tabela;
    StringBuilder saida;
    String template;
    boolean existeAc, existeDesac, existeCorr, existeEsq;
    
    public MovUnityGeradorScript() {
        saida = new StringBuilder();
        existeAc = existeDesac = existeCorr = existeEsq = false;
    }
    
    @Override
    public Object visitGameobject(MovUnityParser.GameobjectContext ctx) {
        saida.append("using System.Collections;\n" +
                    "using System.Collections.Generic;\n" +
                    "using UnityEngine;\n" +
                    "\n" +
                    "public class " +ctx.NOME().getText()+ ": MonoBehaviour\n" +
                    "{\n"+
                "    private Rigidbody2D rb;\n" 
                );
        this.template = verificarTemplate(ctx.templates());
        return super.visitGameobject(ctx); 
    }

    @Override
    public Object visitDef_atributos(MovUnityParser.Def_atributosContext ctx) {
        if(template.equals("top-down"))
            saida.append("    private Vector2 move;\n" +
                    "    private int vertical, horizontal;\n");
        else if(template.equals("side-scrolling"))
            saida.append("    private int horizontal;\n");
        
        saida.append("    public float speed="+ctx.vel.getText()+"f;\n");
        if(!ctx.CORRIDAVEL().isEmpty()){
            saida.append("    public float runningSpeed="+ctx.corrvel.getText()+"f;\n");
            saida.append("    private float defaultSpeed="+ctx.vel.getText()+"f;\n");
            existeCorr = true;
        }
        if(!ctx.GRAVIDADE().isEmpty())
            saida.append("    private float gravity="+ctx.grav.getText()+"f;\n");
        else
            saida.append("    private float gravity=0;\n");  
        
        if(!ctx.PULOIMPULSO().isEmpty())
            saida.append("    public float jump="+ctx.puloIm.getText()+"f;\n");
        
        if(!ctx.ACELERACAO().isEmpty() || !ctx.DESACELERACAO().isEmpty()){
            if(template.equals("top-down"))
                saida.append("    private Vector2 currentVelocity = Vector2.zero;\n");
            else if(template.equals("side-scrolling"))
                saida.append("    private float currentSpeed = 0;\n");
            if(!ctx.ACELERACAO().isEmpty()){
                existeAc = true;
                saida.append("    public float acceleration="+ctx.ac.getText()+"f;\n");
            }

            if(!ctx.DESACELERACAO().isEmpty()){
                existeDesac = true;
                saida.append("    public float deceleration="+ctx.desac.getText()+"f;\n");
            }
        
        }
        
        if(!ctx.ESQUIVADUR().isEmpty()){
            saida.append("    private float dashSpeed = "+ctx.esqvel.getText()+"f;\n");
            saida.append("    private float dashDuration = "+ctx.esqdur.getText()+"f;\n");
            saida.append("    private float dashCooldown = "+ctx.esqesp.getText()+"f;\n");
            saida.append("    private bool canDash = true;\n");
            saida.append("    private bool isDashing = false;\n");
            existeEsq = true;
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
        saida.append("     void Update()\n" +
                    "    {\n" +
                    "        Movement();\n"
                    );
        if(template.equals("side-scrolling")) 
            saida.append("        Jump();\n");
        if(existeCorr)
            saida.append("        Run();\n");
        if(existeEsq)
            saida.append("        Dash();\n");
        saida.append( "    }\n\n");
        return super.visitDef_atributos(ctx); 
    }

    @Override
    public Object visitAttr_teclado(MovUnityParser.Attr_tecladoContext ctx) {
        saida.append("     void Movement()\n{\n");
        if(existeEsq)
            saida.append("        if(isDashing) return;\n");
        if(template.equals("top-down")){
            saida.append("        horizontal = 0;\n" +
                        "        vertical = 0;\n");
            
            String modo = verificarModosTeclado(ctx.modos_teclado());
            boolean diagonal;
            if(!ctx.DIAGONAL().isEmpty())
                diagonal = verificarParcelaLogica(ctx.parcela_logica().get(0)).equals("verdadeiro");
            else
                diagonal = true;
            
            
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
                if(!diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        } else if(Input.GetKey(KeyCode.W)){\n" +
                            "            vertical =1;\n");
                
                if(!diagonal)
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
                if(!diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        } else if(Input.GetKey(KeyCode.UpArrow)){\n" +
                            "            vertical =1;\n");
                
                if(!diagonal)
                    saida.append("            horizontal =0;\n");
                
                saida.append("        }\n" +
                            "        move = new Vector2(horizontal, vertical);\n"
                );
            }
            
            saida.append("        move.Normalize();\n");
            if(existeAc){
                saida.append("        Vector2 targetVelocity = move * speed;\n");
                saida.append("        currentVelocity = Vector2.MoveTowards(currentVelocity, targetVelocity, acceleration * Time.deltaTime);\n");
            }
            if(existeDesac){
                saida.append("        if (move.magnitude == 0)\n" +
                            "        {\n" +
                            "            currentVelocity = Vector2.MoveTowards(currentVelocity, Vector2.zero, deceleration * Time.deltaTime);\n" +

                            "        }\n");
            }

            if(existeAc && !existeDesac){
                saida.append("        if (move.magnitude == 0)\n" +
                            "        {\n" +
                            "            currentVelocity = Vector2.zero;\n" +

                            "        }\n");

                saida.append("        rb.velocity = currentVelocity;\n");
            }
            else if(!existeAc && existeDesac){
                saida.append("        else{\n" +
                            "            currentVelocity = move*speed;\n}\n"+
                            "        rb.velocity = currentVelocity;\n"

                );
            }
            else if(existeAc && existeDesac){
                saida.append("        rb.velocity = currentVelocity;\n");

            }
            else{
                    saida.append("        rb.velocity = move*speed;\n");
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
            
            
            
            if(!existeAc && !existeDesac)
                saida.append("rb.velocity = new Vector2( horizontal*speed, rb.velocity.y);\n");
            else{
                saida.append("        if(horizontal != 0)\n");
                if(existeAc)
                    saida.append("            currentSpeed = Mathf.SmoothStep(currentSpeed, horizontal * speed, acceleration * Time.deltaTime);\n");
                else
                    saida.append("            currentSpeed = horizontal * speed;\n");
                    
                saida.append("else\n");
                
                if(existeDesac)
                    saida.append("            currentSpeed = Mathf.SmoothStep(currentSpeed, 0, deceleration * Time.deltaTime);\n");
                else
                    saida.append("            currentSpeed = 0;\n");
                
                saida.append("rb.velocity = new Vector2(currentSpeed, rb.velocity.y);");
            }
        }
        
        
        saida.append("}\n");
        
        if(template.equals("side-scrolling")){
            saida.append("    void Jump(){\n");
            saida.append("        if (Input.GetKeyDown("+ConverterParaKeyCode(ctx.pulo)+"))\n" +
                            "        {\n" +
                            "            rb.velocity= new Vector2(rb.velocity.x, jump);\n" +
                            "        }\n");
            saida.append("    }\n");
        }
        
        if(existeCorr){
            saida.append("    void Run(){\n");
            saida.append("        if (Input.GetKey("+ConverterParaKeyCode(ctx.corrida)+"))\n" +
                            "        {\n" +
                            "            speed = runningSpeed;\n" +
                            "        }\n");
            saida.append("        else\n" +
                            "        {\n" +
                            "            speed = defaultSpeed;\n" +
                            "        }\n");
            saida.append("    }\n");
        }
        
        if(existeEsq){
            saida.append("    void Dash(){\n");
            saida.append("          if(Input.GetKeyDown("+ConverterParaKeyCode(ctx.esquiva)+") && canDash){\n");
            saida.append("               StartCoroutine(Dashing());\n");
            saida.append("        }\n");
            saida.append("     }\n\n");
            
            saida.append("    private IEnumerator Dashing(){\n" +
                        "        canDash = false;\n" +
                        "        isDashing = true;\n" +
                        "        rb.velocity = rb.velocity.normalized*dashSpeed;\n" +
                        "\n" +
                        "        yield return new WaitForSeconds(dashDuration);\n" +
                        "        isDashing = false;\n" +
                        "\n" +
                        "        yield return new WaitForSeconds(dashCooldown);\n" +
                        "        canDash = true;\n" +
                        "    }");
        }
        
        saida.append("}");
        return super.visitAttr_teclado(ctx);
    }

    @Override
    public Object visitAttr_mouse(MovUnityParser.Attr_mouseContext ctx) {
       
        
        String modo = verificarModosMouse(ctx.modos_mouse());
        
        if(modo.equals("clique")){
            saida.append("private Vector3 targetPosition;\n");
            saida.append("private bool isMoving;\n");
        }
        saida.append("     void Movement()\n{\n");
        if(modo.equals("seguir"))
        {
            saida.append
            ("        move = Camera.main.ScreenToWorldPoint(Input.mousePosition);\n" +
            "        transform.position = Vector2.MoveTowards(transform.position, move, speed * Time.deltaTime);\n"
            );
        }
        else if(modo.equals("clique"))
        {
            saida.append("        if (Input.GetMouseButtonDown(");
         
            if(verificarBotoesMouse(ctx.botoes_mouse()).equals("esquerdo"))
            {
                saida.append("0");
            }
            else if(verificarBotoesMouse(ctx.botoes_mouse()).equals("direito"))
            {
                saida.append("1");
            }
            saida.append("))\n{\n");
            saida.append
            ("            move = Camera.main.ScreenToWorldPoint(Input.mousePosition);\n" +
            "            isMoving = true;\n" +
            "        }");
            
            saida.append("if (isMoving)\n" +
"        {");
            saida.append
            ("        transform.position = Vector2.MoveTowards(transform.position, move, speed * Time.deltaTime);\n" +
            "        if (Vector3.Distance(transform.position, targetPosition) < 0.1f)\n" +
            "        {\n" +
            "            isMoving = false;\n" +
            "        }\n");
            saida.append("}\n");
        }   
        
        saida.append("}\n");
        saida.append("}");
        return super.visitAttr_mouse(ctx);
    }
    
    
}
