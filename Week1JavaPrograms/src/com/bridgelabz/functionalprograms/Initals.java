package com.bridgelabz.functionalprograms;

import java.io.FileNotFoundException;

import com.utility.Utility;

public class Initals {

	public static void main(String[] args) throws FileNotFoundException {
		while(true)
		  {
		System.out.println("Please Enter 1 for print K \n 2.  Print Pattern of D \n 3. Print Pattern of W : ");
		int s = Utility.getInt();
		PrintInitalsPattern.enterValue(s);
	}
	
	}

public static void enterValue(int s) throws FileNotFoundException {
		switch (s) {
		  case 1:
			System.out.println("Entered String is K");
			PrintInitalsPattern.patternOfK(s);
			break;
		case 2:
			System.out.println("Entered String is D");
			PrintInitalsPattern.patternOfD(s);
			break;
		case 3:
			System.out.println("Entered String is W");
			PrintInitalsPattern.patternOfW(s);
			break;
	}
}
}