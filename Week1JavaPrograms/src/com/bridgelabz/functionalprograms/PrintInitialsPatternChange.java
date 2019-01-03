package com.bridgelabz.functionalprograms;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.utility.Utility;

public class PrintInitialsPatternChange {
		public static void main(String[] args) throws FileNotFoundException {
			  while(true)
			  {
			System.out.println("Please Enter 1 for print K \n 2.  Print Pattern of D \n 3. Print Pattern of W : \n 4.print pattern of KDW ");
			System.out.println("5.Enter value of KD\n 6.Enter Pattern of KW\n7. Enter pattern of DK\n8.pattern of DKW");
			System.out.println("9.Enter value of WD \n10.Enter the value of the WK \n11.Enter the value of WKD ");
			int s = Utility.getInt();
			PrintInitialsPatternChange.enterValue(s);
		}
		}	


	public static void enterValue(int s) throws FileNotFoundException {
			switch (s) {
			  case 1:
				System.out.println("Entered String is K");
				PrintInitialsPatternChange.patternOfK(s);
				break;
			case 2:
				System.out.println("Entered String is D");
				PrintInitialsPatternChange.patternOfD(s);
				break;
			case 3:
				System.out.println("Entered String is W");
				PrintInitialsPatternChange.patternOfW(s);
				break;
				
			case 4:
				System.out.println("Entered String is KDW");
				PrintInitialsPatternChange.patternOfKDW(s);
				break;
			case 5:
				System.out.println("Entered String is KD");
				PrintInitialsPatternChange.patternOfKD(s);
				break;
			case 6:
				System.out.println("Entered String is KW");
				PrintInitialsPatternChange.patternOfKW(s);
				break;
			case 7:
				System.out.println("Entered String is DK");
				PrintInitialsPatternChange.patternOfDK(s);
				break;
			case 8:
				System.out.println("Entered String is DKW");
				PrintInitialsPatternChange.patternOfDKW(s);
				break;
				case 9:
					System.out.println("Entered String is WD");
					PrintInitialsPatternChange.patternOfWD(s);
					break;
					case 10:
						System.out.println("Entered String is WK");
						PrintInitialsPatternChange.patternOfWK(s);
						break;
					case 11:
						System.out.println("Entered String is WKD");
						PrintInitialsPatternChange.patternOfWKD(s);
						break;
			default:
				System.out.println("invalid input please enter again : ");
				int s1 = Utility.getInt();
				PrintInitialsPatternChange.enterValue(s1);
				break;
			}

		}
	
	/*public static void patternOfKD(int s) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new File("KDW1.txt"));
		try {
		   FileReader fw;
			fw = new FileReader("KDW1.txt");
			char ch;
			while ((ch=(char) fw.read())!=-1) 
		            System.out.print((char)ch); 
		  
		        // close the file 
		        //fr.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
          // fw.write("Welcome to javaTpoint.");    
           //fw.close();    
	}
*/
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

			for(int j = 0 ; j<13 ; j++) {
				
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
			
		



		public static void patternOfW(int s) throws FileNotFoundException {
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
		@SuppressWarnings("unused")
		public static void patternOfKDW(int s) throws FileNotFoundException {
			String str="";
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(new File("KPrintInitials.txt"));
			@SuppressWarnings("resource")
			Scanner reader1 = new Scanner(new File("DPrintInitials.txt"));
			@SuppressWarnings("resource")
			Scanner reader2 = new Scanner(new File("WPrintInitials.txt"));

			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<13; j++) {
				
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
				
	
		while (reader1.hasNext()){
			str = reader1.nextLine();

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
		while (reader2.hasNext()){
			str = reader2.nextLine();

		for(int j = 0 ; j<31 ; j++) {
			
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
		

			

		public static void patternOfKD(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("KD.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<29; j++) {
				
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
		public static void patternOfKW(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("KW.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<46; j++) {
				
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

		public static void patternOfDK(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("DK.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<29; j++) {
				
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
		public static void patternOfDKW(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("DKW.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<62; j++) {
				
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
		public static void patternOfWD(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("WD.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<47; j++) {
				
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
		public static void patternOfWK(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("WK.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<46; j++) {
				
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
		public static void patternOfWKD(int s) throws FileNotFoundException {
			String str="";
			Scanner reader = new Scanner(new File("WKD.txt"));
			while (reader.hasNext()){
				str = reader.nextLine();

			for(int j = 0 ; j<62; j++) {
				
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
			
		
}