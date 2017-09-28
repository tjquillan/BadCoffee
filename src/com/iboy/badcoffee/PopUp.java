package com.iboy.badcoffee;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class PopUp 
{
	JFrame frame;
	Dimension screenSize;
	
	public PopUp()
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
	
	public static void main(String[] args)
	{
		PopUp popUp = new PopUp();
		while(true)
		{
			popUp.makeFrame();
		}
	}
}
