package com.tutorial.main;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

/**
 * Created by Leonardo on 20.02.2016.
 */
public class Game extends Canvas implements Runnable
{
    private boolean running = false;
    private Thread thread;
    private Handler handler;
    private Random random;
    private HUD hud;

    public Game()
    {
        handler = new Handler();
        random = new Random();
        hud = new HUD();

        addKeyListener(new KeyInput(handler));
        new Window("Let's build a Game", this);
        start();

        handler.addObject(new Player(Window.WIDTH / 2 - 32, Window.HEIGHT / 2 - 32, GameObjectID.Player));
        handler.addObject(new BasicEnemy(random.nextInt(Window.WIDTH / 2), random.nextInt(Window.HEIGHT / 2), GameObjectID.BasicEnemy));
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    /* Basic Game loop */
    public void run()
    {
        this.requestFocus();

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

    public static int clamp(int val, int min, int max)
    {
        if (val >= max) {
            return val = max;
        } else if (val <= min) {
            return val = min;
        } else {
            return val;
        }
    }

    protected void tick()
    {
        handler.tick();
        hud.tick();
    }

    protected void render()
    {
        BufferStrategy bufferStrategy = this.getBufferStrategy();
        if (bufferStrategy == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, Window.WIDTH, Window.HEIGHT);

        handler.render(graphics);
        hud.render(graphics);

        graphics.dispose();
        bufferStrategy.show();
    }
}
