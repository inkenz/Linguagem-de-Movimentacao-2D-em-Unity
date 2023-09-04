using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Exemplo3: MonoBehaviour
{
    private Rigidbody2D rb;
    private Vector2 move;
    private int vertical, horizontal;
    public float speed=30f;
    private float gravity=0;


    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        if(rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;

        rb.gravityScale =gravity;
    }

    void Update()
    {
        Movement();
    }

    private Vector3 targetPosition;
    private bool isMoving;
    void Movement()
    {
        if (Input.GetMouseButtonDown(0))
        {
            move = Camera.main.ScreenToWorldPoint(Input.mousePosition);
            isMoving = true;
        } if (isMoving)
        {
            transform.position = Vector2.MoveTowards(transform.position, move, speed * Time.deltaTime);
            if (Vector3.Distance(transform.position, targetPosition) < 0.1f)
            {
                isMoving = false;
            }
        }
    }
}