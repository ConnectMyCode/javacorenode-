package com.test.multithreading;

import java.util.Scanner;

public class TicketCounter {

	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String passengerName = sc.nextLine();
			
		
		
		
		if(passengerName.equals(null) || passengerName.isEmpty())
		{
			System.out.println("Invalid Passenger Details");
			System.exit(0);
			
		}
		
		ticketBooking t1 = new ticketBooking(passengerName);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
