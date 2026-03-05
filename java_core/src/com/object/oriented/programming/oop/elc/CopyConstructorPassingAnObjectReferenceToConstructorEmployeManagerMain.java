package com.object.oriented.programming.oop.elc;
import java.util.Scanner;

import com.object.oriented.programming.oop.blc.CopyConstructorPassingAnObjectReferenceToConstructorEmployee;
import com.object.oriented.programming.oop.blc.CopyConstructorPassingAnObjectReferenceToConstructorManager; 
public class CopyConstructorPassingAnObjectReferenceToConstructorEmployeManagerMain { 
	
	public static void main(String []args)
	{	
		Scanner sc = new Scanner(System.in); 
		String employeeName = sc.next();
		String employeId = sc.next();
		
		CopyConstructorPassingAnObjectReferenceToConstructorEmployee starEmployee = new CopyConstructorPassingAnObjectReferenceToConstructorEmployee(employeeName , employeId);	  
																																									
		CopyConstructorPassingAnObjectReferenceToConstructorManager manager = new CopyConstructorPassingAnObjectReferenceToConstructorManager(starEmployee);    
		
		
		System.out.println(starEmployee); 
		starEmployee = null;
		
		/*So i gave 'null' literal value to the reference variable so the object: lets say at 1000x was created referenced by 'staremployee' no is assignred null so that object is now eligible for Gatage collection */
		
		System.gc();
		
		System.out.println(starEmployee);  
		System.out.println(manager);  
		
		
		
		
	}
}
