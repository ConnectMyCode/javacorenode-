package com.polymorphism.learn;

public class instanceofDemo17 {

	
	public static void main(String []args) 
	{
		instanceofVehicleDemo17 veh1 = null; 
		veh1 = new instanceofBMWDemo17();
		getVehicle(veh1); 
		
		veh1= new instanceofFordDemo17(); 
		getVehicle(veh1); 
		
		
		
	}
	
									//Loose Coupling -->This Vehicle parameter can hold Ford and BMW values thoguh of Different class type this is claled Loose COUPLING	
	public static void getVehicle(instanceofVehicleDemo17 vehicle) 
	{
		if(vehicle instanceof instanceofBMWDemo17)  
		{			
			System.out.println("BMW Object");
		}
		else {
			System.out.println("Ford Object");
		}
	}
}
