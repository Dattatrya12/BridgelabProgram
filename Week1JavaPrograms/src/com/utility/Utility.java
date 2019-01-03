package com.utility;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
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
public class Utility {
	   static Scanner scanner=new Scanner(System.in);

	
	   public static int getInt()
	   {
		   int integerValue=scanner.nextInt();
		   return integerValue;
	   }
	   public static float getFloat()
	   {
		   float floatValue=scanner.nextFloat();
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
	   /**
	    * Aim:program that take three name as input print out the proper sentence name
	    * in reverse order.
	    * @author Dattatrya Age
	    *@version:1.0
	    *@since:12-12-2018 */
	   public static void getThreeNames()
	   {
		   
			String name=scanner.nextLine();            
			String arr[]=name.split(" ");

			switch(arr.length)
			{
			case 1:
				System.out.println("Datta "+name);
				break;
			case 2:
				     System.out.println("Datta " +arr[1]+ "," +arr[0]);	
				default:
					System.out.println("Datta " +arr[2]+ ","+arr[1]+ "," +arr[0]);
				     }
			
	}
	   

	   /**
	    * 
	    * Aim:program to leap year
	    * @author Dattatrya Age
	    *@version:1.0
	    *@since:12-12-2018 */
        
	   public static void getLeapYear()
				{
		   int year;//Take integer variable year
		   year=Utility.getInt();//Assign a value to the variable
					if(year>=1582)//year must be greter than 1952
						/*Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
                         Check if the year is divisible by 400, DISPLAY "leap year"
                           Otherwise, DISPLAY "not leap year"*/
						if(year%4==0 && year%100!=0 || year%400==0)
						{
							System.out.println("leap year"+year);
						}
						else 
						{
							System.out.println("not leap year");
						}
					else
					{
					   System.out.println("Inavalide year");
					}
				}
	   
	   /**
	    * Aim:program to Display no such method error
	    * @author Dattatrya Age
	    *@version:1.0
	    *@since:12-12-2018 */
        public   void print() {
		System.out.println("I am in Print Method");
	}
	
	public  void show() {
 		System.out.println("I am in show method");
 	}


		   	 /**
		 	    * Aim:program to perform arithmatic operation and also check precendance of operator
		 	    * using integer value through the functions
		 	    * @author Dattatrya Age
		 	    *@version:1.0
		 	    *@since:12-12-2018 */
		         
		   	    public static void getInputOpt(int a,int b,int c)
		   	    {
		   	    	int x=a+b*c;//first perform the multiplication b*c=12 it gives then perform addition a+b*c=14
                    int y=a*b+c;//a*b=6 then c=4 final result a*b+c=10
		   	    	int z=c+a/b;//a/b=0 c=4 c+a/b=4
                     int p=a%b+c;//a%b=2 c=4 c=a%b+c=6
		   	    	System.out.println(x+" "+y+ " "+z+" "+p);
		   	    			
		   	    			
		   	    }
		   	 /**
			 	    * Aim:program to calculate harmonic series
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:12-12-2018 */
		   	    public static void getHarmonic()
		   	    {
		   	  // command-line argument
		   	    	System.out.println("enter n");
		   	       int num=scanner.nextInt();
		   	    int result = 1;
				for(int i=1;i<=num;i++){
					System.out.print(result+"/"+i+" "); // compute 1/1 + 1/2 + 1/3 + ... + 1/n
					
				}
		   	  }	
		   	 /**
			 	    * Aim:program to perform arithmaetic opertion using double values
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:13-12-2018 */
		   	    
		   	 public static void getDoubleOpt(double a,double b,double c)
		   	    {
		   	    	double x=a+b*c; //first perform b*c=20.0 then add 1.0 final result x=a+b*c 20.0+1.0=21.0		   	    	
		   	    	double y=a*b+c; //a*b=1*5=5.0 c=4.0 final result=a*b+c=5.0+4.0=9.0
		   	    	double z=c+a/b; //	z=c+a/b=4.2	   	    	
		   	    	double p=a%b+c; //p=a%b+c a%b=1.0 c=4.0 then p=a%b+c=1.0+4.0=5.0
		   	    	System.out.println(x+" "+y+ " "+z+" "+p);
		   	    			
		   	    			
		   	    }
		   	/**
		 	    * Aim:This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
		 	    * @author Dattatrya Age
		 	    *@version:1.0
		 	    *@since:13-12-2018 */
		          public static void getPowerOfTwo()
		          {
		        	  int num=scanner.nextInt();
		              System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
		              System.out.println();
		              System.out.println("Printing all till Power Value "+num);
		              
		              for(int i=1;i<=num;i++)
		              {
		               	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
		              }
		          }
		          /**
			 	    * Aim:Computes the prime factorization for given number.
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:13-12-2018 */
		          // A function to print all prime factors 
		          // of a given number n 
		          public static void findPrimeFactors(int n) 
		          { 
		              // Print the number of 2s that divide n 
		              while (n%2==0) 
		              { 
		                  System.out.print(2 + " "); 
		                  n /= 2; 
		              } 
		        
		              // n must be odd at this point.  So we can 
		              // skip one element (Note i = i +2) 
		              for (int i = 3; i <= Math.sqrt(n); i+= 2) 
		              { 
		                  // While i divides n, print i and divide n 
		                  while (n%i == 0) 
		                  { 
		                      System.out.print(i + " "); 
		                      n /= i; 
		                  } 
		              } 
		        
		              // This condition is to handle the case whien 
		              // n is a prime number greater than 2 
		              if (n > 2) 
		                  System.out.print(n); 
		          } 
		          /**
			 	    * Aim:program to check dates fall in spring seasons or not.
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:13-12-2018 */
		          public static void toSpringSeason()
		          {
		        	  int month,date;
		        	  System.out.println("Enter a date:");
		        	  date=scanner.nextInt();
		        	  System.out.println("Enter Month");
		        	  month=scanner.nextInt();
		        	  if(date<=0 && month<=0)
		        	  {
		        	  }
		        	  else  if((date>=20 && date<=31 && month==3)|| (date>=1 && date<=30 && month==4) ||(month>=1 && month<=31 && month==5) ||(month>=1 && month<=20 && month==6))
		        		  {
		        			  System.out.println("Dates and months falls in the spring seasons");
		        		  }
		        		  else
		        		  {
		        			  System.out.println("Dates and months not fall in the spring season");
		        		  }
		        	  }
		          /**
			 	    * Aim:program to check dates fall in spring seasons or not.
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:13-12-2018 */
		          public static void toQuadraticEquation(double a,double b,double c)
		          {
		        	 double delta,root1,root2;
		        	 delta=b*b-4*a*c;
		        	 if(delta >= 0)
		             {
		     System.out.println("Roots are real");
		        	 root1=( - b + Math.sqrt(delta))/(2*a);
		        	 root2=(-b - Math.sqrt(delta))/(2*a);
		        	 System.out.println("First root is:"+root1);
		             System.out.println("Second root is:"+root2);
		         }
		         else 
		            {
		         	System.out.println("roots are imaginary");
		             }
		          }
		          /**
			 	    * Aim:program to calculate a distance
			 	    * @author Dattatrya Age
			 	    *@version:1.0
			 	    *@since:13-12-2018 
			 	    *@param x input double value from user 
	          * @param y input double value from user 
	                 * @return*/
		          //print euclidian distance from the point(x,y) at the origion(x,y).
		          public static void getDistance(double x, double y) {
		      		double distance = Math.sqrt((x*x) + (y*y));
		      		System.out.println("Distance of x="+x);
		      		System.out.println("Distance of y="+y);
		      		System.out.println("Distance="+distance);
		      		
		      	}
		          /**purphose: calculation of sum of two dice**********/
		      	 /* @param x taking integer from user
		      	 * @param y taking integer from user 
		      	 */
		      	
		      	public static int getSumOfTwoDice() {
		      		
		      		
		      		  //Random is a inbuilt class in java.util package
		      		 
		      		Random dice = new Random();
		      		
		      		
		      		 // take 1st random number
		      		 
		      		int number1 = 1+dice.nextInt(6);
		      		System.out.println("First random number is: "+number1);
		      		
		      		
		      		 // take 2nd random number
		      		 
		      		int number2 = 1+dice.nextInt(6);
		      		System.out.println("Second random number is: "+number2);
		      		
		      		
		      		 // sum of both random number
		      		 
		      		
		      		int sum = number1 + number2;
		      		return sum;
		      		
		      	}
		      	/******************* Aim:print the 5 uniform random values between 0 and 1 and also find avg,min,max***/
		 	    public static void getStats5(int r, int s) {
		    		double average;
		    		double sum = 0;
		    		double values[]=new double[5];
		    	
		    		//to find random value
		    		
		    		for(int i = 0 ; i < values.length ; i++) {
		    			values[i] = Math.random();
		    		System.out.println(values[i]);
		    		}
		    		
		    		//to find average
		    		
		    		for(int i = 0 ; i < values.length ; i++) {
		    			sum = sum+values[i];
		    		}
		    		average = sum/5;
		    		System.out.println("average is: "+average);
		    		
		    		//to find maximum value
		    		
		    		double max = values[0];
		    		for(int i = 0 ; i < values.length ; i++) {
		    			 if(values[i]>max) {
		    				 max = values[i];
		    			 }
		    			 }
		    		System.out.println("Maximum value is: "+max);

		    		//to find minimum value
		    		
		    		double min = values[0];
		    		for(int i = 0 ; i < values.length ; i++) {
		    			 if(values[i]<min) {
		    				  min = values[i];
		    			 }
		    			 }
		    		System.out.println("Minimum value is: "+min);
		    }
		      	/********************Wind Chill************************/
		    	 /* @param t input double value from user  
		    	 * @param v input double value from user 
		    	 */
		    	
		    	public static void getWindChill(double t, double v) {
		    			if(t>50 || v>120 || v<3) {
		    				System.out.println("not valid enter again: ");
		    				double t1 = Utility.getDouble();
		    				double v1 = Utility.getDouble();
		    				double w = 35.74 + 0.6215*t1 + ((0.4275*t1) - 35.75) * Math.pow(v1, 0.16);
		    				System.out.println("wind chill: "+w);


		    			}else {
		    				double w = 35.74 + 0.6215*t + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);
		    				System.out.println("wind chill: "+w);
		    			}
		    }
		    	//****************DayOfWeek************************************

