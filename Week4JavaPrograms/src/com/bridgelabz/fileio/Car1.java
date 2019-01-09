package com.bridgelabz.fileio;

public class Car1 {

	private int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		c.a=10;
		increment(c);//c=10
		System.out.println(c.a);

	}
	public static void increment(Car1 c)
	{
		c.a++;
		
	}
}
