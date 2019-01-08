package com.bridgelabz.stringsarraysandregularexpression;

import java.util.Scanner;

import com.utility.Utility;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a any number:");
		int n=sc.nextInt();
		int i=Utility.perf(n);
          if(i==n)
          {
        	  System.out.println(n+"is a perfect number");
          }
          else
          {
        	  System.out.println(n+"is not perfect");
          }
	}

}
