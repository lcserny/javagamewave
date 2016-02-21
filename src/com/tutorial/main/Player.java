package com.tutorial.main;

import java.awt.*;
import java.util.Random;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class Player extends GameObject
{
    Random random = new Random();

    public Player(int x, int y, ID id)
    {
        super(x, y, id);

        velX = random.nextInt(5);
        velY = random.nextInt(5);
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
        graphics.setColor(Color.white);
        graphics.fillRect(x, y, 32, 32);
    }
}
