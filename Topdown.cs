using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Topdown : MonoBehaviour
{
    private Rigidbody2D rb;
    private Vector2 move;
    private int vertical, horizontal;
    public float speed= 20f;
    // Start is called before the first frame update
    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        if(rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;

        rb.gravityScale =0;
    }

    // Update is called once per frame
    void Update()
    {
        Movement();
    }

    void Movement(){   
        horizontal = 0;  
        vertical = 0;

        if(Input.GetKey(KeyCode.A)){
            horizontal = -1;
        } else if(Input.GetKey(KeyCode.D)){
            horizontal =1;
        }

        if(Input.GetKey(KeyCode.S)){
            vertical = -1;
            horizontal =0;
        } else if(Input.GetKey(KeyCode.W)){
            vertical =1;
            horizontal =0;
        }
        move = new Vector2(horizontal, vertical);

        move.Normalize();
        rb.velocity = move * speed;
    
    }
}
