package com.predefined.interfaces.learn;

/*<T> : Type parameter  : Accepts: 1.Wrapper Classes    2.Classes User Defined */
					//	  Not Accepts 	1.Primitive Type

/*Imagine this as a Box When We decide it will accept <Integer> type  then all the methods,fields,method parameters will accept only the Integer type. >>> This is Type safety
 * 
 * */

public class BoxDemo1<T> {           //Compiler adds implicitly >>> public class BoxDeemo<T> extends Object >>> Single Level inheritance 
									//So all the Object class Methods that are non static and static methods are inherited by the subclass "BoxDemo1" are avialable to use 
//   T ERASURE CONCEPT: GETS ERASED AT Compile time AND THE GIVEN TYPE IS REPACED BY Compiler only. 
	private T data; 
	
	public T instantRamen; 
	
	public BoxDemo1(T data)  
	{
		super();
		this.data = data;
		
	//	instantRamen = 100;   // the Data type is Generic so Cannot declare the field directly with a Value; ERROR: Type mismatch cannot convert From Type T to int.
			//instancetRamen field has Datatype Ganereic means <T>  so if we initialize a it from outside like above then it will give error because we have not specified the Type for Box<T> 
	}

	
	//Instance Method
	public T getData() {
		return data;
	}

	
	static int aura = 1000;
	
	//Static Method
	public static void run() 
	{
		System.out.println("Sttatic Method Inside BoxDemo1 accessed!!"); 
	}
	
	
	
}

