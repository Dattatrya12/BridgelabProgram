package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
          int res[]=Utility.primeAnagrams(1000);
          System.out.println("Pairs of Anagram are:");
          for(int i=0;i<158;i+=2)
          {
        	  System.out.print(res[i]+ " & " +res[i+1]+"\n");
          }
	}

}
