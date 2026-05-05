package com.multithreading.learn;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FooDemo4 extends Thread{
	
	Thread otherThread;
	
	
	@Override
	public void run() 
	{
		
		
		
	
		String name = Thread.currentThread().getName();
		System.out.println("Thread :"+name+"Salute"); 	           
		
		
		//Adding join in main thread : join()
		
					
		
		//Inside "main" thread :->->-> Using OUPUTSTREAM I am Writing data in the "example.txt" file.
		// HERE  "Thread-0" :-->>    :->_>_>READ data from file "example.txt"
		//Note : Not using join() method Writing and reading will simultaneously happen. Observe what happens when this Thread Concurrently run.
		
		
		
		if(otherThread != null) 
		{
			try
			{
				//Deadlock   // f2.join() inside f2 stack of thread-1 ; that means Current Thread(i.e, f2) waits for f2 thread to complete its execution this is a deadlock situation.         
 /*---->*/		/*	Thread.currentThread().join();  //Inside F2 stack run() method  will only enter inside this if condition :;  here current thread is :-> f2 : current thread : f2.join : means :  thread-1 waits for thread-1 to end its execution
				System.out.println(Thread.currentThread().getName()+"is in waiting state for "+Thread.currentThread().getName() +"to be executed completely");
			*/
				otherThread.join();    //f1.join();  : current thread waits for otherThread to complete it execution 
													// (f2) Thread-1 waits for  (f1) Thread-0 to complete its execution   	
				System.out.println(Thread.currentThread().getName()+"is in waiting state for "+ otherThread.getName() +"to be exectued completely");
			
				/*ask these 2 impl quresitons while using join()      
				 * 
				 * Which is the Current thread ? 
				 * Which is Thread using join method? otherThread.join();
				 * */
			}
			catch(InterruptedException e) 
			{
				System.out.println("Thread Interrupted");    
			}
		}
		
		
		
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
			catch(Exception e) //EOF Exception
			{
				System.out.println("Reading file Ended by "+Thread.currentThread().getName());					
			}
			
		}
		catch(IOException e) 
		{
			System.out.println("Error: ");
			e.printStackTrace();
		}
		
		System.err.println( Thread.currentThread().getName() +"Ended");
	}
	
}
