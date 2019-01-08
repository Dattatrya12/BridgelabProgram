package com.bridgelabz.functionalandlibaries;

import java.io.FileWriter;
import java.io.IOException;

import com.utility.MathFunctions;

public class FindMinAndMaxValue {
	public static void main(String[] args) throws IOException {
		
		//take any random value from user
		
		System.out.println("Enter Any value: ");
		int n = com.utility.MathFunctions.getInt();
		int [] arry = new int[n];

		System.out.println("Enter value in array :");
		for(int i = 0 ; i < n ;i++ ) {
			arry[i]=com.utility.MathFunctions.getInt();

		}
		
		 //it will call maxValue(int n) method

		int min = MathFunctions.toFindMinValue(n, arry);
		System.out.println("Minimum value is : "+min);
		
		 //it will call minValue(int n) method

		int max = MathFunctions.toFindMaxValue(n, arry);
		System.out.println("Maximum value is : "+max );
		
}
}
