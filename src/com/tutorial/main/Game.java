package com.tutorial.main;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Leonardo on 20.02.2016.
 */
public class Game extends Canvas implements Runnable
{
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private Thread thread;
    private boolean running = false;

    public Game()
    {
        new Window(WIDTH, HEIGHT, "Let's build a Game", this);
    }

    public static void main(String[] args)
    {
        new Game();
    }

    public synchronized void start()
    {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop()
    {
        try {
            thread.join();
            running = false;
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    @Override
    /* Basic Game loop */
    public void run()
    {
        long lastTime = System.nanoTime();
        double amountOfClicks = 60.0;
        double ns = 1000000000 / amountOfClicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            while (delta >= 1) {
                tick();
                delta--;
            }

            if (running) {
                render();
            }

            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }

        stop();
    }

    public void tick()
    {

    }

    public void render()
    {
        BufferStrategy bufferStrategy = this.getBufferStrategy();
        if (bufferStrategy == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        graphics.dispose();
        bufferStrategy.show();
    }
}
