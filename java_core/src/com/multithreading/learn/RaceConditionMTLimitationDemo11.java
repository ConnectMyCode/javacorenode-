package com.multithreading.learn;

import java.util.Scanner;

public class RaceConditionMTLimitationDemo11 {

	public static void main(String []args) 
	{
		System.out.println("main thread Started");
		
		var client = new ClientDemo11();
		//Object created in heap memory 
		
		
		//Implements runnable >>>> function Interface having no start() method so will have to use Thread Class Constructor to invoke the start method and invoke run internally.
		
							 //Target set 	
		Thread t0 = new Thread(client , "client-1");              // Thread (Runnable Target , String name)
		Thread t1 = new Thread(client , "client-2"); 
		
		
		t0.start();
		t1.start();
		
		
		System.out.println("main thread Ended");
		
		
		
	}
	
	
	
	
	
	
}


/*
 Let’s break this **very clearly and precisely** based on your diagram 👇

---

# 🧵 Limitation of Multithreading: **Race Condition (Data Race)**

---

## 🔹 What is the Problem?

When **multiple threads access and modify shared data at the same time**,
the final result may become **incorrect or unpredictable**.

👉 This is called:

> **Race Condition / Data Race**

---

# 🔥 Your Given Example Explained

---

## 🏦 Scenario: Joint Bank Account

* Balance = **15K**
* Two threads:

  * `t1` → Withdraw
  * `t2` → Withdraw

---

## 🔹 Code Logic

```java
public void run() {
    if (amount <= balance) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has withdrawn " + amount);
        balance -= amount;
    }
}
```

---

## ⚠️ Problem Area (CRITICAL)

```java
if (amount <= balance)
```

👉 This check + update is **NOT atomic**
(meaning: not executed as one single step)

---

# 🔁 How Race Condition Happens

---

## 💥 Suppose:

* Balance = 15000
* t1 wants 10000
* t2 wants 10000

---

## ❌ Execution Order (Dangerous Case)

```text
Step 1: t1 checks → 10000 <= 15000 ✅
Step 2: t2 checks → 10000 <= 15000 ✅

Step 3: t1 withdraws → balance = 5000
Step 4: t2 ALSO withdraws → balance = -5000 ❌
```

---

## 🚨 Final Result:

```text
Wrong balance = -5000
```

👉 This should NEVER happen in real banking

---

# 🧠 Why This Happens?

Because:

* Threads run **concurrently**
* CPU does **context switching**
* Both threads **see same old value**

---

# 🎯 Real-Life Example (Very Clear)

---

## 🏧 ATM Machine Case

* You and your friend share account
* Balance = ₹15,000

---

### 👤 You (t1):

* Try to withdraw ₹10,000

### 👤 Friend (t2):

* Also tries ₹10,000 at same time

---

## ❌ What Happens Without Control

* Both ATM machines check balance at same time
* Both see ₹15,000
* Both allow withdrawal

---

## 🚨 Final:

```text
Total withdrawn = ₹20,000
Actual balance = ₹15,000
System error = -₹5,000
```

👉 That is a **Race Condition**

---

# 🔴 Key Issue in One Line

👉
**Multiple threads read and update shared data without coordination**

---

# 🔒 Solution Concept (Important)

To fix this, we use:

## ✔ Synchronization

```java
synchronized(this) {
    if (amount <= balance) {
        balance -= amount;
    }
}
```

---

## 🔁 What Changes Now?

```text
t1 enters → locks resource
t2 waits

t1 finishes → releases lock
t2 enters → now sees updated balance
```

---

## ✅ Correct Result

```text
t1 → withdraw 10000 → balance = 5000
t2 → sees 5000 → cannot withdraw
```

---

# 🧠 Important Concepts Covered

From your example, you have learned:

---

## 🔹 1. Race Condition

* Incorrect result due to parallel access

## 🔹 2. Shared Resource

* `balance` is shared among threads

## 🔹 3. Non-Atomic Operation

* `check + update` is not one step

## 🔹 4. Context Switching

* Threads interleave execution

## 🔹 5. Synchronization (Solution)

* Controls access to shared data

---

# ⚡ Final Summary (Exam Ready)

👉
**Race Condition occurs when multiple threads access and modify shared data simultaneously, leading to inconsistent or incorrect results due to lack of synchronization.**

---

If you want next:
👉 I can draw **step-by-step thread timeline diagram (like your notes)**
👉 Or give **interview tricky questions on race condition + synchronization**

  
  
  
 * */
 