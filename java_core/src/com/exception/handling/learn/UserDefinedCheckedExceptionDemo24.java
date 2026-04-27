package com.exception.handling.learn;

import java.util.Scanner;

public class UserDefinedCheckedExceptionDemo24 {
	
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			Integer age = sc.nextInt();
			sc.nextLine();
			
	//		System.out.println("Try Block");
			Validation(age);
			System.out.println("Try Block Finished");
							
		}
		catch(NumberFormatException e) 
		{
		//	System.out.println("Inside catch block");
			System.out.println("Only number allowed");
		}
		catch(InvalidAgeExceptionDemo24 e) 
		{
	//		System.out.println("Inside catch block");
			System.out.println(e.getMessage());
		}
	}
	

	
	public static void Validation(Integer age)  throws InvalidAgeExceptionDemo24
	{
		
		if(age<=18)
		{		
	//		System.out.println("Inisde if block");
			//Checked Exception Created by user HOW? >>> InvalidAgeExceptionDemo24 class extends Exception (Exception has both unchecked and checked exceptions) so it is compulsory to handle this exception using 1.throws 2.try-catch block.   
			throw new InvalidAgeExceptionDemo24(" Not eligible for Vote. ");
		}
		else 
		{
			System.out.println("You are eleigible for Voting");
		}
		System.out.println("Validation Over");
	}
	
	
}
