package com.exception.handling.learn;

public class CheckedUncheckedExceptionNotes {

	
	
	
	
	
	/*
	 Here are your **precise bullet-point notes** based on the images (nothing missed, cleaned and structured):

---

# 🔥 Types of Exceptions in Java

* 3 types:

  * Checked Exception
  * Runtime Exception
  * Error (serious problems)
* RuntimeException + Error → **Unchecked Exceptions**

---

# 🔥 Strange Behavior of Java Compiler

* `.class` file exists but still shows `ClassNotFoundException`
* Compiler mentions `ClassNotFoundException` (not JVM confusion)
* `10/0` → 100% exception at runtime, but **no compile-time error**

---

# 🔥 Checked Exception

### ✔ Definition

* Must be **handled (try-catch)** OR **declared (throws)**
* Compiler **forces handling**
* Ensures clarity about runtime issues

---

### ✔ Characteristics

* Compiler takes **strict care**
* Code **will not compile** without handling
* Handling is **compulsory**
* Subclasses of:

  * `java.lang.Exception`
  * NOT `RuntimeException` and NOT `Error`

---

### ✔ Examples

* FileNotFoundException
* IOException
* InterruptedException
* ClassNotFoundException
* SQLException
* CloneNotSupportedException
* EOFException

---

# 🔥 Unchecked Exception

### ✔ Definition

* No need to handle or declare
* Compiler **does not enforce handling**

---

### ✔ Characteristics

* Handling is **optional**
* Usually occur due to **programming mistakes**
* Subclasses of:

  * `RuntimeException`
  * `Error`

---

### ✔ Examples

* ArithmeticException
* ArrayIndexOutOfBoundsException
* NullPointerException
* NumberFormatException
* ClassCastException
* ArrayStoreException

---

# 🔥 Checked vs Unchecked (Key Points)

### ✔ Checked Exception

* Common
* Compiler forces handling
* Must use try-catch or throws
* Subclass of Exception (excluding RuntimeException)

---

### ✔ Unchecked Exception

* Rare (as per notes)
* Compiler ignores
* Handling not compulsory
* Includes RuntimeException & Error

---

# 🔥 Why Compiler Strict for Checked Exception?

* Because they depend on **external resources**:

  * File handling → IOException, FileNotFoundException
  * Keyboard input → IOException
  * Threads → InterruptedException
  * Database → SQLException
  * Class loading → ClassNotFoundException
  * Object cloning → CloneNotSupportedException

👉 These may fail at runtime → must be handled

---

# 🔥 try-catch vs throws

### ✔ try-catch

* Handle exception **in same method**
* Allows **custom/user-friendly messages**
* Program continues execution

---

### ✔ throws

* Declares exception to caller
* Used in **method signature**
* Exception handled by:

  * JVM OR caller method
* If exception occurs → remaining code not executed

---

### ✔ Note

* Prefer **try-catch** for better user messages

---

# 🔥 Interview Points

* Exceptions always occur at **runtime**
* Checked Exception:

  * Forces developer to handle (try-catch / throws)
* try-catch:

  * Better → program continues + user-friendly output
* Unchecked Exception:

  * Compiler does **not force handling**
  * Developer choice to handle

---

# 🧠 One-line Summary

```
Checked → Compiler forces handling  
Unchecked → Developer choice  
```

---

If you want, I can convert this into:

* 🔥 Revision chart (1-page)
* 🔥 Interview Q&A format
* 🔥 Mind map for quick recall

	 
	 
	 
	 * */
	
	
}
