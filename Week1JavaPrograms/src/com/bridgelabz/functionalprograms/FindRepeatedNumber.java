package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class FindRepeatedNumber {
	public static void main(String[] args) {
		int[] number = new int[5];
		System.out.println("Please enter positive numbers: ");
      for(int i=0;i<number.length;i++) {
    	  number[i] = Utility.getInt();
}
		
		Utility.getRepeatedNumber(number);
	}

}