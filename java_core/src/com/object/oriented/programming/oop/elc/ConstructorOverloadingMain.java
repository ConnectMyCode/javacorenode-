package com.object.oriented.programming.oop.elc;

import com.object.oriented.programming.oop.blc.ConstructorOverloading;

public class ConstructorOverloadingMain {

	
		public static void main(String args[])
		{
			
			ConstructorOverloading letsPlay = new ConstructorOverloading(123456789L , 1234.0909);			
			System.out.println(letsPlay);     
			  
			ConstructorOverloading letsPlay01 = new ConstructorOverloading(1234.567890 , 123456789L); 			
			System.out.println(letsPlay01);     
			
			ConstructorOverloading letsPlay02 = new ConstructorOverloading("Aryan" , "Ingle");
			System.out.println(letsPlay02);     
			
			ConstructorOverloading letsPlay03 = new ConstructorOverloading(2454.14545 , 789.2313);
			System.out.println(letsPlay03);     
			
			
			ConstructorOverloading letsPlay04 = new ConstructorOverloading(66564.15454f , 366565.11212f);
			System.out.println(letsPlay04);     
		} 
		 
	
	
}







