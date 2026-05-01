package com.file.handling.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class SerializationOnArrayDemo2 {

	public static void main(String []args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of products want.");
		Integer size = Integer.valueOf(sc.next()); 
		
		
		ProductDemo2 []products = new ProductDemo2[size];
		
		int i = 0 ;
		
		for(ProductDemo2 prod : products) 
		{
			System.out.println("Enter product name: ");
			String name = sc.next();
			
			System.out.println("Enter product id: ");
			Integer id = sc.nextInt();
		
			products[i] = new ProductDemo2(name , id);    					
			i++;
		}
		
			//Serialization  
			var filePath = "C:\\java_core_workspace\\java_core\\src\\com\\file\\handling\\learn\\Product.txt";
			FileOutputStream fout = new FileOutputStream(filePath);
			ObjectOutputStream ous = new ObjectOutputStream(fout);			
		
		
			try (fout;ous){
												//void writeObject(Object obj);
					ous.writeObject(products);					
					System.out.println("Array Object Stored Successfully!!!");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
			
			//De-Serialization 
			
			FileInputStream fin = new FileInputStream(filePath);
			ObjectInputStream  ois = new ObjectInputStream(fin);  

			try(fin ; ois)
			{								  // Object readObject();
				ProductDemo2 []p1 = (ProductDemo2[])ois.readObject(); 							
				System.out.println(" List of Products Recieved After De-serialization from Products.txt : ");    
				
				for(ProductDemo2 prods:p1) 
				{
					System.out.println(prods);
				}
				
			System.out.println(Arrays.toString(p1));
			}
			catch(Exception e1) 
			{
				e1.printStackTrace();
			}
			
			
			
	
	}
	
	
}
