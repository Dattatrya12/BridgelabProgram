package com.bridgelabz.fileio;

import java.io.FileWriter;
import java.io.IOException;

import com.utility.Utility;

public class RandomWalker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 int n = 4; 
		 int[] res = new int[n + 1];
		 for (int i = 3; i <= n; i++) 
			 res[i]=Utility.getInt();
	        n=Utility.countWays(n);
	        FileWriter fw=new FileWriter("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/RandomWalker.txt");    
	        fw.write(n);    
	        fw.close(); 

	}

}
