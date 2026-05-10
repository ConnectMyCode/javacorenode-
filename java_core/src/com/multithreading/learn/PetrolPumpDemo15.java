package com.multithreading.learn;

public class PetrolPumpDemo15 {

	
	public static synchronized void PetrolFillingMachine(String carName) {
		
		System.out.println(carName + " started refilling...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(carName + " completed refilling...");	
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
