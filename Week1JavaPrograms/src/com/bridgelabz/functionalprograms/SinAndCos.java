package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class SinAndCos {
	public static void main(String[] args) {
		System.out.println("Enter value of x: ");
		double x = Utility.getDouble();
		System.out.println("Enter any number till that you want taylor series: ");
		int n = Utility.getInt();
		int sinx= (int) Utility.findSin(x,n);
		System.out.println(sinx);
		int cosx=(int) Utility.findCos(x, n);

		System.out.println(cosx);

		
		
	   

	}

	}

