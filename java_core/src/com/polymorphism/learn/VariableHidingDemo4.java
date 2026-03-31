package com.polymorphism.learn;

public class VariableHidingDemo4 {
// At run time Object is created --> NSM and NSF will be initialized thats why DYnamic Polymorphism works at run time . -->Method Overriding(Instance Methods Only) , Variable HIDING ,Method Hiding(Not possible)  
// At Loading time -->Static fields  are initialized and Methods are stored in Method area So here Static Polymorphism Works --> Method Overloading ,Variable Hiding ,Method Hiding 	
//	instance method -->Executed based on Current Object 
//	instance Field --> Executed based on Reference Type 
	
	//Variable hiding is possible only with Super and Sub class.
	
	
	
	public static void main(String []args) 
	{		//	Super p1 = Sub ;
		VariableHidingSuperDemo4 p1 = new VariableHidingSubDemo4(); 
		
		System.out.println(p1.x);  //100  -->As per  Reference Type -->Instance Field Executes. 
		
		p1.m1(); //m1() -->Instance Method executed -->based on the current object --> executed by JVM.     
		
		
		
	}
	
	
	
}
