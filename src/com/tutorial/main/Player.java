package com.tutorial.main;

import java.awt.*;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class Player extends GameObject
{
    public Player(int x, int y, GameObjectID gameObjectId)
    {
        super(x, y, gameObjectId);
    }

    @Override
    public void tick()
    {
        posY += speedY;
        posX += speedX;

        posX = Game.clamp(posX, 0, Window.WIDTH - 35);
        posY = Game.clamp(posY, 0, Window.HEIGHT - 60);
    }

    @Override
    public void render(Graphics graphics)
    {
        graphics.setColor(Color.white);
        graphics.fillRect(posX, posY, 32, 32);
    }
}
