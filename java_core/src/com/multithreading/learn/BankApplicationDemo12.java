package com.multithreading.learn;

import java.util.Scanner;


public class BankApplicationDemo12 {

	public static void main(String []args) 
	{
		System.out.println("Main thread started");
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter amount to withdraw"); 
		double amount = sc.nextDouble(); 
		
		
		CustomerRaceConditionDemo12 cust1 = new CustomerRaceConditionDemo12(amount); 
		
		//cust1.start(); //This above class Implements Runnable >>> Interface functional >> run() method >> no start() method available >> to start() thius we need to use  THREAD class Constructor
		
		
/*UNCOMMENT ToSEE Race CONDTION */ 
		/* 		
  		Thread t1 = new Thread(cust1 , "customer 1");     //Constructor used is >>>> Thread(Runnable Target , String name);
							                              //->which run() method to target mean Runnable Target here cust1.
							
		Thread t2 = new Thread(cust1 , "customer 2");
		
		
		t1.start();
		t2.start();
		
		 */		
																									
	//	⬆️  Above way is when there is a run() method available in the  Customer class so if  it is not available then below is the way where i AM WRITTING the run() method using lambda Function<T, R> .class 
		
		Runnable r1 = () ->
		{
			cust1.withdraw();
		};
		

  		Thread t1 = new Thread(r1, "customer 1");    
       
  		Thread t2 = new Thread(r1 , "customer 2");

  		t1.start();
  		t2.start();

		System.out.println("Main thread ended");
	}
		
}

