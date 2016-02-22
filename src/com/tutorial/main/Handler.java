package com.tutorial.main;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Leonardo on 21.02.2016.
 */
public class Handler
{
    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void update()
    {
        for (GameObject object : objects) {
            object.update();
        }
    }

    public void render(Graphics graphics)
    {
        for (GameObject object : objects) {
            object.render(graphics);
        }
    }

    public void addObject(GameObject object)
    {
        objects.add(object);
    }

    public void removeObject(GameObject object)
    {
        objects.remove(object);
    }
}
