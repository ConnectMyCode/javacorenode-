package com.exception.handling.learn;

public class ExceptionChainingDemo25 {
	
	public static void main(String []args) 
	{
		try 
		{
			int x = 10/0;
			System.out.println("x value is :"+x); 
		}
		catch(ArithmeticException e )
		{
			try {
				
				RuntimeException e1 = new RuntimeException(" Wrapped to Runtime exception. ");
				System.out.println("Wrapped to Runtime Exception using initcause() ");
		
				
				e1.initCause(e);
/*				e1.initCause(e);
				e1.initCause(e);   // Cannot call Multiple times...
*/			
				e1.initCause(e1);    //Self Clause is not allowed.
				//2 rules: 
				/*
				 * 1. Cannot call multiple times  [java.lang.IllegalStateException] 
				 * 2. Self Clause is not allowed. [java.lang.IllegalArgumentException]
				 * */
				
				
				throw e1;
				
			} catch (RuntimeException e2) {
				
				System.out.println("...........");
				System.out.println("Original Cause was :"+ e2.getCause()); //Original cause
				
				
			}
			
		}
	
	}
	

}
