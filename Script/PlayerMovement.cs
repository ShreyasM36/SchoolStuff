using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{
    public float speed = 3;
    public float rotationspeed = 75;
    public Camera m_Camera;
    public float rotX;
    public float rotY;
    private Vector3 m_rotation;
    private Vector3 m_cameraRotation;
    private float m_lookSensitivity = 5.0f;
    public Rigidbody m_RigidBody;
   
   

    // Start is called before the first frame update
    void Start()
    {
        if (m_RigidBody == null)
        {
            m_RigidBody = gameObject.GetComponent<Rigidbody>();
        }
    }

    // Update is called once per frame
    void Update()
    {
        //Move();
        //Rotate();
        newMovements();
        LookCamera();
    }

    public void newMovements()
    {
        //Direction Vector
        Vector3 movementV = transform.forward * Time.deltaTime;
        Vector3 movementH = transform.right * Time.deltaTime;

        movementV *= Input.GetAxis("Vertical");
        movementH *= Input.GetAxis("Horizontal");
        m_RigidBody.MovePosition(m_RigidBody.position + movementV + movementH);
    }

    public void Move()
    {
        if (Input.GetKey(KeyCode.W))
        {
            transform.Translate(25 * speed * Time.deltaTime, 0, 0);
        }
        if (Input.GetKey(KeyCode.S))
        {
            transform.Translate(-25 * speed * Time.deltaTime, 0, 0);
        }
        if (Input.GetKey(KeyCode.A))
        {
            transform.Rotate(0, -25 * rotationspeed * Time.deltaTime, 0);
        }
        if(Input.GetKey(KeyCode.D))
        {
            transform.Rotate(0, 25 * rotationspeed * Time.deltaTime, 0);
        }

    }

    public void LookCamera()
    {
        rotX += Input.GetAxis("Mouse X") * m_lookSensitivity * Time.deltaTime * 10;
        rotY += Input.GetAxis("Mouse Y") * m_lookSensitivity * Time.deltaTime * 10;

        rotY = Mathf.Clamp(rotY, -35f, 35f);

        m_Camera.transform.localRotation = Quaternion.Euler(-rotY, 0f, 0f);
        transform.rotation = Quaternion.Euler(0f, rotX, 0f);
    }
}
