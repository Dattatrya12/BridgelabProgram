package com.bridgelabz.functionalprograms;

import java.io.PrintWriter;

import com.utility.Utility;

public class PrintInitalsNames {

		public static void main(String[] args)
		{
			Utility u=new Utility();      
			System.out.println("Enter number of rows: ");
			int m = u.getInt();
			System.out.println("Enter number of columns: ");
			int n = u.getInt(); 
			        
			//calling methods
			int [][] a  =arrayInt(m,n);
			/*double [][] b  =arrayDouble(m,n);
			/*String [][] c  =arrayBoolean(m,n);*/
			        
			//calling display method
			display(a,m,n);
			        
		}
		
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
		         
				return a;
			}
			
			/*public static double[][] arrayDouble(int m,int n)
			{
				double b[][]=new double[m][n];
				Utility u=new Utility();    
				System.out.println();
				System.out.println("Double Array");
		
				for(int i = 0; i<m; i++)
				{
					for (int j = 0; j<n; j++)
				    {
						b[i][j] = u.getInt();
				    }   
				}
				return b;
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
			}*/
		
			//display method
			public static void display(int[][]a,int m,int n)
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
			 
			 
			
	}


