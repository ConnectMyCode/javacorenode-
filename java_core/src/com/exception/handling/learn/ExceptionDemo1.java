package com.exception.handling.learn;

public class ExceptionDemo1 {

	public static void  main(String []args) 
	{
		Exception e =  new ArithmeticException(); //message= null
		
		System.out.println(e);
//o/p: 	java.lang.ArithmeticException
		
		Exception e1 = new ArithmeticException("Divide By Zero");
		
		System.out.println(e1);
//o\p:	java.lang.ArithmeticException: Divide By Zero	
		
		
		
		//Follow the traces using ctrl + hover over select Open DDeclaration see the  clesses whom they extend and immplement 
		//also in each class see which method is getting executed.
	
	
	
	}
	
}
