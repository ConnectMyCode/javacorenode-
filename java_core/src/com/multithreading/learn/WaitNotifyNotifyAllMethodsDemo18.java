package com.multithreading.learn;

//NOTE : Program describing if There is not proper communication in between 2 Thread output can be un-predictable.

public class WaitNotifyNotifyAllMethodsDemo18 {
	
	
	public static void main(String []args) { 
		System.out.println("Main Thread started!!!");  
		
		
		TestDemo18 test = new TestDemo18();
		
		Thread t1 = new Thread(test);
		t1.start();
		
		
		/*
			 For example, a thread that has called {@code Object.wait()}
	         * on an object is waiting for another thread to call
	         * {@code Object.notify()} or {@code Object.notifyAll()} on
	         * that object.
		 * */
	
	//NOT Inside Synchronized Area give IllegalMonitorStateException e. 	
		try {
			t1.wait();					//t1.wait()  >>>Current Thread 'Main' goes in waiting state t1 thread to { Object.notify()  or   Object.notifyAll() }  notified by the another Object >>> The main thread goes into BLOCKED state , and waits till the execution of the T1 threads Sycnhronized area finishes and after that main thread goes into Runnable state.    
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try { Thread.sleep(100); }
		catch(InterruptedException e) {  }
		
		
		System.out.println("Value of val is: "+ test.getVal());

		System.out.println("Main thread ended!!!");
	
	}

}





//2 Threads must be working on the same Object and wait() , notify() . NotifyAll() these Object class Methods can only be used inside Synchronized area. Else gives >>> IllegalStateMonitorException e . Another Impoertant point It releases The Object Lock and goes into Waiting state.

/*
 Here’s your concept rewritten in **simple + technical + easy-to-remember form** 👇

---

## 🔹 wait(), notify(), notifyAll() — Simple Understanding

👉 These methods are used for **communication between threads** (they must be used inside synchronized code).

---

## 🔁 Your Statement (Simplified & Correct)

👉 When a thread calls `wait()`:

* It **releases the lock**
* Goes into **WAITING state**

---

👉 When another thread calls `notify()` or `notifyAll()`:

1️⃣ Waiting thread is **woken up**
2️⃣ It moves from **WAITING → BLOCKED state**
(because it needs the lock again)
3️⃣ It waits until the **synchronized block/method is free**
4️⃣ Then it gets the lock and moves to **RUNNABLE state**

---

## 🔄 Flow (Very Important)

```
RUNNING 
   ↓ (wait())
WAITING  
   ↓ (notify / notifyAll)
BLOCKED (waiting for lock)
   ↓ (lock acquired)
RUNNABLE → RUNNING
```

---

## 🔹 Key Points (Short Notes)

* `wait()` → releases lock + pauses thread
* `notify()` → wakes up **one** waiting thread
* `notifyAll()` → wakes up **all** waiting threads
* Woken thread **does NOT run immediately** ❗
  👉 It must **re-acquire the lock first**

---

## 🧠 One-Line Memory Trick

👉 **wait = sleep + release lock**
👉 **notify = wake up, but wait for lock again**

---

## 📌 Mini Example (Real-Life)

👉 Think of a **queue at a restaurant** 🍽️

* Customer (thread) waits → `wait()`
* Chef calls next order → `notify()`
* Customer wakes up
  ❗ But must wait if counter is busy → BLOCKED
  ✔ Gets turn → RUNNING

---

## ✅ Final Correct Statement (Refined)

👉
**When another thread calls `notify()` or `notifyAll()`, the waiting thread moves from WAITING to BLOCKED state, waits to re-acquire the lock, and then enters RUNNABLE state once the synchronized execution is finished.**

---

If you want:
👉 I can give **exact memory diagram + JVM states mapping (interview level)**

 
  */


/*EDGE CASE */

/*
 Good question — this is exactly where many people get confused. Let’s keep it **precise and real** 👇

---

## 🔹 Scenario

* 3 threads are in **WAITING** (they called `wait()`)
* One thread calls `notifyAll()`

---

## 🔄 What Happens Step-by-Step

1️⃣ All 3 threads are **woken up**

2️⃣ They move:

```
WAITING → BLOCKED
```

👉 Because they all try to **re-acquire the same lock**

---

## 🔑 Who gets the lock?

👉 **Answer: JVM Thread Scheduler**

* There is **NO guarantee**
* No FIFO (first-come-first-serve)
* No priority guarantee (even `setPriority()` is not reliable)

✔ It depends on:

* JVM implementation
* OS thread scheduling
* CPU timing

---

## 🔥 Important Truth

👉 Even though all threads are notified:

❗ **Only ONE thread gets the lock first**
❗ Others stay in BLOCKED state

After first thread finishes:

* Lock is released
* Again **JVM decides next thread**

---

## 🧠 Simple Analogy

Imagine:

* 3 people waiting outside a room 🚪
* Door opens (`notifyAll()`)

👉 All rush to enter
👉 But only ONE can enter first

❗ Who enters first?
➡️ Depends on **who reaches the door first (scheduler)**

---

## 🔹 Key Points (Interview Ready)

* `notifyAll()` wakes **all waiting threads**
* All move to **BLOCKED (lock contention)**
* Lock is given to **one thread at a time**
* **JVM scheduler decides order (non-deterministic)**

---

## ✅ Final One-Line Answer

👉
**After `notifyAll()`, all waiting threads compete for the lock, and the JVM thread scheduler decides which thread acquires it first — there is no guaranteed order.**

---

If you want:
👉 I can show **code demo where order changes every run (proof of non-determinism)**

 
 
 * */

