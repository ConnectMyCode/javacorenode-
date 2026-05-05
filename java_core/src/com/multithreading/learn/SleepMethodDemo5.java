package com.multithreading.learn;

public class SleepMethodDemo5 {

	
	public static void main(String []args)
	{
		
		System.out.println("Thread Started:"+ Thread.currentThread().getName());
		
		
		Thread t1 = new Thread()    //Anonymous Inner Class is created and internally it extends Thread class. 
		{
			@Override
			public void run() 
			{
				System.err.println("Anonymous Inner Class: ");
				System.out.println("Current Thread : "+Thread.currentThread().getName() );
				
				
				for(int i = 0; i< 9 ; i++) 
				{
					System.out.println("Soldier incoming"+i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
				}
			
				System.err.println("Anonymous Inner Class Ends: ");
			}
			
		};

		TestDemo5 t2= new TestDemo5();   //Here sleep method is used 
		
		
		
		t1.start();   //Thread-0 
		t2.start();   //Thread-1
		
		
		
		System.out.println("Thread Ended:"+ Thread.currentThread().getName());
		
		
	}
	
	
}


/*Flow: 
 
 You’re **very close**, but a few parts of your explanation need **strict correction**. I’ll **validate + fix only where wrong**, sticking exactly to your context 👇

---

# ✅ 📌 What you got CORRECT

✔ Main thread starts first
✔ `t1.start()` and `t2.start()` → both go to **RUNNABLE**
✔ Context switching (`CS`) can happen anytime
✔ `sleep()` moves thread to **TIMED_WAITING**
✔ After sleep → thread goes back to **RUNNABLE**
✔ Threads execute in **interleaved (non-deterministic) order**

---

# ❌ 📌 Corrections (Important)

---

## 🔴 1. This line is WRONG

> “t1 in runnable directly from running to runnable state flows”

### ❌ Problem:

You’re mixing two cases

### ✔ Correct:

👉 From RUNNING → RUNNABLE happens only due to:

* **Context switch (time slice over / preemption)**

👉 From RUNNING → TIMED_WAITING happens due to:

* `sleep()`

---

## 🔴 2. This line is WRONG

> “main thread terminates → then t2 runs”

### ❌ Problem:

You are assuming **sequence**

### ✔ Correct:

👉 Main thread ending **does NOT trigger t2**

* Scheduler decides next thread
* Could be:

  * t1
  * t2
  * even back to main before it ends

---

## 🔴 3. This part needs FIX

> “during each printing op in t1 there is pause or delay of 2 sec → goes to sleep → then runnable → then running”

### ✔ Partially correct, but refine:

👉 Correct flow:

```
t1 RUNNING
→ prints "Soldier incoming0"
→ sleep(2000)
→ TIMED_WAITING
→ (after 2 sec)
→ RUNNABLE
→ (scheduler decides)
→ RUNNING again
```

✔ Sleep happens **after print**, not during print

---

## 🔴 4. Important Missing Detail

👉 When **t2 is sleeping (5 sec)**:

```
t2 → TIMED_WAITING
```

✔ It is **NOT competing for CPU**
✔ Only t1 (or others) will run

---

## 🔴 5. This statement needs correction

> “t1 goes in waiting this time t2 get chance”

### ❌ Wrong wording:

* `sleep()` → **TIMED_WAITING**, not WAITING

### ✔ Correct:

👉

```
t1 → TIMED_WAITING
t2 → RUNNABLE → may become RUNNING
```

---

# 🧠 📌 Correct Flow (Clean Version)

---

### Step 1: Main thread

```
main → RUNNING
prints: Thread Started

creates t1, t2

t1.start() → RUNNABLE
t2.start() → RUNNABLE
```

---

### Step 2: Context Switch

```
t1 → RUNNING
prints: Anonymous Inner Class
```

---

### Step 3: Switch again

```
main → RUNNING
prints: Thread Ended
main → TERMINATED
```

---

### Step 4: t2 runs

```
t2 → RUNNING
prints: Thread-1Started
prints: Missiles incoming 0
→ sleep(5000)
→ TIMED_WAITING
```

---

### Step 5: t1 runs

```
t1 → RUNNING
prints: Soldier incoming0
→ sleep(2000)
→ TIMED_WAITING
```

---

### Step 6: Scheduler keeps switching

* Whichever thread:

  * wakes up first
  * gets CPU

---

# ⚡ 📌 Final Key Fixes (Short)

* RUNNING → RUNNABLE → due to **context switch**
* RUNNING → TIMED_WAITING → due to **sleep()**
* Main thread ending ≠ triggers other threads
* Sleep happens **after execution step**
* `sleep()` ≠ WAITING (it is TIMED_WAITING)

---

# 🔥 Final One-Line Insight

👉
**Threads alternate because of sleep-based blocking + scheduler decisions — not because one thread “hands over” execution to another.**

---

If you want next:
👉 I can draw **exact timeline diagram for THIS code (t1 vs t2 with sleep)**
👉 Or give **expected multiple outputs (interview tricky question)**

 
 
 * */

