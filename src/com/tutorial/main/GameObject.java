package com.tutorial.main;

import java.awt.*;

/**
 * Created by Leonardo on 21.02.2016.
 */
public abstract class GameObject
{
    protected int posX, posY;
    protected GameObjectID gameObjectId;
    protected int speedX, speedY;

    public GameObject(int posX, int posY, GameObjectID gameObjectId)
    {
        this.posX = posX;
        this.posY = posY;
        this.gameObjectId = gameObjectId;
    }

    public abstract void update();

    public abstract void render(Graphics graphics);

    public int getPosX()
    {
        return posX;
    }

    public void setPosX(int posX)
    {
        this.posX = posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void setPosY(int posY)
    {
        this.posY = posY;
    }

    public GameObjectID getGameObjectId()
    {
        return gameObjectId;
    }

    public void setGameObjectId(GameObjectID gameObjectId)
    {
        this.gameObjectId = gameObjectId;
    }

    public int getSpeedX()
    {
        return speedX;
    }

    public void setSpeedX(int speedX)
    {
        this.speedX = speedX;
    }

    public int getSpeedY()
    {
        return speedY;
    }

    public void setSpeedY(int speedY)
    {
        this.speedY = speedY;
    }
}
