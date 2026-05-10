package com.multithreading.learn;

public class DifferentCasesWithThreadClassConstructorDemo13 {
	
	
	
	public static void main(String []args) 
	{
		//CASE 1: ANONYMOUS INNER CLASS using Runnable
		
		Runnable run  = new Runnable() {         //Anonymous Inner class implementing the Runnable Interface. 
			public void run() {
				System.out.println(Thread.currentThread().getName() + " running");
			}
		};
		
		
		Thread t1 = new Thread(run , "Balls 1");  	
		t1.start();
		
		
		
		//Case 2 : Anonymous Inner Class  with Runnable without reference using Thread class Contructor 
		//WITHOUT REFERENCE  
//No separate thread is created concurrently so there is only main thread 		
		new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "Running");
			}
		}.run();   
		
		
		
		Thread t2 = new Thread(new Runnable()        //Thread(Runnable Target , String name)
		{
			public void run() 
			{
				System.out.println(Thread.currentThread().getName()+" running");
			} 
		} , "Balls 2");
		
		
		t2.start();
	




	//CASE 3 : -> Lambda Using Runnable

	Runnable r2 = () -> 
	{
			System.out.println(Thread.currentThread().getName()+" Running");

	};
													
	Thread t3 = new Thread( r2 , "Balls 3");		
	t3.start();						
					
	
	System.out.println("......................");
	
	
	Thread t4 = new Thread(()->{ System.out.println(Thread.currentThread().getName() + " Running"); System.out.println("Make it");}  , "Ball 4");
	t4.start();
	
	
	
	
	//CASE 4 :  Lambda With Thread Constructor without Reference  
	
	new Thread(() -> 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name is :"+ name); 
	},"Balls 5").start();
	

}
}




