package com.functional.interfaces.learn;

public class PassFunctionalInterfaceAsAParameterLambdaDemo7 {
	
	
	public static void main(String []args) 
	{
		/*Lambda function also automatically return the value */
														//	public void getCuube(int num)		
		PassFunctionalInterfaceAsAParameterCalculatorDemo7  calci = num -> num*num*num;      //In heap memory Lightweight Object is created by lambda 
		
		findingCube(calci);		
	}
			
									//Tight Coupling  because it can only accept Target Type Calculator Functional Interface. 
	public static void findingCube(PassFunctionalInterfaceAsAParameterCalculatorDemo7 calci)  
	{
		System.out.println("Cube is: "+ calci.getCube(90));		
	}									//Dynnamic polymorphism : Compiler based on Reference Type Calculator Interface searcches in that interface for method : "getCube()" present : No Error
																  // JVM based on Current Object created Lightweight lambda object >>>> 

}

