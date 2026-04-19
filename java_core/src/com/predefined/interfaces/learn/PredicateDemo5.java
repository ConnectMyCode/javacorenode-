package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo5 {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		//Verify wether a name starts with 'A' or not
		//Predicate<String> str = name-> name.charAt(0) =='A';
								// boolean Test(T t){}
		Predicate<String> str = name->name.startsWith("A");  
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
	boolean isTrue = 	str.test(name); 
		
	
	if(isTrue)
	{
		System.out.println("Name starts with 'A' "+ name);
	}
	else {
	System.out.println("Name does not starts with 'A' "+ name);	
	}
	
	}
	
	
}
