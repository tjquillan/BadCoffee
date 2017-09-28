package com.iboy.badcoffee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DiskWriteMulti
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw;
		int n = 0;
		while(true)
		{
			bw = new BufferedWriter(new FileWriter("test" + n));
	    
			bw.write("allworkandnoplaymakesjackadullboy" + "\n");
			bw.close();
			n++;
		}
	}

}
