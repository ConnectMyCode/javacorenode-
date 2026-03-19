package com.inheritance.learn;

public class MethodOverridingFatherDemo5 extends MethodOverridingGrandFatherDemo5 {
		
	public void home() 
	{
		System.out.println("Father Home");
		super.home(); 
	}
	
	public String toString() 
	{
		super.toString();
		System.out.println("ToString Method of Father");
		return "ToString Method of Father";
	}
	
	
 }
	
