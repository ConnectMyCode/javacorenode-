package com.multithreading.learn;

public class WaitNotifyNotifyAllDemo19 {

//  2 Threads : "Main" and "T1" thread and a  single object TestDemo19 class	
//  
		
		
	public static void main(String []args) {
		
		TestDemo19 test = new TestDemo19();
		
		
		Thread t1 = new Thread(test);  
		t1.start();
		
		synchronized(t1) {      // This area can be accessed only when t1 Object lock is acquired by main thread
		/*   
			 
				## 🔑 Key Concept

			 	* `test` = **lock provider (monitor object)**
			 	* Main thread = **lock requester**
			 	* Block = **critical section**
		 */
				
			System.out.println("Main Thread acquired the lock."); 
			System.out.println("Main Thread is going to wait , after releasing the lock is released."); 
			
			
			try { t1.wait(); } catch(InterruptedException e) {  e.printStackTrace();}
			
			System.out.println("synchronized area inside main thread ends. final vlaue : " + test.getVal());
							
		}
		
		System.out.println("Main Thread ended!!!");
		
	}
	
	
}


/*  When use Notify()  ,who decides to choose the thread to wake up and then goes to Blocked state? 
 
 	⚠️ Important Concept (You likely missed this)

👉 There is something called a:

🔸 Wait Set (or Waiting Pool)
Every object has a wait set
Threads calling wait() go into this pool

When notify() is called:

JVM picks any one thread from this wait set
🔄 After wake-up

Even after being selected:

👉 The thread does NOT run immediately

It goes to:

WAITING → BLOCKED → RUNNABLE → RUNNING

Why?

👉 Because it must re-acquire the lock first

🧠 Key Takeaways

✔ notify() wakes only one thread
✔ Which thread? → ❗ Not predictable
✔ Woken thread → must compete again for lock
✔ Others remain in WAITING

🔥 Interview / Exam One-Liner

👉
notify() wakes up an arbitrary thread from the object's wait set; the selection is non-deterministic and depends on the JVM scheduler.

💡 Pro Tip (Very Important)

👉 Because selection is unpredictable:

✔ Prefer:

notifyAll();

Then let threads:

Compete for lock
Check condition again

👉 This avoids:

Deadlocks
Missed signals
 
 * */





/* What do synchronized(test) mean ?             
 	
 	Short answer: **Yes — but refine it slightly to be technically correct.**

---

## ✅ Correct Statement

👉
**“Main thread is trying to acquire the lock of object `test` to enter a synchronized block that uses `test` as the monitor.”**

---

## 🔍 Why your statement needs correction

Your version:

> "enter its own synchronized area"

❌ Issue:

* The synchronized block is **not “owned” by test**
* It belongs to the **main thread’s code**
* `test` is just the **lock (monitor object)**

---

## 🧠 Exact Understanding

```java
synchronized(test) {
    // block
}
```

👉 Means:

* Main thread tries to **acquire lock on `test`**
* If lock is free → enters block
* If not → goes to **BLOCKED state**

---

## 🔑 Key Concept

* `test` = **lock provider (monitor object)**
* Main thread = **lock requester**
* Block = **critical section**

---

## ✅ Best Interview Line

👉
**“Main thread attempts to acquire the monitor lock of object `test` to execute the synchronized block.”**

---

## ⚠️ Important Reminder

In your code:

```java
synchronized(test) { }
```

✔ Lock is acquired and released
❗ But no real work is done

---

If you want:
👉 I can give **5–6 exact interview statements like this (very high value)**

 */


/*

You’re **very close**, but there is one **critical mistake** in your understanding. Let’s correct it precisely 👇

---

## ❌ Your Mistake

```java
testDemo19 t1 = new testDemo19();
testDemo19 t2 = new testDemo19();
testDemo19 t3 = new testDemo19();
```

👉 You said:

> “these are 3 threads pointing to same object”

❌ **Wrong**

👉 This actually creates:

* **3 different objects**
* Each has its **own lock + waiting queue**

---

## 🔥 What this means

* `t1` → Object 1
* `t2` → Object 2
* `t3` → Object 3

👉 So:
❌ No shared communication
❌ `wait()/notify()` will NOT coordinate between them

---

## ✅ Correct Way (for Inter-Thread Communication)

👉 All threads must share **ONE common object**

```java
testDemo19 shared = new testDemo19();

Thread t1 = new Thread(shared);
Thread t2 = new Thread(shared);
Thread t3 = new Thread(shared);
```

✔ Now:

* All threads use **same object (`shared`)**
* Same lock
* Same waiting queue

👉 ✔ Proper ITC (Inter-Thread Communication)

---

## 🔑 Constraints for wait/notify (Corrected)

👉 Yes, your concept is mostly right — refined version:

### ✅ Required Conditions

1. **Same object must be used**
2. Threads must use:

```java
synchronized(shared)
```

3. `wait()/notify()/notifyAll()` must be called:

```java
shared.wait();
shared.notify();
```

4. Must be inside **synchronized block**
5. Thread must **own the lock**

---

## 🧠 Final Correct Statement

👉
**Inter-thread communication works only when multiple threads synchronize on the same object and call `wait()/notify()/notifyAll()` on that same object inside a synchronized block.**

---

## ⚡ One-Line Fix for Your Understanding

👉
**Different objects = different locks = NO communication**
👉
**Same object = same lock = proper ITC**

---

If you want:
👉 I can show a **wrong vs correct code comparison (very powerful for interviews)**
*/
