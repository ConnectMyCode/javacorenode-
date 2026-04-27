package com.exception.handling.learn;

public class TryCatchWithReturnDemo21 {
	
	
	public static void main(String[]args) 
	{
		
		try 
		{
			System.out.println(returnValue());			
		}
		catch(ArithmeticException e)  //Verifying if try-finally block generated exception is suppressed or not 
		{
			System.out.println("Exception from retturnValue() >>> try block handled here ,BUT \"return\" is in finally block which \n supresses the exception generated in try block if any \n return in try and catch    ");
		}
	}
	
	
	
/*Uncomment*/ @SuppressWarnings("finally")    //Suppresses the Warning coming from finally block   :finally block does not complete normally
	public static int returnValue() 
	{
	//	NOTE: Even if "return" is inside try then inside catch is  compulsory and vice versa
		//	 if outside try-catch "return" is present then no error ;
	   //  finally block any way executes so "return" inside it satisfies No error;				   		
		
		try 
		{
			System.out.println("try block");
			System.out.println(10/0);
			return 100;     
		}
/*Uncomment*/
/*	  catch(Exception e) 
		{
			System.out.println("Catch Block"); 
			return 200;
		//Finally block is Executed Even after return 200;
		}   */
		finally   
		{
			System.out.println("finally block"); 
/*Uncomment*/ 	//		return 400;    //Uncomment try-catch return they will be overriden means not exeecuted .
		}
		
		//Unreachable code
		// return 300;

	}
}
/*
⚠️ CRITICAL RULE (VERY IMPORTANT)

👉 If finally has a return:

🔥 It overrides EVERYTHING

return in try ❌ ignored
return in catch ❌ ignored
exception thrown ❌ suppressed */  


/*
# 🔥 **“finally block does not complete normally” — What it REALLY means**

## ✅ **Definition**

A block **does NOT complete normally** if it:

* contains `return` ✔
* throws an exception ✔
* has `System.exit()` ✔

👉 In your case:

```
finally {
    return 400;
}
```

✔ This means:

> **finally does NOT complete normally**

---

# 🔁 **Actual Execution Flow of Your Code**

```
try → executes
catch → skipped (no exception)
finally → executes
return 400 → method ends
```

---

# ⚠️ **CRITICAL RULE (VERY IMPORTANT)**

👉 If `finally` has a `return`:

> 🔥 It **overrides EVERYTHING**

* return in try ❌ ignored
* return in catch ❌ ignored
* exception thrown ❌ suppressed

---

# 💥 Example Behavior (Conceptual)

### Case 0:

```
try → return 100   >>Exception handled in main() try-catch block    
finally → prints("---"); 
```

### Case 1:

```
try → return 100   >>Exception handled in main() try-catch block    
finally → return 400
```

👉 Output:

```
400
```

---

### Case 2:

```
try → exception
catch → return 200   >>> Exception handled 
finally → return 400
```

👉 Output:

```
400
```

---

### Case 3:

```
try → exception      
no catch			
finally → return 400	 
```						
						
👉 Exception is **lost** ❗
👉 Output:
						
```
400
```

---

# 🚫 **BIG PROBLEM (Interview Trap)**

👉 Writing `return` in `finally` is **BAD PRACTICE**

### Why?

* Hides exceptions ❌
* Breaks debugging ❌
* Confuses flow ❌

---

# 🧠 **Your Statement Check**

### ❌ You wrote:

> “Even if return is inside try then inside catch is compulsory”

👉 **WRONG**

✔ Correct:

* If method must return a value → **ALL paths must return**
* It doesn’t matter whether return is in try/catch/finally

---

# ✅ **Correct Understanding**

👉 Compiler checks:

> “Will this method ALWAYS return a value?”

✔ If yes → OK
✔ If not → compile error

---

# 🎯 **Final Output of Your Code**

```
try block
finally block
400
```

---

# ⚡ **Interview-Ready Answer**

> If a finally block contains a return statement, it overrides any return from try or catch and suppresses any exception. This is because finally does not complete normally, causing the method to terminate from the finally block itself.

---

# ⚡ **One-line Memory Trick**

👉 **“finally return = everything ignored”**

*/

/*
# 🔥 **What does “suppressing exception” mean here?**

👉 In your case (when `finally` has `return`):

> ✅ The exception is **completely lost**
> ❌ It does **NOT propagate to the caller (main method)**
> ❌ It does **NOT reach JVM default exception handler**

---

# 🔁 **Actual Flow**

### Suppose:

```
try {
    int x = 10 / 0;   // ArithmeticException
}
finally {
    return 400;
}
```

---

### What SHOULD have happened:

```
Exception → propagate → main → JVM handler
```

---

### What ACTUALLY happens:

```
Exception occurs in try
↓
finally executes
↓
return 400 executes
↓
method ends immediately
↓
❌ exception is discarded
```

---

# ⚠️ **Key Insight**

👉 The exception **was created**, but:

> 🔥 It is **overridden by the return in finally**

---

# 🧠 **So your statement:**

> “It is not even getting propagated to main?”

✔ **CORRECT**

👉 More precise:

> It does not propagate **at all beyond the method**, because finally terminates the method execution.

---

# 🔥 **Important Comparison**

| Scenario                                | Does exception propagate? |
| --------------------------------------- | ------------------------- |
| try → exception, no finally return      | ✅ Yes                     |
| try → exception, finally without return | ✅ Yes                     |
| try → exception, finally WITH return    | ❌ No (suppressed)         |

---

# 🚫 **Why this is dangerous**

* You lose the real error ❌
* Debugging becomes very hard ❌
* Program behaves incorrectly ❌

---

# 🎯 **Interview-Ready Answer**

> Yes, when a finally block contains a return statement, it suppresses any exception thrown in the try or catch block. The exception does not propagate to the caller or the JVM, because the method terminates from the finally block.

---

# ⚡ **One-line Memory Trick**

👉 **“finally return kills exception propagation”**

*/

