package com.interFaceJDKone.seven.learn;

public class SealedInterfaceDemo3 {

	public static void main(String []args) 
	{	
		
		//Cannot creat a Object of Interface  ERROR:Cannot instantiate the type SealedInterfaceMoveableDemo3
//		SealedInterfaceMoveableDemo3 mv = new SealedInterfaceMoveableDemo3();  
	
		     // Moveable move = new Car();
		SealedInterfaceMoveableDemo3 move = new SealedInterfaceCarDemo3(); 
		
		int speed = move.SPEED; //Dynammic Polymorphism : Compiler: Reference Type Moveable  searcs in Moveable Class  Finds the Public Static Final SPEED Decides ; No ERROR //Accessing Field From Interface 
								//JVM :Executes the Field decided by JVM.
		
		move.move();  //Dynamic Polymorphism : Compiler :Based on Reference Type Moveable Class Search in Moveable Class find the the Exact match ; No ERROR  //Accesing the method from the Car class 
	}				  //JVM: Current Object Creation CAr class Object Searches for move() method in Car class finds it Decides ANd Executes it ;
	
}
