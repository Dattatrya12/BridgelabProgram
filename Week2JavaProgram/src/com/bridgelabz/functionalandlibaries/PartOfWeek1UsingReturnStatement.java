package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class PartOfWeek1UsingReturnStatement {
public static void main(String[] args) {
	    while(true)
	    {
	
	System.out.println("Enter 1 for HarmonicNumber,Enter 2 for sinx,"
			+"Enter 3 for cosx,"
	+ " Enter 4 for Binary : ");
	int x = MathFunctions.getInt();

	switch (x) {
	case 1:
		//HarmonicNumber
		
		//System.out.println("Enter any number : ");
		System.out.println("enter n");
		int n = MathFunctions.getInt();
		double sum =  MathFunctions.getHarmonic(n);
		System.out.println(sum);
		break;
		
	case 2:	
		//sinx
	    System.out.println("Enter value of angle: ");
		double x1 = MathFunctions.getDouble();
		double x11 = MathFunctions.sinAngle(x1);
		System.out.println("value of sin "+x1+" is : "+x11);
		break;

	case 3: 
		
		//cosx
		 System.out.println("Enter value of x: ");
		double xx = MathFunctions.getDouble();
		double x2 = MathFunctions.cosAngle(xx);
		System.out.println("value of cos "+xx+" is : "+x2);
		break;

	case 4:
		//Binary
				System.out.println("Please enter decimal number: ");
				int decimal = MathFunctions.getInt();
				String reverse = MathFunctions.decimalToBinary(decimal);
				System.out.println(" decimal to binary: "+reverse);
				break;
                  
	default:
		break;
	}
}
}
}


