package com.polymorphism.learn;

public class DownCastingDogDemo9 extends DownCastingAnimalDemo9{

	@Override
	public void sleep() 
	{
		System.out.println("Generic Animal is Sleeping");
	}
	
	public void bark()     // -->This method/behaviour is unique to just this class  
	{
		System.out.println("Dog is barking...!"); 
	}
	
	
}
