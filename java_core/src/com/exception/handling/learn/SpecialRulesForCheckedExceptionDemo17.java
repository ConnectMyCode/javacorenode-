package com.exception.handling.learn;

public class SpecialRulesForCheckedExceptionDemo17 {
	
  /* RULE 5 */

	/*Static BLock*/
 static 
 { 
	 System.out.println("Static Block cannot have throws keyword similar to return ");
	 int []arr = new int[3];
	 arr[5] = 10;    //ArrayIndexOutOfBounds        //Unchekced Exception propagates to JVM default Exception handler>>abruptly Terminates program  , If handled >> Normally Terminates . 
	 
/*Uncomment*/ //	Class.forName("SpecialRulesForCheckedExceptionDemo16"); //CHECKED Exception needs to be handled using throws here it is not possible to use "throws". So other opt is (try-catch)  not used here so Program ddoes not executes 
//ERROR: Error: Unresolved compilation problem: 
 } 

 /*Non Static Block*/
 {	 
 	 
	 Integer x = 10/0;   //Unchecked Exception >> it will propagate to JVM HOW?? > It will go back to the Constructor Caller. and via there reach the JVM , >>RSULTS IN >> 1. Object not created because Constructor not executed completely , Abnormal Termination of program because not handled using try-catch ,  
 	 
 	 Class.forName("SpecialRulesForCheckedExceptionDemo16");    /*Checked Exception needs to be handled using 1.Throws not allowed inside  Instance Block so 2.try-catch not handled here. */
 	 /*ERROR: Default constructor cannot handle exception type ClassNotFoundException thrown by implicit super constructor. Must define an explicit constructor*/
 	 
 	 System.out.println("Non Static Keyword cannot have Throws Keyword siilar to Return keyword.");				
 }	 
 
 
 public static void main(String []args)						
 {	
	  
	 /*RI+ULLE 6:  If a method called throws a Checked Exception then the caller method must Throw that Excption using throws Keyword OR
	  * handle it using try-catch block , else the compiler throws a try-catch block */
	 
	 m1();   //Unhandled exception type ClassNotFoundException.
	 
 }	
 
 static void m1() throws ClassNotFoundException {
	 
	 Class.forName("SpecialRulesForCheckedExceptionDemo1");    
	 System.out.println();
 }
 
}



/*Very IMP: */
 /*ERROR: Default constructor cannot handle exception type ClassNotFoundException thrown by implicit super constructor. Must define an explicit constructor*/

/* 

Good question — and this is where your understanding needs a **precise correction** 👇

---

## 🔴 **Why this error occurs**

```
Default constructor cannot handle exception type ClassNotFoundException 
thrown by implicit super constructor. Must define an explicit constructor
```

---

## ⚠️ **Root Cause (Actual Reason — not what you wrote)**

👉 The error is **NOT directly because of the instance block**

👉 The real reason is:

* `Class.forName()` throws **checked exception**
* Instance block **cannot handle or declare it**
* So Java tries to associate that exception with the **constructor**

---

## 🔍 **What Java actually does internally**

When you don’t write a constructor, Java creates a **default constructor** like this:

```java
public SpecialRulesForCheckedExceptionDemo17() {
    super();   // implicit call to Object class constructor
    // instance block code is inserted here internally
}
```

Now your instance block has:

```java
Class.forName("SpecialRulesForCheckedExceptionDemo16");
```

👉 This throws:

```
ClassNotFoundException (checked)
```

---

## 🔴 **Problem**

* Constructor is now **indirectly throwing a checked exception**
* But:

  * Default constructor **does NOT declare `throws`**
  * And you didn’t handle it

👉 So compiler says:

```
Constructor must handle or declare the exception
```

---

## ❗ Why error message mentions `super()`?

This part is confusing, but important:

* Java assumes exception could propagate through constructor chain
* Since constructor starts with `super()`, compiler reports it that way
* But **actual source is your instance block**

---

## ✅ **How to fix it (2 correct ways)**

### ✔ Option 1: Handle inside instance block (BEST)

```java
{
    try {
        Class.forName("SpecialRulesForCheckedExceptionDemo16");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}
```

---

### ✔ Option 2: Declare in constructor

```java
public SpecialRulesForCheckedExceptionDemo17() throws ClassNotFoundException {
}
```

---

## 🔥 **Key Concept (Very Important)**

👉 Instance block code becomes part of constructor internally

So:

* If instance block throws checked exception ❌
* It must be handled OR declared via constructor ✔

---

## 🎯 **Interview-Ready Answer**

> Instance blocks cannot declare `throws`, but their code is internally part of the constructor.
> So if a checked exception occurs inside an instance block, it is treated as if the constructor is throwing it.
> Since the default constructor does not declare `throws`, the compiler gives an error.
> Therefore, the exception must be either handled inside the instance block or declared explicitly in the constructor.

---

## ⚡ Final Correction to Your Understanding

* ❌ “Instance block cannot use throws” → Correct but incomplete
* ❌ “Program will not execute” → Misleading
* ✅ **Correct:** Exception becomes constructor responsibility

---

👉 Your level now: **8.5/10 — very close to interview solid**

If you want, I can now give you a **tricky MCQ based on this (very common in interviews)** 👍



 */



