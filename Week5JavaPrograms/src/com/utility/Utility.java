package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utility {
    static Scanner scanner=new Scanner(System.in);
  public static int getInt()
 {
	   int integerValue=scanner.nextInt();
	   return integerValue;
 }
 public static float getFloat()
 {
	   int floatValue=scanner.nextInt();
	   return floatValue;
 }
 public static double getDouble()
 {
	   double doubleValue=scanner.nextDouble();
	   return doubleValue;
 }
 public static String getString()
 {
	   String stringValue=scanner.nextLine();
	   return stringValue;
 }
 public static double getLong()
 {
	   double longValue=scanner.nextLong();
	   return longValue;
 }
 

}