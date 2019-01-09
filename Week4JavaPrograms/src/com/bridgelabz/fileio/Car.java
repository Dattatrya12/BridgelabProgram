package com.bridgelabz.fileio;

public class Car {

	private int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Car c=new Car();
			
			c.a=10;
			increment(c.a);
			System.out.println(c.a);

	}
	public static int increment(int a)
	{
		a++;
		System.out.println(a);
		return a;
	}

}
