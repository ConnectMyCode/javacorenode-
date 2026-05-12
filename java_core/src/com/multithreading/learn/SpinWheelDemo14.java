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
					Thread.sleep(2000);                 //Even though player goes in sleep he does not release the lock and so the other player2 has to wait till player 1 has finished playing
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
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

//----------------------------------------------------------------OBJECT LEVEL SYNCHRONIZATION--------------------------------------------------------

// once entered inside the synchronized area till the execution of that block is  not finished the other threads wait even if the Thread inside block goes to sleep  others will wait for it to finish its execution.

//Who decides to give the lock  >> JVM >> whichever thread gets the processing time first and executes will get the lock first ....

// How does interrupt works here what is the relation of Interrupt and wait() method .

//From whom the lock is acquired >>> From the corresponding Object here its >> "SpinWheelDemo14" class object. >> This is provided  by Object class when a object is created. .

//Even though Thread.sleep(2000); thread goes into sleep it takes lock along with it and does not release the lock  .  

//when the thread finishes its execution inside the Synchronized area it releases the lock  >>>lock goes back to the corresponding Object() >>> Next Thread Acquires lock from Object >> Submits lock to Synchronized Method, Block.   
	
//   Poor Synchronization  >> lead to DEADLOCK. 

//----------------------------------------------------------------------------------------------------------------------------------------------------------
/*------------------------------------------------------------------CLASS LEVEL SYNCHRONIZATION-------------------------------------------------------------*/
//Read the LIMITiation OF the OBJECT LEVEL SYNCHRONIZATION >> from the Other Demo14.java file 
/*
	Static Synchronization is Introduced >>> WHY?? What is the purpose of it ???? >>>> 
	1. When there are 2 Object created and there is Non static Synchronized block and 2 thread t1 and t2 execute the t1 -->obj1 and t2--->obj2 .....
	At the same time there are 2 thread that are accessing the Synchronized area it pbreaks the purpose of having tthe SYnchronized area if We want a Area inside the code 
	where the Area is globally accessible by only one thread at a time. Then USE 
	
	Static Synchronization 1.Method    >>>--->>>   public static synchronized void shootTheBall(){} 
						   2.Block    >>>>--->>>   synchronized(ClassName.class); >>>  
	
 * */



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


/*
 Here are **precise short notes** on **static synchronization in Java** with clear examples 👇

---

## 🔹 Static Synchronization (Concept)

👉 **Static synchronization = Class-level lock**

* Lock is applied on the **Class object**, not on instance (object)
* All threads (even from different objects) share **ONE lock**
* Ensures **only one thread executes static synchronized code at a time**

---

## 🔹 1. Static Synchronized Method

### ✅ Rule

```java
public static synchronized void methodName() { }
```

👉 Locks on: `ClassName.class`

---

### 📌 Example

```java
class Demo {
    public static synchronized void print() {
        System.out.println(Thread.currentThread().getName() + " entered");
        try { Thread.sleep(1000); } catch(Exception e){}
        System.out.println(Thread.currentThread().getName() + " exited");
    }
}

public class Test {
    public static void main(String[] args) {
        Runnable r = () -> Demo.print();

        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
```

### 🔍 Output Behavior

* T1 enters → T2 waits
* T1 exits → T2 enters

👉 **Only one thread at a time (global control)**

---

## 🔹 2. Static Synchronized Block

### ✅ Rule

```java
synchronized(ClassName.class) { }
```

👉 Locks on: `ClassName.class`

---

### 📌 Example

```java
class Demo {
    public static void print() {
        synchronized(Demo.class) {
            System.out.println(Thread.currentThread().getName() + " entered");
            try { Thread.sleep(1000); } catch(Exception e){}
            System.out.println(Thread.currentThread().getName() + " exited");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Runnable r = () -> Demo.print();

        new Thread(r, "T1").start();
        new Thread(r, "T2").start();
    }
}
```

---

## 🔥 Key Difference

| Feature     | Static Method         | Static Block                    |
| ----------- | --------------------- | ------------------------------- |
| Syntax      | `static synchronized` | `synchronized(ClassName.class)` |
| Lock        | Class-level           | Class-level                     |
| Flexibility | Entire method locked  | Only specific block locked      |

---

## ⚠️ Important Points

* Applies to **all objects** of the class
* Ensures **global mutual exclusion**
* `sleep()` does **NOT release lock**
* Better control using block (fine-grained locking)

---

## 🧠 One-line Summary

👉 **Static synchronization = one thread across entire class at a time**

---

If you want, I can also show:
👉 Difference vs object-level sync (very important for interviews)

  
  
  
 * */

