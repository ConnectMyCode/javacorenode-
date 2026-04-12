package com.interFaceJDKone.seven.learn;

public class InterfaceeMultipleInheritanceDemo9 {

	public static void main(String []args) 
	{
		//Multiple Inheritance is possible through Interface.
		
		ClassCDemo9 demo9 = new ClassCDemo9();
		demo9.m1();
		
		
		
		/*
		 * Let’s stay **strictly within your given code** and clear everything step by step.

---

# 🔹 Which interface method is overridden?

Both interfaces have the same method:

```java
interface A {
    void m1();
}

interface B {
    void m1();
}
```

👉 So:

* `A.m1()`
* `B.m1()`

are **identical method declarations**.

---

## 🔹 In class `C`

```java
class C implements A, B {
    @Override
    public void m1() {
        System.out.println("MI is possible through interface");
    }
}
```

👉 This **single method**:

✔ Overrides **A.m1()**
✔ Overrides **B.m1()**

---

## 🔹 Why only one method is enough?

Because:

* Both interfaces have **same method signature**

  ```
  void m1();
  ```
* Java treats them as **one common contract**

👉 So class `C` provides **one implementation** that satisfies both.

---

# 🔹 Important Concept (Core Reason)

👉 There is **no ambiguity** here because:

* Interfaces **do not have method bodies** (in this context)
* Only declaration exists
* So JVM does not get confused

---

# 🔹 Constructor point (your note explanation)

> "super keyword will directly move to Object class constructor"

✔ Correct

Why?

* Interfaces **don’t have constructors**
* So when `new C()` is executed:

### Flow:

```
C() constructor
   ↓
super() → Object()
```

👉 It directly calls **Object class constructor**

---

# 🔹 Execution Flow of your program

```java
C c1 = new C();
c1.m1();
```

### Step-by-step:

1. `new C()` → object of class `C` is created
2. Constructor chain:

   ```
   C() → Object()
   ```
3. `c1.m1()` is called
4. JVM executes **C’s implementation**

---

# 🔹 Key Points (Bullet Notes 💯)

### ✔ Multiple Inheritance using Interface

* A class can implement **multiple interfaces**

  ```java
  class C implements A, B
  ```

---

### ✔ Method Overriding Rule

* If multiple interfaces have:

  * Same method name
  * Same parameters

👉 Then:

* Only **one implementation is required**

---

### ✔ No Ambiguity (Important 🔥)

* Interfaces (without default methods) only have declarations
* No method body → no conflict
* So **no diamond problem**

---

### ✔ Constructor Behavior

* Interfaces **do not have constructors**
* So:

  ```
  super() → Object class
  ```

---

### ✔ Object Creation

* Object is always of:

  ```
  Class C
  ```
* Not of interface

---

### ✔ Contract Satisfaction

* Class `C` must implement all methods of:

  * Interface `A`
  * Interface `B`

✔ Here both need `m1()`
✔ One method satisfies both

---

# 🔹 One-line interview answer

> “Since both interfaces have identical method signatures, a single implementation in class C overrides both A.m1() and B.m1(), removing any ambiguity.”

---

If you want next level clarity, I can show you **what happens if method signatures are different or default methods are used (where ambiguity actually occurs)**.

		 * 
		 * */

/*
 * 
 * Good — this is the **exact right doubt** to ask 👍

## 🔹 Short Answer

👉 **No priority is given to any interface**
👉 Neither `A` nor `B` is preferred

---

## 🔹 Why no priority?

Because both interfaces have:

```java
void m1();
```

✔ Same method name
✔ Same parameters
✔ Same return type

👉 So they are **identical contracts**

---

## 🔹 What Java actually does

When class `C` implements both:

```java
class C implements A, B
```

Java says:

> “I don’t care whether this came from A or B — just give me one implementation.”

So:

```java
public void m1()
```

✔ Satisfies **A.m1()**
✔ Satisfies **B.m1()**

👉 No conflict → No priority needed

---

## 🔹 Think of it like this

Both interfaces are saying:

```
A → "Give me m1()"
B → "Give me m1()"
```

Class `C` says:

```
"Here is m1()"
```

👉 Both are satisfied → End of story

---

## 🔹 When does priority matter? (Important 🔥)

Priority **only comes into picture** when:

👉 Interfaces have **default methods with body**

Example (not your case, just concept):

```java
interface A {
    default void m1() { }
}

interface B {
    default void m1() { }
}
```

Now ambiguity occurs ❗
Then you must explicitly choose:

```java
A.super.m1();  // or B.super.m1();
```

---

## 🔹 Final Concept (Very Important)

| Situation                         | Priority Needed? | Reason                   |
| --------------------------------- | ---------------- | ------------------------ |
| Same abstract methods (your case) | ❌ No            | Only one contract        |
| Default methods with body         | ✅ Yes           | Multiple implementations |

---

## 🔹 One-line answer 💯

> “No priority is given because both interfaces provide the same abstract method signature, so a single implementation satisfies both.”

---				


 * 
 * 
 * */	
	
	}
	
}
