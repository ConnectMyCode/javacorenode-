package com.multithreading.learn;

public class ThreadCreationUsingExtendsThreadDemo2 {
	
	//Note: I have not Overridden the run() method inside UserThreadDemo2 checking how the thread behaves when executed.
	
	public static void main(String []args) 
	{
		
		System.out.println("Main Thread started!!!"); 
		
		UserThreadDemo2 ut = new UserThreadDemo2();
		
		ut.start();   
		//1.Internally executes "run()" method of Current Object ;
		//2. Requests To OS to assign a new thread for a Concurrent/Parallel Execution. //Assigning thread means Creating a separate stack memory.
		
		
		System.out.println(10/0);    //Verifying : If there is no Overriden run() method in user thread if an error occurs in main() method still thread-0 will keep running or not?  
		//Above Excepttion is not  handled so leads to Abnormal Termination of MAin thread.
		
		System.out.println("Main Thread ended!!!"); 
		
	}

}


//? Why here the output is coming in a  sequential manner 

/*If UserThread does not contains run() method then */

/*
Good question — this is exactly the kind of edge case that tests your understanding. Let’s analyze **strictly based on your code and concepts** 👇

---

# 🔍 1. What happens when `run()` is NOT overridden?

### ✅ Fact (Very Important)
- If your class (`UserThreadDemo2`) **does NOT override `run()`**:
  - Then **`Thread` class’s default `run()`** executes
  - Default implementation:
    - **Does NOTHING (empty method)**

👉 So your **child thread (Thread-0)**:
- Gets created ✔
- Gets scheduled ✔
- Executes ✔
- But performs **no task ❌**

---

# ⚙️ 2. What exactly happens step-by-step?

### Execution Flow:

1. **Main thread starts**      
   ```
   Main Thread started!!!
   ```

2. `ut.start()` is called:
   - New thread (**Thread-0**) is created ✔
   - JVM schedules it ✔
   - It calls `run()` → but **empty → finishes immediately**

3. Main thread continues:
   ```
   System.out.println(10/0);
   ```

4. **Exception occurs in MAIN THREAD**
   - `ArithmeticException` → `/ by zero`
   - Main thread **terminates immediately ❌**

5. `"Main Thread ended!!!"`  
   - ❌ Will NOT execute

---

# ❓ 3. Your Question:
> Why output is coming in sequential manner?

### ✅ Correct Reason:
- Your child thread has **NO work**
- It finishes **almost instantly**
- So practically:
  - No visible concurrency
  - Looks like **sequential execution**

👉 Important:
- Threads are still **created concurrently**
- But since one does nothing → **no observable interleaving**

---

# ❓ 4. Your Verification Question:
> If error occurs in main(), will Thread-0 keep running?

### ✅ Answer (Precise):
- In YOUR case → ❌ NO (because it already finished)

### 🔑 General Rule:
| Scenario | Behavior |
|--------|--------|
| Child thread has NO logic | Finishes immediately |
| Main thread throws exception | Main thread stops |
| Child thread still running? | Only if it has work |

👉 So:
- If `run()` had logic → ✔ child thread would continue independently
- In your case → ❌ nothing to continue

---

# 🧠 5. Concept Validation (Your Understanding)

### ✔ Correct Concepts:
- ✔ `start()` creates a new thread → **Correct**
- ✔ It internally calls `run()` from Thread Class as JVM searches from Bottom to Top approach so run() method of Thread class is emmpty so runt instantenousy → **Correct**
- ✔ Threads run concurrently → **Correct**
- ✔ Exception in main does not directly stop other threads → **Correct**

---

### ❌ Missing / Slight Misunderstanding:
- ❌ Assuming thread will “keep running” even without `run()` logic  
  → It **already finished instantly**

---

# ⚡ FINAL SUMMARY (EXAM READY)

- If `run()` is NOT overridden:
  - Thread executes **empty logic**
  - Finishes immediately

- Sequential output happens because:
  - No actual concurrent work

- Exception in `main()`:
  - Stops only **main thread**
  - Not other threads (if active)

---

If you want next:
👉 I can show **exact timeline diagram (CPU scheduling view)** — very useful for interviews  
👉 Or **difference: start() vs run() (very tricky question)**

*/