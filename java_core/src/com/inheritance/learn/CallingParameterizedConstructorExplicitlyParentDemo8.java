package com.inheritance.learn;

public class CallingParameterizedConstructorExplicitlyParentDemo8 {
		
	public CallingParameterizedConstructorExplicitlyParentDemo8(int y) 
	{
		System.out.println("  Parameterized Constructor of parent class");
	}
	
	public CallingParameterizedConstructorExplicitlyParentDemo8() 
	{
		this(15); 
		System.out.println("User Defined Default No args Construcotr of Parent Class.");
	}
		
}
