package com.tutorial.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Leonardo on 20.02.2016.
 */
public class Window extends Canvas
{
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public Window(String title, Game game)
    {
        JFrame frame = new JFrame(title);
        frame.add(game);

        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
