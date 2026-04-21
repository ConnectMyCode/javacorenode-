package com.exception.handling.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practise1 {
	
	public static void main(String []args)
	{
		System.out.println("Enter Age: \n");	
		Scanner sc= new Scanner(System.in);
		
		Integer age = sc.nextInt();   //Declared inside try{} block then it becomes a local variable whose life is only within try{} block.
		try
		{
		 if (age <=0 || !(age instanceof Integer))  //if age is greater than 0 and of int type then  no need to execute if block
		 {
			 throw new InputMismatchException();
		 }   
		}
		catch(InputMismatchException e)   
		{
			System.out.println("Cannot enter age as negative number");
		}
		
		if(age >= 18) {
			System.out.println("Eligible to Drive");
		}
		else {
			System.out.println("Not elgible to drive");
		}
	}
	
	
	
	
	
}
