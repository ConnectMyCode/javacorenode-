package com.multithreading.learn;

public class TestDemo18 implements Runnable
{
	
	private int val = 0;
	
	@Override
	public void run() 
	{
		for(int i = 1 ; i<=10 ; i++) 
		{
			val= val + i;   //val = 0  1  3  6  10  15
			System.out.println(val + "State of "+Thread.currentThread().getName() + " is "+ Thread.currentThread().getState());
			try { Thread.sleep(100); }
			catch(InterruptedException e) {   }
			
			
		}
	}
		
		
		
	public int getVal() 
	{
		return val;
	}
	
	
}
