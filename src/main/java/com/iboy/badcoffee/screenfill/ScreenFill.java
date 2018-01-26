package com.iboy.badcoffee.screenfill;

import javax.swing.*;
import java.awt.*;

public class ScreenFill {
    private JFrame frame;
    private Dimension screenSize;

    public ScreenFill() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    }

    public void makeFrame() {
        frame = new JFrame();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}
