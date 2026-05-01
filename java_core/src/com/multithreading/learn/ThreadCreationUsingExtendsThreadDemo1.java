package com.multithreading.learn;

public class ThreadCreationUsingExtendsThreadDemo1 {
		
	
	public static void main(String []args) 
	{
		System.out.println("Main Thread is running ");
	
		TestDemo1 test = new TestDemo1();   //Created  thread  >> ?How can you say that thread is created ?ANS >> Class whose object is created Extends Thread Class which means creation of a Custom thread is possible 100% assurred 

		test.start();
		
		System.out.println("Main Thread ended");
		
		
	}
}

//NOTE: start() method is a trigger for JVM to request OS for creating a new thread >>> This thread is Scheduled by the JVM.


/*

	|main()	|	
	|{		|
	|		|
	|		|
	|	   }|
	|		|
	---------
	main thread

	|run()	|	
	|{		|
	|		|
	|		|
	|	   }|
	|		|
	---------
	Thread-0
	

*/



/*		
TestDemo1 test = new TestDemo1();		//? A thread is create means what actually is the memory created as stack memory generated when this obejct is created ? 
		//? JVM creates Stack when actually ? 
		//? After a Stack is created how dow it work is it empty at first or the run method already occupies the Thread-0 stack;
		//? 
 */


/*		
		new TestDemo1().run(); //Anonymous Object Creation  >> ? Can I call this Anonymous Thread Creation?
		//? For the above Anonymous Object when thread is created surely a Stack must be created and the object lies in the Heap memory so how  does this both memory interact what  is the back-end story of  creating these thread this way. 
 */		



/*IMP Clarifiaction of BAsic of Multithreading : 
 
  Perfect — this is **deep JVM/thread understanding**. I’ll stick strictly to your code + questions and validate your concepts precisely 👇

---

# 🔍 1. “Thread is created when object is created” — ✅❌

### Your Statement:

> `TestDemo1 test = new TestDemo1();` → thread is created

### ❌ Not fully correct

### ✅ Correct Concept:

* `new TestDemo1()`:

  * ✔ Creates **object in HEAP**
  * ❌ Does **NOT create a thread**

* `test.start()`:

  * ✔ **Actually creates a new thread (Thread-0)**

### 🔑 Final:

| Step            | What happens                  |
| --------------- | ----------------------------- |
| Object creation | Only object in heap           |
| `start()` call  | Thread is created + scheduled |

---

# 🔍 2. “Stack memory created when object is created?” — ❌

### ❌ Incorrect assumption

### ✅ Correct:

* Stack is **NOT tied to object creation**
* Stack is tied to **THREAD**

### 🔑 Rule:

| Memory | Created When                |
| ------ | --------------------------- |
| Heap   | Object creation (`new`)     |
| Stack  | Thread creation (`start()`) |

---

# 🔍 3. “JVM creates stack when?” — ✅ Precise Answer

* JVM creates:

  * **One stack per thread**

### So:

* Main thread → already has stack
* When `start()` is called:

  * JVM creates **new stack for Thread-0**

---

# 🔍 4. “Is stack empty initially?” — ✅

### Yes, initially:

* Stack is **empty**

### Then:

* When thread starts:

  * `run()` method is pushed onto stack

### Flow:

```
Thread-0 stack:
[ run() ]   ← pushed when thread starts
```

👉 Important:

* `run()` is **NOT pre-loaded**
* It is added **when thread begins execution**

---

# 🔍 5. “Does run() already occupy stack?” — ❌

### ❌ Incorrect

### ✅ Correct:

* Stack is created first (empty)
* Then:

  * `run()` is invoked → pushed onto stack

---

# 🔍 6. Anonymous Object Case

```java
new TestDemo1().run();
```

### Your Question:

> Can I call this Anonymous Thread Creation?

### ❌ NO (Very Important)

### ✅ What actually happens:

* ✔ Anonymous object created (heap)
* ✔ `run()` called like **normal method**
* ❌ NO new thread created

👉 It runs in:

* **Main thread only**

---

# 🔍 7. “Stack must be created for this?” — ❌

### ❌ No new stack created

### Why?

* Because:

  * `run()` is NOT called via `start()`
  * So no new thread

### Instead:

* `run()` executes inside:

  * **Main thread stack**

---

# 🔍 8. Heap vs Stack Interaction (Backend View)

### Case 1: `new TestDemo1().start()`

#### Heap:

* Object stored

#### Stack:

* Main thread stack → calls `start()`
* JVM creates:

  * New stack → Thread-0

#### Execution:

```
Main Thread Stack        Thread-0 Stack
-----------------        -----------------
main()                   run()
start()
```

---

### Case 2: `new TestDemo1().run()`

#### Heap:

* Object created

#### Stack:

* ONLY main thread stack used

```
Main Thread Stack
-----------------
main()
run()   ← normal method call
```

---

# 🔍 9. Your Concepts Validation

### ✔ Correct:

* ✔ Extending Thread allows custom thread creation → TRUE
* ✔ Threads have separate execution → TRUE
* ✔ Heap stores objects → TRUE

---

### ❌ Corrections:

| Your Thought                      | Correct Concept |
| --------------------------------- | --------------- |
| Object creation = thread creation | ❌              |
| Stack created on object creation  | ❌               |
| Anonymous run() = thread          | ❌               |
| run() preloaded in stack          | ❌               |

---

# ⚡ FINAL SUMMARY (INTERVIEW LEVEL)

* Thread is created **ONLY when `start()` is called**
* Each thread has **its own stack**
* Stack is created **at thread start, not object creation**
* `run()`:

  * Called via `start()` → **new thread**
  * Called directly → **normal method (no thread)**

---

If you want next:
👉 I can draw **exact memory diagram (Heap + Multiple Stacks + Flow)** — this will lock the concept permanently in your brain

  
  
  
 * */











