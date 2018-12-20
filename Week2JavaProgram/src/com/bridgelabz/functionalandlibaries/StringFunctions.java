package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class StringFunctions {
	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter 1 for anagram,Enter 2 from palindrome,"
				+"Enter 3 for permutation using Iterative,"
		+ " Enter 4 for permutation recursion,Enter 5 for String function : ");
		int x = com.utility.MathFunctions.getInt();
		
		String stri;
		
		switch(x){
		case 1:
			System.out.println("Enter first string :");
			String input1 =MathFunctions.stringNext();
			System.out.println("Enter second string :");
			String input2 =MathFunctions.stringNext();
			MathFunctions.anagram(input1,input2);
			if(MathFunctions.anagram(input1, input2)) {
				System.out.println("string is anagram");
			}else {
				System.out.println("string is not anagram");

			}
			break;
			
		case 2:
			System.out.println("Enter first string :");
			String input =MathFunctions.stringNext();
			boolean x1 = MathFunctions.isPalindrome(input);
			if(x1) {
				System.out.println("string is palindrom");
			}else {
				System.out.println("string is not palindrom");
			}
			break;
			
		case 3:
			System.out.println("Enter string: ");
			String str = com.utility.MathFunctions.stringNext();
			int l = str.length();
			MathFunctions.toFindPermutation(str,0,l-1);
			break;
		
		case 4:
			// Iterative program to generate all permutations of a String in Java

			System.out.println("Enter any string : ");
			String str1 = MathFunctions.stringNext();
			MathFunctions.swap("datta",1,2);

			System.out.println(" "+MathFunctions.swap("datta",1,2));
			break;

			
		case 5:
			System.out.println("Enter first string: ");
			String string1 = MathFunctions.getString();
			
			System.out.println("Enter second string: ");
			String string2 = MathFunctions.getString();
			
			MathFunctions.matchString("Hello", "hello");
			break;
			
		default:
			break;	
			
		}

		
	}
}
}
