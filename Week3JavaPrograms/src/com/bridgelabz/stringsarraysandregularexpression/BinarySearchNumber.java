package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class BinarySearchNumber {
    public static void main(String args[]) {

    //BinarySearch ob = new BinarySearch(); 
    int arr[] = { 2, 3, 4, 10, 40 }; 
    int n = arr.length; 
    int srch = 10; 
    int result = Utility.binarySearch(arr, 0, n - 1, srch);
    if (result == -1) 
        System.out.println("Element not present"); 
    else
        System.out.println("Element found at index " + result); 
} 
} 
	