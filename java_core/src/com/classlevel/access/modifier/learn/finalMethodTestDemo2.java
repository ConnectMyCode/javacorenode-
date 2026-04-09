package com.classlevel.access.modifier.learn;

public class finalMethodTestDemo2 {
	
	final int y = 100;
	
	{
		y=90;		  //The final field finalMethodTestDemo2.y cannot be assigned. 
	}
	
	
	final public void questions() 
	{
		System.out.println("Question Paper set A");
	} 
	
}
