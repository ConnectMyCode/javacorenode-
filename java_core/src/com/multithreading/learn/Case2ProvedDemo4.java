package com.multithreading.learn;

public class Case2ProvedDemo4 {
			

	    public static void main(String[] args) throws InterruptedException {

	        System.out.println("Main Started");

	        FooDemo4 f1 = new FooDemo4();   // Thread-0
	        FooDemo4 f2 = new FooDemo4();   // Thread-1

	        // 🔗 Giving reference of f1 to f2
	        f2.otherThread = f1;

	        f1.setName("Thread-0");
	        f2.setName("Thread-1");

	        f2.start(); //Thread-1
	        
	        f1.start(); //Thread-0

	        System.out.println("Main Ended");
	    }
	}




