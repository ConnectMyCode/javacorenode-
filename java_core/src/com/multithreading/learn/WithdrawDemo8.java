package com.multithreading.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WithdrawDemo8 extends Thread{
	
	private double amount;
	

	public WithdrawDemo8(double amount)
	{
		this.amount = amount;
	}
	
	@Override
	public void run() 
	{
		String path = "C:\\java_core_workspace\\java_core\\src\\com\\multithreading\\learn\\Demo8.txt";
		
		double bankBalance;
		
		FileInputStream f1;
		try 
		{
			f1 = new FileInputStream(path);   
			var oop = new ObjectInputStream(f1);
		
			 					 
				bankBalance = (double)oop.readObject();
				System.out.println(bankBalance);
				if(amount > bankBalance) 
				{
					System.out.println("Entred withdrawal amount is greater than the current Balance");
				}
				else if(amount < bankBalance) 
				{
					
				 bankBalance -= amount;
					
				/*Updated the balance amount actually the whole file Re-written that is overridden by the new file the old value is deleted. Can't be undone*/
				 	FileOutputStream fop = new FileOutputStream(path);
					var oip = new ObjectOutputStream(fop);    
					
					oip.writeObject(bankBalance);
					
					System.out.println("amount withdrawn please collect the cash below in 5 secs");
					System.out.println("Current Balance is : "+ bankBalance);
					
					//Updating the amount by again writing the recent amount in the file back.
			
				}
			 
					Thread.sleep(5000);  
					
					/*
				 		main → RUNNING
						t3.start()

						main → calls join()
						main → WAITING

						t3 → RUNNING
						t3 → sleep(5s) → TIMED_WAITING

						(5 sec pass)

						t3 → RUNNABLE → RUNNING
						t3 → completes → DEAD

						main → RUNNABLE → RUNNING

					 * */			 
		} catch (Exception e) {
			
		    
			System.out.println(e.getCause()
					);
		} 
		
		
	}	
	
}
