package com.object.oriented.programming.oop.elc;

import java.util.Scanner;

import com.object.oriented.programming.oop.blc.DeepCopyDemo1;

public class DeepCopyDemo1Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		/*Shallow copy */
		
		
		System.out.println("deep1 --> OBJECT1 --> propertie --> PRICE:20000");
		DeepCopyDemo1 deep1 = new DeepCopyDemo1(20000);    //OBJECT1 -->> initalizing the NSF with parameterized constructor 

		
		System.out.println("Enter the price for deep2 : ");
		double price = sc.nextDouble();
		
		DeepCopyDemo1 deep2  = new DeepCopyDemo1(); //OBJECT2   -->> initializing the NSF with default no args constructor to price =0.0;  defined by the developer inside the class not by compiler ; later when we pass a value in setPrice the value is modified 
		
		
		
		deep2.setPrice(price);  //copying the price of deep1--> Object1    into    deep2-->Object2-->into ---->price{nsf} . This is deep copying. 
		System.out.println("deep2.setPrice(price)"+deep2.getPrice());   
	
		
		
	    deep2.setPrice(deep1.getPrice());   	
	    System.out.println("deep2.setPrice(deep1.getPrice())"+deep2.getPrice()+"Updating object2 propertie --> price to 20000");   
		
	System.out.println( "deep1 --> OBJECT1 : "+deep1.getPrice()); 
	System.out.println("deep2 --> OBJECT2 : "+ deep2.getPrice());
		/*Deep Copy*/
		
		
	}
}
