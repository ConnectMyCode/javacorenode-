package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInterfacePredefinedFunctionDemo4 {

	
	public static void main(String []args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Verifying a no..is even or odd
	
	
	//Interface  Object cannot be created  we can access the SAM of Interface using lambda function 
	//	Predicate<Integer> p1 =new Predicate<>();  
	//Error :Cannot instantiate the type Predicate
		
		
	Predicate<Integer> p2 =num -> num%2 ==0;
	/*SEE DECLARATION OF "PREDICATE"*/	
	
	int number = sc.nextInt();
	
	boolean isEven = p2.test(number);
	
	if(isEven) 
	{ 
		System.out.println("Even Number "+number);
	}
	else {
		System.out.println("Odd Number "+number);
	}
	
}	
}
