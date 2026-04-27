package com.exception.handling.learn;


import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesAutomaticClossingFacilityDemo18 {

	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			
			System.out.println("Enter your Pin: ");
			 int pin = sc.nextInt();  
			 System.out.println("Your Salary is: "+ 10000); 
		}
		catch(InputMismatchException m) 
		{
			System.out.println("Input is not in a proper Format");
		}
		
	}
	
	
	

	
}
