package com.interFaceJDKone.seven.learn;

//non-sealed: This class can be inherited by an class so restrcitions
non-sealed public class SealedInterfaceCarDemo3 implements SealedInterfaceMoveableDemo3{
//This class implements Moveable Interface so the FIelds and Methods are available to this Car class to access 
	//It is compulsory to override the Abstract method;
	
	
	
	public void move() 
	{
		System.out.println("Speer of the car is "+ SPEED);
	}
	
	
}
