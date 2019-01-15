package com.utility;
import java.io.FileReader;  
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class Utility {
              static Scanner scanner=new Scanner(System.in);
            public static int getInt()
		   {
			   int integerValue=Integer.parseInt(scanner.nextLine());
			   return integerValue;
		   }
		   public static float getFloat()
		   {
			   int floatValue=scanner.nextInt();
			   return floatValue;
		   }
		   public static double getDouble()
		   {
			   double doubleValue=scanner.nextDouble();
			   return doubleValue;
		   }
		   public static String getString()
		   {
			   String stringValue=scanner.nextLine();
			   return stringValue;
		   }
		   public static Long getLong()
		   {
			   long longValue=scanner.nextLong();
			   return longValue;
		   }

		   public static void printPoemLyrics() throws FileNotFoundException
		   {
		   Scanner file = new Scanner(new File("poem.txt"));
		   String line = "";
	        while(file.hasNextLine())           
	        {
	                 line = line+"\n"+file.nextLine();
	                 
	             
	        }
	        for(int i=1;i<=9;i++)
	    	{
	    		if(i==1)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Chicks" ).replaceAll("<<SOUND>>","chick-chick");
	    			System.out.println(fin+"\n");
	    		}
	    		
	    		if(i==2)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Duck" ).replaceAll("<<SOUND>>","Quack-quack");
	    			System.out.println(fin+"\n");
	    		}
	    		
	    		if(i==3)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Turkey" ).replaceAll("<<SOUND>>","gobble-gobble");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==4)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Cow" ).replaceAll("<<SOUND>>","moo-moo");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==5)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Pig" ).replaceAll("<<SOUND>>","oink-oink");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==6)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Cat" ).replaceAll("<<SOUND>>","meow-meow");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==7)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Dog" ).replaceAll("<<SOUND>>","Bow-Bow");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==8)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Mule" ).replaceAll("<<SOUND>>","Heehaw-Heehaw");
	    			System.out.println(fin+"\n");
	    		}
	    		if(i==9)
	    		{
	    			String fin=line.replaceAll("<<ANIMAL>>","Turtle" ).replaceAll("<<SOUND>>","nerp-nerp");
	    			System.out.println(fin);
	    		}

               }
	        }
		  /*********************minimum and maximum from file
		   * @throws IOException **********/

		  public static void getMinimumMaximum() throws IOException
		  {
		  	Scanner file=new Scanner(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/MinMaxInput.txt"));
		  	
		  	int arr[]=new int[6];
		  	//read from file
		  	while(file.hasNext())
		  	{
		  	
		  	for(int i=0;i<6;i++)
		  	{
		  		String n=file.nextLine();
		  		int a=Integer.parseInt(n);
		  		arr[i]=a;
		  	}
		  	
		  	}
		  	file.close();
		  	
		  	FileWriter fw=new FileWriter(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/MinMaxOutput.txt"));
		  	//compare to find min 
		  	int temp=arr[0];
		  	for(int i=1;i<arr.length;i++)
		  	{
		  		if(arr[i]<temp)
		  		{
		  		temp=arr[i];
		  		}
		  	}
		  	System.out.println("minimum is:"+temp);
		  	fw.write("minimum is:"+temp+"\n");
		  	
		  	//max
		  	int temp1=arr[0];
		  	for(int i=1;i<arr.length;i++)
		  	{
		  		if(arr[i]>temp1)
		  		{
		  		temp1=arr[i];
		  		}
		  	}
		  	System.out.println("maximum is:"+temp1);
		  	fw.write("maximum is:"+temp1);
		  	fw.close();
		  	file.close();
		  }

		   /****************birth dates************/
			public static void getBirthDate(int maximum, int minimum) throws IOException
			{
				FileWriter fw=new FileWriter(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/birthdates.txt"));
				int st[][]=new int[50][3];
				
				//date
				for(int i=0;i<50;i++) 
				{
				int n= ((int) (Math.random()*(maximum - minimum))) + minimum;
				st[i][0]=n;
				}
				
				//month
				int min=1,max=13;
				for(int j=0;j<50;j++) 
				{
				int n= ((int) (Math.random()*(max - min))) + min;
				st[j][1]=n;
				}
				
				//year
				int min1=1992,max1=1994;
				for(int j=0;j<50;j++) 
				{
				int n= ((int) (Math.random()*(max1 - min1))) + min1;
				
				st[j][2]=n;
				}
				
				//display
				
				fw.write("\tDate\tMonth\tYear\n");
				for(int k=0;k<50;k++)
				{
					fw.write((k+1)+":\t");
					for(int l=0;l<3;l++) 
					{
					if(st[k][l]>=28 && st[k][1]==2 )
						st[k][l]=st[k][l]-2;
					
					if(st[k][2]<1992)
						st[k][2]=1993;
					String newArr =(Integer.toString(st[k][l])+"\t\t");
					fw.write(newArr);
					
					}
					fw.write("\n");
					
				}
				fw.close();
			}


			/*******************average of floting point numbers in file
			 * @throws IOException *********/

			public static void getAverage() throws IOException
			{
				Scanner file=new Scanner(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/averageInput.txt"));
				float arr[]=new float[10];
				while(file.hasNextLine())
				{
					for(int i=0;i<10;i++)
					{
						String input=file.nextLine();
						float n=Float.parseFloat(input);
						arr[i]=n;
					}
				}
				file.close();
				
				FileWriter fw=new FileWriter(new File("/home/admin1/Desktop/JavaPrograms/Week4JavaPrograms/averageOutput.txt"));
				int count=0;
				float sum=0;
				for(int i=0;i<arr.length;i++)
				{
					count++;
					sum=sum+arr[i];
				}
				System.out.println("sum:"+sum);
				
				float average=sum/count;
				System.out.println("average of is:"+average);
				fw.write("average:"+average);
				fw.close();
			}



			
			
public static int[][] trasposDemo(int row,int col){
				
				int [][]array = new int [row][col];
				  System.out.println("Enter element in matrix :");
				  
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						   array[i][j] = Utility.getInt();
					  }
				  }
				  System.out.println();
				  
				  System.out.println("before matrix:");
				  for(int i=0;i<row;i++) {
					  for(int j=0;j<col;j++) {
						  System.out.print(array[i][j]+"\t");
					  }
					  System.out.println();
				  }
				
				  System.out.println("after matrix is below:");
				int newArr[][]=new int[3][3];
				for(int i=0;i<col;i++) {
					for(int j=0;j<row;j++) {
						newArr[i][j]=array[j][i];
						System.out.print(array[j][i]+"\t");
					}
					System.out.println();
				

		}
				return newArr ;
			
		}
public static int countWays(int n) 
{ 
    int[] res = new int[n + 1]; 
    res[0] = 1; 
    res[1] = 1; 
    res[2] = 2; 

    for (int i = 3; i <= n; i++) 
        res[i] = res[i - 1] + res[i - 2] 
                            + res[i - 3]; 

    return res[n]; 
} 
            public static int increment(int a)
            {
            	a++;
            	System.out.println(a);
            	return a;
            }
            public static void inventoryDetails()
        	{
        		JSONParser parser = new JSONParser();
        		try
        		{
        			//Read json file and stored in json object
        			JSONObject obj =(JSONObject) parser.parse(new FileReader("InventoryJson.json"));
        			System.out.println(obj);
        			//getting price of rice
        			JSONObject jsonobj1 =  (JSONObject) obj.get("Rice");
        			System.out.println("\n******Rice Details*****\n"+jsonobj1);
        		    Object riceprice = jsonobj1.get("Price").toString();
        		    //getting total weight of rice means how much rice is available
        		    JSONObject jsonobj2 =  (JSONObject) obj.get("Rice");				
        		    Object riceweight = jsonobj2.get("Weight").toString();
        		    System.out.println("\nTotal Rice Stock   :"+Integer.parseInt( jsonobj1.get("Price").toString())*
        		    		(Integer.parseInt( jsonobj2.get("Weight").toString())));
        		   
        		    //getting price of pulses
        		    JSONObject jsonobj3 =  (JSONObject) obj.get("Pulses");
        			System.out.println("\n******Pulses Details*****\n"+jsonobj3);
        		    Object pulsesprice = jsonobj3.get("Price").toString();
        		    //getting weight of pulses 
        		    JSONObject jsonobj4 =  (JSONObject) obj.get("Pulses");				
        		    Object pulsesweight = jsonobj4.get("Weight").toString();
        		    System.out.println("\nTotal Pulses Stock   :"+Integer.parseInt( jsonobj3.get("Price").toString())*
        		    		(Integer.parseInt( jsonobj4.get("Weight").toString())));
        		    //getting details of wheats 
        		    JSONObject jsonobj5 =  (JSONObject) obj.get("Wheats");
        			System.out.println("\n******Wheats Details*****\n"+jsonobj5);
        		    Object wheatsprice = jsonobj5.get("Price").toString();
        		    
        		    JSONObject jsonobj6 =  (JSONObject) obj.get("Wheats");				
        		    Object wheatsweight = jsonobj6.get("Weight").toString();
        		    System.out.println("\nTotal Wheats Stock   :"+Integer.parseInt( jsonobj5.get("Price").toString())*
        		    		(Integer.parseInt( jsonobj6.get("Weight").toString())));
        		}
        		catch(Exception e)
        		{
        			System.out.println(e);
        		}		
        	}
            public static void stockDetails()
            {
            	JSONParser parser = new JSONParser();
        		try
        		{
            	JSONObject obj =(JSONObject) parser.parse(new FileReader("stock.json"));
    			System.out.println(obj);
    			
        		}
        		catch(Exception e)
        		{
        			System.out.println(e);
        		}
        		

            }
}

	          		
	          	
			


		   
		 
