package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class RollDie {
	public static void main(String[] args) {
		//int k=8;
		System.out.println("Enter that how many times that die will be roll: ");
		int n = Utility.getInt();
		Utility.rollingDie(n);
	}

}