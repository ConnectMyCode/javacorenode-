package com.exception.handling.learn;

import java.util.Scanner;

public class ThrowAndThrowsDiffDemo23 {
		
	public static void withdraw(String amount)  throws LowBalanceExceptionDemo23
	{
		int enteredAmount = Integer.valueOf(amount);
		
		
		
		/*Validation and Giving correct output message to the user. */
		if(enteredAmount <= 0 ) 
		{				//Checked Exception Created by user HOW? >>> IllegalArgumentException class extends Exception (Exception has both unchecked and checked exceptions) so it is compulsory to handle this exception using 1.throws 2.try-catch block.   
			throw new IllegalArgumentException("Invalid Ammount entere only numbers no special characters and negative values allowed.");    
		}
		if(enteredAmount >0 && enteredAmount <=1000) 
		{
			//user-defined Exception. Hoow to become a  user-defined Exception?  :-> If the class extends Exception Or Simply becomes the part of Exception Hierarchy.
			throw new LowBalanceExceptionDemo23("Account has less Balance");    //throws a checked Exception need to handle it compulsory
		}
		
		
		/* Buisness Logic executes after validation is complete: */ 
	 	
	 	
		
	}
	 	
		
	 	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a amount to withdraw: "); 
		
		String amount = sc.next();		
		
		try(sc)
		{
			withdraw(amount);			
		}		
		catch(LowBalanceExceptionDemo23 e){  
			e.getMessage();
		}
		catch(IllegalArgumentException e) 
		{
			e.getMessage();
		}
	}
	
	
	
}
