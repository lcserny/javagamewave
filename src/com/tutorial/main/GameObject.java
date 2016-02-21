package com.tutorial.main;

import java.awt.*;

/**
 * Created by Leonardo on 21.02.2016.
 */
public abstract class GameObject
{
    protected int posX, posY;
    protected ID id;
    protected int speedX, speedY;

    public GameObject(int posX, int posY, ID id)
    {
        this.posX = posX;
        this.posY = posY;
        this.id = id;
    }

    public abstract void tick();

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

    public ID getId()
    {
        return id;
    }

    public void setId(ID id)
    {
        this.id = id;
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
