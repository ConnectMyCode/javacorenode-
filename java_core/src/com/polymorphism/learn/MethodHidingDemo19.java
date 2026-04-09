package com.polymorphism.learn;

public class MethodHidingDemo19 {
	public static void main(String []args)
	
	{    // POLYMORPHISM --> Only METHODS NOT VARIABLES  
		//WHY? -> Instance variable -->No Overriding  so No polymorphism 
		//		  Static Variables -> No Overloading -->No polymorphism
		
		
		MethodHidingBirdDemo19 bird = new MethodHidingSparrowDemo19();
		System.out.println("Color is: "+bird.color);
		System.out.println("Number of wings are: "+bird.wings);
		
		bird.fly();   //method hiding is static Polymorphism 
					//aT compile time  the compiler decides based on the method signature and parameters and searches it in the Reference type class and binds that method before execution early binding
					//JVM just executes it 
		
		//Instance field 
		//Static Method
		//Static Field
	//    ----------->  Always Executed based on the CURRENT REFERENCE
	
	}
	
}
