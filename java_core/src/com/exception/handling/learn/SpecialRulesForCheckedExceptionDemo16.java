package com.exception.handling.learn;

public class SpecialRulesForCheckedExceptionDemo16 {

	public void show() 
	{
			System.out.println("Inside Parent Class method show()");
	}
	
	void build() 
	{
		System.out.println("Build method From parent class is not throwing any Unchecked Exception!. Still the Sub class overriden method can throw an Uncheked Exception. ");
	}
}
