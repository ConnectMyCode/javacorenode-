package com.exception.handling.learn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SceanriBasedpractise3 {

	public static void main(String []args) 
	{																					   				//File: Resource
		       //read:IS Resource Need To handle it because it throws Checked Exception:IOException     //FileNotFoundException   May generate or not :--> Checked Exception: FIleNotFoundException;  if there is possibility then Compiler forces Developer to handle  this exception using 1.try-catch 2."Throws"- keyword in Method Declaration
	try(BufferedReader read = new BufferedReader( new FileReader("C:/java_core_workspace/java_core/src/com/exception/handling/learn/data") ))  
	{
		String line;
		while( (line = read.readLine()) != null )
		{
			
			try 
			{
				int num  = Integer.parseInt(line);
			    
				try {
					int result = 100/num;
					System.out.println("Result:"+ result);
				}
				catch(ArithmeticException e) 
				{
					System.out.println("Value cannot be divided by zero");
					e.getStackTrace();
					e.getMessage();
				}
			}
			catch(NumberFormatException e)
			{
				System.err.println(" Value given is Invlaid only Integer format excepted. ");
			}
			
			
													
		}
		
	}	
	catch(IOException e) 
	{
		
	}
	System.out.println("Layer-1 Try-catch block exited");
	
	System.out.println("Main method ended!!!");
		
		
		
	}
	
	
}

/*				parseInt()                          valueOf()
Usage    Converts String → int             Converts String → Integer
*/



// How Can IO_EXCEPTION handle FILE_NOT_FOUND_EXCEPTION ?? 
/* 
 * Great question — this is a **core concept of Java exception hierarchy** 👇
 

---

## ✅ **Short Answer**

👉 `IOException` can handle `FileNotFoundException` because:

> **FileNotFoundException is a subclass (child) of IOException**

---

## 🧠 **Hierarchy (VERY IMPORTANT)**

```
Exception
   ↑
IOException
   ↑
FileNotFoundException
```

---

## 🔍 **What this means**

```java
try {
    FileReader fr = new FileReader("abc.txt");
}
catch (IOException e) {
    System.out.println("Handled");
}
```

👉 Even though:

* `FileReader` throws `FileNotFoundException`

✔ It is still caught because:

* `IOException` = **parent class**
* Can catch **all its child exceptions**

---

## ⚠️ Rule (Interview Important)

👉 **Parent class reference can catch child class exceptions**

---

## 🔴 But reverse is NOT possible

```java
try {
    // some IO operation
}
catch (FileNotFoundException e) {
}
```

❌ This will NOT catch:

* Other IOExceptions (like EOFException)

---

## 🔥 Catch Order Rule

```java
try {
    // code
}
catch (FileNotFoundException e) {
}
catch (IOException e) {
}
```

✔ Correct → specific to general

---

```java
catch (IOException e) {
}
catch (FileNotFoundException e) {
}
```

❌ Compile-time error → unreachable catch block

---

## 🎯 Interview-Ready Answer

> IOException can handle FileNotFoundException because FileNotFoundException is a subclass of IOException. In Java, a catch block of a parent exception type can handle all its child exceptions.

---

## ⚡ One-line Memory Trick

👉 **Parent catches child, child cannot catch parent**

---

If you want, I can give you a **tricky MCQ where this concept breaks people in interviews** 😄    */

