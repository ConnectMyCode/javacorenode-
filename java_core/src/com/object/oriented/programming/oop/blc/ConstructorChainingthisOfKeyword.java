package com.object.oriented.programming.oop.blc;

public class ConstructorChainingthisOfKeyword {
	public ConstructorChainingthisOfKeyword()  
	{
		this(12454545L , 45458.302100);
		System.out.println("No args Constructor");
	}	
	
	public ConstructorChainingthisOfKeyword(long num1 , double num2)  
	{
		this(12212.9090 , 7897979065646464L);
		System.out.println("Sequence of Parameter long , double "+num1+num2); 
	}
	
	public ConstructorChainingthisOfKeyword(double num1 , long num2) 
	{	this("Ganga","Maa");
		System.out.println("Sequence of parameters double , long "+num1+num2); 
	}
	
	public ConstructorChainingthisOfKeyword(String name1 , String name2)
	{	this("Ganga", "Maa" , "River");
		System.out.println("Number of parameters in constructor 2"+name1+name2);
	}
	
	public ConstructorChainingthisOfKeyword(String name1 , String name2 , String name3)
	{
		this(1234.9090 , 123.9090);
		System.out.println("Number of parameters in constructor 3"+name1+name2+name3);	
	}
	
	
	public ConstructorChainingthisOfKeyword(double d1 , double d2){ 
		this(4664f , 4454.22332f);
		System.out.println("double type arguments double , double");  
	}

	public ConstructorChainingthisOfKeyword(float d1 , float d2){
		super(); 																													
		System.out.println("float type arguments float ,float");  
	}

}
