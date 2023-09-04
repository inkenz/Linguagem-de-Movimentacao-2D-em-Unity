using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Exemplo2: MonoBehaviour
{
    private Rigidbody2D rb;
    private int horizontal;
    public float speed=10f;
    public float runningSpeed=30f;
    private float defaultSpeed=10f;
    private float gravity=3f;
    public float jump=15f;


    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        if(rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;

        rb.gravityScale =gravity;
    }

    void Update()
    {
        Movement();
        Jump();
        Run();
    }

    void Movement()
    {
        horizontal = 0;
        if (Input.GetKey(KeyCode.A))
        {
            horizontal = -1;
        }
        else if (Input.GetKey(KeyCode.D))
        {
            horizontal = 1;
        }
        rb.velocity = new Vector2( horizontal*speed, rb.velocity.y);
    }
    void Jump(){
        if (Input.GetKeyDown(KeyCode.Space))
        {
            rb.velocity= new Vector2(rb.velocity.x, jump);
        }
    }
    void Run(){
        if (Input.GetKey(KeyCode.LeftShift))
        {
            speed = runningSpeed;
        }
        else
        {
            speed = defaultSpeed;
        }
    }
}