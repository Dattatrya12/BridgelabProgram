package com.utility;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Aim:utility class to Define all basic logic.
 * 
 * @author Dattatrya Age
 *@version:1.0
 *@since:12-12-2018
 */
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
	   /********************BinarySearchWord*********************/
	   public static void searchWord() throws FileNotFoundException
	   {
		   String word = ""; int val = 0;
		    while(!word.matches("quit"))
		    {
		        System.out.println("Enter the word to be searched for");
		        Scanner input = new Scanner(System.in);
		        word = input.next();
		        Scanner file = new Scanner(new File("SearchWord.txt"));

		        while(file.hasNextLine())           
		        {
		            String line = file.nextLine();
		            if(line.indexOf(word) != -1)
		            {
		                System.out.println("Word EXISTS in the file");
		                val = 1;
		                break;
		            }
		            else
		            {
		                val = 0;
		                continue;
		            }
		        }
		        if(val == 0)
		        {
		            System.out.println("Word does not exist");
		        }
		        System.out.println("-------continue or quit--- enter continue or quit");
		        word = input.next();        
		    }     
	   }
	   /******************Insersation SORT USING String********/
	   public static String[] insersationSort(String array[], int n){
		   String temp="";
		   for(int i=0;i<n;i++){
		   for(int j=i+1;j<n;j++){
		   if(array[i].compareToIgnoreCase(array[j])>0){
		   temp = array[i];
		   array[i]=array[j];
		   array[j]=temp;
		   }
		   }
		   }
		   return array;
		   }
		   
	      /*********************BubbleSort**********************/
	    public static void bubbleSort(int arr[])
	       {
	           int n = arr.length;
	           for (int i = 0; i < n-1; i++)
	               for (int j = 0; j < n-i-1; j++)
	                   if (arr[j] > arr[j+1])
	                   {
	                       // swap temp and arr[i]
	                       int temp = arr[j];
	                       arr[j] = arr[j+1];
	                       arr[j+1] = temp;
	                   }
	       }
	   /* Prints the array */
	      public static void printArrayOfBubbleSort(int arr[])
	       {
	           int n = arr.length;
	           for (int i=0; i<n; i++)
	               System.out.print(arr[i] + " ");
	           System.out.println();
	       }
	      
	      /***************************BinarySearchProgram**********************/
	    public static  int binarySearch(int arr[], int low, int high, int srch) 
	      { 
	          if (high >= low) { 
	              int mid = low + (high - low) / 2; 
	                if (arr[mid] == srch) 
	                  return mid; 
	                if (arr[mid] > srch) 
	                  return binarySearch(arr, low, mid - 1, srch); 
	            return binarySearch(arr, mid + 1, high, srch); 
	          } 
	    
	          // We reach here when element is not present 
	          // in array 
	          return -1; 
	      } 
	    
	      
	    
}