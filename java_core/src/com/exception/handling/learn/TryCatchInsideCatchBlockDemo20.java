package com.exception.handling.learn;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/*Wrtiing try-catch inside   >>>1. Catch(){}   block    2.finally{} Block*/
public class TryCatchInsideCatchBlockDemo20 {

	
	public static void main(String []args)
	{	
		System.out.println("main Methodd Started"); 

		
		Scanner sc= new Scanner(System.in);	
		
		
		try(sc)
		{
			System.out.println("Enter your Roll.No:");
			int roll = sc.nextInt();
			System.out.println("Your ROLL is :"+roll);
		}
		catch(InputMismatchException e) 
		{
			System.err.println("Provide Valid Input!!"); 
			
			try {
				System.out.println(10/0); 
			}
			catch(ArithmeticException e1)
			{
				System.err.println("Divide By Zero Problem");
			}
		}  
		finally 
		{
			System.out.println("Finally block");   
			try{
				Object []abj = new Object[3];				
			
				try {
					abj= new Object[3];
					abj[0] = 12;
					abj[1] = 4;
					abj[2] = 45;				
				}
				catch(ArrayStoreException e)
				{
					System.err.println("Invavlid element so cannot store in array");
				}
				finally 
				{
					System.out.println("Array: "+Arrays.toString(abj));   				
				}
			}
			catch(NegativeArraySizeException e)      
			{
				System.out.println("Negative Size of Array Not Allowed Only positive Integer allowed");
			}
			
		}
		
		
		System.out.println("main Methodd ended"); 
		
		
	}			
	
	
}
