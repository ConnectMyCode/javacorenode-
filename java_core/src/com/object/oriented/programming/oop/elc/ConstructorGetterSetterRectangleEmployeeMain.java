package com.object.oriented.programming.oop.elc;
import java.util.*;

import com.object.oriented.programming.oop.blc.ConstructorGetterSetterEmployee;
import com.object.oriented.programming.oop.blc.ConstructorGetterSetterRectangle;

public class ConstructorGetterSetterRectangleEmployeeMain {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		double height = sc.nextDouble(); 
		double width = sc.nextDouble();
		
		ConstructorGetterSetterRectangle construct = new ConstructorGetterSetterRectangle(width,height); 
		
		System.out.println( "Area is: "+construct.getArea());
		System.out.println("Perimeter is: "+construct.getPerimeter()); 
		
		
		
		/*Employee Getter and setter*/
		
		long number  = sc.nextLong(); 
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		
		ConstructorGetterSetterEmployee emps = new ConstructorGetterSetterEmployee(number , name , salary); 
		
		emps.toString();
		sc.close();
		
	} 

}