				/**
				 * @param y input integer value from user 
				 * @param m input integer value from user 
				 * @param d input integer value from user 
				 * @return 
				 */
				
				public static void getDayOfWeek(int y, int m, int d) {
			        int y0 = y - (14 - m) / 12;
			        
			        int x = y0 + y0/4 - y0/100 + y0/400;
			        
			        int m0 = m + 12 * ((14 - m) / 12) - 2;
			        
			        int d0 = (d + x + (31*m0)/12) % 7;
			        System.out.println(d+"/"+m+"/"+y+"");
			        int month=scanner.nextInt();
			         switch (d0) {
					
					case 0:
			        	System.out.println("Sunday");
			        	break;
					case 1:
			        	System.out.println("Monday");
			        	break;
					case 2:
			        	System.out.println("Tuesday");
			        	break;
					case 3:
			        	System.out.println("Wednesday");
			        	break;
					case 4:
			        	System.out.println("Thursday");
			        	break;
					case 5:
			        	System.out.println("Friday");
			        	break;
					case 6:
			        	System.out.println("Saturday");
			        	break;
					default:
						break;
			        }
			        
			        }
				//****************TemperatureConversion**********************************************
				
				
				/**
				 * @param choice take integer value as an input 1 0r 2 from user
				 */
				
				public static void getTemperatureConversion(int choice) {
					
					double temperature = 0.0;
					double converted = 0.0;
					
					
					 // condition for choice 1 and 2
					 
					if(choice == 1) {
						
						System.out.println("Enter the temperature in celcius");
						temperature = Utility.getDouble();
						converted = (temperature*9/5)+32;
						System.out.println("Temperature in fahrenheit is: "+converted);
						
					}
					else {
						if(choice == 2) {
							
							System.out.println("Enter the temperature in fahrenheit: ");
							temperature = Utility.getDouble();
							converted = (temperature-32)*5/9;
							System.out.println("Temperature in celcius is: "+converted);
							
						}
						}
			}
				//************CarLoan********************************************
				
