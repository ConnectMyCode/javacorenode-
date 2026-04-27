package com.file.handling.learn;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.Scanner;

public class SerailizationDeSerializationDemo1  {

	
	public static void  main(String []args)  throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Serialization  --> What is Serialization ?? >>> 
		var filePath = "C:\\java_core_workspace\\java_core\\src\\com\\file\\handling\\learn\\Employee.txt";
		var fout = new FileOutputStream(filePath);     //Connection Creation (OutputStream COnnection Established)  //Also throws FileNotFoundException class.
		var oos = new ObjectOutputStream(fout);       //Wrapping FileOutputStreanm to Iv=bjectOuputStream  >> This class contains >> void write(Object obj) method >Converts object into Bytes ,and FileOutputStream  writes byte into file.  
		 
		System.out.println("Enter no.of Objects: ");
		int noOfObjects = sc.nextInt();
		
		EmployeeDemo1 employeeData[] = new EmployeeDemo1[noOfObjects];
		
		
	try(oos;fout;sc) 
	{
		//valueOf    String --> Integer 
		//parseInt   String --> int
		try 
		{
			for(int i =0 ; i<noOfObjects ; i++) 
			{
				System.out.println("Enter eemployrr id: ");
				Integer id =Integer.valueOf(sc.next());
				sc.nextLine();
				
				
				System.out.println("Enter eemployee name: ");
				String name = sc.nextLine(); 
				
				System.out.println("Enter eemployrr salary: ");
				Double salary = Double.valueOf(sc.next());
				
				employeeData[i] =	EmployeeDemo1.getEmployeeObject(id, name , salary, LocalDateTime.now());   //Genereate  ArrayIndexOutOfBoundsException  handled below

				oos.writeObject(employeeData[i]);  //Writing the object in the Employee.txt file; 
		}
		   
		}
		catch(ArrayIndexOutOfBoundsException e1)  
		{
			System.out.println("No of elements inputs are only 2 ");
		}
	}	 	
	catch(FileNotFoundException f) 
	{
		System.out.println("File not Found.");
	}	
	
	
	/*Printing the Employee Data from array*/
	int i = 0 ; 
	for(EmployeeDemo1 emp:employeeData) 
	{	
		
		System.out.println("Employee :"+i+": "+emp);
		++i;
	}
	
	
	/*TASK:: ::: ::::: Retrieve the data from the File using De-serialization */
	
	var finput = new FileInputStream(filePath);    //Establishing InputStream connection to Retrieve the Data from file "EmployeeDemo1.txt" 
	//Connection Creation (InputStream COnnection Established) 
	var ois = new ObjectInputStream(finput);    //Wrapping FileInputStream in ObjectInputStream  
	
	
	System.out.println();
	try(ois;finput)
	{
		while(true) 
		{
			EmployeeDemo1 data =  (EmployeeDemo1)ois.readObject();
			
			System.out.println(data);
			
			
		}
		
	}
	catch(EOFException e3)
	{
		System.out.println("File Ended");
	}
	
	
	}
	
	
	
}


/*
Creates a file output stream to write to the file with the
     * specified name. A new {@code FileDescriptor} object is
     * created to represent this file connection.           ///Creates a connection(outputStream) with the file.   



 * */


/*
 Good — I’ll **strictly stick to your code and context** and explain **ONLY what `ObjectOutputStream` and `FileOutputStream` are doing**, their **hierarchy**, and **their role in THIS code**.

---

# 🔥 **1. Where they are in File Handling Hierarchy**

```
java.lang.Object
   ↓
java.io.OutputStream   (abstract class)
   ↓
java.io.FileOutputStream   (low-level stream)
   ↓
java.io.ObjectOutputStream (high-level stream / wrapper)
```

---

# 🧠 **2. What each one does (in YOUR code)**

## ✅ **`FileOutputStream fout = new FileOutputStream(filePath);`**

### ✔ What it does:

* Creates a **connection between your program and the file**
* This is **LOW-LEVEL (byte stream)**
* Writes **raw bytes** to file

### ✔ Your comment is correct:

> “Connection Creation (OutputStream connection established)”

### ✔ Also:

* If file does not exist → **creates file**
* If path is wrong → throws **`FileNotFoundException`**

---

## ✅ **`ObjectOutputStream oos = new ObjectOutputStream(fout);`**

### ✔ What it does:

* Wraps `FileOutputStream`
* Converts **Java objects → bytes (Serialization)**

👉 This is **HIGH-LEVEL stream**

---

# 🔁 **3. How they work together (VERY IMPORTANT)**

```
Employee Object
   ↓
ObjectOutputStream (converts object → bytes)
   ↓
FileOutputStream (writes bytes → file)
   ↓
Employee.txt
```

---

# 🔥 **4. What exactly is happening in YOUR code**

### Step-by-step:

### 🔹 Step 1:

```
FileOutputStream fout
```

👉 Opens file connection

---

### 🔹 Step 2:

```
ObjectOutputStream oos
```

👉 Prepares to write **objects (not raw data)**

---

### 🔹 Step 3:

```
try(oos; fout; sc)
```

👉 JVM will automatically call:

```
oos.close()
fout.close()
sc.close()
```

---


---


### 🔥 So currently:

| Component          | Status         |
| ------------------ | ---------------|
| FileOutputStream   | ✅ Connected    |
| ObjectOutputStream | ✅ Ready        |
| Object Writing     |  |✅ Writting   |
---------------------------------------

# 🎯 **5. Final Understanding**

## ✅ `FileOutputStream`

* Handles **file connection**
* Writes **bytes to file**

## ✅ `ObjectOutputStream`

* Handles **serialization**
* Converts **object → byte stream**

---

# ⚡ **One-line clarity**

👉 `FileOutputStream` → *“Where to write”*
👉 `ObjectOutputStream` → *“What to write (object → bytes)”*

---

# 🚫 **Brutal Truth (Important)**

👉 Your program currently:

> ❌ Does NOT perform serialization
> ✔ Only prepares for it

---

If you want next:
👉 I can show **exact minimal fix (1 line) to make serialization actually work**

  
  
  
 * */

 