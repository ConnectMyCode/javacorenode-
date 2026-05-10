package com.multithreading.learn;

public class YieldDemo18 {
	
	public static void main(String []args) {
		
		ChildThreadYieldDemo18 test = new ChildThreadYieldDemo18();
		
		Thread child1 = new Thread(test, "Child1");
		Thread child2 = new Thread(test, "Child2"); 
		
		
		child1.start();
		child2.start();
		
		
		
	}
	
	
		
	
}

// Yield()  >>> Moves thread form  RUNNING ---DIRECTLY TO ------ RUNNABLE STATE


// Thread.yield();   CURRENT Thread -> main     
// Current Thread sends a message to the JVM schedular to stop the execution of Currently running thread and Give chance to the thread in RUnable State.

//Thread SCHEDULER >----> May OR May NOT Accept the Request.
/*  IF , Request is accepted -->--->Other Thread(RUNNABLE STATE) has Lower Priority -->--> Current Thread continues to run Ignores Lower Priority thread.
  							 -->--->Other Thread(RUNNABLE STATE) has Higher OR Same Priority ---> Current Thread return to Runnable state directly and gives chance to the Other  Thread with higher or same priority.		
 * */





