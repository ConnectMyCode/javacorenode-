package com.multithreading.learn;

public class IsAliveMethodDemo3 {

	
//Public final boolean isAlive()  method .	
	
	public static void main(String []args) 
	{
		System.out.println("Main thread start of the story");
		
		TestDemo3 tnt = new TestDemo3();
		
		tnt.start();
		System.out.println(""+tnt.isAlive()); //Return type is boolean true/ false
		
		for(int j= 0 ; j<15 ; j++) 
		{
			System.out.println("main thread keep smiling: "+j);
		}
		System.out.println(""+tnt.isAlive()); // Test Thread may be alive or not  
		
		System.out.println("Main thread end of the story");
		
		System.out.println(""+tnt.isAlive()); // Test Thread may be alive or not   Depending on the Thread Scheduler how it assigns the Thread to the processor
		
		
		System.out.println("Current Thread main: "+Thread.currentThread().getName()); 
		
	}
	
}



