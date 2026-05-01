package com.file.handling.learn;

import java.io.Serializable;

public record ProductDemo2(String name , Integer id) implements Cloneable , Serializable {

	
	@Override
	public Object clone()  
	{
		
		//Handling the CloneNotSupportedException  ->>>here using try-catch : So no need to wriute throws keyword 
		//If inside try block return is present then compulsory to write insde Catch block else an error comes ; 
		try  
		{
			return super.clone();       			
		}
		catch(CloneNotSupportedException e)   
		{
			System.out.println("Class deos not implement Cloneable Marker Interface");
			return null;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
