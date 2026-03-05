package com.object.oriented.programming.oop.elc;

public class ConstructorMCQMain {

	public static void main(String args[])
	{
		int number = 1;
		String letters  = "abc";
		number = number(number);
		letters = letters(letters);
		System.out.println(number + letters);
		int original1 = 10; 
		int original2 = 20; 
		swap(original1,original2); 
		System.out.println(original1);
		System.out.println(original2);
	}
	
	
	public static void swap(int a , int b){
		int temp = a;
		 a = b;
		b= temp; 
		
	}
	public static int number(int number)
	{
		number++; 
		return number; 
		
	}
	public static String letters(String word)
	{
		word += "d";  //String is Immutable Object; 
		System.out.println(word);
		return word; 
	}
	
	
	
	
}
