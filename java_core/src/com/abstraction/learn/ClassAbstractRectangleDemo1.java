package com.abstraction.learn;



public class ClassAbstractRectangleDemo1 extends ClassAbstractShapeDemo1{

	@Override
	public void foo1() {     //Abstract MEthod Overriden  (Compulsory)
		
		System.out.println("Make a foo count");
		
	}

	@Override
	public String fool() {  //INstance Method Overriden (CHOICE)
		// TODO Auto-generated method stub
		return super.fool();
	}

	
	
}
