package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class Calender {
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		int y = MathFunctions.getInt();
		System.out.println("Enter Month: ");
		int m = MathFunctions.getInt();
		System.out.println("Enter Day: ");
		int d = MathFunctions.getInt();
		int day = MathFunctions.dayOfWeek(y, m, d);

		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		System.out.println("day of date is: "+week[day]);

		
	}

}