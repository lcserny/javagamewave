package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class KeyInput extends KeyAdapter
{
    private Handler handler;

    public KeyInput(Handler handler)
    {
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        for (GameObject object : handler.objects) {
            if (object.getId() == ID.Player) {
                switch (key) {
                    case KeyEvent.VK_W:
                        object.setVelY(-5);
                        break;
                    case KeyEvent.VK_S:
                        object.setVelY(5);
                        break;
                    case KeyEvent.VK_A:
                        object.setVelX(-5);
                        break;
                    case KeyEvent.VK_D:
                        object.setVelX(5);
                        break;
                }
            }

            if (object.getId() == ID.Player2) {
                switch (key) {
                    case KeyEvent.VK_UP:
                        object.setVelY(-5);
                        break;
                    case KeyEvent.VK_DOWN:
                        object.setVelY(5);
                        break;
                    case KeyEvent.VK_LEFT:
                        object.setVelX(-5);
                        break;
                    case KeyEvent.VK_RIGHT:
                        object.setVelX(5);
                        break;
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        for (GameObject object : handler.objects) {
            if (object.getId() == ID.Player) {
                switch (key) {
                    case KeyEvent.VK_W:
                        object.setVelY(0);
                        break;
                    case KeyEvent.VK_S:
                        object.setVelY(0);
                        break;
                    case KeyEvent.VK_A:
                        object.setVelX(0);
                        break;
                    case KeyEvent.VK_D:
                        object.setVelX(0);
                        break;
                }
            }

            if (object.getId() == ID.Player2) {
                switch (key) {
                    case KeyEvent.VK_UP:
                        object.setVelY(0);
                        break;
                    case KeyEvent.VK_DOWN:
                        object.setVelY(0);
                        break;
                    case KeyEvent.VK_LEFT:
                        object.setVelX(0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        object.setVelX(0);
                        break;
                }
            }
        }
    }
}
