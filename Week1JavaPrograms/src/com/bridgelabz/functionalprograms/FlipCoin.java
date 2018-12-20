package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		int flip = 0;
		System.out.println("Enter number of flip: ");
		if(flip<0) {
			System.out.println("Please enter positive value");
			flip = Utility.getInt();

		}else {
			flip = Utility.getInt();
		}
	Utility.getFlipCoin(flip);
	}

}