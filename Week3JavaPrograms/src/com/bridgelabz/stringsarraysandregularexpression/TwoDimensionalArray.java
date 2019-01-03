package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class TwoDimensionalArray {
	public static void main(String[] args)
	{
		//Utility u=new Utility();      
		System.out.println("Enter number of rows: ");
		int m = Utility.getInt();
		System.out.println("Enter number of columns: ");
		int n = Utility.getInt(); 
		        
		//calling methods
		int [][] a  =Utility.arrayInt(m,n);
		double [][] b  =Utility.arrayDouble(m,n);
		String [][] c  =Utility.arrayBoolean(m,n);
		        
		//calling display method
		Utility.display(a,b,c,m,n);
		Utility.display1(a, b, c, m, n);
		 Utility.display2(a, b, c, m, n);       
}
}