package com.multithreading.learn;


public class AnonymousInnerClassUsingThreadClassWithReferenceVariableDemo7 {
	
	
	public static void main(String []args)
	{
		
		System.out.println("Main thread started");
		
		//Anonymous inner class
		Thread t1 = new Thread()  
		{
			public void run() 
			{
				for(int i= 0 ; i < 6  ; i++) 
				{
					System.out.println("Value :" + i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
			
		};
		
		
		//Anonymous Inner class without Reference 
		
		new Thread() 
		{
			@Override
			public void run() 
			{
				for(int i = 0 ; i< 8 ; i++) 
				{
					System.out.println("Incoming barrage of fire in : ");
					 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		  																						
		
		t1.start();
		
		System.out.println("Main Thread Ended");    
		
	}
	
}
