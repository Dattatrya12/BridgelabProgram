package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class FindSqrt {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		double c = MathFunctions.getDouble();
        double t = MathFunctions.getSqrt(c);

		System.out.println("square root of c is : "+t);

	}

}
