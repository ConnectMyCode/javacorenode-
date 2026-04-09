package com.abstraction.learn;

public class ClassAbstractSquareDemo1 extends ClassAbstractShapeDemo1{


// Press: ALT+S >>> generate Implemented Method	
	
	@Override
	public void foo1() {   //Abstract Method Implemented/Overriden
		System.out.println("Make a foo silent");
		}
		
	
	//ERROR: The type ClassAbstractSquareDemo1 must implement the inherited abstract method ClassAbstractShapeDemo1.foo1()
   // 2 ways: 1} Make class abstract if not implemented the abstract method   
  //		   2} Implement the method.
	
	
	
	
	
	
}
