package com.multithreading.learn;

public class UncontrolledThreadingCantExpectDDesiredOuputFOrSleepandJoinMethodIfNotUsedCorrectlyDemo6 {
	
	
	public static void main(String []args) 
	{
		
		FooDemo6 t0 = new FooDemo6(); 		
		FooDemo6 t1 = new FooDemo6(); 		
		FooDemo6 t2 = new FooDemo6(); 		
		FooDemo6 t3 = new FooDemo6(); 		
		
		//Referencing 
		t0.otherThread = t1;
		
		t2.otherThread = t3;
		
		//Setting name
		t0.setName("t0");  			t1.setName("t1");  			t2.setName("t2");   		t3.setName("t3"); 
		
//		t0.start();  t1.start(); 	t2.start(); 	t3.start(); 	 //If it is written this way it will Execute randomly not in a sequence >> WHY ???  
		
		t0.start(); 
		t1.start(); 	
		t2.start(); 	
		t3.start(); 	
	
	System.out.println( "Priority of t0 by default : "+t0.getPriority());
	System.out.println( "Priority of t1 by default : "+t1.getPriority());
	System.out.println( "Priority of t2 by default : "+t2.getPriority());
	System.out.println( "Priority of t3 by default : "+t3.getPriority());
		
		/*    Observe Output : o/p: 
		  		t3 Started
		    	t0 Started
				t2 Started
				t1 Started 
			
		*Why all thread are randomly executing Assumption:   if t0.start() is written first then it should Run first ? 

		Concept Clear : 
		
Yes — **but understand it precisely (interview-level clarity)** 👇

---

# ✅ 📌 When `start()` is called

👉 The thread moves to:

```
NEW → RUNNABLE
```

---

# 🧠 What “RUNNABLE” actually means

* ✔ Thread is **ready to run**
* ✔ Waiting for CPU from **Thread Scheduler**
* ❌ Not necessarily executing yet

---

# ⚠️ Important Clarification

> ❓ Does `start()` mean thread starts running immediately?

❌ NO

👉 It only means:

* Thread is **eligible to run**
* Scheduler decides when it actually runs

---

# 🧵 Actual Flow

```
Thread t = new Thread();  // NEW
t.start();                // RUNNABLE
                         // ↓ (scheduler decides)
                         // RUNNING
```

---

# 🔥 Interview Trap

> “After calling `start()`, thread goes to RUNNING state”

❌ Incorrect
✔ Correct answer:

👉
**Thread goes to RUNNABLE state, not directly RUNNING**

---

# 🧠 Extra Deep Insight

* In Java:

  * `RUNNABLE` includes both:

    * Ready state
    * Running state (internally handled by JVM/OS)

👉 That’s why:

* You don’t see a separate `RUNNING` state in Java API

---

# ⚡ Final Answer (1 line)

👉
**Yes, after calling `start()`, the thread enters RUNNABLE state and waits for CPU scheduling.**


		*/
		
//-----------------------------------------------------------		
/*		
		You’re **close**, but a few key assumptions need correction. I’ll validate and fix your understanding **line by line, strictly based on your code + output** 👇

		---

		# 🧠 📌 1. First: Your assumption

		> “t3 started → then it comes back to main thread”

		### ❌ This is NOT correct

		👉 Once you call:

		```java
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		```

		* Main thread **does NOT control execution anymore**
		* It **does NOT “come back” and switch threads**
		* Scheduling is handled by **OS scheduler**, not main

		---

		# ✅ Correct Understanding

		### 🔹 Step 1: Main Thread execution

		```java
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		```

		👉 Main thread:

		* Calls `start()` one by one
		* Each call:

		  ```
		  NEW → RUNNABLE
		  ```
		* After all calls:

		  * All threads are in **RUNNABLE (READY)**

		✔ Up to this point → **your understanding is correct**

		---

		# 🧵 📌 Step 2: Scheduler takes over

		Now:

		* OS scheduler picks **any thread**
		* Example (your output):

		```
		t3 started
		```

		👉 Means:

		* Scheduler picked **t3 first**
		* NOT because of main thread
		* NOT because of order

		---

		# ❗ Important Correction

		> “then it comes back to main thread”

		❌ Wrong

		👉 Reality:

		* CPU switches between **threads directly**
		* Main thread is **not involved anymore**

		---

		# 🧠 📌 Step 3: Your Flow Analysis

		You wrote:

		> “t1 executes → goes to waiting → runnable → t0 executes”

		### ❌ Partially incorrect

		---

		## 🔴 Mistake 1: Why does thread go to WAITING?

		👉 Only if you use:

		* `sleep()`
		* `join()`
		* `wait()`

		If your `run()` has `sleep()` → ✔ correct
		Otherwise → ❌ wrong assumption

		---

		## 🔴 Mistake 2: Sequence assumption

		You wrote:

		```
		t1 :0
		t1 :1
		t1 :2
		→ then t0 executes
		```

		❌ Not guaranteed

		👉 Actual behavior:

		```
		t1 :0
		→ context switch
		t0 :0
		→ context switch
		t2 :0
		→ context switch
		t3 :0
		```

		---

		# 🧵 📌 Real Execution Model (Correct Flow)

		### After all `start()`:

		```
		All threads → RUNNABLE (READY)
		```

		---

		### CPU Execution (example):

		```
		t3 → RUNNING → prints "t3 started"

		→ context switch

		t1 → RUNNING → prints "t1 :0"

		→ context switch

		t0 → RUNNING → prints "t0 :0"

		→ context switch

		t2 → RUNNING → prints "t2 :0"
		```

		---

		# ⚙️ 📌 If `sleep()` is used

		Then your statement becomes **partially correct**:

		```
		t1 → RUNNING
		t1 → sleep() → TIMED_WAITING
		→ CPU switches to t0
		```

		✔ This is valid **only if sleep exists**

		---

		# 🔥 Final Corrections to Your Understanding

		| Your Statement                    | Correct? | Fix                          |
		| --------------------------------- | -------- | ---------------------------- |
		| Main thread comes back            | ❌        | Scheduler controls execution |
		| Threads go to RUNNABLE            | ✔        | Correct                      |
		| Execution follows start order     | ❌        | Completely random            |
		| Thread goes WAITING automatically | ❌        | Only if sleep/join/wait used |
		| CPU switches between threads      | ✔        | Correct                      |

		---

		# ⚡ FINAL CORRECT FLOW (1-Line)

		👉
		**Main thread only starts threads; after that, the OS scheduler decides which thread runs, and execution switches directly between threads — not via the main thread.**

		---

		# 🧠 Interview-Level Insight

		👉
		There is **no “return to main thread” concept in scheduling** —
		only **CPU context switching between runnable threads**.

		---

		If you want next:
		👉 I can draw **exact timeline diagram for your code (with sleep impact)**
		👉 Or simulate **step-by-step execution like CPU debugger (very powerful for interviews)**
*/	
		
		
		
//-----------------------------------------------------------		
		
	/*EDGE CASE 
 		
Yes — **context switching can absolutely happen at that marked point**, and your intuition is mostly right. Let’s make it **precise and correct** 👇

---

# 🧠 📌 Your Question (Simplified)

While main is executing:

```java
t0.start();
t1.start();
t2.start();   // ← mark
t3.start();
```

👉 Can scheduler:

* Switch to `t1` (or any thread)
* Run it
* Then come back to main and continue with `t2.start()` / `t3.start()`?

---

# ✅ ✅ FINAL ANSWER

👉 **YES — this is completely possible**

---

# 🧵 📌 What actually happens

### Step-by-step realistic flow:

```
Main Thread:
t0.start()  → t0 → RUNNABLE

t1.start()  → t1 → RUNNABLE

---- CONTEXT SWITCH happens here ----
```

---

## 🔄 CPU switches to another thread

```
t1 → RUNNING
prints: "t1 started"
prints: "t1 :0"

---- CONTEXT SWITCH ----
```

---

## 🔄 Back to main thread

```
Main resumes:
t2.start() → t2 → RUNNABLE
t3.start() → t3 → RUNNABLE
```

---

## 🔄 More switching

```
t0 → RUNNING
t2 → RUNNING
t3 → RUNNING
```

---

# ⚠️ Important Clarifications

## 🔴 1. Main thread is just another thread

* It can be:

  * ✔ Preempted (paused)
  * ✔ Resumed later

👉 So yes:

> Main can be interrupted between `t1.start()` and `t2.start()`

---

## 🔴 2. `start()` is NOT atomic at program level

* Each line:

  ```java
  t1.start();
  ```

  can be interrupted **after execution**

👉 Scheduler can switch **after any line**

---

## 🔴 3. Threads can start executing immediately

* Once `start()` is called:

  * Thread is **eligible to run instantly**

👉 So:

* `t1` may run **before `t2.start()` even executes**

---

# 🧠 📌 Correct Mental Model

```
Main Thread:
   start t0
   start t1
   (paused here)

Thread-1:
   starts executing

Main Thread:
   resumes
   start t2
   start t3
```

---

# 🔥 Interview-Level Insight

👉
**Thread execution can begin even before all `start()` calls are completed in the main thread.**

---

# ⚡ Final One-Line Answer

👉
**Yes, context switching can occur between any two statements, so a started thread (like t1) can run before the main thread finishes calling t2.start() and t3.start().**

---

If you want next:
👉 I can show **instruction-level view (how CPU + PC register actually switches)**
👉 Or give **edge cases where this causes bugs (race conditions)**
 		
 		
 		
	 * */	
		
		
/*Q.   
 ANS:->   
 Great question — this is the **core of how threads actually behave**. Let’s make it crystal clear.

---

# 🧠 📌 Your Question

> If no `sleep()`, `wait()`, or `join()` is used,
> when context switch happens, **where does the currently running thread go?**

---

# ✅ 📌 Final Answer

👉 The running thread goes back to:

```
RUNNABLE (READY) state
```

✔ It does **NOT** go to WAITING
✔ It does **NOT** go to BLOCKED
✔ It simply becomes **eligible again**

---

# 🧵 📌 Exact Flow

### Before context switch:

```
t1 → RUNNING
t0, t2, t3 → RUNNABLE (READY)
```

---

### Context switch happens:

```
t1 → RUNNABLE (READY)
t0 → RUNNING
```

---

# ⚙️ 📌 Why this happens?

Because:

👉 No blocking operation is used
👉 So thread is **still ready to execute**

---

# 🔄 📌 What triggers context switching?

Even without `sleep()`:

* Time slice finished (most common)
* OS preemption
* Higher priority thread arrives
* Multi-core scheduling decisions

---

# 🧠 📌 Important Distinction

| Situation                        | Thread goes to |
| -------------------------------- | -------------- |
| `sleep()`                        | TIMED_WAITING  |
| `wait()`                         | WAITING        |
| `join()`                         | WAITING        |
| Lock not available               | BLOCKED        |
| **Context switch (no blocking)** | **RUNNABLE** ✅ |

---

# 🔥 Interview Trap

> “Thread goes to waiting when switched”

❌ WRONG

👉 Correct:
**Thread goes back to RUNNABLE unless explicitly blocked**

---

# 🧠 📌 Internal Reality (Deep Insight)

* CPU saves:

  * Program Counter (PC)
  * Stack state
* Thread is paused
* Later resumes **exactly from same line**

---

# 🧵 📌 Visual

```
t1 RUNNING
   ↓ (context switch)
t1 RUNNABLE (paused, state saved)

t0 RUNNING
```

---

# ⚡ Final One-Line Answer

👉
**During a context switch (without sleep/wait/join), the running thread is paused and moved back to RUNNABLE state, ready to be scheduled again.**

---

If you want next:
👉 I can show **real memory (stack + PC register) diagram during context switching**
👉 Or explain **difference between preemptive vs cooperative scheduling (important interview topic)**

  
  
  
 *  */	
		
		
/*      
 	Regarding Lock: 
 	
 	Excellent — now you’re touching the **most important multithreading concept: locks + context switching**. Let’s be very precise.

---

# 🧠 📌 Your Question

> During context switching, what happens to the **lock** held by a thread?

---

# ✅ 📌 Final Answer

👉 **The lock is NOT released during context switching**

✔ The thread **keeps the lock**
✔ Even if it is **paused (not running)**
✔ Other threads **cannot access that locked resource**

---

# 🧵 📌 Scenario

### Suppose:

```java
synchronized(obj) {
    // critical section
}
```

---

## 🔹 Step 1: Thread-1 enters

```
t1 → RUNNING
t1 acquires lock on obj
```

---

## 🔹 Step 2: Context switch happens

```
t1 → RUNNABLE (paused)
BUT ❗ still holding the lock
```

---

## 🔹 Step 3: Thread-2 tries to enter

```
t2 → tries synchronized(obj)
❌ cannot enter
→ goes to BLOCKED state
```

---

# ⚠️ Important Rule

👉
**Lock is released ONLY when:**

* Thread exits synchronized block ✅
* Thread throws exception and exits block ✅

---

# ❌ Lock is NOT released when:

* Context switch happens ❌
* Thread is preempted ❌
* CPU moves to another thread ❌

---

# 🧠 📌 Special Case

## 🔹 What about `sleep()`?

```java
synchronized(obj) {
    Thread.sleep(1000);
}
```

👉

* Thread goes to **TIMED_WAITING**
* ❗ Still holds the lock

---

## 🔹 What about `wait()`?

```java
synchronized(obj) {
    obj.wait();
}
```

👉

* Thread goes to **WAITING**
* ✔ **Releases the lock**

---

# 🧾 📌 Summary Table

| Operation         | Lock Released? |
| ----------------- | -------------- |
| Context switch    | ❌ No           |
| `sleep()`         | ❌ No           |
| `join()`          | ❌ No           |
| `wait()`          | ✅ Yes          |
| Exit synchronized | ✅ Yes          |

---

# 🔥 Interview Trap

> “When thread stops running, it releases the lock”

❌ WRONG

👉 Correct:
**Lock is independent of CPU execution — it stays with the thread until explicitly released**

---

# 🧠 Deep Insight (Very Important)

👉
**CPU scheduling (RUNNING / RUNNABLE) and Lock ownership are completely different systems**

* Scheduler → controls execution
* Lock → controls resource access

---

# ⚡ Final One-Line Answer

👉
**During context switching, the thread keeps the lock; it is not released until the thread exits the synchronized block or calls `wait()`.**

---

If you want next:
👉 I can show **deadlock scenario using this concept (very important interview trap)**
👉 Or draw **timeline diagram showing lock + thread states together**

 	
 	
 	
 * */
		
		
	
		  
	}

}
