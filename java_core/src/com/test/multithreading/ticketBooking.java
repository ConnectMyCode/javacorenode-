package com.test.multithreading;

public class ticketBooking extends Thread{

	private String name;
	
	public ticketBooking(String name) 
	{
		this.name = name;
	}
	
	
	@Override
	public void run() 
	{
		System.out.println("Ticket generation started...");   
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Seat allocated successfully");  
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ticket Generated successfully");  
	
		System.out.println("Booking completed for "+ name);  

		System.out.println("Ticket sent to passenger");  
		
	}
	
}
