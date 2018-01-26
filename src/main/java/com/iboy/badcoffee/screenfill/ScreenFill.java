package com.iboy.badcoffee.screenfill;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ScreenFill 
{
	JFrame frame;
	Dimension screenSize;
	
	public ScreenFill()
	{
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	}
	
	public void makeFrame()
	{
		frame = new JFrame();
		frame.setSize(screenSize.width, screenSize.height);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
