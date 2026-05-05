package com.multithreading.learn;

import java.util.Scanner;

public class OTPVerificationDemo8 extends Thread{
	
	protected static  Thread otherThread;     //Method area so accessible to all
	
	
	protected  boolean isFlag;
	
	
	@Override
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the otp: ");
		int otp = sc.nextInt();
		
		
		if(otp == 123) 
		{
			//just to see how sleep works using sleep method otherwise its unnecessary;  
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("OTP is correct  Proceed with balance Check : ");
			isFlag = true;
		}
		else {
			System.out.println("OTP is incorrect: Please enter correct otp ");
			isFlag = false;
		}
	
	}
	
	
	
	
	
	
}