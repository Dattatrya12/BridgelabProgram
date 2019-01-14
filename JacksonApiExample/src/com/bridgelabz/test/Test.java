package com.bridgelabz.test;

import java.io.IOException;

//import org.codehaus.jackson.map.JsonMappingException;

//import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.bean.Employee;
import com.bridgelabz.util.JacksonUtil;

public class Test {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpNo(101);
		emp.setEmpName("datta");
		emp.setSalary(20000);
          String resultEmployee=JacksonUtil.convertJavaToJson(emp);
          System.out.println(resultEmployee);
	}

}
