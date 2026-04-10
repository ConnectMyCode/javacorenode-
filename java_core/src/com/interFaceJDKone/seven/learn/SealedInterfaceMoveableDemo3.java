package com.interFaceJDKone.seven.learn;


//sealed : Only the classes that are permitted by the "Moveable" Interface/Contract will be allowed to implement this interface if without permission it is implemented then it will Give error
public sealed interface SealedInterfaceMoveableDemo3 permits SealedInterfaceCarDemo3{

	
	//Fields are by default public ,static , Final 
	
	//Methods are by default abstract and public , 
					
					
	int SPEED =90;	
	
	void move();        
					
					
}
