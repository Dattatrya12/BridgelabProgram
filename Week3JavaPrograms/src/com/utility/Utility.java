package com.utility;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Aim:utility class to Define all basic logic.
 * 
 * @author Dattatrya Age
 *@version:1.0
 *@since:12-12-2018
 */
public class Utility  {
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
	   /********************BinarySearchWord*********************/
	   public static void searchWord() throws FileNotFoundException
	   {
		   String word = ""; int val = 0;
		    while(!word.matches("quit"))
		    {
		        System.out.println("Enter the word to be searched for");
		        Scanner input = new Scanner(System.in);
		        word = input.next();
		        Scanner file = new Scanner(new File("SearchWord.txt"));

		        while(file.hasNextLine())           
		        {
		            String line = file.nextLine();
		            if(line.indexOf(word) != -1)
		            {
		                System.out.println("Word EXISTS in the file");
		                val = 1;
		                break;
		            }
		            else
		            {
		                val = 0;
		                continue;
		            }
		        }
		        if(val == 0)
		        {
		            System.out.println("Word does not exist");
		        }
		        System.out.println("-------continue or quit--- enter continue or quit");
		        word = input.next();        
		    }     
	   }
	   /******************Insersation SORT USING String********/
	   public static String[] insersationSort(String array[], int n){
		   String temp="";
		   for(int i=0;i<n;i++){
		   for(int j=i+1;j<n;j++){
		   if(array[i].compareToIgnoreCase(array[j])>0){
		   temp = array[i];
		   array[i]=array[j];
		   array[j]=temp;
		   }
		   }
		   }
		   return array;
		   }
		   
	      /*********************BubbleSort**********************/
	    public static void bubbleSort(int arr[])
	       {
	           int n = arr.length;
	           for (int i = 0; i < n-1; i++)
	               for (int j = 0; j < n-i-1; j++)
	                   if (arr[j] > arr[j+1])
	                   {
	                       // swap temp and arr[i]
	                       int temp = arr[j];
	                       arr[j] = arr[j+1];
	                       arr[j+1] = temp;
	                   }
	       }
	   /* Prints the array */
	      public static void printArrayOfBubbleSort(int arr[])
	       {
	           int n = arr.length;
	           for (int i=0; i<n; i++)
	               System.out.print(arr[i] + " ");
	           System.out.println();
	       }
	      
	      /***************************BinarySearchProgram**********************/
	    public static  int binarySearch(int arr[], int low, int high, int srch) 
	      { 
	          if (high >= low) { 
	              int mid = low + (high - low) / 2; 
	                if (arr[mid] == srch) 
	                  return mid; 
	                if (arr[mid] > srch) 
	                  return binarySearch(arr, low, mid - 1, srch); 
	            return binarySearch(arr, mid + 1, high, srch); 
	          } 
	    
	          // We reach here when element is not present 
	          // in array 
	          return -1; 
	      } 
	    /********************MergeSort*******************/
	   public static void merge(int arr[], int l, int m, int r) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	    // Main function that sorts arr[l..r] using 
	    // merge() 
	   public static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	  
	    /* A utility function to print array of size n */
	    public static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  //***************** Method for to print frequecy count ********************//
		
