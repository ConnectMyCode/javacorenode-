package com.exception.handling.learn;

import java.util.Scanner;

public class SingleTryWithMultipleCatchBlocksDemo8 {

	
	public static  void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			
			int index = sc.nextInt();
			int []arr = new int[index]; //NegativeArrayIndexExceotion
			
			System.out.println(arr[0]);  
			int x = 10/0;			//ArithemticException 
			
			
			System.out.println("Enter a name:");
			String name = new String("Suraj");
			Integer num = Integer.valueOf(name);  //NumberForatException 
			
			
			
			
		}
		catch(NegativeArraySizeException  e)    
		{	
			System.out.println("Array Size cannot be negativel only positive!!");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divede anumber by Zero");
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Cannot convert String to Integer Type");
		}
		
		System.out.println("Main Method ended.");
	}
	
	
	
	
}


// Runtime:   I/P:  -2     arrays size negative >>   NegativeArraySizeException Object Create 
//					   	>> control goes out of -> try block -> Remaining line of code not executed of try block  
					//	>> JVm searches for  Exact mathc   1.  NegativeArraySizeException Object    2. Catch( NegativeArraySizeException Object)     match found 
					//  >> Exceutes Catch Block > prints catch block message
//						>>> Normally Terminates >>> Means? >> Executes next line of code After try-catch block .  


//NOTE: Only 1 Error is handled at a Time so user does not gets overwhelmed




