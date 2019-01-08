package com.bridgelabz.fileio;

import java.io.FileWriter;
import java.io.IOException;

import com.utility.Utility;

public class Stats5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Random values Between 0 to 1: ");
        FileWriter fw=new FileWriter("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/Stats.txt");    
        fw.write(Utility.getStats5(0,1));
        fw.close();
	}

}
