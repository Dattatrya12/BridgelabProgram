package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		double c = Utility.getDouble();
        double t = Utility.getSqrt(c);

		System.out.println("square root of c is : "+t);

	}

}
