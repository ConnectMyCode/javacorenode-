package com.polymorphism.learn;

public class Notes {

	
*
	# 🔹 Polymorphism

	* **Poly** = Many
	* **Morphiam** = Forms
	  👉 Meaning: **Same object having different behavior**

	---

	# 🔹 Example (Overloading)

	```java
	public void add(int a, int b) {}
	public void add(double a, double b) {}
	public void add(String a, String b) {}
	```

	👉 Same method name → different behavior (based on parameters)

	---

	# 🔹 Types of Polymorphism

	## 1. Static Polymorphism (Compile Time)

	* Exists at **compile time**
	* **Compiler decides** method execution
	* Based on **method signature (parameters)**
	* Also called:

	  * Early Binding
	  * Compile-time polymorphism

	👉 Achieved by:

	* **Method Overloading**

	---

	## 2. Dynamic Polymorphism (Runtime)

	* Exists at **execution time**
	* **JVM decides** method execution
	* Based on **object (runtime object)**
	* Also called:

	  * Late Binding
	  * Runtime polymorphism

	👉 Achieved by:

	* **Method Overriding**

	---

	# 🔹 Method Hiding (Static Methods)

	## Key Points

	* Only possible with **static methods**
	* **Static methods cannot be overridden**
	* If same method in parent & child → it is **method hiding**, NOT overriding

	---

	## 🔥 Important Rules

	* Static method belongs to **class**, not object
	* Non-static method belongs to **object**

	---

	### ❌ Not Allowed

	* Static → Non-static overriding ❌
	* Non-static → Static overriding ❌

	---

	### ❌ Annotation

	```java
	@Override  // ❌ Not allowed for static methods
	```

	---

	# 🔹 Execution Rule (VERY IMPORTANT)

	👉 **Static methods, static variables, non-static variables → depend on reference type**

	---

	# 🔹 Example Understanding

	```java
	Bird bird = new Sparrow();
	```

	### Accessing:

	```java
	bird.color   → Parent (Bird)
	bird.wings   → Parent (Bird)
	bird.fly()   → Parent (Bird)  // static method
	```

	---

	# 🔥 Final Concept

	| Type          | Based On   | Who Decides | Example        |
	| ------------- | ---------- | ----------- | -------------- |
	| Overloading   | Parameters | Compiler    | add(int, int)  |
	| Overriding    | Object     | JVM         | runtime method |
	| Method Hiding | Reference  | Compiler    | static method  |

	---

	# ⚡ One-line Summary

	* **Overloading → Compile time**
	* **Overriding → Runtime**
	* **Static → Always reference type**

	---

	If you want, I can give you **tricky MCQs from this exact topic** (very useful for exams/interviews).

	
	        | Concept                    | Type of Polymorphism  | Who Decides | Based On                      | Runtime Change Possible? | Key Reason                     |
			| -------------------------- | --------------------- | ----------- | ----------------------------- | ------------------------ | ------------------------------ |
			| **Method Overloading**     | Static (Compile-time) | Compiler    | Parameters (method signature) | ❌ No                     | Methods differ by arguments    |
			| **Method Overriding**      | Dynamic (Runtime)     | JVM         | Object (actual object)        | ✅ Yes                    | Uses dynamic dispatch          |
			| **Variable Hiding**        | Not polymorphism      | Compiler    | Reference type                | ❌ No                     | Variables are not overridden   |
			| **Method Hiding (static)** | Static behavior       | Compiler    | Reference type                | ❌ No                     | Static methods belong to class |

	
			
			🔥 Correct Understanding
			🔹 What is polymorphism?

			👉 Only related to methods, not variables

			✔ Method Overloading → Static polymorphism
			✔ Method Overriding → Dynamic polymorphism
			❌ Variables → NOT polymorphism
			🔹 Instance Fields
			class Bird {
			    String color = "White";
			}

			class Sparrow extends Bird {
			    String color = "Brown";
			}

			Bird b = new Sparrow();
			System.out.println(b.color);


			👉 Output: "White"

			✔ Why?
			Compiler uses reference type (Bird)
			No runtime decision
			No overriding for variables
			🔹 Static Fields
			class Bird {
			    static int wings = 2;
			}

			class Sparrow extends Bird {
			    static int wings = 4;
			}

			Bird b = new Sparrow();
			System.out.println(b.wings);


			👉 Output: 2

			🔥 Final Reason

			Variables (both instance & static) do not support overriding
			👉 So no runtime polymorphism
			👉 Only hiding happens, resolved at compile time
			
	
			        | Member Type        | Polymorphism? | Why                                    |
					| ------------------ | ------------- | -------------------------------------- |
					| Instance Variable  | ❌ No          | No overriding, only hiding             |
					| Static Variable    | ❌ No          | Belongs to class, compile-time binding |
					| Method Overloading | ✅ Yes         | Compile-time polymorphism              |
					| Method Overriding  | ✅ Yes         | Runtime polymorphism                   |

			
			
	
}
*/