	  		public static int frequecyCount(String str) {
	  			String s1[] = str.split(" ");
	  	         System.out.println(s1.length);
	  	         System.out.println("Entered String");
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         System.out.print(s1[i]);
	  	         System.out.print(" ");
	  	         }
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         	for(int j = i+1; j < s1.length; j++)
	  	         	{
	  	         	if(s1[i].compareTo(s1[j]) > 0)// compare charecters of string
	  	         	{
	  	         		String temp = s1[i];
	  	         		s1[i] = s1[j];
	  	         		s1[j] = temp;
	  	         	}
	  	         }
	  	         }
	  	         System.out.println();
	  	         System.out.println("Sorted String:");
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         System.out.print(s1[i]);
	  	         System.out.print(" ");
	  	         }
	  	         System.out.println();
	  	         int count = 1;
	  	         for(int i = 0; i< s1.length ; i++)
	  	         {
	  	         	for(int j = i+1; j < s1.length; j++)
	  	         	{
	  	         		if(s1[i].equals(s1[j]))// count repeated element in string
	  	         		{
	  	         			count ++;
	  	         			s1[j] = "0";// REPLACE ELEMENT TO ZERO IF MATCH
	  	         		}
	  	         }
	  	         	if(s1[i] != "0")
	  	         	{
	  	         		System.out.println("Frequency of "+s1[i]+"= "+count );
	  	         	}
	  	         count = 1;
	  	 }
	  			return count;

	  		}	
	  		
	  		
	  	//**************** Method for frequency count **************************************************//
	  		
	  		public static int checkNumber(int n) {
	  			
	  		
	  		System.out.println("Imagine number between 0 to " +n);
	      	int low=0;
	      	int high=n;
	      	int guess=(low+high)/2;
	      	char input=' ';
	      	int tries=1;
	      	if(high>=low) 
	      	{
	      		while(input !='y') 
	      		{
	      			
	      			System.out.println("Is your number"+guess+"?");
	      			System.out.println("y/n");
	      			input=scanner.next().charAt(0);
	      			if(input == 'n')
	      			{
	  	    			System.out.println("h.Is your number higher than "+ guess+"?");
	  	    			System.out.println("l.Is your number lower than "+ guess+"?");
	  	    			input=scanner.next().charAt(0);
	  	    			if(input=='h')
	  	        		{
	  	        		    low=guess;
	  	        		    guess=(high+low)/2;
	  	        		    tries++;
	  	        		}
	  	        		else if(input=='l')
	  	        		{
	  	        			high=guess;
	  	        			guess=(high+low)/2;
	  	        			tries++;
	  	            	}
	      			}
	      		}
	      	}
	  		return guess;
	      	
	  }
	  	//***************** Regular expression **********************************//
			
			public static void regexExpression(String fname, String mobnum , String fname1) {
				
				String Message = "Hello <<name>>, We have your full name\n" +
				           
			                "as <<full name>> in our system. your contact number is +91­xxxxxxxxxx. Please,let us\n" +
			                "know in case of any clarification Thank you BridgeLabz 01/01/2016. " ;
			       
			        String regexName = "<<name>>" ;
			       
			        String regexFname = "<<full name>>" ;
			        
			        String regexNum = "­xxxxxxxxxx";
			       
			        String regexDate = "01/01/2016";
			       
			        SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");

			        Date date = new Date();
			       
			        String fdate = Date.format(date);
			       
			        //System.out.println("Date: " +fdate);
			        Message = details(Message, regexName, fname1);
			        Message = details(Message, regexFname,fname );
			        Message = details(Message, regexNum, mobnum);
			        Message = details(Message, regexDate, fdate);
			       

			        System.out.println(Message);
			}
			
		    public static String details(String Template , String regexName , String regexFname){
			       
		        //pattern object which defines the regular expression
		       
		        Pattern pattern = Pattern.compile(regexName);
		       
		        //matcher object
		        Matcher match = pattern.matcher(Template);
		        return match.replaceAll(regexFname);

		    }
		
		//***************** method for replacement of regex ***************//
		    public static String replaceWithpattern(String str , String replace) {
		    	Pattern pattern = Pattern.compile("\\s+");
		    	Matcher matcher = pattern.matcher(str);
		    	return matcher.replaceAll(replace);
		    }
		    
		 //*************** method for replace all ***********************//
		    public static String replaceAll(String regex, String replacement) {
		        return Pattern.compile(regex).matcher(replacement).replaceAll(replacement);
		    }
		  public static  String[] macOldDonaldPoem(String[] a){String o="Old MacDonald had a farm",e=", "
		  		+ "E-I-E-I-O",x=" a "+a[1],s=x+" "+a[1];
		  System.out.print(o+e+",\nAnd on that farm he had a "+a[0]+e+","
		  		+ "\nWith"+s+" here and"+s+" there,\nHere"+x+", "
		  				+ "there"+x+", everywhere"+s+",\n"+o+e+"!");
		return a;}
