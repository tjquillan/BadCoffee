package com.iboy.badcoffee.multiframe;

import javax.swing.JFrame;

public class MultiFrame 
{
	JFrame frame;
	
	public MultiFrame()
	{
		
	}
	
	public void makeFrame()
	{
		frame = new JFrame();
		frame.setSize(200,100);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
