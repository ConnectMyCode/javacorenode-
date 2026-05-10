package com.multithreading.learn;

import java.util.Scanner;

public class PetrolPumpAndCarsTestDemo15 {
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String []carName = new String[3];
		
		for(int i=0 ; i<=2 ; i++)
		{
			System.out.println("Enter Car name:"+i);
			carName[i] = sc.nextLine(); 
			
		}
		
		
		//3 Cars
		CarDmo15 car1 = new CarDmo15(carName[0]);  
		CarDmo15 car2 = new CarDmo15(carName[1]);  
		CarDmo15 car3 = new CarDmo15(carName[2]);  
		
		
		//approach the petrolPump to refill gas 
		//But condition>> Only one refilling machine is there so one car at a time
		
		car1.start();		car2.start();  		car3.start(); 
		
		
		
	}
		
}