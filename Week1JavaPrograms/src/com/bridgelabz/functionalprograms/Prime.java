package com.bridgelabz.functionalprograms;

import com.utility.Utility;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("Enter any positive number: ");
				int n = Utility.getInt();
				Utility.getPrime(n);
				

			}
	public static void getPrime(int n) {
		
		  //  List<Integer> primes = new ArrayList<Integer>();
		    
			String primeNumbers = " ";
			 for (int i = 1; i <= n; i++)  	   
		      { 		 		  
		         int counter=0; 		  
		         for(int num =i; num>=1; num--)
		         {
			    if(i%num==0)
			    {
				counter = counter + 1;
			    }
			    
			 }
			 if (counter ==2)
			 {
			    //Appended the Prime number to the String
			    primeNumbers = primeNumbers + i + " ";
			 }	
		      }	
		      System.out.println("Prime numbers from 1 to "+n+" are :");
		       
			System.out.println(primeNumbers);
	}
			


	}


