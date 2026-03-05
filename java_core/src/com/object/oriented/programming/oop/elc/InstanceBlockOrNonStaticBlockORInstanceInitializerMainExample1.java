package com.object.oriented.programming.oop.elc;

import com.object.oriented.programming.oop.blc.InstanceBlockOrNonStaticBlockORInstanceInitializerExample1;

public class InstanceBlockOrNonStaticBlockORInstanceInitializerMainExample1 {
	
	public static void main(String []args)
	{							
		System.out.println("Main Method ");
		
		
		/*every time we will create an new  object the instance block will be executed htat is inside the class 
		 * Process :->  1.A no args constructor added ny compiler because no user defined is present will be added by compiler
		 * 				2. Inside it "super()" keyword is added automatically by the compiler  in the 1st line of the constructor() --> InstanceBlockOrNonStaticBlockORInstanceInitializerExample1() 
		 * 					super() executes --> 2nd Line non static blocks are placed by the compiler inside the constructor Body and they will execute 
		 * 				3.Then the actual constructor body starts executing.
		 * 				4.purpose :-> Give the common message and logic to all the multiple objects , and to initialize the instance variable/non static fields . 
		 *   
		 * 				*/ 
		
		InstanceBlockOrNonStaticBlockORInstanceInitializerExample1 instanceBlock1 = new InstanceBlockOrNonStaticBlockORInstanceInitializerExample1();
		System.out.println("First object"+ instanceBlock1);
	
		InstanceBlockOrNonStaticBlockORInstanceInitializerExample1 instanceBlock2 = new InstanceBlockOrNonStaticBlockORInstanceInitializerExample1();
		System.out.println("Second object"+instanceBlock2);
		
		InstanceBlockOrNonStaticBlockORInstanceInitializerExample1 instanceBlock3 = new InstanceBlockOrNonStaticBlockORInstanceInitializerExample1();
		System.out.println("Third object"+instanceBlock3);
		
		
		
	}                            
	
	
}
