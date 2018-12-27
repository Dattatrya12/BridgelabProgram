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
	    /********************MergeSort*******************/
	   public static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	   public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	  
	    /* A utility function to print array of size n */
	    public static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  //***************** Method for to print frequecy count ********************//
		
	  		public static int frequecyCount(String str) {
	  			String s1[] = str.split(" ");
	  	         System.out.println(s1.length);
	  	         System.out.println("Entered String");
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         System.out.print(s1[i]);
	  	         System.out.print(" ");
	  	         }
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         	for(int j = i+1; j < s1.length; j++)
	  	         	{
	  	         	if(s1[i].compareTo(s1[j]) > 0)// compare charecters of string
	  	         	{
	  	         		String temp = s1[i];
	  	         		s1[i] = s1[j];
	  	         		s1[j] = temp;
	  	         	}
	  	         }
	  	         }
	  	         System.out.println();
	  	         System.out.println("Sorted String:");
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         System.out.print(s1[i]);
	  	         System.out.print(" ");
	  	         }
	  	         System.out.println();
	  	         int count = 1;
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         	for(int j = i+1; j < s1.length; j++)
	  	         	{
	  	         		if(s1[i].equals(s1[j]))// count repeated element in string
	  	         		{
	  	         			count ++;
	  	         			s1[j] = "0";// REPLACE ELEMENT TO ZERO IF MATCH
	  	         		}
	  	         }
	  	         	if(s1[i] != "0")
	  	         	{
	  	         		System.out.println("Frequency of "+s1[i]+"= "+count );
	  	         	}
	  	         count = 1;
	  	 }
	  			return count;

	  		}	
	  		
	  		
	  	//**************** Method for frequency count **************************************************//
	  		
	  		public static int numberChek(int n) {
	  			
	  		
	  		System.out.println("Imagine number between 0 to " +n);
	      	int low=0;
	      	int high=n;
	      	int guess=(low+high)/2;
	      	char input=' ';
	      	int tries=1;
	      	if(high>=low) 
	      	{
	      		while(input !='y') 
	      		{
	      			
	      			System.out.println("Is your number"+guess+"?");
	      			System.out.println("y/n");
	      			input=scanner.next().charAt(0);
	      			if(input == 'n')
	      			{
	  	    			System.out.println("h.Is your number higher than "+ guess+"?");
	  	    			System.out.println("l.Is your number lower than "+ guess+"?");
	  	    			input=scanner.next().charAt(0);
	  	    			if(input=='h')
	  	        		{
	  	        		    low=guess;
	  	        		    guess=(high+low)/2;
	  	        		    tries++;
	  	        		}
	  	        		else if(input=='l')
	  	        		{
	  	        			high=guess;
	  	        			guess=(high+low)/2;
	  	        			tries++;
	  	            	}
	      			}
	      		}
	      	}
	  		return guess;
	      	
	  }
	  
	      
	    
}