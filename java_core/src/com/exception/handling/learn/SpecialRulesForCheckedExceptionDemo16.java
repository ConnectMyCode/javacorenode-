package com.exception.handling.learn;

import java.io.FileNotFoundException;

public class SpecialRulesForCheckedExceptionDemo16 {

	
	/*Does not throw Checked*/
	public void show() 
	{
			System.out.println("Inside Parent Class method show() is not throwing Checked Exception so Child class has Overridden this method that too  cannot throw a Checked Exception if throws it gives ERROR. ");
	}
	
	/*Does not throw UnChecked*/
	void build() 
	{
		System.out.println("Build method From parent class is not throwing any Unchecked Exception!. Still the Sub class overriden method can throw an Uncheked Exception. ");
	}



	
	/*Throws Checked Exception*/
	public void run() throws FileNotFoundException  //CHECKED Exception.
	{
		System.out.println("Parent Class Run() method If it throws A CHECKED EXCEPTION its child CLass OVerriding run() method May Or May Not Throw Chekced Exception. ");
	}
	
	
	/*Throws UnChecked Exception*/
	public void chill() throws ClassCastException
	{
		System.out.println("Chill() method throws Unchecked exception ");
	}
	
	
	/*Throws Exception*/
	public void action() throws Exception
	{
		System.out.println("action() super class method is throowng Exception it is not compilsory to throw an exception ffrom sub class but it can throw both Runtime(Uncheked)Exception  and Excetpions direct subclasses(Checked Exception.) ");
	}
	
	
	/*Throws Throwable*/
	public void talkOnly() throws Throwable		
	{
		System.out.println("Super class talkOnly() method  throws ");		
		
	}

	
}


