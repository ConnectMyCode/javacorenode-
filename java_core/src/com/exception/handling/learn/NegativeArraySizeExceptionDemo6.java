package com.exception.handling.learn;

import java.util.Scanner;

public class NegativeArraySizeExceptionDemo6 {

	
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main method started!!!");
		
		try 
		{
			int size = sc.nextInt();
			int []arr = new int[size]; 
			System.out.println("Length of Array is :"+ arr.length); 
			Integer a = 10/0;
		
		}
		catch(NegativeArraySizeException e)   //Specific Exception only handled cannot handle any other exception  type except  "NegativeArraySizeException".
		{
			System.err.println("Array Size cannot be Negative it must be Positive!!");
		}
		
		
		System.out.println("Main Method Ended!");
		
	}
	
}
/* 
 * Good question — this is exactly where understanding **exception flow inside JVM** becomes important.

Let’s go step-by-step with **object movement + control flow** 👇

---

# 🔥 STEP-BY-STEP FLOW OF YOUR PROGRAM

## 🔹 1. Program Starts

```java
System.out.println("Main method started!!!");
```

✔ Executes normally

---

## 🔹 2. Inside `try` block

### ✅ Input

```java
int size = sc.nextInt();
```

You entered:

```
3
```

✔ No issue

---

### ✅ Array Creation

```java
int[] arr = new int[size];
```

✔ Since size = 3 → Array created successfully in **HEAP**

```
HEAP:
arr → [0,0,0]
```

---

### ✅ Print Length

```java
System.out.println(arr.length);
```

✔ Output:

```
Length of Array is :3
```

---

## 🔥 3. Exception Occurs HERE

```java
Integer a = 10/0;
```

### 💥 What happens internally:

1. JVM detects: division by zero
2. JVM **creates an Exception Object**

👉 Specifically:

```
new ArithmeticException("/ by zero")
```

---

## 🔥 4. Exception Object Creation (VERY IMPORTANT)

```
HEAP:
--------------------------
ArithmeticException object
   message → "/ by zero"
   stackTrace → method call details
--------------------------
```

---

## 🔥 5. JVM Starts "Exception Propagation"

Now JVM tries to find a matching `catch` block.

---

## 🔍 6. Does your catch match?

```java
catch(NegativeArraySizeException e)
```

❌ Your exception = `ArithmeticException`
❌ Catch type = `NegativeArraySizeException`

👉 Types DO NOT MATCH

---

## 🔥 7. What JVM does next?

Since no matching catch:

👉 JVM **exits the try block immediately**
👉 Skips remaining code
👉 Starts **stack unwinding**

---

## 🔥 8. Stack Unwinding

JVM checks:

```
main() method → no matching catch
```

👉 No handler found anywhere

---

## 🔥 9. Default Exception Handler (JVM Handler)

Now JVM itself handles it.

👉 This is called:

💡 **Default Exception Handler**

---

## 🔥 10. What JVM prints

```text
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at com.exception.handling.learn.NegativeArraySizeExceptionDemo6.main(...:19)
```

✔ This comes from:

* Exception object’s **message**
* Exception object’s **stack trace**

---

## 🔥 11. Program Termination

👉 This is:

❌ **Abnormal Termination**

So this line NEVER executes:

```java
System.out.println("Main Method Ended!");
```

---

# 🧠 MEMORY + FLOW VISUALIZATION

```
STACK:
--------------------------------
main()
--------------------------------

HEAP:
--------------------------------
ArithmeticException("/ by zero")
--------------------------------
```

---

# 🔥 KEY CONCEPT (VERY IMPORTANT)

👉 Exception handling works based on **type matching**

| Exception Thrown           | Catch Block Present? | Result          |
| -------------------------- | -------------------- | --------------- |
| ArithmeticException        | ❌ No                 | JVM handles     |
| NegativeArraySizeException | ✔ Yes                | (Not used here) |

---

# 🔥 ANSWER TO YOUR CORE QUESTION

> ❓ Where is ArithmeticException getting caught?

👉 ✅ **It is NOT caught in your code**

👉 ✅ It is handled by:
💡 **JVM Default Exception Handler**

---

# 🔥 WHY IT PRINTS IN CONSOLE?

Because:

✔ Exception object contains:

* Message
* Stack trace

✔ JVM prints it using:

```java
e.printStackTrace()
```

(internally)

---

# 🔥 FINAL UNDERSTANDING (ONE LINE)

> If no matching catch block is found, JVM’s default handler catches the exception, prints its details, and terminates the program abnormally.

---

# 🚀 BONUS (What you SHOULD do)

To handle properly:

```java
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

OR

```java
catch (Exception e) {
    System.out.println("Handled: " + e);
}
```

---

If you want next level 🔥
I can show:

* How multiple catch blocks are matched internally
* Difference between `throw` vs `throws`
* Real stack trace breakdown line by line

 * 
 * 
 * */
 