/*************************2D Array Program**********************/		  

		  public static int[][] arrayInt(int m,int n)
			{
				int a[][]=new int[m][n];
				Utility u=new Utility();    
				System.out.println();
				System.out.println("Integer Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
				    {
						a[i][j] = u.getInt();
				    }   
				}
				return a;
			}
		//display method
			public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
			{
			PrintWriter pw=new PrintWriter(System.out,true);
			
			//display integers
			System.out.println();
			pw.println("2D ARRAY INTEGER");
			
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
		        {
					pw.print("\t"+a[i][j]+" ");
		        } 
		     pw.println("\t");
		    }
			}
			
			public static double[][] arrayDouble(int m,int n)
			{
				double b[][]=new double[m][n];
				Utility u=new Utility();    
				System.out.println();
				System.out.println("Double Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
				    {
						b[i][j] = u.getDouble();
				    }   
				}
				return b;
			}
			
			public static void display1(int[][]a,double[][]b,String[][]c,int m,int n)
			{
				PrintWriter pw=new PrintWriter(System.out,true);

			//display double
			System.out.println();
			pw.println("2D ARRAY DOUBLE");
				
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
			    {
					pw.print("\t"+b[i][j]+" ");
			    } 
			pw.println("\t");
			}
			}
			public static String[][] arrayBoolean(int m,int n)
			{
			String c[][]=new String[m][n];
			Utility u=new Utility();    
			System.out.println();
			System.out.println("Boolean Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
					{
						c[i][j] = u.getString();
					}   
				}
			return c;
			}
		
			public static void display2(int[][]a,double[][]b,String[][]c,int m,int n)
			{
				PrintWriter pw=new PrintWriter(System.out,true);

				 
			//display boolean
			System.out.println();
			pw.println("2D ARRAY BOOLEAN");
					
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
				{
					pw.print("\t"+c[i][j]+" ");
				} 
			pw.println("\t");
			}
			
		}
			/************************ method for regex *******************************************************/
			
			
			public static String checkResult(String firstName, String lastName, String phoneNumber, String emailId, String userName, String passWord)
			{
				boolean validation= false;
				System.out.println("Enter first name of user:");
				 while(validation !=true) {
					  firstName = Utility.getString();
					 validation = Utility.stringValidation(firstName);
						if(validation == false)
						{
							System.out.println("Enter correct name");
						}
						return firstName;
					}
				 
				 validation = false;
					System.out.println("Enter last name");
					while(validation != true)
					{
					 lastName =Utility.getString();
						validation = Utility.stringValidation(lastName);
						if(validation == false)
						{
							System.out.println("please Enter correct Lastname");
						}
					}
			

		       validation = false;
			System.out.println("Enter user phone number");
			while(validation != true)
			{
				 phoneNumber = Utility.getString();
				validation = Utility.contactValidation(phoneNumber);
				if(validation == false)
				{
					System.out.println("please Enter correct phone number");
				}
			}
			return phoneNumber;
			}
			
			
			//********************** method for Replacement *********************************//
			   //match and and replace element by regex
			    public static String replacementregex(String s,String change,String req)
			    {
			    	Pattern p = Pattern.compile(change);
			    	Matcher m = p.matcher(s);
			    	return m.replaceAll(req);
			    }
			    
			//********************* method for to check string valiation*********************//
			    
			   // check my String contain character in string 
			    public static boolean stringValidation(String name)
			    {
			    	String regex ="[a-zA-z]+";
			    	if(name.matches(regex) == true)
			    	{
			    		return true;
			    	}
			    	return false;
			    }

			//*********************** method for email validation ***************************//
			    
			    public static boolean emailidValidation(String eid)
			    {
			    	String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";//String starts with word + indicate continuation
			    	//\\^ MAtch starts with
			    	//\\+ continue
			    	//\\w  MAtch wordcharacter
			    	//\\.  Match contain .
			    	if(eid.matches(regex) == true )
			    	{
			    		return true;
			    	}
			    	return false;
			    	
			    }
			//********************** method for contact validation **************************//
			    
		    public static boolean contactValidation(String phno)
			    {
			    	String regex ="[0-9]{10}$";
			    	if(phno.matches(regex) == true)
			    	{
			    		return true;
			    		
			    	}
			    	return false;
			    }
			//********************** method for user id validation *************************//
			    
		    public static boolean uIdValidation(String uname)
			    {
			    	String regex ="[0-9a-zA-Z]+";
			    	if(uname.matches(regex) == true)
			    	{
			    		return true;
			    	}
			    	return false;
			    }   
			//********************* method for password validation ************************//
		    
			public static boolean  passwordValidation(String password,String fn,String ln,String un)

			{
				String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
				         
				if(password.matches(regex) == true && (password != fn||password != ln||password != un))
				{
					return true;
				}
			return false;
			}
		/********************************BinarySearchwordFile******************/
			public static void binarySearch(String word) throws IOException {

				//Read in a list of words from File
				
				String str="";
				Scanner reader = new Scanner(new File("SearchWord.txt"));
				while (reader.hasNext()){
					str = reader.nextLine();
			  }
				String s = str;
				String check = "";
		        String[] arrOfStr = s.split(",", 4); 
		        int first = 0;
		        int last = arrOfStr.length;
		        int mid  =  (first + last)/2;
		        
		        //loop for search words upto mid point.
		        
		        
		        for(int i = 0 ; i <= mid ; i++) {
		        	if(word.equals(arrOfStr[i])) {
		        		check = arrOfStr[i];
		        	}
		        }
		        
		        //loop for search word after mid point.
		        
		        for(int i = mid ; i < last ; i++) {
		        	if(word.equals(arrOfStr[i])) {
		        		check = arrOfStr[i];
		        	}
		        }
				
					if(word.equals(check)) {
						System.out.println("yes, word is found");

					}
				else {
						System.out.println("word is not found");
					}		
			}
			
			/*******************Program to print TWODPrime anagram and palinrome*******/
			public static int[] prime2DArray(int range) {
				int array[] = new int[range];

				int index=0;
				for(int value=2;value<range;value++) {
					if(isPrime(value)) {
						array[index] = value;
						index++;
					}
				}
				return array;
				
			}
			
			public static boolean isPrime(int n) {
				//n>=100
				for(int j=2;j<=n/2;j++) {
					int rem = n % j;
					
					if(rem == 0) {
						return false;
					}
					
				}
				return true;

}
			/**
			 * Function is used to check the pallindrome prime numbers
			 * 
			 * @param number which is to be checked for pallindrome
			 * @return true if the given number is pallindrome,false if it is not
			 */
			public static boolean isPallindrome(int number) 
			{
				int temp=number;
				int reverseNumber=0;
				while(number>0)
				{
					int remainder= number%10;
					reverseNumber=(reverseNumber*10)+remainder;
					number/=10;
				}
				return (temp==reverseNumber);
			}

			
			public static int[] primeAnagrams(int range) {
				int index = 0;
				String[] array1 = new String[168];
				int[] anagram = new int[168];
				int count = 0;
				
				for(int i=2;i<range;i++){
					if(Utility.isPrime(i)) {
						array1[index] = String.valueOf(i);
						index++;
					}
				}
				
				
				
				for(int i=0;i<index;i++) {
					for(int j=i+1;j<index;j++) {
						if(Utility.isAnagram(array1[j], array1[i])) {
							anagram[count] = Integer.parseInt(array1[i]);
							count++;
							anagram[count] = Integer.parseInt(array1[j]);
							count++;
						}
					}
				}
				
				return anagram;
			}
			public static boolean isAnagram(String str1, String str2) {
				boolean status=true;
				
				if(str1.length() != str2.length())
					status = false;
				else {
					char[] str1Array = str1.toCharArray();
					char[] str2Array = str2.toCharArray();
					
					Arrays.sort(str1Array);
					Arrays.sort(str2Array);
					
					status = Arrays.equals(str1Array, str2Array);
		 		}
				if(status)
					return true;
				else 
					return false;
			}
			
		 	//****************** method for to check prime palinrome check *********//


			public static void primePalindromeCheck(int range) {
				
				System.out.println(" output is given below: ");
			  for(int index = 2;index<range;index++) {
				  if(isPrime(index) && isPallindrome(index)) {
					  System.out.println(index+"\t");
				  }
				  
			  }
				
		}
			/**********************2D primeNumber using array**************/
			public static void twoDPrimeArray() {
				int [][]prime = new int[10][25];
				
				int first=0,second=0,third=0,fourth=0;
				int fifth=0,sixth=0,seventh=0,eight=0,nineth=0,ten=0;
			
				for(int i=2;i<1000;i++) {
					int flag=0;
						 for(int j=2;j<i;j++)
						 {
						if(i%j==0)
							flag=1;
						}
					if(flag==0)
					{
					
					if((i > 0) && (i <= 100))
						prime[0][first++] = i;
					else if((i > 100) && (i <= 200))
						prime[1][second++]=i;
					else if((i > 200) && (i <= 300)) 
						prime[2][third++] = i;
					else if((i > 300) && (i <= 400)) 
						prime[3][fourth++] = i;
					else if((i > 400) && (i <= 500)) 
						prime[4][fifth++] = i;
					else if((i > 500) && (i <= 600)) 
						prime[5][sixth++] = i;
					else if((i>600)&&(i<=700)) 
						prime[6][seventh++]=i;
					else if((i > 700) && (i <= 800)) 
						prime[7][eight++] = i;
					else if((i > 800) && (i <= 900)) 
						prime[8][nineth++] = i;
					
					else if((i > 900) && (i<= 1000))		
						prime[9][ten++] = i;
					
					
					}
					}
				
			     for(int i=0;i<10;i++) {
					  for(int j=0;j<25;j++) 
						   {if(prime[i][j]==0)
							   continue;
							  System.out.print(" |"+prime[i][j]+"| ");
						  }System.out.println();
					  }
					
				  }
			/*********************Calculate the deteminant of the Matrix******/
			public static void checkDeteminatOfaMatrix()
			{
			int arr11[][]=new int[10][10],i,j,n;
			  int det=0;
			  
			  
			       System.out.println("\n\nCalculate the determinant of a 3 x 3 matrix :\n");
			       System.out.println();
				 System.out.println("Input elements in the first matrix :\n");
			       for(i=0;i<3;i++)
			        {
			            for(j=0;j<3;j++)
			            {
				           System.out.println("element -  : "+i+""+j);
				           arr11[i][j]=scanner.nextInt();
			            }
			        }  
				 System.out.println("The matrix is :\n");
				 for(i=0;i<3;i++)
				 {
				   for(j=0;j<3 ;j++)
				     System.out.print(arr11[i][j]+"\t");
				   System.out.println();
				 }

			  for(i=0;i<3;i++)
			      det = det + (arr11[0][i]*(arr11[1][(i+1)%3]*arr11[2][(i+2)%3] - arr11[1][(i+2)%3]*arr11[2][(i+1)%3]));

			  System.out.println("The Determinant of the matrix is: ="+det);
			}
			/************************TransposDemo*************************/
			public static int[][] trasposDemo(int row,int col){
				
				int [][]array = new int [row][col];
				  System.out.println("Enter element in matrix :");
				  
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						   array[i][j] = Utility.getInt();
					  }
				  }
				  System.out.println();
				  
				  System.out.println("before matrix:");
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						  System.out.print(array[i][j]+"\t");
					  }
					  System.out.println();
				  }
				
				  System.out.println("after matrix is below:");
				
				for(int i=0;i<col;i++) {
					for(int j=0;j<row;j++) {
						System.out.print(array[j][i]+"\t");
					}
					System.out.println();
				

		}
				return array ;
			
		}
			/********************************findpower of two*******************/
			public static void getPowerOfTwo()
			{
				System.out.println("Enter the value of n ");
				int n=scanner.nextInt();
				int unitIndex=0,tenIndex=0,hundredIndex=0;
				int power[][]=new int[3][5];
				for(int i=0;i<=n;i++)
				{
					int result=(int) Math.pow(2, i);
				
				if(result>=0 && result<=9)
				{
					power[0][unitIndex]=result;
					unitIndex++;
					
				}
					
				else if(result>=10 && result<=99)
				{
					power[1][tenIndex]=result;
					tenIndex++;
					
				}
				else if(result>=100 && result<=999)
				{
					power[2][hundredIndex]=result;
					hundredIndex++;
					
				}
					
			}
				for(int k=0;k<=2;k++)
				{
					for(int l=0;l<=4;l++)
					{
						System.out.print(power[k][l]+"\t");
					}
					System.out.println();
				}
			}
			public static void printTwoElements(int arr[], int size) 
		    { 
		        int i; 
		        System.out.print("The repeating element is "); 
		  
		        for (i = 0; i < size; i++) { 
		            int abs_val = Math.abs(arr[i]); 
		            if (arr[abs_val - 1] > 0) 
		                arr[abs_val - 1] = -arr[abs_val - 1]; 
		            else
		                System.out.println(abs_val); 
		        } 
		    }
			//*************** Tic Tac Toe ***********************************//
		    
		 	
			   public static void printGameArray(int[][] gameArray) {
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if (gameArray[i][j] == 0) {
								System.out.print("| X |");
							} else if (gameArray[i][j] == 1) {
								System.out.print("| O |");
							} else {
								System.out.print("|   |");
							}
						}
						System.out.println();
						System.out.println("===============");
					}

				}
			   

				public static void computerTurn(int[][] gameArray) {

					Random random = new Random();
					int row = random.nextInt(3);
					int cols = random.nextInt(3);
					if (isValidTurn(gameArray, row, cols)) {
						gameArray[row][cols] = 1;
					} else {
						computerTurn(gameArray);
					}

			}
				
				public static void userTurn(int[][] gameArray) {
					System.out.println("Your Turn....");
					System.out.println("Enter key");
					//System.out.print("Row=");
					int [][] fill = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
					int key = Utility.getInt() ;
					int row=fill[key-1][0];
					int col=fill[key-1][1];
					if (isValidTurn(gameArray, row, col)) {
						gameArray[row][col] = 0;
					} else {
						userTurn(gameArray);
					}

			}
				
				public static  boolean checkWin(int[][] gameArray, int i) {
					for (int j = 0; j < 3; j++) {
						if (gameArray[j][0] == i && gameArray[j][1] == i  // ||
								&& gameArray[j][2] == i) {
							return true;
						}
						if (gameArray[0][j] == i && gameArray[1][j] == i // ----
								&& gameArray[2][j] == i) {
							return true;
						}
					}
					if (gameArray[0][0] == i && gameArray[1][1] == i // x
							&& gameArray[2][2] == i) {
						return true;
					}
					if (gameArray[0][2] == i && gameArray[1][1] == i //
							&& gameArray[2][0] == i) {
						return true;
					}
					return false;
			}
			
				
				
				public  static String ticTacToe() {
					boolean userTurn = false;
					int gameArray[][] = new int[3][3];
					

					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							gameArray[i][j] = -1; //initially game array is null so print -1
						}
					}
					
					
					for (int k = 0; k < 9; k++) {

						if (userTurn) {
							userTurn(gameArray);
							userTurn = false;
							printGameArray(gameArray);
							if (checkWin(gameArray, 0)) {
								return "You Won";
							}

						} else {
							System.out.println("Computer's Turn");
							computerTurn(gameArray);
							userTurn = true;
							printGameArray(gameArray);
							if (checkWin(gameArray, 1)) {
								return "Computer Won";
							}

						}

						
					}

					return "Match Draw";
		}
				public static boolean isValidTurn(int[][] gameArray, int row, int cols ) {
					if (gameArray[row][cols] == -1 ) {
						return true;
					}
					return false;
			}
				/******************Program to print Triplet****************/
				public static void printTriplet(int[] array) {
					
			     	int size = array.length;
					int count = 0;
					
					for(int i=0;i<size-2;i++) {
						for(int j=i+1;j<size-1;j++) {
							for(int k=j+1;k<size;k++) {
								
								if(array[i]+array[j]+array[k] == 0) {
									System.out.println("Triplets are: " +array[i]+" "+array[j]+" " +array[k] );
									count++;
								}
									
								}
							}
						}
					
				
				      	System.out.println("pair count is :"+count++);
			}
           /*************Minor Matrix Program**********************/
				public static void createMinor(int matrix[][], int minor[][], int row, int col) {
				    int minor_row, minor_col;
				    for (int i = 0; i < 3; i++) {
				        minor_row = i;
				        if (i>row)
				            minor_row--;
				        for (int j = 0; j < 3; j++) {
				            minor_col = j;
				            if (j>col)
				                minor_col--;
				            if (i != row && j != col)
				                minor[minor_row][minor_col] = matrix[i][j];
				        }
				    }
				}
				/***********program to print lyrics of poem**********/
			    
			    public static void printLyrics()
			    {
			    	String poem="Old MacDonald had a farm, E-I-E-I-O\n" + 
			    			"And on his farm he had a <<ANIMAL>>, E-I-E-I-O\n" + 
			    			"With a <<SOUND>> here and a <<SOUND>> there\n" + 
			    			"Here a <<SOUND>>\n" + 
			    			"There a <<SOUND>>\n" + 
			    			"Everywhere <<SOUND>>\n" + 
			    			"Old MacDonald had a farm, E-I-E-I-O";
			    	
			    	
			    	for(int i=1;i<=9;i++)
			    	{
			    		if(i==1)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Chicks" ).replaceAll("<<SOUND>>","chick-chick");
			    			System.out.println(fin+"\n");
			    		}
			    		
			    		if(i==2)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Duck" ).replaceAll("<<SOUND>>","Quack-quack");
			    			System.out.println(fin+"\n");
			    		}
			    		
			    		if(i==3)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Turkey" ).replaceAll("<<SOUND>>","gobble-gobble");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==4)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Cow" ).replaceAll("<<SOUND>>","moo-moo");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==5)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Pig" ).replaceAll("<<SOUND>>","oink-oink");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==6)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Cat" ).replaceAll("<<SOUND>>","meow-meow");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==7)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Dog" ).replaceAll("<<SOUND>>","Bow-Bow");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==8)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Mule" ).replaceAll("<<SOUND>>","Heehaw-Heehaw");
			    			System.out.println(fin+"\n");
			    		}
			    		if(i==9)
			    		{
			    			String fin=poem.replaceAll("<<ANIMAL>>","Turtle" ).replaceAll("<<SOUND>>","nerp-nerp");
			    			System.out.println(fin);
			    		}
			    		
			    	}
			}
			    /*********************Program for calendar****************/
	    		
	    		
	    		public static void calender(int month, int year) {

	    			String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
	    					"Octomber", "November", "December" };
	    			int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    			if (month == 2)
	    			{
	    				if(year%4==0 || year%400==0 && year%100!=0)
	    				days[month] = 29;
	    			}
	    			System.out.println("   " + months[month] + " " + year);
	    			System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	    			int d = Utility.day(month, 1, year); // d having value between 0 to 6
	    			for (int i = 0; i < d; i++)
	    				System.out.print("\t"); // till day we add space
	    			for (int i = 1; i <= days[month]; i++) {
	    				System.out.printf("\t" + i);
	    				if (((i + d) % 7 == 0)) // next line
	    					System.out.println();
	    			}
	    		}
	    			

	    		public static int day(int month, int day, int year) {
	    			int y = year - (14 - month) / 12;
	    			int x = y + y / 4 - y / 100 + y / 400;
	    			int m = month + 12 * ((14 - month) / 12) - 2;
	    			int d = (day + x + (31 * m) / 12) % 7;
	    			return d;

	    		}
	    		/*********matric multiplication***************/
	    		 
	    		 public static void getMatricMultiplication()
	    		 {
	    		    	
	    		    	int [][]array1 = new int [2][3];
	    		    	  System.out.println("Enter element of matrix 1 :");
	    		    	  
	    		    	  for(int i=0;i<2;i++) 
	    		    	  {
	    		    		  for(int j=0;j<3;j++) 
	    		    		  {
	    		    			   array1[i][j] = Utility.getInt();
	    		    		  }
	    		    	  }
	    		    	  System.out.println();
	    		    	  
	    		    	  System.out.println("your matrix:");
	    		    	  for(int x=0;x<3;x++)
	    		    	  {
	    		    	  System.out.print("\tcol"+(x+1));
	    		    	  }
	    		    	  System.out.println();
	    		    	  
	    		    	  for(int i=0;i<2;i++)
	    		    	  {
	    		    		  System.out.print("row"+(i+1)+" ");
	    		    		  for(int j=0;j<3;j++) 
	    		    		  {
	    		    			  System.out.print("\t "+array1[i][j]);
	    		    			  
	    		    		  }
	    		    		  System.out.println();
	    		    	  }
	    		    	  
	    		    	  

	    		      	int [][]array2 = new int [3][2];
	    		      	  System.out.println("\nEnter element of matrix 2 :");
	    		      	  
	    		      	  for(int i=0;i<3;i++) 
	    		      	  {
	    		      		  for(int j=0;j<2;j++) 
	    		      		  {
	    		      			   array2[i][j] = Utility.getInt();
	    		      		  }
	    		      	  }
	    		      	  System.out.println();
	    		      	  
	    		      	  System.out.println("your matric:");
	    		      	  for(int x=0;x<2;x++)
	    		      	  {
	    		      	  System.out.print("\tcol"+(x+1));
	    		      	  }
	    		      	  System.out.println();
	    		      	  
	    		      	  for(int i=0;i<3;i++)
	    		      	  {
	    		      		  System.out.print("row"+(i+1)+" ");
	    		      		  for(int j=0;j<2;j++) 
	    		      		  {
	    		      			  System.out.print("\t "+array2[i][j]);
	    		      			  
	    		      		  }
	    		      		  System.out.println();
	    		      	  }
	    		 	

	    		 int res1=(array1[0][0]*array2[0][0])+(array1[0][1]*array2[1][0])+(array1[0][2]*array2[2][0]);

	    		 int res2=(array1[0][0]*array2[0][1])+(array1[0][1]*array2[1][1])+(array1[0][2]*array2[2][1]);

	    		 int res3=(array1[1][0]*array2[0][0])+(array1[1][1]*array2[1][0])+(array1[1][2]*array2[2][0]);

	    		 int res4=(array1[1][0]*array2[0][1])+(array1[1][1]*array2[1][1])+(array1[1][2]*array2[2][1]);

	    		 //int multiplication[][]=new int[2][2];
	    		 System.out.println("\nmatric multiplication:");
	    		 for(int x=0;x<2;x++)
	    			  {
	    			  System.out.print("\tcol"+(x+1));
	    			  }
	    			  System.out.println();
	    		 System.out.print("row1\t"+res1+"\t"+res2+"\n");
	    		 System.out.print("row2\t"+res3+"\t"+res4+"\n");
	    		 
	    		}
	    /************************Program to demonstrate Gambling simulator using 2d array********/		 
	    		 public static void gamblingSimulator()
	    			{
	    				int stake,goal,trails;
	    				System.out.println("enter amount:");
	    				stake=scanner.nextInt();
	    				System.out.println("enter goal:");
	    				goal=scanner.nextInt();
	    				System.out.println("enter number of trails:");
	    				trails=scanner.nextInt();
	    				double array[][]=new double[trails][1];
	    				int wins=0;
	    				int loss=0;
	    				
	    					int cash = stake;
	    					{
	    						if(goal<=cash)
	    						System.out.println("goal is less than or equal to cash");
	    					
	    						else 
	    						{
	    								for(int m=0;m<trails;m++)
	    								{
	    									double v=Math.random();
	    									if(v< 0.5) 
	    									{
	    										array[m][0]=v;
	    										loss++;	
	    										cash=cash-100; //100 win amount
	    									}	
	    									else 
	    									{
	    										array[m][0]=v;
	    										wins++;
	    										cash=cash+100;
	    									}
	    								}
	    					
	    					System.out.println("\nresult of every trails is as:");
	    						for(int i=0;i<trails;i++)
	    						{
	    							System.out.print((i+1)+")"+array[i][0]);
	    							if(array[i][0]<0.5)
	    								System.out.print("-> lost\n");
	    							else
	    								System.out.print("-> won\n");
	    						}
	    								
	    						
	    					if(cash==goal)
	    						System.out.println("reached goal...");
	    					else
	    						System.out.println("can't reach the goal...");
	    					double pw= (wins*100)/trails;
	    					System.out.println(" win percentage="+pw);
	    					double pl= (loss*100)/trails;
	    					System.out.println(" loss percentage="+pl);
	    					
	    					
	    					}
	    				}
	    				
	    			}
	    /*********program to demonstrate 2d array Rolling Die****************/		 
	    		 public static void findRolledNumberFrequencyOnDice()
	    			{
	    				int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
	    				System.out.println("enter number of dice rolls:");
	    				int n=scanner.nextInt();
	    				Random dice = new Random();
	    				
	    				int a[]=new int[n];
	    				int res[][]=new int[6][1];
	    				System.out.println("Random numbers are as follows:");
	    				for(int i = 0 ; i < n ; i++) 
	    				{
	    					int num=1+dice.nextInt(6);
	    					System.out.print(num+" ");
	    					for(int k = 0 ; k < n ; k++) 
	    						{
	    						a[k]=num;
	    						}
	    					
	    					if (num==1) 
	    					{
	    						
	    						count1++;
	    						res[0][0]=count1;
	    					}
	    			
	    					if (num==2) 
	    					{
	    						count2++;
	    						res[1][0]=count2;
	    					}
	    					if (num==3)
	    					{
	    						count3++;
	    						res[2][0]=count3;
	    					}
	    					if (num==4)
	    					{
	    						count4++;
	    						res[3][0]=count4;
	    					}
	    					if (num==5)
	    					{
	    						count5++;
	    						res[4][0]=count5;
	    					}
	    					if (num==6) 
	    					{
	    						count6++;
	    						res[5][0]=count6;
	    					}
	    				}
	    				System.out.print("\n");
	    				for(int k=0;k<6;k++)
	    				{
	    					System.out.println((k+1)+" repeated "+res[k][0]+" times.");
	    				}
	    			
	    				
	    			}
	    			
	    			
	    			/********************HARMONIC SERIES Program Using 2d Array*************/
	    			public static void findHarmonicSeries()
	    			{
	    				System.out.println("how many harmonic series you want to print??????");
	    				int x=scanner.nextInt();
	    				double series[][]=new double[x][2];
	    				
	    				for(int a=1;a<=x;a++)
	    				{
	    				int n;
	    				System.out.println("enter value of n:");
	    				n=scanner.nextInt();
	    			
	    				series[a-1][0]=n;
	    				double sum=0.0;
	    				for(int i=1;i<=n;i++)
	    					{
	    					sum=sum+1.0/i;
	    					}
	    				series[a-1][0]=n;
	    				series[a-1][1]=sum;
	    				//System.out.println(a);
	    			
	    				}
	    				
	    				for(int i=1;i<=x;i++)
	    				{
	    					System.out.println("harmonic series for "+series[i-1][0]+" is "+series[i-1][1]);
	    				}
	    				
	    		}

}

	
			 
			
	



	  
	      
	    