				/**
				 * @param Y input int value from user 
				 * @param P input float value from user 
				 * @param R input float value from user 
				 */
				
				public static void getCarLoan(int Y, double P, double R) {
					float n = 12 * Y;
					double r = R/(12*100);
					double payment = (P*r)/Math.pow(1-(1+r),(-n));
					System.out.println("N="+n);
					System.out.println("r="+r);
					System.out.println("payment="+payment);
					
			}
				//******************Trig****************************************************

				/**
				 * @param degrees takeing double value from user in an array
				 */
				public static void getTrig(double degrees) {
					
					if(degrees<0) {
						System.out.println("please enter positive number: ");
						double degrees1 = Utility.getDouble();
						Utility.getTrig(degrees1);
					}else {
					
					// convert degrees to radians 
					double radians = Math.toRadians(degrees);
					System.out.println("radians is: "+radians);
					
			        // sin() method to get the sin value 
					
					double sinVal = Math.sin(radians);
					System.out.println("sin = "+sinVal);

					
			        // cos() method to get the cosine value 
					
					double cosVal = Math.cos(radians);
					System.out.println("cos = "+cosVal);
					}

			}
				//*******************Prime*************************************************

				/**
				 * @param n takeing integer numbers from user in an array
				 */
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
				public static void getFactorial()
				{
					int n,factorial=1;
					n=scanner.nextInt();
					for(int i=n;i>=1;i--)
					{
						factorial=factorial*i;
						System.out.println("Factorial="+factorial);
					}
				}
				//*******************FindRepeatedNumber***************************

