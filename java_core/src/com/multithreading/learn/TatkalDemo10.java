package com.multithreading.learn;

public class TatkalDemo10 implements Runnable{

	@Override
	public void run() 
	{
		
		String name = Thread.currentThread().getName();
		System.out.println( name+ " Your Tatkal  Ticket has been booked !!!");    
	}

}
