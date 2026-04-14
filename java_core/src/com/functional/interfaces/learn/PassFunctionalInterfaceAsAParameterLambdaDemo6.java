package com.functional.interfaces.learn;

public class PassFunctionalInterfaceAsAParameterLambdaDemo6 {

	
	public static void main(String []args) 
	{
		PassFunctionalInterfaceAsAParameterCalculatorDemo6 c1 = num ->num*num*num;
		
		/*Passing functional Interface as a parameter inside a Method: */
		
		findingTheCube(c1);
		
		
	}
	
	
	public static void findingTheCube(PassFunctionalInterfaceAsAParameterCalculatorDemo6 num) 
	{
		System.out.println("Cube is: "+ num.getCube(11));
	}
	
}

