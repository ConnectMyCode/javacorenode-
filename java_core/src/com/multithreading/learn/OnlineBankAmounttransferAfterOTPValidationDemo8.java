package com.multithreading.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class OnlineBankAmounttransferAfterOTPValidationDemo8 {
	
	public static void main(String []args) throws InterruptedException
	{
		
		Scanner sc = new Scanner(System.in);
			String path = "C:\\java_core_workspace\\java_core\\src\\com\\multithreading\\learn\\Demo8.txt";
		
	//Writing the amount in the file only once then When the programme is executed ahgain the real amount / curent amount perssit .	   
	/*	try {
			FileOutputStream fop = new FileOutputStream(path);
			var oop = new ObjectOutputStream(fop);
			
			oop.writeObject(800000.0000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getCause();
		} 
		*/
		
	//-------------OTP Verification--------------
		OTPVerificationDemo8 otpThread = new OTPVerificationDemo8();
		
		
		BalanceCheckDemo8 t2 = new BalanceCheckDemo8();
	//Referencing 
			OTPVerificationDemo8.otherThread = t2;
		
		
		otpThread.setName("OTP");

		otpThread.start();
		
		try {
			System.out.println("OTP Verification started");
			otpThread.join();    //main thread will wait for otpThread to complete its execution.
		}
		catch(InterruptedException e) 
		{
			System.out.println("Thread Interrupted while in waiting state");
		}
		
		
		/*-------------- Balance Checking -----------*/
		
		if(otpThread.isFlag == true)
		{
			t2.start();
			System.out.println(t2.isAlive());		  
			t2.join();     //main method waits for t2 thread to complete its execution : -> balance chekcing will take place first after completing it the main thread continues
			System.out.println("Balance check completed");
		}
		else if(otpThread.isFlag == false) 
		{
			System.exit(0);
		}
		
		
		
		
		
		/*    use File handling store the data inside a file to make it permanent .And retrieve and update it . */
		
		
		System.out.println("Do you want to Withdraw some amount : ENTER Y/N");
		
		String userInput = sc.next().toLowerCase();
		
		if(userInput.equalsIgnoreCase("y")) 
		{
			//------------Withdraw--------------------------	
			
			System.out.println("Enter amount to withdraw: ");    
			
			double withdraw = sc.nextDouble();
			
			WithdrawDemo8 t3 = new WithdrawDemo8(withdraw);
			//referencing 
				//Will not work because the thread is in Dead State         
			//From file we are fetching the data.
			t3.start();	
			t3.join(); //main thread waits for t2 thread to end. 
				
		}		
		else if(userInput == "n") 
		{
			System.out.println("Thank you for Using our Banking services hope to see you soon.....");
		}
				
				
		System.out.println("Main thread ended : Thank you Please visit soon....");
		
						
			FileInputStream f1;
			try {
			var	fip = new FileInputStream(path);
				
			var oop = new ObjectInputStream(fip);
			
			double balance = (double)oop.readObject();
			System.out.println(balance);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getCause();
			}   

	

}
}