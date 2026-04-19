package com.exception.handling.learn;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class SpecialRulesForCheckedExceptionChildDemo16 extends SpecialRulesForCheckedExceptionDemo16{
/*RULE 3:*/
	@Override					//CHECKED EXCEPTION
	public void show() throws CloneNotSupportedException   //ERROR: Exception CloneNotSupportedException is not compatible with throws clause in SpecialRulesForCheckedExceptionDemo16.show()
	{
		System.out.println("Super Class MEthod is not throwing checked exception so , overriden method cannot throw Checked exception.");
	}
	
	
	@Override					//UCHEKED EXCEPTION
	public void build() throws ArithmeticException       
	{
		System.out.println("Overriden method build() from subclass can throw an exception even though super class Method is not throwing any Exception because it is an uncheked exception. ");
	}
	
	
	
	
	
	@Override
	public void run()            
	{
		System.out.println("Overriden run() from parent class which Throws CHEKCED EXCEPEPTION this method has choice to throw or not throw the Checked Exception ; Both are ok No error. ");
	}
	
							/*Uncomment*/
	public void chill()  // throws ClassNotFoundException    //IF: Tey to throw a Checked Exception to a Super class Method  throwing Unchecked exception it Give error Not Compatible: "Exception ClassNotFoundException is not compatible with throws clause in SpecialRulesForCheckedExceptionDemo16.chill() " 
	{
		System.out.println("Overriden chill() from Parent class  which throws UNCHECKED EXCEPTION it is not compulsory this method should throw any Unchecked excetption too. ");
	}

	
	
	//IF: Super Class method throws EXception /  Throwable    then is it ??? compulsory to throw Exception from sub class methods .For either  Checked  |   Unchecked   Exception ??? 
	
	@Override 						/*Unchecked*/			/*Checked*/
	public void action() /*throws ArrayStoreException*/ /*throws EOFException */       
	{
		System.out.println("If super class Method action() throws EXCEPTION then for Sub class Overriding method its not compulsory to throw an ERROR.  ");
	}
	
	
	 @Override						/*Checked*/							/*Unchecked*/					/*ERROR*/
	 public void talkOnly() /*throws FileNotFoundException*/  /* throws NumberFormatException */   /* throws VerifyError */
	 {
		 System.out.println("This overriding  method May or May not throw an Exception and ERROR  that is Checked | Unchecked Exception as it is throwable in super class method it can handle both types of Exception.");
	 }
	
	 
	 
	/*RULE 4: */ 
//	 IF a super class is throwing an checked Exception then the sub class MAy or May not throw exception    BUT, if it throws it must follow these 2 rules:     
//    1. Sub class Throws Exception must be same Exception class or Exceptions Sub class exception        2. sub class method  Cannot throw a exception that is SUper class  of the Exception thrown by  the  super class method in Parent class.
	 
	 
	 
	 
	 
	 
	 
}




//??   How does this Exception object flows is there any role of Super class how this error is handled when an Overridden method throws an excetpion where does it goes how JVM behaves and compiler behaves . ?? Go in depth to understand how  the super class plays role here .  