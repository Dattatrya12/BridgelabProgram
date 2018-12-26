package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class StringFunctions {
	public static void main(String[] args) {
		while(true) {
			System.out.println("1.Enter 1 for Anagram \n2.Enter 2 for palinrome");
			System.out.println("3.Enter 3 for Find permutation \n4.Enter for the String swap");
		     System.out.println("5.Please Enter two string ");
		int x = com.utility.MathFunctions.getInt();
		
		String stri;
		
		switch(x){
		case 1:
			System.out.println("Enter first string to check anagram:");
			String input1 =MathFunctions.stringNext();
			System.out.println("Enter second string to check anagram :");
			String input2 =MathFunctions.stringNext();
			MathFunctions.isAnagram(input1,input2);
			if(MathFunctions.isAnagram(input1, input2)) {
				System.out.println("string is anagram");
			}else {
				System.out.println("string is not anagram");

			}
			break;
			
		case 2:
			System.out.println("Enter first string to check palinrome :");
			String input =MathFunctions.stringNext();
			boolean x1 = MathFunctions.isPalindrome(input);
			if(x1) {
				System.out.println("string is palindrom");
			}else {
				System.out.println("string is not palindrom");
			}
			break;
			
		case 3:
			System.out.println("Enter string to find permutation: ");
			String str = com.utility.MathFunctions.stringNext();
			int l = str.length();
			MathFunctions.findPermutation(str,0,l-1);
			break;
		
		case 4:
			// Iterative program to generate all permutations of a String in Java

			System.out.println("Enter any string to perform swapping: ");
			String str1 = MathFunctions.stringNext();
			MathFunctions.swap("datta",1,2);

			System.out.println(" "+MathFunctions.swap("datta",1,2));
			break;

			
		case 5:
			MathFunctions.matchString();
			break;
			
		default:
			break;	
			
		}

		
	}
}
}
