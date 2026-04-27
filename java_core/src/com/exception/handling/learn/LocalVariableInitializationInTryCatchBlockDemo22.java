package com.exception.handling.learn;

public class LocalVariableInitializationInTryCatchBlockDemo22 {

	public static void main(String []args) 
	{
		int x =400;    //Here only declared an initialized so it accessible in try-catch and finally block . 
		
		try 
		{
	//		x= 100;     //inside try initialized x ;  
			System.out.println("Try-Block x:"+x);
		}
		catch(Exception e)	//Compulsory in catch block to re-initilaize if want to access x ; 
		{
//			x=200;
			System.out.println("Catch-Block x:"+x); 
		}
		finally {
//			x=300;
			System.out.println("Catch-Block x:"+x); //Compulsory to reinitialize of want to acces x;			
		}
	}
	
	
}
