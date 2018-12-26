package com.bridgelabz.stringsarraysandregularexpression;



import com.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
        Utility.bubbleSort(arr);
        System.out.println("Sorted array");
        Utility.printArrayOfBubbleSort(arr);

	}

}