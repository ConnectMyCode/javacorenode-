package com.multithreading.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ExceptionDemo4 {
	
	public static void main(String []args)  throws FileNotFoundException ,IOException
	{
		Scanner sc = new Scanner(System.in);
			
		Thread.currentThread().setName("MAIN");
		
		System.err.println("Thread: "+Thread.currentThread().getName()+"Started");
		
		
		//Now i am adding join() method to see changes in execution of these threads : 
		join();   //Waits for this thread to terminate. Throws InterrupteException 
	
		
		FooDemo4 f1 = new FooDemo4();
		f1.setName("Thread-0");   //setName(String name)   used to set a name to user thread explicitly. 
		f1.start();  
		
		

		FooDemo4 f2 = new FooDemo4();
		f2.setName("Thread-1");   //setName(String name)   used to set a name to user thread explicitly. 
		f2.start();
		
		
		
		String path = "C:\\java_core_workspace\\java_core\\src\\com\\multithreading\\learn\\example.txt";
		
		FileOutputStream fout = new FileOutputStream(path);
		var oops = new ObjectOutputStream(fout); 
		
		String []contacts = new String[2]; 
							
		try(fout;oops;sc)
		{
			for(int i = 0 ; i < 2 ; i++) 
			{
				System.out.println("ENter mobile phone number");
				contacts[i] =   sc.next();
				oops.writeObject(contacts[i]);
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		System.err.println("Thread: "+Thread.currentThread().getName()+"Ended");
		
	}

}

