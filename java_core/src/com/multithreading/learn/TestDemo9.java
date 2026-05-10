package com.multithreading.learn;

public class TestDemo9 implements Runnable{
	
	@Override
	public void run() 
	{
		
		for(int i = 0; i<9 ; i++) 
		{
			System.out.println("Running "+i +" "+ Thread.currentThread().getName());
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	

	
	
	
}
