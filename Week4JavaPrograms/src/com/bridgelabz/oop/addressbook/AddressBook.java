package com.bridgelabz.oop.addressbook;
import java.io.File;
import java.io.IOException;

import com.utility.Utility;

public class AddressBook {

	public static void main(String[] args) throws Exception {
		String addressBookName = "";
		String firstName;
		String lastName;
		AddressBookManager manager = new AddressBookManager();
        String repeat = "";
       //manager.printDetails();
        while(repeat != "YES")
        {
        	System.out.println("Menu:");
    		System.out.println("1. create new address book");
    		System.out.println("2. add person in existing address book");
    		System.out.println("3. manage address book");
            int choice = Utility.getInt();
        switch(choice)
        {
        case 1:
        		System.out.println("Enter address book name");
        		addressBookName = Utility.getString();
        		if(manager.createAddressBook(addressBookName))
        		{
        			System.out.println("new Address Book created");
        		}
        		else
        		{
        			System.out.println("address book already created");
        		}
        		break;
        case 2:
        		System.out.println("Enter address book  ");
        		addressBookName = Utility.getString();
        	
        		System.out.println("Enter person first name: ");
        		firstName = Utility.getString();
        		System.out.println("Enter person last name: ");
        		lastName = Utility.getString();
        		AddressBookManager.addPersonInAddressBook(addressBookName, firstName, lastName);
        		break;
        case 3: 
        	    	System.out.println("Enter address book");
        	    	addressBookName = Utility.getString();
        	    	boolean exist = new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/"+addressBookName+".json").exists();
        	    	long fileLength = new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/"+addressBookName+".json").length();
        	    	if(exist == false || fileLength == 0)
        	    	{
        	    		System.out.println("invalid choice");
        	    	
        	    	}
        	    	else
        	    	{
        	    		
        	    	System.out.println("To Manage the book press:");
        	    	
        	    	System.out.println("1. for add person");
        	    	System.out.println("2. Edit person details");
        	    	System.out.println("3. for delete person");
        	    	System.out.println("4. sort person by name and zip");
        	    	System.out.println("5. print person details");
        	    	System.out.println("6. for saveAs");
        	    	choice = Utility.getInt();
        	    
        	    	switch(choice)
        	    	{
        	    	case 1:
        	    		   
        	    		   manager.add();
        	    		   break;
        	    	case 2: System.out.println("Enter person first name:");
        	    	        firstName = Utility.getString();
        	    	        manager.editPerson(firstName, addressBookName);
        	    	        break;
        	    	           
        	    	case 3: 
        	    			System.out.println("Enter person first name:");
        	    		    firstName = Utility.getString();
        	    		    System.out.println("Enter address book name");
        	    		    
        	    		    manager.delete(firstName, addressBookName);
        	    		    break;
        	    	case 4:
        	    			System.out.println("press 1. for sort by name and 2. for sort by zip:");
        	    			choice = Utility.getInt();
        	    			if(choice == 1)
        	    			{
        	    		    manager.sortByName(addressBookName);
        	    			}
        	    			if(choice == 2)
        	    			{
        	    				manager.sortByZip(addressBookName);
        	    			}
        	    	case 5: 
        	    		    System.out.println("Enter First name of person ");
        	    		    firstName = Utility.getString();
        	    		    manager.print(addressBookName, firstName);
        	    	case 6 :
        	    		     System.out.println("Enter new address book name");
        	    		     String  addName = Utility.getString();
        	    		     System.out.println("Enter file extension");
        	    		     String extension = Utility.getString();
        	    		     manager.saveAs(addressBookName, addName, extension);
        	    	default :
             			    System.out.println("Invalid choice");
             			     break;
        	    	}
        	    	}
        			break;
        default :
        			System.out.println("Invalid choice");
        			break;
        }
      
        	
        System.out.println("To continue press 1 \n and for exit press any number ");
        repeat = Utility.getString();
	}
        if(repeat == "YES")
        {
        	System.out.println("Exit");
        }
}
}
