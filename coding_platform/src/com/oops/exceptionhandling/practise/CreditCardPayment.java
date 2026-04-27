package com.oops.exceptionhandling.practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//cant be inherited further : final 
final public class CreditCardPayment 
{
	public static void CreditCardPayment( String userName ) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Card number");
		
		try 
		{
			Long cardNumber = sc.nextLong(); //NumberFormatException
			String cardHolderName ;
			
			
		}
		catch(NumberFormatException e)    //If Input given wrong then give message       
		{
			System.out.println("Invalid Card Number please check the number does not contain any characters . Only Numbers are allowed.");
		}
		
		
/*?Does it really :sc*/		try(sc)  //Automatically sc resaource gets closed after the try catch block
		{
			
			
			
			
			BufferedReader rd = new BufferedReader(new FileReader("C:\\java_core_workspace\\coding_platform\\src\\com\\oops\\exceptionhandling\\practise\\CredentialsDatabse"));					
			
			
			
			try 
			{
				
			}
			catch() 
			{
				
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File Does not exits with name: CredentialsDatabse.txt");
		}
	}
	
	
} 
