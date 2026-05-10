package com.multithreading.learn;

public class ThreadClassConstructorDemo10 {
	
	
	public static void main(String []args) 
	{
		
		
		TatkalDemo10 tatkal = new TatkalDemo10();
		Thread scot = new Thread(tatkal , "MR. Scott");  // // Thread class contructor used  : Thread(Runnable Target , String name)

		PremiumTatkalDemo10 premiumTatkal = new PremiumTatkalDemo10();
		Thread smith = new Thread(premiumTatkal);      // Thread class contructor used  : Thread(Runnable Target)        
			
			
		scot.start();
		smith.start();
		
		
		
		
//		internally the run() method has been triggered . 
		
	}

}
