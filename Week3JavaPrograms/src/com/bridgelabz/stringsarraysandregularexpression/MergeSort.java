package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class MergeSort {
	 public static void main(String args[]) 
	    { 
	        int arr[] = {12, 11, 13, 5, 6, 7}; 
	        System.out.println("Given Array"); 
	        Utility.printArray(arr); 
	        Utility.sort(arr, 0, arr.length-1); 
	        System.out.println("\nSorted array"); 
	        Utility.printArray(arr); 
	    } 
	} 

