package com.patterns;

public class PatternOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)>10)
					break;
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