				/**
				 * @param number takeing integer numbers from user in an array
				 */
				public static void getRepeatedNumber(int[] number) {
					for(int i = 0 ; i < number.length ; i++) {
						for(int j = i+1 ; j < number.length ; j++) {
							if(number[i] == number[j]) {
								System.out.println("Repeated value is: "+number[j]);
							}

						}
									
					}
					
			}
				//********************SecondLargeAndSmallElement*******************************

				/**
				 * @param a takeing integer numbers from user in an array
				 */
				public static void getSecondLargeAndSmallElement(int[] a) {
								
					
						int temp;
						
						for(int i = 0 ; i < a.length ; i++) {
							for(int j = i+1 ; j < a.length ; j++) {
								if(a[i] > a[j]) {
									temp = a[i];
									a[i] = a[j];
									a[j] = temp;
								}
							}
						}
						System.out.println("second largest number is: "+a[a.length - 2]);
						
						for(int i = 0 ; i < a.length ; i++) {
							for(int j = i+1 ; j < a.length ; j++) {
								if(a[i] < a[j]) {
									temp = a[i];
									a[i] = a[j];
									a[j] = temp;
								}
							}
						}
						System.out.println("second smallest number is: "+a[a.length - 2]);

				}
				//*******************FlipCoin*****************************************

				
				/**
				 * @param f takeing integer numbers from user 
				 */
				public static void getFlipCoin(int f) {
					double d[]=new double[f];
					int tail = 0;
					int head = 0;
					if(f>0) {
						for(int i=0;i<f;i++) {
							d[i]= Math.random();
							if(d[i]<0.5) {
								System.out.println("tails");
								tail++;
							}else {
								System.out.println("heads");
								head++;
							}
							}
							}else {
								System.out.println("It is a negative number");
							
								

							}
							float PercentageHead  = (head*100)/f;
							System.out.println("Percentage of head= "+PercentageHead);
						
							float PercentageTail  = (tail*100)/f;
							System.out.println("Percentage of tail= "+PercentageTail);
							}
				   /******************PrintInitalsName***********/
				     
				         public static void printInitalsK()
				         {
				        	 for(int i=9;i>=1;i=i-2)
				        	 {
				        		 if(i==1)
				        		 {
				        			 System.out.println("******");
				        			 break;
				        		 }
				        		 for(int j=1;j<=i;j++)
				        		 {
				        			 {
				        				 if(j==1)
				        				 
				        				 
				        					 System.out.print("**");
               				       
				        			 else if(j==i)
				        			 
				        				System.out.print("***");
				        			 }
				        			  System.out.print(" ");
				        		 }
				        		 System.out.println();
				        	 }
				        	 
				        	 for(int i=1;i<=9;i=i+2)
				        	 {
				        		 if(i==1)
				        		 
				        			 continue;
				        		 
				        		 for(int j=1;j<=i;j++)
				        		 {
				        			 {
				        				 if(j==1)
				        				 
				        				 
				        					 System.out.print("**");
               				       
				        			 else if(j==i)
				        			 
				        				System.out.print("***");
				        			 }
				        			  System.out.print(" ");
				        		 }
				        		 System.out.println();
				        	 }
				         }
				         /**********Aim:To print PatternD Program*************/
				     	
