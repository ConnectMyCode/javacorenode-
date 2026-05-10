package com.multithreading.learn;

public class OnlinePortalDemo16 {
			
	private static volatile int seatsAvailable = 2;    //must be static 
	
	
	public static synchronized void ticketConfirmationSystem(String name) 
	{
		
		if(seatsAvailable == 0 ) 
		{
			System.out.println("Seats are not availbale");
		}
		else {
			System.out.println(name + "Welcome processing please wait till seat confirmation....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Seat booking completed Check your email to view the ticket");
		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		}
	}
	
	
}
