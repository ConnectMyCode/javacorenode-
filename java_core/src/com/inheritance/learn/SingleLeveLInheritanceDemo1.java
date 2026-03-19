package com.inheritance.learn;

public class SingleLeveLInheritanceDemo1 {
	
	public static void main(String []args) 
	{
		Dog dog = new Dog();
		dog.roam(); //Accessing the supercalss method using object reference 
		dog.bark();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		
		Animal animal = new Animal(); 
		//animal.bark();  //Errro : bark() ,ethod is undefined  WHY: cannot access the child class properties fomr the Parent claass; 
	}

}

class Animal
{
	public void roam() 
	{
		System.out.println("Inside the Roam Method of Super class "); 
 	}
}



class Dog extends Animal 
{
	public void bark() 
	{
		System.out.println("Dog is barking inside theod of  sub class : dog");
	}
}