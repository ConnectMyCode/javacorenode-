package com.functional.interfaces.learn;

public class PassFunctionalInterfaceAsAParameterLambdaDemo7 {
	
	
	public static void main(String []args) 
	{
		/*Lambda function also automatically return the value */
		
		PassFunctionalInterfaceAsAParameterCalculatorDemo7 calci = num -> num*num*num;
		
		findingCube(calci);
		
		
	}
	
									//Tight Coupling  because it can only accept Target Type Calculator Functional Interface. 
	public static void findingCube(PassFunctionalInterfaceAsAParameterCalculatorDemo7 calci)
	{
		System.out.println("Cube is: "+ calci.getCube(90));		
	}

}

