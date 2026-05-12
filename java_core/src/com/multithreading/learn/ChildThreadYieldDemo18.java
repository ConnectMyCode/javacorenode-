package com.multithreading.learn;

import java.util.concurrent.locks.LockSupport;

public class ChildThreadYieldDemo18 implements Runnable{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		for(int i =1; i<=10 ; i++)
		{ System.out.println(i+" by "+ name +" thread"); 
			if(name.equalsIgnoreCase("Child1")) {
				Thread.yield(); //Gives the Chance to Child 2 thread
			}
		} 
	
}
} 
