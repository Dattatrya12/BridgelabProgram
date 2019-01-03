package com.utility;



import java.util.Scanner;

public class Utility {static Scanner scan = new Scanner(System.in);

/*
 *  This method is used to take integer input from user
 */

public static int getInt() {
int Integer = scan.nextInt();
return Integer;
}

/*
 *  This method is used to take float input from user
 */

public static float getFloat() {
	float Float = scan.nextFloat();
	return Float;
	}

/*
 *  This method is used to take string input from user
 */

public static String getString() {
	String string = scan.nextLine();
	return string;
	}
public static String stringNext() {
	String string = scan.next();
	return string;
}


public static void start()
{
	long startTimer=0;
	
	
	startTimer=System.currentTimeMillis();
	System.out.println("Start Time is: "+startTimer);
}

// to stop timer
public static void stop()
{
	
	long stopTimer=0;
	stopTimer=System.currentTimeMillis();
	System.out.println("Stop Time is: "+stopTimer);
}

public static long getElapsedTime()
{
	
	int stopTimer=0;
	long startTimer=0;
	long elapsed=stopTimer-startTimer;
	return elapsed;
}
	

}
