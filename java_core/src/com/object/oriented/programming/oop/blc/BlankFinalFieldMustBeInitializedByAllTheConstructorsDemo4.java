package com.object.oriented.programming.oop.blc;

public class BlankFinalFieldMustBeInitializedByAllTheConstructorsDemo4 
{
	
	private final double salary; 
	
	public BlankFinalFieldMustBeInitializedByAllTheConstructorsDemo4()
	{
		salary = 909090; 
		System.out.println(salary);
	}
	
	public BlankFinalFieldMustBeInitializedByAllTheConstructorsDemo4(double salary)
	{
		this.salary =salary; 
		System.out.println(salary);
	}
	
	public double getBlankFinalFieldMustBeInitializedByAllTheConstructorsDemo4() 
	{
		System.out.println(salary);
		return this.salary; 
	}

}
