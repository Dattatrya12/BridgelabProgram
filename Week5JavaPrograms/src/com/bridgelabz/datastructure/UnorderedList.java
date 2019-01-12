package com.bridgelabz.datastructure;

import java.io.IOException;

import com.utility.Utility;

public class UnorderedList {
public static void main(String[] args) throws IOException {
		
		//take integer from user
		
		System.out.println("Enter any word for checking : ");
		String word = Utility.getString();
		Utility.unorderedList(word);
		
		}

}