package com.patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of lines(odd numbers)");
		Scanner scanner=new Scanner(System.in);
		int lines=scanner.nextInt();
         int mid=(lines+1)/2;
         //upper portion
         for(int i=1;i<=mid;i++)
         {
        	 for(int s=1;s<=(mid-i);s++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=(i*2-1);j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         //lower
         for(int i=1;i<=(mid-1);i++)
         {
        	for(int s=1;s<=i;s++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*(mid-i)-1;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
         }
         
	}

}
