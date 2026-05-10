package com.multithreading.learn;

public class CarDmo15 extends Thread{
	
	
	private String name;
	
	public CarDmo15(String name) 
	{
		this.name = name;
	}
	
	
	@Override
	public void run() 
	{
		
		PetrolPumpDemo15.PetrolFillingMachine(name);
		
		
		
	
	}
	
	
}
