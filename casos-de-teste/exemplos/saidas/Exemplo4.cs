using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Exemplo4: MonoBehaviour
{
    private Rigidbody2D rb;
    private int horizontal;
    public float speed=12f;
    private float gravity=1f;
    public float jump=4f;
    private float currentSpeed = 0;
    public float acceleration=20f;


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
    }

    void Movement()
    {
        horizontal = 0;
        if (Input.GetKey(KeyCode.G))
        {
            horizontal = -1;
        }
        else if (Input.GetKey(KeyCode.D))
        {
            horizontal = 1;
        }
        if(horizontal != 0)
            currentSpeed = Mathf.SmoothStep(currentSpeed, horizontal * speed, acceleration * Time.deltaTime);
        else
            currentSpeed = 0;
        rb.velocity = new Vector2(currentSpeed, rb.velocity.y);    
    }
    void Jump(){
        if (Input.GetKeyDown(KeyCode.Space))
        {
            rb.velocity= new Vector2(rb.velocity.x, jump);
        }
    }
}