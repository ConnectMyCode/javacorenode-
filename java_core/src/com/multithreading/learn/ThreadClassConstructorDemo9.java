package com.multithreading.learn;

public class ThreadClassConstructorDemo9 {
	
	public static void main(String []args) 
	{
		System.out.println("Main Thread Started");
		
		var test = new TestDemo9();
		
		Thread t0 = new Thread(test);
		t0.setName("t0");	
		t0.start();     
		
		var test1 = new TestDemo9();	
		
		Thread t1 = new Thread(test1);
		t1.setName("t1");
		t1.start(); 
		
		
		
		System.out.println("Main Thread Ended");
	}
	
}


/*
🧵 Assigning Target using Runnable (Core Concept)
🔹 1. Flow of Execution (Very Important)
Step-by-step:
Create class implementing Runnable
class Test implements Runnable {
    public void run() {
        System.out.println("Child Thread is running");
    }
}

Pass object as target
Test test = new Test();
Thread t = new Thread(test);   // target assigned

Start thread
t.start();

🔁 Internal Working (As per your diagram)
✔ Constructor
Thread(Runnable target) {
    this.target = target;
}

✔ start() method
public void start() {
    // new thread created
    this.run();   // (JVM internally handles actual threading)
}

✔ run() method (Thread class)
public void run() {
    if (target != null) {
        target.run();   // calls Test class run()
    }
}

🔥 Final Flow (Must Remember)
t.start()
   ↓
Thread.run()
   ↓
target.run()  (Test class)

⚠️ Important Points
Runnable → defines task
Thread → defines worker
Target = Runnable object passed to Thread
❗ Key Rule

👉 If target is provided:

Thread.run() → target.run()


👉 If target is NOT provided:

Thread.run() → does nothing

🧵 Thread Class Constructors (Short Notes)
🔹 Common Constructors
Thread()

No target, no name
Thread(String name)

Only thread name
Thread(Runnable target)

Assigns task (MOST IMPORTANT)
Thread(Runnable target, String name)

Task + name
Thread(ThreadGroup group, Runnable target)

Group + task
Thread(ThreadGroup group, String name)

Group + name
Thread(ThreadGroup group, Runnable target, String name)

Group + task + name
🔥 Most Used in Practice
Thread(Runnable target)
Thread(Runnable target, String name)
🧠 One-Line Summary

👉
Thread executes task given by Runnable using target.run() when start() is called.



 * */
 