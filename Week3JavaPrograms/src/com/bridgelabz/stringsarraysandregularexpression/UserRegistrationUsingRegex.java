package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class UserRegistrationUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Utility.checkResult("datta", "Age", "9158174621", "dattaage999@gmail.com", "Dattatrya","Datttrya@123"));
        System.out.println(Utility.replacementregex("parmeshwar", "Raut", "Parmeshwar"));
        System.out.println(Utility.stringValidation("sagar"));
        System.out.println(Utility.emailidValidation("dattaage999@gmail.com"));
        System.out.println(Utility.contactValidation("9158174621"));
        System.out.println(Utility.uIdValidation("Pamdurang"));
        System.out.println(Utility.passwordValidation("Datta@123", "datta", "Age", "Pandurang"));
	}

}
