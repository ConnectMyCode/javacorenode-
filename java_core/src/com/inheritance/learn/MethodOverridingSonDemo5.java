package com.inheritance.learn;

public class MethodOverridingSonDemo5 extends MethodOverridingFatherDemo5 {

	public void home() {
		System.out.println("Son Home");
		super.home(); 
	}
	
	public String toString() 
	{	super.toString();    
		return "ToString Method of Son Home";
	}
	
	
}
