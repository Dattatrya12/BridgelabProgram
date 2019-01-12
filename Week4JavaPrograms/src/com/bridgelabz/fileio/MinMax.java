package com.bridgelabz.fileio;

import java.io.FileWriter;
import java.io.IOException;
import com.utility.Utility;

public class MinMax {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter size of the array: ");
		int n = Utility.getInt();
		int [] arry = new int[n];

		System.out.println("Enter value in array :");
		for(int i = 0 ; i < n ;i++ ) {
			arry[i]=Utility.getInt();

		}
		
		 //it will call maxValue(int n) method

		int min = Utility.toFindMinValue(n, arry);
		System.out.println("Minimum value is : "+min);
		
		 //it will call minValue(int n) method

		int max = Utility.toFindMaxValue(n, arry);
		System.out.println("Maximum value is : "+max );
		FileWriter fw=new FileWriter("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/MinMax.txt");    
        fw.write("min="+min+" max="+max); 
         fw.close(); 
		

	}

}
