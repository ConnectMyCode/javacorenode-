package com.multithreading.learn;

public class CustomerRaceConditionDemo12    // implements Runnable 
{
	
	private double withdraw;
	
	private double bankBalance =15000;
	
	
	
	public CustomerRaceConditionDemo12(double withdraw){
		
		this.withdraw = withdraw;			
	}			
	
	
	public double getBankBalance() {
		return bankBalance;
	}




	public void withdraw() 
	{
/*			 customer 1    customer 2     Both of them enter  HOW? Explained below >>>> This condition is called race condition this a rare condition but it is  possible to occur these a limitation of MMultiThreading.                
   		  	|				|
		  	|				|
		  	|				|
		  	⬇️				⬇️    */
		 if(withdraw <= bankBalance) 
	 /*		 |				|
			 |				|
			 |				|
			 ⬇️				⬇️
	 	customer 1          customer 2	
	  */		
			
	//->  customer 1 enters true condition >>CONTEXT Switches >> customer 2 >> Customer 2 enters true condition >>  
			/*   output:->      
				customer 2 Amount successfully withdrawn.
				customer 1 Amount successfully withdrawn.
				customer 2 Current Balance is : -9000.0
				customer 1 Current Balance is : -9000.0
			 * */
		{
			bankBalance -= withdraw;
			System.out.println(Thread.currentThread().getName()+ " Amount successfully withdrawn.");
			System.out.println( Thread.currentThread().getName()+" Current Balance is : "+ getBankBalance());     
		}
		else {
			System.out.println(Thread.currentThread().getName() + "Insufficient Bank Balance. Please check the available balance."+getBankBalance());       
		}
	}

	
	
//If this run() method is commented then so here the run method is not avaiable we have another beautiful way to do this :-> 
	
//	Runnable r1 = ()-> {};
	

	
/*UNCOMMENT*/	
/*	
	public void run() 
	{ 
		System.out.println(Thread.currentThread().getName() + " Processing");
		
		
		for(int i=0; i<4 ; i++) 
		{
			System.out.println(Thread.currentThread().getName()+ "🔃");
			
			try {
			 	Thread.sleep(1000);
			} catch (InterruptedException e) {
			 	// TODO Auto-generated catch block
			 	e.printStackTrace();
			}
		}    
	
		withdraw();
	
	}
	*/
	
	
	
	
}
