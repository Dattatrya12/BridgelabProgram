package com.patterns;

public class PatternBox {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<=5;i++)  //rows
		{
			for(j=0;j<=5;j++)  //columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
