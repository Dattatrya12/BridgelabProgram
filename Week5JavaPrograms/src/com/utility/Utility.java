package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
    static Scanner scanner=new Scanner(System.in);
  public static int getInt()
 {
	   int integerValue=scanner.nextInt();
	   return integerValue;
 }
 public static float getFloat()
 {
	   int floatValue=scanner.nextInt();
	   return floatValue;
 }
 public static double getDouble()
 {
	   double doubleValue=scanner.nextDouble();
	   return doubleValue;
 }
 public static String getString()
 {
	   String stringValue=scanner.nextLine();
	   return stringValue;
 }
 public static double getLong()
 {
	   double longValue=scanner.nextLong();
	   return longValue;
 }
 public static void unorderedList(String word) throws IOException {
		
		//Read in a list of words from File

		  		//String p = "";
				String str="";
				Scanner reader = new Scanner(new File("unorderedlist.txt"));
				while (reader.hasNext()){
					str = reader.nextLine();
			
				}
				
				String s = str;
				//String check = "";
		        String[] arrOfStr = s.split(",", str.length()); 
		        
		        MyLinkedList<String> al = new MyLinkedList<String>();
		        for(int i = 0 ; i < arrOfStr.length ; i++) {
		        	al.add(arrOfStr[i]);
		        }
		        al.show();
	        	if(al.search(word)){
	        		String s1 = word;
	        		System.out.println("this word is alredy in list so remove it");
	        		//System.out.println(al.index(s1));
					int Deletedata = al.index(s1);
					al.pop(Deletedata);
					al.show();
	        	
		        	   }
	        		else 
	        		{
	        			System.out.println("this word is not in the list so add it");
	    				al.add(word);
	    				al.show();
	        			
	        		}
}
//****************** balanced Paratheses *******************************//	
	
		public static boolean checkForValidExpression(String expression) {
			
			MyStack<Character> mystack=new MyStack<Character>();
			char paranthes;
			for(int i=0;i<expression.length();i++)
			{
				paranthes=expression.charAt(i);
				if(paranthes=='(' || paranthes=='{' || paranthes=='[')
				{
					mystack.push(paranthes);
				}
				
					else
					{
						if(mystack.pop() != null) {
							return false;
						}
						switch (paranthes)
						{
						case ')':
							if(mystack.peek().equals('('))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						case '}':
							if(mystack.peek().equals('{'))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						case ']':
							if(mystack.peek().equals('['))
							{
								mystack.pop();
							}
							else
							{
								return false;
							}
							break;
						}
					}
				}
			return true;
		}

}