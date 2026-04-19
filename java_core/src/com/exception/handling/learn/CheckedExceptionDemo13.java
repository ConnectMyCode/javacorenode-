package com.exception.handling.learn;

public class CheckedExceptionDemo13 {
			
	
	public static void main(String  []args)   throws ClassNotFoundException //throwing this Checked Exception to JVM handled by Default exception handler.[stackTrace message]
	{
		
	
		System.out.println("main method started");
		m1();
/*Uncomment*/ /*		try{
			m1();   //Here we are not handling the Checked Exception and  Throwing it from m1() method to main() method  so it will give  compilation error . Unless we don't handle this will give a  runtime error:   Unresolved compilation problem: Unhandled exception type ClassNotFoundException  : Code is not executed unless we handle this Error  >> This error is not handled by  JVM's Default Exception Handler.   			
		}
		catch(ClassNotFoundException e)   //When we handle this error the Execution will happen smoothly 
		{
			System.out.println("Class Name Invlaid or File Does not Exists");
		}*/
		System.out.println("main method ended!!");
	}
													
	public static void m1() throws ClassNotFoundException  //at line.no.11:" Unhandled exception type ClassNotFoundException "       
	{
		System.out.println("m1() method started");
		m2();
/*Uncomment*/ /*		try     //If no method is handling the Class not found exception then ? 
		{
			m2();			
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}*/ 
		System.out.println("m1 method ended");
	}
							///Throws keyword is used to declare:-  
	public static void m2() throws ClassNotFoundException          // "throws" : is not written then Compiler Error:"Unreachable catch block for ClassNotFoundException. This exception is never thrown from the try statement body" 
	{
		System.out.println("m2() method started");
		
		Class.forName("com.exception.handling.learn.SampleDemo13");   //Here the Class / "SampleDemo13.class" file is present so it is being loaded while runtime so no exception is thrown // BUT COMPULSORILY I had to write either throws or try-catch block for just satisfying the compiler that I am handling the Exception and  run/execute the code ;     
		
		Class.forName("com.exception.handling.learn.SampleDemo14");  //Compiler: Giving assurance to Compiler the error is handled  by adding "throws" / "try-catch" ;   Here Class /"SampleDemo14.class" file does not exists so>> Create a ClassNooFoundException Object at runtime >> As m2() method declared " throws ClassNotFoundException "  so it passes the responsibility of handling the error to its Caller >> m1() method : Also handles the error by using "throws" declared in method so error object passes to its caller method "main()" >>  
		
		//Compiler Error:  Unhandled exception type ClassNotFoundException 
		System.out.println("m2() method ended");
	}
	
}



/* CASE SCENARIO: 1 
   Good question — this is where **checked exceptions behave very differently** from unchecked ones. Let’s cleanly correct your understanding 👇

---

## ❓ If NO method handles `ClassNotFoundException`, what happens?

### ✅ Case 1: No `try-catch` AND no `throws` anywhere

```java
m1(); // calling method that throws checked exception
```

👉 **Result:**

* ❌ **Compilation Error**
* Message: `Unhandled exception type ClassNotFoundException`
* ✔️ Code will **NOT run at all**

---

## ✅ Case 2: Methods use `throws`, but `main()` does NOT handle or declare

```java
public static void main(String[] args) {
    m1(); // m1 throws exception
}
```

👉 **Result:**

* ❌ **Compilation Error again**
* Because `main()` must either:

  * handle (`try-catch`) OR
  * declare (`throws ClassNotFoundException`)

---

## ✅ Case 3: Exception propagated till `main()` using `throws`

```java
public static void main(String[] args) throws ClassNotFoundException {
    m1();
}
```

👉 **Now what happens?**

* ✔️ Code **compiles successfully**
* ✔️ At runtime:

  * If exception occurs → it reaches JVM
  * JVM prints:

    * Exception message
    * Stack trace
* ❌ Program terminates

---

## ⚠️ IMPORTANT CORRECTION (Your misconception)

You wrote:

> JVM does not handle checked exceptions ❌

👉 **Correct Concept:**

* ✔️ JVM **CAN handle checked exceptions**
* BUT ONLY IF they reach JVM (via `throws` till `main`)
* ❗ Compiler forces handling BEFORE runtime

---

## 🔥 Key Difference (Very Important)

| Type                | Compiler Check | Runtime Handling              |
| ------------------- | -------------- | ----------------------------- |
| Checked Exception   | ✔️ Mandatory   | ✔️ JVM handles if reaches top |
| Unchecked Exception | ❌ Not required | ✔️ JVM handles                |

---

## 🔁 Flow in YOUR CODE (If no try-catch anywhere)

```
m2() → m1() → main() → JVM
```

### Steps:

* `m2()` throws `ClassNotFoundException`
* `m1()` → passes using `throws`
* `main()` → passes using `throws`
* JVM → prints error + terminates

---

## 🧠 Important Notes from Your Code

* `Class.forName("SampleDemo13")`

  * ✔️ Class exists → No exception

* `Class.forName("SampleDemo14")`

  * ❌ Class NOT found → `ClassNotFoundException` at runtime

---

## 🚨 Special Compiler Rule You Mentioned (Correct)

```java
catch(ClassNotFoundException e)
```

Without exception in try:

* ❌ Compiler Error:

  ```
  Unreachable catch block
  ```
* ✔️ Because compiler knows exception is never thrown

---

## 💡 Final One-Line Answer

👉 *If no method handles a checked exception, the program will NOT compile unless it is declared using `throws` till `main()`. If it reaches JVM, then JVM will handle it and terminate the program.*

---

If you want, I can give you a **perfect interview diagram comparing checked vs unchecked propagation (very important for exams/interviews)**.

 	
 * */





/* CASE SCENARIO: 2    {If all the try catch blocks are removed then why the statmt are not printed like "main method started"...}
 
  Good observation — but the reason is **very simple and important** 👇

---

## ❓ Why nothing is printed?

```java
System.out.println("main method started");
m1();
```

👉 You expected:

```
main method started
m1() method started
m2() method started
```

---

## ✅ Actual Reason

### 🔴 Your code does NOT compile

Because:

```java
m1();  // m1() throws ClassNotFoundException
```

* `m1()` has:

  ```java
  throws ClassNotFoundException
  ```
* But `main()` is:

  * ❌ NOT handling (no try-catch)
  * ❌ NOT declaring (no throws)

---

## 💥 Result

👉 **Compilation fails → Program never runs**

So:

* ❌ `main method started` → NOT printed
* ❌ `m1() method started` → NOT printed
* ❌ `m2() method started` → NOT printed

---

## ⚠️ Important Concept

👉 **Execution happens ONLY after successful compilation**

Since this is a **checked exception**, compiler stops you **before runtime**

---

## 🔍 Error You Will See

```
Unhandled exception type ClassNotFoundException
```

---

## ✅ How to Fix

### ✔️ Option 1: Add `throws` in main

```java
public static void main(String[] args) throws ClassNotFoundException {
    System.out.println("main method started");
    m1();
}
```

👉 Now output will be:

```
main method started
m1() method started
m2() method started
Exception in thread "main" java.lang.ClassNotFoundException...
```

---

### ✔️ Option 2: Use try-catch

```java
try {
    m1();
} catch (ClassNotFoundException e) {
    System.out.println("Handled in main");
}
```

---

## 🧠 Key Takeaway

👉 *If checked exception is not handled or declared → program will not even start execution.*

---

## 🔥 One-line Answer

👉 *Nothing is printed because compilation fails due to unhandled checked exception, so JVM never starts execution.*

---

  
 *   */
 