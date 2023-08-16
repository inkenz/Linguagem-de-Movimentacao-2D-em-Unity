using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Sidescrolling : MonoBehaviour
{
    private Rigidbody2D rb;
    private Vector2 move;
    private int vertical, horizontal;
    public float speed = 20f;
    public float gravity = 10f;
    // Start is called before the first frame update
    void Start()
    {
        rb = gameObject.GetComponent<Rigidbody2D>();
        if (rb == null) rb = gameObject.AddComponent(typeof(Rigidbody2D)) as Rigidbody2D;

        rb.gravityScale = gravity;
    }

    void Update()
    {
        Movement();
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
        move = new Vector2(horizontal*speed, rb.velocity.y);
        rb.velocity = move;

        if (Input.GetKeyDown(KeyCode.Space)) // Verifica se o bot�o de pulo (espa�o) foi pressionado
        {
            rb.AddForce(Vector2.up * 50f, ForceMode2D.Impulse); // Aplica uma for�a para cima para simular o pulo
        }
    }
}
