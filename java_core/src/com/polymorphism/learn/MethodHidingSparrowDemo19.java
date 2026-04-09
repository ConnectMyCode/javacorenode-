package com.polymorphism.learn;

public class MethodHidingSparrowDemo19 extends MethodHidingBirdDemo19{

	String color = "brown"; //NSF
	
	public static void fly() //SM static Method -->Similar method as the super class so this
	{						//Fly() method is stored in method area and already there is a method wth same name present 
							//2 methods woth smae method signature  and static -->Method Hiding;
		System.out.println("Sparrow Bird is Flying");
	}
	
	
}
