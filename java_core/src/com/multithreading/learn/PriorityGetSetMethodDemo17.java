package com.multithreading.learn;

public class PriorityGetSetMethodDemo17 {    
	
	
	public static void main(String []args)
	{	
		
		//Parent thread is Always Main thread  
		
		Thread t1 = new Thread();   //Created a Child Thread
		
		
		System.out.println("Priority of the Current thread :" +Thread.currentThread().getName()+" is" + Thread.currentThread().getPriority() );   
	
		System.out.println("Priority of the Current Child thread : " + t1.getName()+" is " + t1.getPriority() );   

		
		//Setting prirotiy
		t1.setPriority(10);
		System.out.println("Priority of the Current Child thread : " + t1.getName()+" is " + t1.getPriority() );   
		
	}
	
	

}


//Child Thread(t1) always carries the same priority as the Parent thread(main)  i.e, '5'  

//Using setPriority() non static method  we can change priority in between the range 1-10;

//Using getPriority() we can get  thread priority.

//If priority is out of range 1-10   11>> Error  given is IllegalArgumentException error.
 
// 1-Min/lowest   ; 10 - Max/Highest   ; default priority - 5

