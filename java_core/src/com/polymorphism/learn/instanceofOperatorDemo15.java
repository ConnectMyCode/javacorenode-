package com.polymorphism.learn;

public class instanceofOperatorDemo15 {
	
	
	public static void main(String []args)
	{
		instanceofOperatorTestDemo15 test= new instanceofOperatorTestDemo15();
		
		if(test instanceof instanceofOperatorTestDemo15) 
		{
			System.out.println("Yes test  referrence variable is of type Test class");
		}
		else {			
			System.out.println("No test is not  referrence variable  of type Test class");
		}
	}
}

