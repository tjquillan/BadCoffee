package com.iboy.badcoffee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DiskWriteSingle 
{
	public static void main(String[] args) throws IOException
	{
		Random rand = new Random();
		BufferedWriter bw = new BufferedWriter( new FileWriter("test"));
	    
	    while(true)
	    {
	    	bw.write(String.valueOf(rand.nextInt(237737373) + "\n"));
	    }
}
}
