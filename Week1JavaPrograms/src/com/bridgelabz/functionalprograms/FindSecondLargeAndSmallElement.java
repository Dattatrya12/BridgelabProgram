package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class FindSecondLargeAndSmallElement {
	public static void main(String[] args) {
		System.out.println("Please Enter positive values : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]<0) {
				System.out.println("please enter positive number: ");
				a[i] = Utility.getInt();

			}else {
			a[i] = Utility.getInt();
			}
		}
		Utility.getSecondLargeAndSmallElement(a);
}
}