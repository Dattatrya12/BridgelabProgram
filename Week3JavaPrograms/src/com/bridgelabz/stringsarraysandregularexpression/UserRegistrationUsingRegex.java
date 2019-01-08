package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class UserRegistrationUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       /* System.out.println(Utility.checkResult("datta", "Age", "9158174621", "dattaage999@gmail.com", "Dattatrya","Datttrya@123"));
        System.out.println(Utility.replacementregex("parmeshwar", "Raut", "Parmeshwar"));
        System.out.println(Utility.stringValidation("sagar"));
        System.out.println(Utility.emailidValidation("dattaage999@gmail.com"));
        System.out.println(Utility.contactValidation("9158174621"));
        System.out.println(Utility.uIdValidation("Pamdurang"));
        System.out.println(Utility.passwordValidation("Datta@123", "datta", "Age", "Pandurang"));*/
		String a,b,c,d,e,f;
		a=Utility.checkFname();
		b=Utility.checkLname();
		c=Utility.checkPhoneNumber();
		d=Utility.checkEmail("sush@gmail.com");
		e=Utility.checkUserId();
		f=Utility.checkPassword();
		System.out.println("\nYour details are as follows:");
		System.out.println("first name:"+a+"\n"+"last name:"+b+"\n"+"contact:"+c+"\n"+"email:"+d+"\n"+"useId:"+e+"\n"+"password:"+f);
			
}
	}



