package com.multithreading.learn;

import java.util.Scanner;

public class ClientDemo11 implements Runnable{
	
	
	private int availableSeat = 1;
	
	@Override
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Thread.currentThread().getName() + "Started"); 
		
		
		System.out.println("Enter number of seats :: ");
		int wantedSeat = sc.nextInt();
		
		sc.nextLine();
		
						
		
		if(wantedSeat <= availableSeat)
		{
			System.out.println(Thread.currentThread().getName() + " Seats has been reeserved");
			--availableSeat; 
			System.out.println(getAvailableSeat() + " Available seats ");
			
		}
		else {
			System.out.println(Thread.currentThread().getName() + "Seats are not  available");
		}
		
		
		
		
		System.out.println(Thread.currentThread().getName()+ "Ended");
	}

	public int getAvailableSeat() {
		return availableSeat;
	}
	
}
