package com.multithreading.learn;

public class BalanceCheckDemo8 extends Thread{

	private double balance = 100000;
	
	
	
	
	public double getBalance() {
		return balance;
	}


	@Override
	public void run()
	{
		
		System.out.println("Checking Balance");
		try {
			Thread.sleep(10000);						//Buffering feel given to user just kidding Experimeting sleep() method
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Current Balance is : "+ getBalance());
		
		/*     - -----Withdraw Logic------ - 
		 * 	
		 * if(withdraw > balance) 
		{
			System.err.println("Withdraw amount more than Current Balance :"+ balance);       
		}
		else if(withdraw < balance) 
		{
			balance -= withdraw;
			System.out.println("Current Balance : " + balance);    
		}*/
	
	}	
		
		
		
}
