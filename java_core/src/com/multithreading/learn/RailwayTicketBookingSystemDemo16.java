package com.multithreading.learn;

import java.util.Scanner;

public class RailwayTicketBookingSystemDemo16 {
	
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		String[] passengerName = new String[3];
		
		for(int i =0; i<=2; i++) 
		{
			
			System.out.println("ENter your name"+i);
			passengerName[i] = sc.nextLine();	
			
		}
		
		
		//3 Passengers want to book railway ticket 
		CustomerDemo16 cust1 = new CustomerDemo16(passengerName[0]);
		CustomerDemo16 cust2 = new CustomerDemo16(passengerName[1]);
		CustomerDemo16 cust3 = new CustomerDemo16(passengerName[2]);
		
		
		cust1.start();     cust2.start();       cust3.start();
		
		
	}

}