				     	public static void printInitalsD()
				     	{
				     		//logic for half D (for first 4 rows,that's why initial value of i is 6)
				     		//6,7,8,9 first four rows
				     		//blank spaces starting from 6
				     		for(int i=6;i<=9;i++)
				     			{
				     				//logic for first line
				     				if(i==6)
				     				{
				     					for(int m=1;m<9;m++)
				     					{
				     					System.out.print("*");
				     					
				     					}
				     				}
				     				else
				     				for(int j=1;j<=i;j++)
				     				{
				     					{
				     					
				     					if(j==1 || j==i) 
				     						System.out.print("**");
				     					
				     					}
				     					System.out.print(" ");	//logic for space
				     					
				     				}
				     				System.out.println();
				     				
				     				//logic to print 5th line
				     				if(i>=9)
				     				{
				     					for(int k=1;k<=10;k++)
				     					{
				     						if(k==1 || k==10)
				     						{
				     							System.out.print("**");	
				     						}
				     						else
				     							System.out.print(" ");
				     					}
				     					System.out.println();
				     					
				     				}
				     				
				     			}
				     			
				     			//logic for next half D (from 7th to 9th line)
				     			for(int i=9;i>=6;i--)
				     			{
				     				
				     				for(int j=1;j<=i;j++)
				     				{

				     					//logic for last line
				     					if(i==6)
				     					{
				     						for(int m=1;m<9;m++)
				     						{
				     						System.out.print("*");
				     						}break;
				     					}
				     					{
				     				
				     					if(j==1 || j==i) 
				     						System.out.print("**");
				     					
				     					}
				     					System.out.print(" ");
				     				}
				     				System.out.println();
				     			}
				     		}
				     	
				     	
				     	
				     		
				     	
				     

				   //***********************Sqrt************************************************
				 	
				 	/**
				 	 * @param c takeing integer value from user in an array
				 	 */
				 	public static double getSqrt(double c) {
				 		
				 		double e = 1e-15;
				 		double t = c;
				 		if(c<0) {
				 			System.out.println("Please enter positive number: ");
				 			int c1 = Utility.getInt();
				 			Utility.getSqrt(c1);

				 		}else {
				         // repeatedly apply Newton update step until desired precision is achieved
				 		
				         while (Math.abs(t - c/t) > e*t) {
				             t = (c/t + t) / 2.0;
				         }
				        
				 		}
				 		return t;
				 		
				 	}
				 	//**************************gamlingSimulator********************************

					/**
					 * @param stake taking integer value from user
					 * @param goal taking integer value from user
					 * @param trails takling integer value from user
					 */
					public static void trails(int stake, int goal, int trails) {
						int won = 0;
						int loss = 0;
						int cash = stake;
						int bets=1;
						
						for(int t = 0 ; t < trails ; t++) {
						
							while(cash>0 && cash<goal) {
								if(Math.random()>0.5) {
									cash++;
								}else {
									cash--;
								}
							}
							if(cash==goal) {
								won++;
							}else {
								loss++;
							}
							
						}
						System.out.println("Number of times won :"+won);
						System.out.println("Number of times loss :"+loss);
						double perWin = (won*100)/trails;
						System.out.println("percent win : "+perWin);
						
						double perloss = (loss*100)/trails;
						System.out.println("percent loss : "+perloss);
						}
					//****************RollDie******************************************************


					/**
					 * @param n taking integer values from user
					 */
					public static void rollingDie(int n ) {
						Random dice = new Random();
						int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;

						for(int i = 0 ; i < n ; i++) {
							int num=1+dice.nextInt(6);
							System.out.println(num);
						
							if (num==1) {
								count1++;
							}
							
							if (num==2) {
								count2++;
							}
							
							if (num==3) {
								count3++;
							}
							
							if (num==4) {
								count4++;
							}
							
							if (num==5) {
								count5++;
							}
							
							if (num==6) {
								count6++;
							}
						
							
						}
						System.out.println();
						System.out.println(" 1 repeated :"+count1+"times   2 repeated :"+count2+"times  3 repeated :"+count3);
						System.out.println(" 4 repeated :"+count4+"times   5 repeated :"+count5+"times  6 repeated :"+count6);
					
						System.out.println();
						
					if(count1>count2 & count1>count3 &count1>count4 &count1>count5 & count1>count6) {
						System.out.println("1 maximum time rolled : "+count1);

					}else {
						if(count2>count1 & count2>count3 &count2>count4 &count2>count5 & count2>count6) {
							System.out.println("2 maximum time rolled : "+count2);
						}else {
							if(count3>count1 & count3>count2 &count3>count4 &count3>count5 & count3>count6) {
								System.out.println("3 maximum time rolled : "+count3);
							  }else {
									if(count4>count1 & count4>count2 &count4>count3 &count4>count5 & count4>count6) {
										System.out.println("4 maximum time rolled : "+count4);
									}else {
										if(count5>count1 & count5>count2 &count5>count3 &count5>count4 & count5>count6) {
											System.out.println("5 maximum time rolled : "+count5);
										  }else {
												if(count6>count1 & count6>count2 &count6>count3 &count6>count4 & count6>count5) {
													System.out.println("6 maximum time rolled : "+count6);
												}else {
													System.out.println("there are more then 1 maximum time repeated number");

												}
										  	}
										}
							  		}
								}
							}
				}
					//*****************SinAndCos****************************************************

					
					
