package com.multithreading.learn;

public class TestDemo19 implements Runnable{

	private int val = 0;
	
	
	
	@Override
	public void run() 
	{
		
		synchronized(this) {
			
			System.out.println("CHild Thread  got the lock");

			for(int i = 1 ; i<=10 ; i++) 
			{
				val= val + i;   //val = 0  1  3  6  10  15
				
				System.out.println(val + "State of "+Thread.currentThread().getName() + " is "+ Thread.currentThread().getState());
				
				try { Thread.sleep(100); } catch(InterruptedException e) { System.err.println("Error inside TestDemo19 file");  }
				
			}
			notify();
			
			
			
			
			
			
		}
		
	}
		
		
		
	public int getVal() 
	{
		return val;
	}
	

	
	
}
