package com.bridgelabz.functionalandlibaries;

import com.utility.MathFunctions;

public class PresentAndFutureValue {

	public static void main(String[] args) {
		while(true) {
			          System.out.println("1.Enter 1 for Future value 2.Enter 2 for Present Value");
			          int x = com.utility.MathFunctions.getInt();
			          switch(x){
			  		case 1:
				System.out.println("Enter invest dollars($): ");
				float c1 = MathFunctions.getFloat();
				System.out.println("Enter interest rate: ");
				float r1 = MathFunctions.getFloat();
				System.out.println("Enter time period: ");
				float t1 = MathFunctions.getFloat();
				double value=MathFunctions.futureValue();

				System.out.println("Present value is : "+value);
				  break;
			  		case 2:
			  			System.out.println("Enter invest dollars($):");
			  			float c = MathFunctions.getFloat();
			  			System.out.println("Enter interest rate(%): ");
			  			float r = MathFunctions.getFloat();
			  			System.out.println("Enter time period in years: ");
			  			float t = MathFunctions.getFloat();
			  			double value1=MathFunctions.presentValue();
                        
			  		System.out.println("Future value is : "+value1);
			  		  break;
			  		default:
			  			   System.out.println("Invalide choice");
			  			   break;
			  			
				
			       }
			}
	}

}
