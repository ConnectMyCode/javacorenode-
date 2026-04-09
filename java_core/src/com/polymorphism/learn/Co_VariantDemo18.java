package com.polymorphism.learn;

public class Co_VariantDemo18 {

	public static void main(String []args) 
	{
		
	//	shape s1= null; 
	
	Co_VariantShapeDemo18 s1= new Co_VariantSquareDemo18();	
	System.out.println(s1.draw());
	
	//DOWNCASTING
	Co_VariantSquareDemo18 s2 = (Co_VariantSquareDemo18)s1;
	System.out.println(s2.draw());
		
	}
}
