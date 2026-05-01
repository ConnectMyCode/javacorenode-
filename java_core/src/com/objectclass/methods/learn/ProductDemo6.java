package com.objectclass.methods.learn;

/*
  A class implements the {@code Cloneable} interface to
 * indicate to the {@link java.lang.Object#clone()} method that it
 * is legal for that method to make a
 * field-for-field copy of instances of that class.
 
 * */

																//Marker Interface	: Tells Jvm that i=this class is eligible to use the  clone() method and also can be cloned and an indication to the Object class or use of clone() method.	
public record ProductDemo6(Integer id ,  String name) implements Cloneable{

	
	
	@Override    //Object class method :clone();    --->  
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
}
