package com.iboy.badcoffee.popup;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.JFrame;

public class PopUp 
{
	JFrame frame;
	WindowListener exitListener;
	Dimension screenSize;
	Random rand;
	
	public PopUp()
	{
		rand = new Random();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		exitListener = new WindowAdapter() 
		{
		    @Override
		    public void windowClosing(WindowEvent e) 
		    {
		        makeFrame();
		        makeFrame();
		    }
		};
	}
	
	public void makeFrame()
	{
		int x = rand.nextInt(screenSize.width);
		int y = rand.nextInt(screenSize.height);
		
		frame = new JFrame();
		frame.setSize(600,400);
		frame.setLocation(x, y);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.addWindowListener(exitListener);
	}
}
