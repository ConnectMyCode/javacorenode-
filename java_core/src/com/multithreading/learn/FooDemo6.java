package com.multithreading.learn;

public class FooDemo6 extends Thread{
	
	Thread otherThread;
	
	
	@Override
	public void run() 
	{
		
		System.out.println(Thread.currentThread().getName()+ " Started");
		
		for(int i= 0 ; i <=2 ; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" :"+i);
		  if(otherThread!=null) {  
			  
			  System.out.println(Thread.currentThread().getName()+" Entred inside if():");
			  
			  if(otherThread.getName() == "Thread-1"){ try {otherThread.sleep(10000); } catch(InterruptedException e){ System.out.println(otherThread.getName()+ "Was Interrupted"); }  }

		  
			  if(otherThread.getName() == "Thread-3"){ try {otherThread.join(); } catch(InterruptedException e) {System.out.println(otherThread.getName()+"Was Interrupted");}   }
		  }	
		
			
			
			
		}
		
		System.out.println(Thread.currentThread().getName()+ " Ended");
		
		
		
	}
	

}




/*  Sleep and join will not work as decided because the threads are not controlled if the threads are controlled using join fomr the start then I can get the desired Result    */


/*Structure */

//    4 Threads     
				
/*				Single Class Multiple Objects  --> Multiple Threads
  												pointing to Same Class
 				
  				
	main(){		
	foo t1 = new foo();  
	foo t2 = new foo();  
	foo t3 = new foo();  
	foo t4 = new foo();  
	
	t0.otherThread = t1 ;
	
	t3.otherThread = t4 ;		
	
	t1.start() ; t2.start() ; t3.start() ; 	t4.start() ; 			
	THread-0   ; Thread-1   ; Thread-2   ;  Thread-3   ; 			
	
				} 
				
				
   public class	foo extends Thread {
			
		thread otherThread   //Reference Variable storing other threads reference variable
		
		void run(){
		
		for(int i=1 ; i<=10 ; i++){
			    	    	
			printing(i);
			if(otherThread.getName() == "Thread-1")
			{   otherThread.sleep(2000);                }
			
			if(otherThread.getName() == "Thread-3")
			{   otherThread.join();      f4.join()                 }
		}
		
	}
			
			}			
	
	
	
	
	main |-------
	
 f1	Thread-0 |---Thread.sleep(1000) -----Waiting 5sec---------|----Ends----|    //Even though Thread-0 is in sleep mode it can still be in Running state > Depends on JVM Schedular >> It can either put this state in Waiting state or Keep it running.

 f2	Thread-1 |--------------------------------|-----Ends------|              
 	
 f3	Thread-2 |--- join() -----------Waits for Thread-3 to complete it execution then resumes-----|-----Resumes------|----------Ends------| 
 	
 f4	Thread-3 |-----------------------------------------------------------------------------------|------Ends-----|
 
 	
  	
  	
  	
  	
  		
  		
  	
  	
 * */
 