package com.multithreading.learn;

public class TestDemo3 extends Thread{
	
	
	@Override
	public void run()
	{
		System.err.println("Keep smiling Thread-0");
		
		
		for(int i = 0 ; i<9 ; i++) 
		{
			System.out.println("Getting Ecstatic Bro"+i);
		}
		
		System.err.println(" It was a fullfilling journey Thread-0");
	}
	
	
}


