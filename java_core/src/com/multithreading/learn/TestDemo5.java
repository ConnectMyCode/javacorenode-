package com.multithreading.learn;

public class TestDemo5 extends Thread{

	
	@Override
	public void run() 
	{
		
		System.err.println(Thread.currentThread().getName()+"Started");
		
		try 
		{
			
			for(int i = 0 ;  i< 15 ; i++) 
			{
				System.out.println("Missiles incoming "+ i);
				Thread.sleep(5000);    //Creates a  InterruptedException				
			
				
			}
			
		}
		catch(InterruptedException e) 
		{
			System.out.println("Thread interrupted"+Thread.currentThread().getName());
		}
		System.err.println(Thread.currentThread().getName()+"Ended");
	}
}




