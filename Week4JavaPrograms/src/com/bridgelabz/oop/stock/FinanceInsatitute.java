package com.bridgelabz.oop.stock;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
//import jdk.jfr.events.FileWriteEvent;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.utility.Utility;

public class FinanceInsatitute 
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		
		int temp = 1;
		while(temp == 1)
		{
			System.out.println("1.create new account");
			System.out.println("2.for transection:");
			int choice = Utility.getInt();
		switch(choice)
		{
		
		case 1: System.out.println("Enter user name \n");
				String name =Utility.getString(); 
				System.out.println("Enter user amount");
				int amount = Utility.getInt();
				String file = "/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/user.json";
				
				boolean result = Implementation.createNewUser(file, name ,amount);
			     if(result == true)
			     {
			    	 System.out.println("new user register");
			     }
			     else
			     {
			    	 System.out.println("user already register");
			     }
			     break;
		
		case 2: System.out.println("1.to buy share:");
				System.out.println("2.to sell share:");
				int transaction = Utility.getInt();
				switch(transaction)
				{
				case 1: 
						System.out.println("Enter user name:");
						String userName =Utility.getString() ;
						System.out.println("Enter amount ");
						int buyAmount = Utility.getInt();
						System.out.println("Enter company Symbol");
						String symbol = Utility.getString();
						String file2 = "/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/transaction.json";
						
						Implementation.buy(userName, symbol, buyAmount,file2);
						break;
				case 2: 
					System.out.println("Enter user name:");
					userName =Utility.getString() ;
					System.out.println("Enter amount ");
					buyAmount = Utility.getInt();
					System.out.println("Enter company Symbol");
					symbol = Utility.getString();
					
					
					Implementation.sell(userName, symbol, buyAmount);
					break;
				}
				
		}	
		
		System.out.println("Do you want to continue press 1 or for stop press 2");
		temp = Utility.getInt();
		
	} 

	}

}