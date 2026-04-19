package com.predefined.interfaces.learn;

import java.util.Scanner;

public class LambdaDemo2 {

	public static void main(String []args) 
	{
		Scanner sc= new Scanner(System.in);
		 
		PredictableInterfaceDemo2 p = age -> age>=18;    //return type of the method is boolean true / false 
		
		System.out.println("Enter your age: ");
		int userAge = sc.nextInt();
				
		System.out.println("Eligible for voting :"+ p.predict(userAge));  
		
		
		
	}
}




