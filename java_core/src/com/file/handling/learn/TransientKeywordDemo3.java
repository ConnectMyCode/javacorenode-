package com.file.handling.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TransientKeywordDemo3 {
	
	public static void main(String []args) throws IOException 
	{
		
		Scanner sc= new Scanner(System.in);
		
		//Serialization 
		String path = "C:\\java_core_workspace\\java_core\\src\\com\\file\\handling\\learn\\CustomerData.txt";
		var fou = new FileOutputStream(path);
		var oos = new ObjectOutputStream(fou);
		
		
			
		try(fou;oos;sc)
		{
			oos.writeObject( new CustomerDemo3(111 , "Aryan" , 123000D , 123456789L) );
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
		//De-Serialization 
		var fin = new FileInputStream(path);   //InputStream Connection Established;
		var ois = new ObjectInputStream(fin);
		
		try(fin;ois)
		{	//Object readObject(); 
			CustomerDemo3 cust   =(CustomerDemo3) ois.readObject();
			System.out.println(cust);
		}
		catch(Exception e)	  
		{
			System.out.println("Error: "); 
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
