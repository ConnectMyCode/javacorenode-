package com.multithreading.learn;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FooDemo4 extends Thread{
	
	@Override
	public void run() 
	{
	
		String name = Thread.currentThread().getName();
		System.out.println("Thread :"+name+"Salute"); 	           
		
		
		//Adding join in main thread : join()
		
		
		
		//Inside "main" thread :->->-> Using OUPUTSTREAM I am Writing data in the "example.txt" file.
		// HERE  "Thread-0" :-->>    :->_>_>READ data from file "example.txt"
		//Note : Not using join() method Writing and reading will simultaneously happen. Observe what happens when this Thread Concurrently run.
		
		
		try 
		{
			String path = "C:\\java_core_workspace\\java_core\\src\\com\\multithreading\\learn\\example.txt" ;
			
			FileInputStream fin = new FileInputStream(path);
			var ois = new ObjectInputStream(fin);
			
			try(fin;ois)
			{
				int i=0;
				
				while(i<2) 
				{
					String contact = (String)ois.readObject();  					
					System.out.print("Retrieved Successfully: "+contact);
					i++;
				}
			 //returnn type is Object so Using Explicit Casting to convert into String
			
			}
			catch(Exception e) 
			{
				System.out.println("Error: ");	
				e.printStackTrace();				
			}
			
		}
		catch(IOException e) 
		{
			System.out.println("Error: ");
			e.printStackTrace();
		}
		
		System.err.println("Thread-0 Ended");
	}
	
}
