package com.patterns;

public class PatternOfCharacter {

	public static void main(String[] args) {
		String s="Java";
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(s.charAt(j-1)+"");
				}
				
			}
			System.out.println();
		}

	}

}
