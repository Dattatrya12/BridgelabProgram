package com.bridgelabz.oop;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagement 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/management.json");
		ObjectMapper obje=new ObjectMapper();
		 List<PojoInventory> inventory=new ArrayList<>();
		// List<InventoryManagement> management=new ArrayList<>();
		inventory=obje.readValue(file, new TypeReference<List<PojoInventory>>(){});
		System.out.println("inventory management:");
		System.out.println(inventory.get(0));
		for(int i = 0 ; i < inventory.size();i++)
		{
			
			System.out.println("name"+inventory.get(i).getName()+",  weight:"+inventory.get(i).getWeight()+",price:"+inventory.get(i).getPrice());
			int weight = inventory.get(i).getWeight();
			int price = inventory.get(i).getPrice();
			int total_price = (weight*price);
			System.out.println("Total price:"+total_price);
		}
	}
}
