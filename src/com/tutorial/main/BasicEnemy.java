package com.tutorial.main;

import java.awt.*;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class BasicEnemy extends GameObject
{
    public BasicEnemy(int x, int y, GameObjectID gameObjectId)
    {
        super(x, y, gameObjectId);

        speedX = 5;
        speedY = 5;
    }

    @Override
    public void update()
    {
        posX += speedX;
        posY += speedY;

        if (posY <= 0 || posY >= Window.HEIGHT - 42) {
            speedY *= -1;
        }

        if (posX <= 0 || posX >= Window.WIDTH - 26) {
            speedX *= -1;
        }
    }

    @Override
    public void render(Graphics graphics)
    {
        graphics.setColor(Color.red);
        graphics.fillRect(posX, posY, 16, 16);
    }
}