					/**
					 * @param x taking double value from user
					 * @param n taking integer value from user
					 * 
					 * method to find sinx 
					 * 
					 */
					public static double findSin(double x , int n) {
						double p = 0;
						double q = 0;
						double sinx;
						double x1 = x%(2*Math.PI);
						
						for(int i = 1 ; i < n ; i = i + 4 ) {
							p = p + Math.pow(x1, i)/factorial(i);
							
						}
						for(int i = 3 ; i < n ; i = i + 4) {
							q = q - Math.pow(x1, i)/factorial(i);
						}
						sinx = p + q;
						return sinx;
						}
					
					
					/**
					 * @param x taking double value from user
					 * @param n taking integer value from user
					 * 
					 * 	 * method to find sinx 
					 */
					public static double findCos(double x , int n) {
						double p = 0;
						double q = 0;
						double cosx;
						double x2 = x;
						for(int i = 4 ; i < n ; i = i + 4 ) {
							p = p + Math.pow(x2, i)/factorial(i);
							
						}
						for(int i = 2 ; i < n ; i = i + 4) {
							q = q - Math.pow(x2, i)/factorial(i);
						}
						cosx =1 + p + q;
						return cosx;
						}
					public static long factorial(int n) {
						int fact = 1;
						int n1;
						
							for(int i1 = 1 ; i1<= n ; i1++) {
							fact = fact*i1;
					
						}
							return fact;
						}
					//********************Binary***************************************************
					
					/**
					 * @param decimal taking integer value from user
					 * 
					 */
					public static void decimalToBinary(int decimal) {
						// we can also convert decimal to binary by this ...
						
						/* String binary = Integer.toBinaryString(decimal);
						System.out.println("Binary is :"+binary);*/
						
						String binary="";
						
						int n = decimal;
						String sum = "";
						String reverse= "";
						
						//condition for getting remender
						
						while(n >=1) {
							binary=binary+(n%2);
							n = n/2;
						}
						
						//condition-if the element of binary number is greater then 0 or less then 4.
						
						
						if(binary.length() > 0 && binary.length() < 4) {
							for(int i = 0 ; i < 4-binary.length() ; i++) {
								sum = sum + 0;
							}
							binary = binary + sum;
						}
						
						//reverse the remender for getting binary number.
						
						for(int i = binary.length() - 1 ;i >= 0 ; i--) {
							reverse = reverse + binary.charAt(i);
						}
						System.out.println("Reverse="+reverse);
						
						}
					public static void print(int n, int k) { 
						for (int i = 0; i < n; i++) { 
						System.out.println(); 
						for (int j = 0; j < (3 * k + 2); j++) { 

							// For printing the upper portion of 
							// the pattern "GFG" 
							if ((i == 0 && j != k && j != 2 * k + 1) || 
								((i == n / 2) && (j > 1) && (j != k) && 

								// for printing the middle portion of 
								// the pattern "GFG" 
								(j != 2 * k + 1) && (j != 2 * k + 3)) || 
								((i == n - 1) && (j != k) && 

								// for printing the lower portion of 
								// the pattern "GFG" 
								((j <= k) || (j > 2 * k + 1))) 

							|| (j == 0) || (j == k + 1) || (j == (2 * k + 2)) || 
								((j == k - 1 || j == 3 * k + 1) && (i > n / 2))) 

							// printing * where ever required 
							System.out.print("*"); 

							else
							System.out.print(" "); // printing space where ever required 
						} 
						}
					}
}
				  



				
					
				
		          
		          
		       
		        
		   	    

				
			


			
			
	  
	
	
	
	
	

