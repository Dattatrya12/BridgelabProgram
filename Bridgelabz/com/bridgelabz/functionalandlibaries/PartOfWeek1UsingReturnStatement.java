package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class PartOfWeek1UsingReturnStatement {
public static void main(String[] args) {
	    while(true)
	    {
	
	System.out.println("1.Enter 1 for HarmonicNumber \n2.Enter 2 for sinx Angle");
	System.out.println("3.Enter value of cos Angle\n4.Enter Decimal Number ");
	int x = MathFunctions.getInt();

	switch (x) {
	case 1:
		//HarmonicNumber
		
		//System.out.println("Enter any number : ");
		System.out.println("Enter value of n to Get harmonic number:");
		int n = MathFunctions.getInt();
		double sum =  MathFunctions.getHarmonic(n);
		System.out.println(sum);
		break;
		
	case 2:	
		//sinx
	    System.out.println("Enter value of sin angle: ");
		double x1 = MathFunctions.getDouble();
		double x11 = MathFunctions.sinAngle(x1);
		System.out.println("value of sin "+x1+" is : "+x11);
		break;

	case 3: 
		
		
		 System.out.println("Enter value of cos angle: ");
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


