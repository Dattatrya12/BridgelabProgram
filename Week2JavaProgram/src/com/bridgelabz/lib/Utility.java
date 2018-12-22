package com.bridgelabz.lib;

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
	

}
