package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
            if (object.getGameObjectId() == GameObjectID.Player) {
                switch (key) {
                    case KeyEvent.VK_W:
                        object.setSpeedY(-5);
                        break;
                    case KeyEvent.VK_S:
                        object.setSpeedY(5);
                        break;
                    case KeyEvent.VK_A:
                        object.setSpeedX(-5);
                        break;
                    case KeyEvent.VK_D:
                        object.setSpeedX(5);
                        break;
                }
            }
        }

        if (key == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        for (GameObject object : handler.objects) {
            if (object.getGameObjectId() == GameObjectID.Player) {
                switch (key) {
                    case KeyEvent.VK_W:
                        object.setSpeedY(0);
                        break;
                    case KeyEvent.VK_S:
                        object.setSpeedY(0);
                        break;
                    case KeyEvent.VK_A:
                        object.setSpeedX(0);
                        break;
                    case KeyEvent.VK_D:
                        object.setSpeedX(0);
                        break;
                }
            }
        }
    }
}
