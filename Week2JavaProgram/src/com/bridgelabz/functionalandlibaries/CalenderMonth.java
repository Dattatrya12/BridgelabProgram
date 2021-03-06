package com.bridgelabz.functionalandlibaries;
import com.utility.MathFunctions;

public class CalenderMonth {
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		int y = MathFunctions.getInt();
		System.out.println("Enter Month: ");
		int m = MathFunctions.getInt();
		
		if(y<0 ) {
			System.out.println("Please enter positive year: ");
			y = MathFunctions.getInt();

		}if(m<0) {
			System.out.println("Please enter positive month: ");
			m = MathFunctions.getInt();

		}
		
		
		
		String[] months = {" ","January","February","March","April","May","Jun",
				"July","August","September","October","November","December"};//from 1=january upto 12=Dec
		
		int[] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int j = 0;
		if(months[m] == "January") {
			j = 1;
		}
		if(months[m] == "February") {
			j = 2;
		}
		if(months[m] == "March") {
			j = 3;
		}
		if(months[m] == "April") {
			j = 4;
		}
		if(months[m] == "May") {
			j = 5;
		}
		if(months[m] == "Jun") {
			j = 6;
		}
		if(months[m] == "July") {
			j = 7;
		}
		if(months[m] == "August") {
			j = 8;
		}
		if(months[m] == "September") {
			j = 9;
		}
		if(months[m] == "October") {
			j = 10;
		}
		if(months[m] == "November") {
			j = 11;
		}
		if(months[m] == "December") {
			j = 12;
		}
		

		int year = 0;
		//check for leap year
		if(m == 2 && MathFunctions.isLeapYear(y)) {
			days[m] = 29;		
			}
		
		int dy = MathFunctions.dayOfWeek(y, m, 1);	

		
		System .out.println(" ");
		System.out.println("% java Calendar "+j+" "+y);
		System.out.println("  "+months[m]+ "  "+y);
		System.out.println("S  M  T  W  Th  F  S");

		
		//call day of week
		
		
        //String array2;
			    for (int i = 0; i < dy; i++)
			        BLStdOut.print("   ");
			    for (int i = 1; i <= days[m]; i++) {
			    	System.out.printf("%2d ",i);
			        if (((i + dy) % 7 == 0)) 
			        	System.out.println();
			    }
	       }
	}



