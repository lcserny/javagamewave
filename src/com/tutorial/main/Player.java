package com.tutorial.main;

import java.awt.*;
import java.util.Random;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class Player extends GameObject
{
    public Player(int x, int y, ID id)
    {
        super(x, y, id);
    }

    @Override
    public void tick()
    {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics graphics)
    {
        if (getId() == ID.Player) {
            graphics.setColor(Color.white);
        } else if (getId() == ID.Player2) {
            graphics.setColor(Color.blue);
        }

        graphics.fillRect(x, y, 32, 32);
    }
}
