package com.interFaceJDKone.seven.learn;

public class Interface7VersionNotes {

	
	
/*
		## Core Definition and Structure
		* **Keyword:** Interface is a keyword in Java, similar to a class; the compiler (`javac`) generates a `.class` file for it.
		* **Purpose:** It defines the **"working functionality of a class"** and is primarily used to achieve **loose coupling** and support **dynamic polymorphism**.
		* **100% Abstraction:** Up to JDK 1.7, interfaces contain **only abstract methods**, ensuring no concrete methods are present.

		## Rules for Members (Default Modifiers)
		* **Methods:** By default, all interface methods are **public** and **abstract**.
		* **Variables:** By default, all variables are **public**, **static**, and **final**.

		## Strict Constraints
		* **Prohibited Elements:** You **cannot** define non-static fields (object properties), non-static methods (object behavior), constructors, static blocks, or non-static blocks.
		* **No Instantiation:** You cannot create an object (instance) of an interface.

		## Implementation and Inheritance
		* **Multiple Inheritance:** Because interfaces do not support constructors, they allow Java to achieve **multiple inheritance**.
		* **Implementation:** The `implements` keyword is used by classes to provide method bodies.
		* **Overriding Rules:** * You **cannot reduce the visibility** of the overridden methods (they must remain public).
		    * Subclasses must override **all** abstract methods, or the subclass itself must be declared as an **abstract class**.

		---
		> **Note on Versioning:** The notes mention that from **JDK 1.8 onwards**, the rules changed to allow **default** and **static** methods, which are not covered in the JDK 1.7 section.


*/
}
