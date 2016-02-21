package com.tutorial.main;

import java.awt.*;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class HUD
{
    public static int HEALTH = 100;

    public void tick()
    {
        HEALTH--;

        HEALTH = Game.clamp(HEALTH, 0, 100);
    }

    public void render(Graphics graphics)
    {
        graphics.setColor(Color.gray);
        graphics.fillRect(15, 15, 200, 32);
        graphics.setColor(Color.green);
        graphics.fillRect(15, 15, HEALTH * 2, 32);
        graphics.setColor(Color.white);
        graphics.drawRect(15, 15, 200, 32);
    }
}
