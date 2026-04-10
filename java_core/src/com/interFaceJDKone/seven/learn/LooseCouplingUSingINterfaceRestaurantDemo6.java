package com.interFaceJDKone.seven.learn;

public class LooseCouplingUSingINterfaceRestaurantDemo6 {    
	
	
	//LCRP: Loose Coupling Runtime Polymorphism :  
	
	
						//Loose Coupling --> Tea() , Coffee() , Horlicks() , Objects this Classes Implements HotDrink Interface .
	public void getOrder(InterfaceHotDrinkDemo6 drink)   //Interface Type-->"HotDrink"   
	{					//Upcasting ---->    HotDrink<--tea      HotDrink<--coffee 
		
	/*	So internally:
			InterfaceHotDrinkDemo6 drink = new TeaDemo6();
	*/
		drink.prepare();     //Dynamic Polymorphism >>>> Run time Polymorphism 
	
	/*
	 * 
	 * 
Compiler checks:
✔ Does prepare() exist in interface? → YES ✅
So compilation passes
4. At Runtime (MOST IMPORTANT 🔥)

JVM checks:
👉 "Which object is actually stored inside drink?"
	 * 
	 * 
	 * */
	
	}

/*
 * Good — Gemini’s answer is **correct but generic**.
You need a **Java + Interface + Runtime Polymorphism focused answer** (interview-ready).

---

# ✅ **Coupling & Cohesion (Interface Context – Clean Notes)**

## 🔹 **Coupling (Dependency between classes)**

### ✅ **Loose Coupling (Using Interface)**

* When a class depends on an **interface instead of concrete classes**
* Achieved using **runtime polymorphism (upcasting)**

### 🔥 In your code:

```java
public void getOrder(InterfaceHotDrinkDemo6 drink)
```

👉 The method depends on:

* `InterfaceHotDrinkDemo6` ❌ NOT `Tea`, `Coffee`, etc.

---

### ✅ Benefit:

* You can pass any implementation:

```java
order.getOrder(new TeaDemo6());
order.getOrder(new CoffeeDemo6());
order.getOrder(new HorlicksDemo6());
```

👉 No change needed in `Restaurant` class

---

### 💥 Key Point:

> The class is **independent of concrete implementations**

---

### ❌ Tight Coupling (Avoid this)

```java
public void getOrder(TeaDemo6 tea)
```

👉 Problem:

* Works only for Tea ❌
* Cannot use Coffee or others ❌
* Changes required everywhere ❌

---

## 🔹 **Why Interface gives Loose Coupling**

👉 Interface acts as a **contract**

```java
interface HotDrink {
    void prepare();
}
```

👉 Any class implementing it:

* MUST define `prepare()`

So:

* Restaurant doesn’t care *which drink*
* It only calls:

```java
drink.prepare();
```

---

## 🔹 **Cohesion (Within a Class)**

### ✅ High Cohesion

* Class has **single responsibility**
* Data + related methods are tightly bound

---

### 🔥 Example:

```java
class TeaDemo6 implements InterfaceHotDrinkDemo6 {
    public void prepare() {
        System.out.println("Preparing Tea");
    }
}
```

👉 This class:

* Only handles **Tea logic**
* No unrelated functionality

---

## 🎯 **Final Interview Answer (Perfect Version)**

> Loose coupling in Java is achieved using interfaces, where a class depends on an abstraction rather than concrete implementations. This allows different implementations (like Tea, Coffee) to be used interchangeably through runtime polymorphism without modifying the dependent class. High cohesion ensures that each class has a single responsibility, keeping related data and behavior together.

---

## 🔥 Ultra Short Version (if interviewer interrupts)

> Interface enables loose coupling by decoupling implementation from usage, and cohesion ensures each class focuses on a single responsibility.

---

If you want next level 🚀
I can give:

* 🔥 Real-world Spring Boot example (VERY IMPORTANT for interviews)
* 🔥 MCQs + tricky questions from this topic

 * 
 * */	
	

}

