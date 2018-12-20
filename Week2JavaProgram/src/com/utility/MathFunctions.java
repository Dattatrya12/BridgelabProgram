package com.utility;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
import java.util.Scanner;
//import java.util.Set;
/**
 * Aim:utility class to Define all basic logic.
 * 
 * @author Dattatrya Age
 *@version:1.0
 *@since:19-12-2018
 */
public class MathFunctions {
//private static  String  = null;
static Scanner scan = new Scanner(System.in);
	
	/*
	 *  This method is used to take integer input from user
	 */
	
	public static int getInt() {
	int Integer = scan.nextInt();
	return Integer;
	}
	
	/*
	 *  This method is used to take float input from user
	 */
	
	public static float getFloat() {
		float Float = scan.nextFloat();
		return Float;
		}
	
	/*
	 *  This method is used to take string input from user
	 */

	public static String getString() {
		String string = scan.nextLine();
		return string;
		}
	public static String stringNext() {
		String string = scan.next();
		return string;
	}
	
	public static String getString(String[] string1) {
		String string = scan.nextLine();
		return string;
		}
	
	/*
	 *  This method is used to take double input from user
	 */

	public static double getDouble() {
		double Double = scan.nextDouble();
		return Double;
		}
	
	/*
	 *  This method is used to take long input from user
	 */

	public static long getLong() {
		long longvalue = scan.nextLong();
		return longvalue;
		}
	//****************************StringFunction***************************************
	
		/**
		 * @param input1 take first string from user
		 * @param input2 take second string from user
		 * @return true if string is anagram and false if string is not anagram
		 */
		
		public static boolean anagram(String input1, String input2) {
			
	        //Remove all whitespace first

			String s1  =  input1.replaceAll("\\s", " ");
			String s2  =  input2.replaceAll("\\s", " ");
			
			boolean status;
			
			if(s1.length() != s2.length()) {
				return false;
				//System.out.println("string is not anagram");
			}else {
				
	            //Convert into character array

				char[] s1Array = s1.toLowerCase().toCharArray();
				char[] s2Array = s2.toLowerCase().toCharArray();
				
	            //Sorting both character array
				
				Arrays.sort(s1Array);
				Arrays.sort(s2Array);
				
				//Check if both arrays are equal

				status = Arrays.equals(s1Array, s2Array);
				return true;
				
			}

	}
		/***********************************************StringFunctionB*********************************

		/**
		 * @param input take string from user 
		 * @return true if string is palindrom and false if string is not palindrom
		 */
		
		public static boolean isPalindrome(String input) {
			String temp=input;
			String rev="";
			int length = input.length(); 
			

			 for(int i = length - 1 ;i >= 0 ; i --) {
				 
				 rev = rev + input.charAt(i);
			 } 
			System.out.println(rev);
			boolean status = temp.equals(rev);
			System.out.println(status);
			 if(status) {
				// System.out.println("string is palindrom");
				 return true ;
			 }
			 else
			 {
				 //System.out.println("string is not palindrom");
				 return false;
			 }
			
			
		}
		
		//**********************************StringFunctionC*************************************************

		/**
		 * @param str take string from user
		 * @param l take integer from user 
		 * @param r take integer from user
		 */
		
		public static void toFindPermutation(String str, int l, int r) {
			if(l==r) {
				System.out.println(str);
			}else {
				for(int i = l ; i <= r; i++) {
				str = swap(str , l ,i);
				toFindPermutation(str , l+1, r);
				str = swap(str, l, i);

			}
			}
			//return str;
			
		}

		public static String swap(String a, int i, int j) {
			char temp;
			char[] charArray = a.toCharArray();
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			
			return String.valueOf(charArray);
	}
		//*************************StringFunctionE***************************************

		/**
		 * @param string1 take string from user
		 * @param string2 take string from user
		 */
		
		public static void matchString(String string1, String string2) {
			if(string1.equals(string2)) {
				System.out.println("Strings are equal");
			}else {
				System.out.println("String are not equal");
			}
			
	}

		
		/*******************Calender*****************************************************

		/**
		 * @param y  take integer from user 
		 * @param m  take integer from user 
		 * @param d  take integer from user 
		 * @return value of d0
		 */
		
		public static int dayOfWeek(int y, int m, int d) {
			if(y < 0 && m < 0 && d < 0) {
				y = MathFunctions.getInt();
				m = MathFunctions.getInt();
				d = MathFunctions.getInt();
				dayOfWeek(y, m, d);
			}
			
			
			int y0 = y - (14 - m) / 12;
	        
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        
	        int d0 = (d + x + (31*m0)/12) % 7;
			
			return d0;	
	}
		public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }

	    // return true if the given year is a leap year
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }
	    public static double getHarmonic(int n)
   	    {
   	  // command-line argument
   	    	
   	     
	    	//int num=scan.nextInt();
   	    double result = 0.0;
		for(int i=1;i<=n;i++){
			//System.out.print(result+"/"+i+" "); // compute 1/1 + 1/2 + 1/3 + ... + 1/n
			result+=1.0/i;
			
                }
		return result;
   	    }
	  //************************MathFunction4***************************************

		/**
		 * @param x take double from user
		 * @return result by using formula
		 */
		
		public static float sinAngle(double x) {
			float result  = (float) Math.sin( Math.toRadians( x ) ) ;
			return result;
			
		}

		public static double cosAngle(double xx) {
			float result  = (float) Math.cos( Math.toRadians( xx ) ) ;
			return result;
			//double x2 = Math.cos(xx);
			//double q = Math.toDegrees(x2);
			//return q;
	}
	    public static String decimalToBinary(int x)

	    {

	        if(x > 0)

	        {

	            int a = x % 2;

	            x = x / 2;

	            return a + "" + decimalToBinary(x);

	        }

	        return "";

	    }
	    public static double getSqrt(double c) {
	 		
	 		double e = 1e-15;
	 		double t = c;
	 		if(c<0) {
	 			System.out.println("Please enter positive number: ");
	 			int c1 = MathFunctions.getInt();
	 			MathFunctions.getSqrt(c1);

	 		}else {
	         // repeatedly apply Newton update step until desired precision is achieved
	 		
	         while (Math.abs(t - c/t) > e*t) {
	             t = (c/t + t) / 2.0;
	         }
	        
	 		}
	 		return t;
	 		
	  
	    }

		public static int getFactorial()
		{
			int n1, factorial=1;
			n1=scan.nextInt();
			for(int i=n1;i>=1;i--)
			{
				factorial=factorial*i;
				//System.out.println("Factorial="+factorial);
				
			}
			return factorial;
		}

		 
}

	

	

		