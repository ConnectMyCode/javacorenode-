package com.exception.handling.learn;

public class MultipleTryCatchBlockDemo7 {

//Note:-> JVM : Creates objects at run time so the Exception ,Error Object  are getting created at Run time only and  also Finding which Catch block mathces the Object is done by JVM at runtime if No Catch Block Matches the Exception Object then JVM handles the Exception Object by Itself that is called as >>>  Default Exception Handler  >>> Using message()  , stackTrace() methods of Exception object it will print the message of the exception handled by JVM .  	
	public static void main(String []args)
	{
		
	/*NOTE: Displaying multiple errors at once is not good and User experience will degrade as shown below.*/	
		
		try {
			String str = null;
			System.out.println(str.length());  //ERROR null pointer exception Object is created at run time by JVM  
		}
		catch(NullPointerException e) 
		{
			System.err.println("reference variable is pointing to null"); 
		}
		
		/*Above the Nullpointer Exception object is created and Handled  and message is printed */
		 /*flow continues and another try catch block occurs  */
		
		
		try 
		{
			String s1 = "Java";
			Integer value = Integer.valueOf(s1);
			System.out.println(value);
		}
		catch(NumberFormatException e)
		{
			System.err.println("String input is not in a proper format");
		}
		
		try 
		{
			Object []obj = new String[2];
			obj[0] = "Surat";
			obj[1] = 100;
		}
		catch(ArrayStoreException e) 
		{
			System.err.println("Illegal element in the Array");   
		}
	}
}
/*

You’re **very close**—your understanding is mostly correct. I’ll refine it, fix a few inaccuracies, and point out subtle loopholes with clear examples.

---

# ✅ 🔥 REFINED VERSION (CORRECT & PRECISE)

```java
// ✔ Refined Understanding

→ Exceptions and Errors are objects created by the JVM at runtime.

→ When an abnormal condition occurs (like divide by zero, invalid array size, etc.),
  the JVM creates a corresponding Exception/Error object.

→ The JVM then searches for a matching catch block based on the type of the exception.

→ This matching is done at runtime using the exception object's type.

→ If a matching catch block is found:
     ✔ Control is transferred to that catch block
     ✔ The exception is said to be "handled"

→ If NO matching catch block is found:
     ✔ The JVM's Default Exception Handler handles it
     ✔ It prints:
         - Exception class name
         - Exception message
         - Stack trace (method call sequence)

→ After that, the program terminates abnormally.
```

---

# ⚠️ 🔴 LOOPHOLES / CORRECTIONS (VERY IMPORTANT)

## ❌ 1. "Using message(), stackTrace() methods"

👉 This is **not fully correct**

✔ Correct is:

* `getMessage()` ✔ (method exists)
* `printStackTrace()` ✔ (method exists)
* `stackTrace()` ❌ (no such method)

---

### ✔ Internally JVM behaves LIKE:

```java
e.printStackTrace();
```

---

## ❌ 2. "JVM creates Exception always"

👉 Not always ONLY JVM

✔ Exceptions can be created by:

| Who creates? | Example                        |
| ------------ | ------------------------------ |
| JVM          | `10/0 → ArithmeticException`   |
| Programmer   | `throw new Exception("Error")` |

---

### ✔ Example:

```java
throw new ArithmeticException("Manual error");
```

👉 Here **you created the object**, not JVM.

---

## ❌ 3. "JVM finds catch block"

👉 Slight refinement needed

✔ JVM does:

* Match based on **type hierarchy (IS-A relationship)**

---

### ✔ Example:

```java
try {
    int x = 10 / 0;
}
catch (Exception e) {
    System.out.println("Handled");
}
```

👉 Even though exception is `ArithmeticException`

✔ It matches because:

```
ArithmeticException IS-A Exception
```

---

## ❌ 4. Missing Concept: **Stack Unwinding**

👉 You didn’t mention this (important gap)

---

### ✔ What actually happens:

If no catch in current method:

👉 JVM moves UP the call stack

---

### ✔ Example:

```java
void m1() {
    int x = 10/0;
}

void m2() {
    m1();
}

public static void main(String[] args) {
    m2();
}
```

👉 Flow:

```
m1() → no catch
⬆
m2() → no catch
⬆
main() → no catch
⬆
JVM handles
```

👉 This is called:

🔥 **Stack Unwinding / Exception Propagation**

---

## ❌ 5. "Error objects" mention incomplete

👉 Important distinction missing:

| Type      | Can Handle?  |
| --------- | ------------ |
| Exception | ✔ Yes        |
| Error     | ❌ Usually NO |

---

### ✔ Example:

* `OutOfMemoryError`
* `StackOverflowError`

👉 These are **serious problems**
👉 Not meant to be handled normally

---

## ❌ 6. Missing: **Program Flow Break**

👉 Important behavior:

✔ As soon as exception occurs:

* Remaining code in `try` block is **skipped**

---

### ✔ Example:

```java
try {
    System.out.println("A");
    int x = 10/0;
    System.out.println("B"); // ❌ never runs
}
```

Output:

```
A
Exception...
```

---

# 🔥 FINAL PERFECT UNDERSTANDING (INTERVIEW LEVEL)

> Exceptions are runtime objects created either by the JVM or explicitly by the programmer. When an exception occurs, the JVM searches for a matching catch block based on type compatibility. If found, the exception is handled; otherwise, the JVM propagates the exception up the call stack (stack unwinding). If no handler is found, the default exception handler prints the exception details (type, message, stack trace) and terminates the program abnormally.

---

# 🚀 QUICK VISUAL FLOW

```
Exception occurs
       ↓
Object created (Heap)
       ↓
Search catch block (Runtime)
       ↓
[Found?]
   ✔ Yes → Execute catch
   ❌ No
       ↓
Stack Unwinding
       ↓
[Still not found?]
       ↓
JVM Default Handler
       ↓
printStackTrace()
       ↓
Program Ends ❌
```

---

# 💡 FINAL TIP (VERY IMPORTANT)

👉 Always remember:

✔ Compile-time → checks possibility
✔ Runtime → actual exception object + handling

---

If you want next level 🔥
I can show:

* Exact bytecode for try-catch
* How multiple catch blocks are prioritized
* Difference between checked vs unchecked exceptions (deep JVM view)



*/