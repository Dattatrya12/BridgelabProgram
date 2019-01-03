package com.bridgelabz.stringsarraysandregularexpression;

import java.io.IOException;

import com.utility.Utility;

public class BinarySearchWordArray {

public static void main(String[] args) throws IOException {
		
		//take integer from user
		
		System.out.println("Enter any word for checking : ");
		String word = Utility.getString();
		Utility.binarySearch(word);
		}
	}
