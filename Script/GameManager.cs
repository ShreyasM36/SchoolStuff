using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    public bool isPaused;
    private void LockCursor()
    {
        Cursor.lockState = CursorLockMode.Locked;
        Cursor.visible = false;
    }
      
    private void UnlockCursor()
    {
        Cursor.lockState = CursorLockMode.None;
        Cursor.visible = true;
    }
    public void PauseGame()
    {
        isPaused = true;
        Time.timeScale = 0;
        UnlockCursor();
    }
    public void UnpauseGame()
    {
        isPaused = false;
        Time.timeScale = 1;
        LockCursor();
    }

    // Start is called before the first frame update
    void Start()
    {
        UnpauseGame();
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
