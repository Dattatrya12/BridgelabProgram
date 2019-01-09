package com.utility;
import java.io.FileReader;  
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
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

		   public static void printPoemLyrics() throws FileNotFoundException
		   {
		   Scanner file = new Scanner(new File("poem.txt"));
		   String line = "";
	        while(file.hasNextLine())           
	        {
	                 line = line+"\n"+file.nextLine();
	                 
	             
	        }
	        for(int i=1;i<=9;i++)
	    	{
	    		if(i==1)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Chicks" ).replaceAll("<<SOUND>>","chick-chick");
	    			System.out.println(fin+"\n");
	    		}
	    		
	    		if(i==2)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Duck" ).replaceAll("<<SOUND>>","Quack-quack");
	    			System.out.println(fin+"\n");
	    		}
	    		
	    		if(i==3)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Turkey" ).replaceAll("<<SOUND>>","gobble-gobble");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==4)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Cow" ).replaceAll("<<SOUND>>","moo-moo");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==5)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Pig" ).replaceAll("<<SOUND>>","oink-oink");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==6)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Cat" ).replaceAll("<<SOUND>>","meow-meow");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==7)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Dog" ).replaceAll("<<SOUND>>","Bow-Bow");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==8)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Mule" ).replaceAll("<<SOUND>>","Heehaw-Heehaw");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==9)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Turtle" ).replaceAll("<<SOUND>>","nerp-nerp");
	    			System.out.println(fin);
	    		}

               }
	        }

			/**
			 * @param n taking integer from user
			 * @param taking list of array from user 
			 * @return minimum value 
			 * @throws IOException 
			 */
			
			public static int toFindMinValue(int n, int[] arry) throws IOException {
				/*Scanner file = new Scanner(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/MinMax.txt"));
				   String line = "";
			        while(file.hasNextLine())           
			        {*/
				int temp;
				
				
				
				for(int i = 0 ; i <  arry.length ; i++ ) {
					for(int j = i+1 ; j < arry.length ; j++) {
						if(arry[i] > arry[j]) {
							temp = arry[i];
							arry[i] = arry[j];
							arry[j] = temp;
		 				}

					}
						
						}
				
				return arry[0];
			        }
						
		
			/**
			 * @param n take integer from user
			 * @param take list of array from user
			 * @return maximum value 
			 */
			
			public static int toFindMaxValue(int n, int[] arry) {
				int max = arry[0];
				
				
				for(int i = 0 ; i <  arry.length ; i++ ) {
						if(arry[i] > max) {
							max = arry[i];
						}
					
				}
				return max;
		}
			/**********Program to stats using file
			 * @return **********************/
			
			public static int getStats5(int r, int s) {
			
	    		double average;
	    		double sum = 0;
	    		double values[]=new double[5];
	    	
	    		//to find random value
	    		
	    		for(int i = 0 ; i < values.length ; i++) {
	    			values[i] = Math.random();
	    		System.out.println(values[i]);
	    		}
	    		
	    		//to find average
	    		
	    		
	    	
				for(int i = 0 ; i < values.length ; i++) {
	    			sum = sum+values[i];
	    		}
	    		average = sum/5;
	    		System.out.println("average is: "+average);
	    		
	    		//to find maximum value
	  
	    		double max = values[0];
	    		for(int i = 0 ; i < values.length ; i++) {
	    			 if(values[i]>max) {
	    				 max = values[i];
	    			 }
	    			 }
	    		System.out.println("Maximum value is: "+max);

	    		//to find minimum value
	    		
	    		double min = values[0];
	    		for(int i = 0 ; i < values.length ; i++) {
	    			 if(values[i]<min) {
	    				  min = values[i];
	    			 }
	    			 }
	    		System.out.println("Minimum value is: "+min);
				return s;
				
				
	    }
public static int[][] trasposDemo(int row,int col){
				
				int [][]array = new int [row][col];
				  System.out.println("Enter element in matrix :");
				  
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						   array[i][j] = Utility.getInt();
					  }
				  }
				  System.out.println();
				  
				  System.out.println("before matrix:");
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						  System.out.print(array[i][j]+"\t");
					  }
					  System.out.println();
				  }
				
				  System.out.println("after matrix is below:");
				int newArr[][]=new int[3][3];
				for(int i=0;i<col;i++) {
					for(int j=0;j<row;j++) {
						newArr[i][j]=array[j][i];
						System.out.print(array[j][i]+"\t");
					}
					System.out.println();
				

		}
				return newArr ;
			
		}
            public static int increment(int a)
            {
            	a++;
            	System.out.println(a);
            	return a;
            }
           
			
	          		
	          		
	          	}
			


		   
		 