/*Static Blocks*/
/*
Yes — your direction is right, but let’s make it **crystal clear and interview-perfect** 👇

---

## ✅ **Unchecked Exception (RuntimeException) in Static Block**

✔ **It CAN propagate**

```java
static {
    int x = 10 / 0; // ArithmeticException (unchecked)
}
```

### 🔍 What happens:

* No need to handle it
* It **propagates automatically**
* JVM wraps it into:
  👉 `ExceptionInInitializerError`
* Class loading **fails**

---

## ❌ **Checked Exception in Static Block**

```java
static {
    Class.forName("ABC"); // Checked Exception
}
```

### 🔴 Problem:

* Compiler error:

  ```
  Unhandled exception type ClassNotFoundException
  ```

### ❗ Why?

* Checked exceptions **must be either:**

  * handled (try-catch) ✔
  * OR declared using `throws` ✔

👉 But:

* Static block **cannot use `throws`**
* So only option:
  ✔ **Handle using try-catch**

---

## 🔑 **Core Difference (VERY IMPORTANT)**

| Type                | Can propagate? | Why                                           |
| ------------------- | -------------- | --------------------------------------------- |
| Unchecked Exception | ✅ Yes          | Compiler does NOT force handling              |
| Checked Exception   | ❌ No           | Must be handled, cannot use `throws` in block |

---

## 🎯 **Exact Interview Line**

> Unchecked exceptions can propagate from static blocks because the compiler does not enforce handling.
> However, checked exceptions cannot propagate because static blocks cannot declare `throws`, so they must be handled within the block.

---

## ⚡ One-line Memory Trick

👉 **Unchecked → allowed to escape**
👉 **Checked → must be caught inside**

---
*/


/*Instance Block */
   
/*
Perfect — here’s the **same concept for Instance (Non-static) Block**, clean and interview-ready 👇

---

## ✅ **Unchecked Exception in Instance Block**

```java
{
    int x = 10 / 0; // ArithmeticException (unchecked)
}
```

### 🔍 What happens:

* No need to handle it
* It **propagates automatically**
* Object creation **fails**
* Exception goes to **constructor caller**

---

## ❌ **Checked Exception in Instance Block**

```java
{
    Class.forName("ABC"); // Checked Exception
}
```

### 🔴 Problem:

* Compiler error:

  ```
  Unhandled exception type ClassNotFoundException
  ```

### ❗ Why?

* Checked exceptions must be:

  * handled ✔
  * OR declared using `throws` ✔

👉 But:

* Instance block **cannot use `throws`**
* So:
  ✔ **Must handle using try-catch**

---

## 🔑 **Core Difference**

| Type                | Can propagate? | Why                                  |
| ------------------- | -------------- | ------------------------------------ |
| Unchecked Exception | ✅ Yes          | Compiler does NOT force handling     |
| Checked Exception   | ❌ No           | Must be handled, cannot use `throws` |

---

## ⚠️ **Important Behavior**

* Instance block runs:
  👉 **Before constructor**
* If exception occurs:

  * Constructor **never completes**
  * Object **is NOT created**

---

## 🎯 **Interview-Ready Statement**

> Unchecked exceptions can propagate from instance blocks because the compiler does not enforce handling.
> Checked exceptions cannot propagate because instance blocks cannot declare `throws`, so they must be handled within the block.
> If an exception occurs, object creation fails and the constructor does not complete.

---

## ⚡ One-line Memory Trick

👉 **Instance block = constructor pre-step**
👉 **Unchecked escapes, Checked must be caught**

---

If you want, next I can give you a **tricky comparison: constructor vs instance block vs static block (very high interview value)** 👍


*/












/*When a class is loaded the static block is exceuted if an Exception object is generated at the time og loading the exceituon of the code will be terminated abmnoally which is not encouraged 
 * 
 /* Similary if a non static block is exceuted at runtime when the Constructor is called to initlaize the fields of an object so a Instance block is excuted even before the contructor body exceutes so if an exception is generated then the object wwill not be inintialized properly and programs ends abruptly */
 