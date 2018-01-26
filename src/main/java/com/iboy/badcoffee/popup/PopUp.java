package com.iboy.badcoffee.popup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class PopUp {
    private JFrame frame;
    private WindowListener exitListener;
    private Dimension screenSize;
    private Random rand;

    public PopUp() {
        rand = new Random();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                makeFrame();
                makeFrame();
            }
        };
    }

    public void makeFrame() {
        int x = rand.nextInt(screenSize.width);
        int y = rand.nextInt(screenSize.height);

        frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(x, y);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(exitListener);
    }
}
