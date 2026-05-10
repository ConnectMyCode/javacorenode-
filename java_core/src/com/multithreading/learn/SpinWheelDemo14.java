package com.multithreading.learn;

public class SpinWheelDemo14 implements Runnable{

	
	private volatile int loops;
	
	
	public SpinWheelDemo14(int loops) 
	{
		this.loops = loops;
	}
	
	
	
	
	//Block Level Synchronization 
	public void game() 
	{
		System.out.println(Thread.currentThread().getName() + " Entered into Wheel  game mode... ");
		//Non static synchronized block       
		synchronized(this) {
			System.out.println(Thread.currentThread().getName() + "Only alllowed one player at a time in the circle to spin the wheel .... contains lock.... Object Level.........");
			// Updatable Resource 
			for(int k = 1 ; k<=10 ; k++)
			{
				try {
					Thread.sleep(500);                 //Even though player goes in sleep he does not release the lock and so the other player2 has to wait till player 1 has finished playing
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Wheel Round Completes :"+ k+ "of" +Thread.currentThread().getName());
				
			}
			System.out.println(Thread.currentThread().getName()+ " Finished playing the Wheel game next player please enter into the circle ring tpo play .... lock is released......... Object Level.........");
			
		}
		
		
	}
	
	
	//Method level Synchronization 
	public synchronized void pinTheBalloon() 
	{
		System.out.println(Thread.currentThread().getName() + " Entered the pin the Ballon game mode .....has locked  ...... Object Level ............... ");
	
		for(int j =1 ; j<=10 ; j++ ) 
		{
			System.out.println(Thread.currentThread().getName() +  "Took " + j + " try" );
		}
	
		System.out.println(Thread.currentThread().getName() + " Ended the pin the ballon game mode ..... has released lock ...... Object Level ........");
		
	}
	
	
	
	//Static Synchronized Method 
	public static synchronized void ShootTheBall() 
	{
		System.out.println(Thread.currentThread().getName() + " Entered the Shoot The Ball game Mode    ......has lock ...... Class Level ...... ");                 
	
		for(int l =0 ; l<=6 ; l++) 
		{
			System.out.println( Thread.currentThread().getName() +" Shoot " + l +" Ball");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " Ended the  Shoot the ball game mode ..... has released lock ...... Class Level ........");
	
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " START 0"); 
		
		game();
		
		pinTheBalloon();
		
		ShootTheBall();
		
	}
	
	
	
}



// once entered inside the synchronized area till the execution of that block is  not finished the other threads wait even if the Thread inside block goes to sleep  others will wait for it to finish its execution.

//Who decides to give the lock  >> JVM >> whichever thread gets the processing time first and executes will get the lock first ....

// How does interrupt works here what is the relation of Interrupt and wait() method .

//From whom the lock is acquired >>> From the corresponding Object here its >> "SpinWheelDemo14" class object. >> This is provided  by Object class when a object is created. .

//Even though Thread.sleep(2000); thread goes into sleep it takes lock along with it and does not release the lock  .  

//when the thread finishes its execution inside the Synchronized area it releases the lock  >>>lock goes back to the corresponding Object() >>> Next Thread Acquires lock from Object >> Submits lock to Synchronized Method, Block.   
	
//   Poor Synchronization  >> lead to DEADLOCK. 



/*
Here are your **short, crisp notes (exam-ready)** based strictly on your diagram 👇

---

# 🧵 Limitation of Object-Level Synchronization

---

## 🔹 Concept

* `synchronized` method locks **only one object**
* Each object has its **own lock (monitor)**

---

## 🔹 Your Example

* `Table Object1` → used by `t1`, `t2`
* `Table Object2` → used by `t3`, `t4`

```java
public synchronized void printTable(int num)
```

---

## 🔹 Behavior

### ✔ Within SAME object

```text
t1 & t2 → Object1 → NO interference (proper synchronization)
t3 & t4 → Object2 → NO interference (proper synchronization)
```

👉 Only one thread allowed at a time per object

---

### ❌ Across DIFFERENT objects

```text
t1 (Object1)  ||  t3 (Object2)
t2 (Object1)  ||  t4 (Object2)
```

👉 Can execute **simultaneously**

👉 No control between objects

---

## ⚠️ Limitation

👉
**Object-level synchronization does NOT provide global control**

👉 Multiple objects = multiple locks = possible concurrent execution

---

## 🔴 Problem

* Threads from different objects can enter synchronized block at same time
* May cause:

  * inconsistent output
  * race condition (if shared resource exists)

---

## 🔒 Key Point

```text
Lock is tied to OBJECT, not CLASS
```

---

## 🔹 Solution (Concept)

👉 Use:

* `static synchronized` (class-level lock)
* or common shared object for locking

---

# ⚡ Final One-Line Summary

👉
**Object-level synchronization works only per object, not across multiple objects, so it cannot fully prevent concurrent access in multi-object scenarios.**

---

If you want next:
👉 I can give **Object vs Class level synchronization (very important interview table)**
👉 Or **real-life example for this exact limitation (super easy to remember)**
 
 * */


