package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo6 {

	public static void main(String []args) 
	{	
		//Verify wether a student is pass or fail;
		
		Scanner sc = new Scanner(System.in);
		Predicate<StudentRecordCommon> p3 = student -> student.marks()>=60;  
		//If marks <= 75 fail else true
		
		System.out.println("Enter marks: ");
		Double stMarks = sc.nextDouble();
		
		//Creating a object of  Record class 
		StudentRecordCommon raj =  new StudentRecordCommon(12 ,stMarks , "Raj");
		
		boolean isPass =  p3.test(raj); 
		
		
		if(isPass) {
			System.out.println(raj.name()+" Passed with marks: "+raj.marks());
		}
		else 
		{
			System.out.println(raj.name()+" Failed with marks: "+raj.marks());
		}
	} 
		
}