package com.bridgelabz.oop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonClass;
import org.codehaus.jackson.map.ObjectMapper;
//import com.fasterxml.jackson.core.type.TypeReference;
import org.codehaus.jackson.type.TypeReference;


public class StockMain {

	public static void main(String[] args) throws  IOException {
		File file = new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/stock.json");
		ObjectMapper mapper = new ObjectMapper();
		List<PojoStock> stock=new ArrayList<>();
		

		stock=mapper.readValue(file, new TypeReference<List<PojoStock>>(){});
		System.out.println("stock report:");
		System.out.println(stock.get(0));
		for(int i = 0 ; i < stock.size();i++)
		{
			//System.out.println(stock.get(i));
			int number = stock.get(i).getNumber();
			int price = stock.get(i).getPrice();
			int total_price = (number*price);
			System.out.println("Total price:"+total_price);
			System.out.println(stock.get(i));
			
		}

	}

}