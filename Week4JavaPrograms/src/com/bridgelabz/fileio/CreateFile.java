package com.bridgelabz.fileio;
import java.io.*;
import java.util.*;
import java.lang.*;
public class CreateFile {
	private static Formatter x;
     public void openFile()
     {
    	 try
    	 {
    		x=new Formatter("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/Stats.txt") ;
    	 }
          catch(Exception e)
    	 {
        	  System.out.println("Error in the File:");
    	 }
}
     public static int  addRecords(int r,int s)
     {
    	 
    	 double average;
  		double sum = 0;
  		double values[]=new double[5];
  	
      for(int i = 0 ; i < values.length ; i++) {
 			values[i] = Math.random();
 		x.format("Values:", values[i]);
 		}
 		
 		//to find average
 		
 		for(int i = 0 ; i < values.length ; i++) {
 			sum = sum+values[i];
 		}
 		average = sum/5;
 		x.format("average is:", +average);
 		
 		//to find maximum value

 		double max = values[0];
 		for(int i = 0 ; i < values.length ; i++) {
 			 if(values[i]>max) {
 				 max = values[i];
 			 }
 			 }
 		x.format("Maximum value is:", +max);

 		//to find minimum value
 		
 		double min = values[0];
 		for(int i = 0 ; i < values.length ; i++) {
 			 if(values[i]<min) {
 				  min = values[i];
 			 }
 			 }
 		x.format("Minimum value is", +min);
		return r;
 		
 		
 		
 }
    	 
     
    	// x.format("%s %s %s", "999","datta","age");
   
			
 		
     public void closeFile()
     {
    	 x.close();
     }
}