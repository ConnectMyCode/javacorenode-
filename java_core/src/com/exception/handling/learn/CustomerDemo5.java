package com.exception.handling.learn;

import java.util.Scanner;

public class CustomerDemo5 {
	
	Scanner sc;
	
	public static void main(String []args)
	{
		clientResult();
		
	}
	
	
	
	public static void clientResult() 
	{
		Scanner ip = new Scanner(System.in);   
		
		System.out.println("Hello Client, Welcome to my Application"); 
		
		
		try {
			System.out.println("Enter value of X and Y");	
			Integer x = Integer.valueOf(ip.nextInt()); 
			Integer y = Integer.valueOf(ip.nextInt()); 
			Integer result = x/y;  
			System.out.println("Result is: "+result); 
		}	
		catch(Exception e)   //Super class so It can handle any type of exception . We can also take specific type of exceptions 
		{
			System.err.println("Please don't put zero!!!");  
		}
		System.out.println("Thank you For Visiting the Application!!!");
		
	}
	

}
