package com.object.oriented.programming.oop.blc;

public class InstanceBlockOrNonStaticBlockORInstanceInitializerExample2 {
	
	/* int x ;>  It is a non static field so it will be saved in the layer 2 Data 
	 * also , instance/Non static block is in layer-2 Data. 
	 * so there is no kind of any error . 
	 * 
	 * 
	 * 1.Class "InstanceBlockOrNonStaticBlockORInstanceInitializerExample2" loaded
	 * 2.Object is created "OBJ1" at location-> 1000x , referenced by-> "instanceBlock1" 
	 * 3.During creation of the object  in the constructor body compiler will add "Super()" keyword in 1st line
	 * 		and in the second line it will place the non static members(instance block and variables)
	 * 4.These will be executed first int x = 100 ; and then non static block. 
	 * 5.As the non static field and block have the same priority it will be executed int he order of top to bottom . 
	 * 6.Every object is created these non static block will be executed;  
	 * 	 * */ 
	
	public InstanceBlockOrNonStaticBlockORInstanceInitializerExample2()
	{
		System.out.println("Ye sahi nahi hua i should get the first piority but super() and non staic block is getting priority");
		int x= 400;    /*Method level variable -> local variable --> local scope*/
		System.out.println(this.x); //Class level -> instance field    
		System.out.println(x);
	}
	
	
	int x;  //non static field  
	
	{ //purpose of the block :-> Initialize the non static fields ; 
		x= 9000; 
		System.out.println("x value is :"+x ); 
		System.out.println("Object creation is in progress"); 
	}
	
	
}
