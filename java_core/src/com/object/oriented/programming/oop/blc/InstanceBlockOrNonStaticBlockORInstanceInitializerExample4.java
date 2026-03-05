package com.object.oriented.programming.oop.blc;

public class InstanceBlockOrNonStaticBlockORInstanceInitializerExample4 {
	/*If there is no "super()" keyword inside the constructor in 1st Line then non static members will not be added by the compiler in the 2nd liine of the constructor*/
	public InstanceBlockOrNonStaticBlockORInstanceInitializerExample4(int x) 
	{
		this("Java");
		System.out.println("int value is: "+ x);
	}
	public InstanceBlockOrNonStaticBlockORInstanceInitializerExample4(String sentence) 
	{
		this(2300.00f);
		System.out.println("int value is: "+ sentence);
	}
	public InstanceBlockOrNonStaticBlockORInstanceInitializerExample4(float flight) 
	{
		this(4090.0909);
		System.out.println("int value is: "+ flight);
		
	}
	public InstanceBlockOrNonStaticBlockORInstanceInitializerExample4(double bus) 
	{
		
		System.out.println("int value is: "+ bus);		
	}
	
	
	//Non static block
	{
		System.out.println("Non static Block"); 
	}

}
