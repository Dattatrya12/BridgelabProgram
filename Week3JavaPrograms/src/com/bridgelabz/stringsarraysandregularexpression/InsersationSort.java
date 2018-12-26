package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class InsersationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr ={"Dattatrya","Sushant","Parmeshwar","Rahul","Sagar"};
		int count = 0;
		String sortedArray[] = Utility.insersationSort(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
		}

	
}
