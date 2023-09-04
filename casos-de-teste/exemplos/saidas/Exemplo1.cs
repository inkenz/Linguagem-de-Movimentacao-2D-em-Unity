using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Exemplo1: MonoBehaviour
{
    private Rigidbody2D rb;
    private Vector2 move;
    private int vertical, horizontal;
    public float speed=10f;
    private float gravity=0;
    private float dashSpeed = 40f;
    private float dashDuration = 0.25f;
    private float dashCooldown = 3f;
    private bool canDash = true;
    private bool isDashing = false;


    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        if(rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;

        rb.gravityScale =gravity;
    }

    void Update()
    {
        Movement();
        Dash();
    }

    void Movement()
    {
        if(isDashing) return;
        horizontal = 0;
        vertical = 0;
        if(Input.GetKey(KeyCode.J)){
            horizontal = -1;
        } else if(Input.GetKey(KeyCode.L)){
            horizontal =1;
        }

        if(Input.GetKey(KeyCode.K)){
            vertical = -1;
        } else if(Input.GetKey(KeyCode.I)){
            vertical =1;
        }
        move = new Vector2(horizontal, vertical);
        move.Normalize();
        rb.velocity = move*speed;
    }
    void Dash(){
          if(Input.GetKeyDown(KeyCode.LeftControl) && canDash){
               StartCoroutine(Dashing());
        }
     }

    private IEnumerator Dashing(){
        canDash = false;
        isDashing = true;
        rb.velocity = rb.velocity.normalized*dashSpeed;

        yield return new WaitForSeconds(dashDuration);
        isDashing = false;

        yield return new WaitForSeconds(dashCooldown);
        canDash = true;
    }
}