		package com.bridgelabz.fileio;

import java.io.FileWriter;
import java.io.IOException;

import com.utility.Utility;

public class Transpose {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[][] array=Utility.trasposDemo(3,3);
		FileWriter fw=new FileWriter("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/Transpose.txt"); 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				fw.write(array[i][j]+" ");   
			}
			fw.write("\n");
			
			System.getProperty( "line.separator" );
		
		}
		fw.close(); 
		
	

	}
}
