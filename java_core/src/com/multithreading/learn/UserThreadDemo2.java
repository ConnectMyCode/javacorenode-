package com.multithreading.learn;

public class UserThreadDemo2 extends Thread{

	
	//NOT OVerriden run() method so JVM will go to Thread Class and search there; 
	
	{
		for(int i=0;i<10;i++) 
		{
			System.out.println("i: "+i);
		}
		System.out.println("Hi no run method in UserThread named as Thread-0 \n"+ "Concurrent Execution of THread-0 Finish");
		
	}
	
	{}
	
	
}
