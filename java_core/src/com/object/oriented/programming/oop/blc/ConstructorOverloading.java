package com.object.oriented.programming.oop.blc;

public class ConstructorOverloading {
	
	public ConstructorOverloading()
	{
		System.out.println("No args Constructor");
	}	
	
	public ConstructorOverloading(long num1 , double num2)  
	{
		System.out.println("Sequence of Parameter long , double "+num1+num2); 
	}
	
	public ConstructorOverloading(double num1 , long num2) 
	{
		System.out.println("Sequence of parameters double , long "+num1+num2); 
	}
	
	public ConstructorOverloading(String name1 , String name2)
	{
		System.out.println("Number of parameters in constructor 2"+name1+name2);
	}

	public ConstructorOverloading(String name1 , String name2 , String name3)
	{
		System.out.println("Number of parameters in constructor 3"+name1+name2+name3);
		
	}
	
	
	public ConstructorOverloading(double d1 , double d2){
		System.out.println("double type arguments double , double");  
	}

	public ConstructorOverloading(float d1 , float d2){
		System.out.println("float type arguments float ,float");  
	}
	
	
	
}
