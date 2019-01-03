package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class CheckColinear {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter value of x1 :");
		int x1 = MathFunctions.getInt();
		System.out.println("Enter value of x2 :");
		int x2 = MathFunctions.getInt();
		System.out.println("Enter value of x3 :");
		int x3 = MathFunctions.getInt();
		System.out.println("Enter value of y1 :");
		int y1 = MathFunctions.getInt();
		System.out.println("Enter value of y2 :");
		int y2 = MathFunctions.getInt();
		System.out.println("Enter value of y3 :");
		int y3 =MathFunctions.getInt();
		boolean x = MathFunctions.isSlope(x1,x2,x3,y1,y2,y3);
		boolean y = MathFunctions.triangle(x1, x2, x3, y1, y2, y3);
		if(x) {
			System.out.println("points are collinear  formed by slope");
		}else {
			System.out.println("points are not collinear formed by slope");
		}
		
		if(y) {
			System.out.println("points are collinear formed by triangle");
		}else {
			System.out.println("points are not collinear formed by triangle");

		}
	}
	}


