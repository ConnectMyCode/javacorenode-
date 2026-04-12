package com.interFaceJDKone.seven.learn;

public class InterfaceDefaultMethodsBikeDemo11 implements InterfaceDefaultMethodsVehicle01Demo11{
		
	//Default = Choice If want to override or use as it  is . 

	@Override
	public void run() 
	{
			System.out.println("Car is Running in BIKE Lane Implementing Vehicle Rules ");
	}
	
	@Override
	public void horn() 
	{
		System.out.println("Car is giveing horn in BIKE Lane Implementing Vehicle Rules ");		
	}
	
	
	
	
	
	
	//default :ERROR: Cannot decarease the visibility of the Inherited Method From Interface Vehicle

	@Override
	public void m1() 
	{
		System.out.println("Method Overriding  of M1() INside Class Bike ");
	}


}
