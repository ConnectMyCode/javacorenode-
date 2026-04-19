package com.exception.handling.learn;

public class SpecialRulesForCheckedExceptionChildDemo16 extends SpecialRulesForCheckedExceptionDemo16{

	@Override					//CHECKED EXCEPTION
	public void show() throws CloneNotSupportedException   //ERROR: Exception CloneNotSupportedException is not compatible with throws clause in SpecialRulesForCheckedExceptionDemo16.show()
	{
		System.out.println("Super Class MEthod is not throwing checked exception so , overriden method cannot throw exception.");
	}
	
	
	@Override					//UCHEKED EXCEPTION
	public void build() throws ArithmeticException       
	{
		System.out.println("Overriden method build() from subclass can throw an exception even though suoer class Method is not throwing any Exception because it is an uncheked exception. ");
	}

}



//??   How does this Exception object flows is there any role of Super class how this error is handled when an Overiden method throws an excetpion where does it goes how JVM behaves and compiler behaves . ?? Go in depth to understand how  the super class plays role here .  