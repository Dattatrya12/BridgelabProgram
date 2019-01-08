package com.patterns;

public class PassByValueAndPassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=25;
		System.out.println("Before calling the display method number:"+number);
        display(number);
		System.out.println("after calling the display method number:"+number);

	}
	public static void display(int num)
	{
		System.out.println("Inside the display Method"+num);
		 num=100;
			System.out.println("Inside the display Method modification"+num);

	}

}
