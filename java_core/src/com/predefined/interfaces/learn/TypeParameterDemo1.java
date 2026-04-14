package com.predefined.interfaces.learn;

public class TypeParameterDemo1 {
	
	
	public static void main(String []args) 
	{
		BoxDemo1<Integer> intType = new BoxDemo1<>(15); 
		System.out.println("Integer Type is: "+intType.getData() );   //Getters method   Instance Method   
		System.out.println("Static Field Value is: "+intType.aura ); 		// Static Field accessed using ReferencVataibleName.fieldName  
		intType.run(); //Static method accessed
		intType.instantRamen = 100; 
		System.out.println("Integer Type is: "+ intType.instantRamen );  // Instance Field  accessed  
		
		BoxDemo1<Boolean> booleanType = new BoxDemo1<>(true);
		System.out.println(booleanType.aura);   
		System.out.println(booleanType.getData()) ;
		
		
		//Passing an Student Class as Type for Box and   Object as T:Student Object parameter :
		
		//Pay attention to Memory diagram concept will get cleared 
		
		
		BoxDemo1<StudentDemo1> student  = new BoxDemo1<>(new StudentDemo1("Arjun" , 14));    
		
		/*Memory Visualization 
		 * STACK:
--------------------------
student → Box object
--------------------------

HEAP:
--------------------------
Box object:
   data → Student object

Student object:
   id = 111
   name = "Scott"
--------------------------

		 * 
		 * */
		
		student.getData();
		
		StudentDemo1 s =  student.getData();     // return this.data;    data>> contains Student Record Object>>  id ,name fields
		
		System.out.println("Access data value Student Object containing field name and id "+ s.name()+"\n"+s.id());  
		
//		StudentDemo1 stud0 = (Integer)student.getData();  //Type safety : At compile time To understand Type safety read the below notes :
		
		
		
	/*

		# 🔥 Example Code

		```java
		class Box<T> {
		    private T data;

		    public Box(T data) {
		        this.data = data;
		    }

		    public T getData() {
		        return data;
		    }
		}

		class Demo {
		    public static void main(String[] args) {
		        Box<Integer> box = new Box<>(10);
		        Integer value = box.getData();
		        System.out.println(value);
		    }
		}
		```

		---

		# 🔥 STEP 1: **Compilation Starts (javac)**

		### 🔹 Compiler sees:

		```java
		Box<Integer>
		```

		👉 It performs **Type Substitution**

		```
		T → Integer
		```

		So logically it checks like:

		```java
		private Integer data;
		public Integer getData()
		```

		✔ This ensures:

		* Only Integer allowed
		* Type safety ✅

		---

		# 🔥 STEP 2: **Type Checking**

		Compiler verifies:

		```java
		Box<Integer> box = new Box<>(10); // ✅ OK
		```

		If you try:

		```java
		new Box<>("Hello"); // ❌ ERROR
		```

		👉 Error happens **HERE (compile-time)**

		---

		# 🔥 STEP 3: **Type Erasure (MOST IMPORTANT ⚠️)**

		After checking, compiler **removes generics**

		---

		## 🔹 Code becomes:

		```java
		class Box {
		    private Object data;

		    public Box(Object data) {
		        this.data = data;
		    }

		    public Object getData() {
		        return data;
		    }
		}
		```

		---

		# 🔥 STEP 4: **Compiler inserts CASTING**

		Your code:

		```java
		Integer value = box.getData();
		```

		---

		## 🔹 Compiler converts it to:

		```java
		Integer value = (Integer) box.getData();
		```

		✔ Casting added automatically

		---

		# 🔥 STEP 5: **Bytecode generation**

		Now `.class` file is generated.

		👉 Important:

		* No `<T>`
		* Only `Object`
		* With inserted casts

		---

		# 🔥 STEP 6: **JVM Runtime Execution**

		Now JVM runs the program.

		---

		## 🔹 Line 1:

		```java
		Box<Integer> box = new Box<>(10);
		```

		👉 What happens:

		1. `10` → Autoboxed to `Integer`
		2. New Box object created
		3. `data` stores reference to `Integer(10)`

		---

		## 🔹 Memory View 🧠

		```
		STACK:
		-------------------
		box → Box object
		value → (empty)
		-------------------

		HEAP:
		-------------------
		Box object:
		   data → Integer(10)

		Integer object:
		   value = 10
		-------------------
		```

		---

		## 🔹 Line 2:

		```java
		Integer value = (Integer) box.getData();
		```

		👉 Execution:

		1. `getData()` returns → Object (Integer internally)
		2. JVM applies cast → `(Integer)`
		3. Assigns to `value`

		---

		## 🔹 Line 3:

		```java
		System.out.println(value);
		```

		👉 Output:

		```
		10
		```

		---

		# 🔥 STEP 7: What if wrong type?

		```java
		Box<Integer> box = new Box<>(10);

		String s = (String) box.getData(); // ❌
		```

		👉 Runtime:

		* JVM tries to cast Integer → String
		* 💥 `ClassCastException`

		---

		# 🔥 FINAL FLOW (SUPER IMPORTANT 🧠)

		```
		SOURCE CODE
		   ↓
		[COMPILER]
		   ↓
		1. Type Substitution (T → Integer)
		2. Type Checking
		3. Type Erasure (→ Object)
		4. Insert Casting
		   ↓
		BYTECODE (.class)
		   ↓
		[JVM]
		   ↓
		5. Object creation in Heap
		6. Method execution
		7. Casting at runtime
		   ↓
		OUTPUT
		```

		---

		# 🔥 KEY TAKEAWAYS

		✔ Generics exist ONLY at compile-time
		✔ Runtime uses `Object`
		✔ Casting is inserted automatically
		✔ Type safety = compile-time guarantee

		---

		# 🔥 One-line master understanding

		> Generics provide compile-time type safety, after which type erasure removes type information and the JVM operates on Objects with compiler-inserted casts.

		---

		# 🚀 If you want next level (highly recommended)

		I can show:

		* Real **bytecode (`javap`) output**
		* Bridge methods in generics
		* Why `List<int>` is not allowed

		
		
		
| Concept      | Meaning                           |
| ------------ | --------------------------------- |
| Type Safety  | Only correct type allowed         |
| Substitution | `T → StudentDemo1` (compile-time) |
| Type Erasure | Generics removed at runtime       |
| Type Casting | Compiler adds it automatically    |

		
		
🔥 Analogy (Easy to remember)

Think of Box as:

📦 “I store something (Object), I don’t know what it is.”

And caller says:

👉 “I KNOW it’s a Student, so I’ll cast it.”
		
	
		*
		*     
		*     class Box {
    private Object data;

    public Box(Object data) {
        this.data = data;
    }

    public Object getData() {     ///Method returns Object reference >>>> returns Type StudentDemo1 Object it is casted to Object  >>>> At run time the Compiler Added casting (StudentDemo1)student.getData()    downcasting happens >>>> 
        return data;
    }
}

		*     
🔥 Key Insight (THIS IS THE CONFUSION POINT)

The object in memory is always a Student object,
but the method returns it as an Object reference,
which is then cast back to Student.
		*
		*
		*
		*
		*
		*
		*
		*/

	}
	
	
	
	

}
