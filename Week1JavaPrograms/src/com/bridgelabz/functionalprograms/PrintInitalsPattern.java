package com.bridgelabz.functionalprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.utility.Utility;

public class PrintInitalsPattern {
		public static void main(String[] args) throws FileNotFoundException {
			  while(true)
			  {
			System.out.println("Please Enter 1 for print K or 2 for print D or 3 for print W : ");
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

			default:
				System.out.println("invalid input please enter again : ");
				int s1 = Utility.getInt();
				PrintInitalsPattern.enterValue(s1);
				break;
			}

		}



		public static void patternOfK(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("KPrintInitials.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<13 ; j++) {
				
				char x = str.charAt(j);
				if(x=='1') {
					System.out.print("*");
				}
				if(x=='0') {
					System.out.print(" ");
				}
			}
			System.out.println("");
			}
				
	}
				
		
				
			
		public static void patternOfD(int s) throws FileNotFoundException {
			String str1="";
			Scanner reader = new Scanner(new File("DPrintInitials.txt"));
			while (reader.hasNext()){
				str1 = reader.nextLine();

			for(int j = 0 ; j<14 ; j++) {
				
				char x = str1.charAt(j);
				if(x=='1') {
					System.out.print("*");
				}
				if(x=='0') {
					System.out.print(" ");
				}
			}
			System.out.println("");
			}
		
				
	}
			
		



		private static void patternOfW(int s) throws FileNotFoundException {
			String str2="";
			Scanner reader = new Scanner(new File("WPrintInitials.txt"));
			while (reader.hasNext()){
				str2 = reader.nextLine();

			for(int j = 0 ; j<31 ; j++) {
				
				char x = str2.charAt(j);
				if(x=='1') {
					System.out.print("*");
				}
				if(x=='0') {
					System.out.print(" ");
				}
			}
			System.out.println("");
			}
			
		}
}
	


