package com.multithreading.learn;

public class PremiumTatkalDemo10 implements Runnable{

	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		System.out.println( name+ " Your Premium Tatkal  Ticket has been booked !!!");    
	}
}