package com.tutorial.main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Leonardo on 20.02.2016.
 */
public class Window extends Canvas
{
    public Window(int width, int height, String title, Game game)
    {
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);

        game.start();
    }
}