package com.object.oriented.programming.oop.elc;

import java.util.*;

import com.object.oriented.programming.oop.blc.CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct;


public class CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProductMain  {
	
	
	public static void main(String []args){
		
	
	Scanner sc = new Scanner(System.in);
	
	String productName = sc.next();
	double productPrice = sc.nextDouble();
	
	/*Using object1 reference(prod1)   initializing the object2 properties by passing the object1 reference 'prod1' in constructor of object2 while creating the object2*/ 
	CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct prod1 = new CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct(productName , productPrice);  
	CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct prod2 = new CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct(prod1); //passing an object reference in To Constructor   
	
	
	
	/*If i write sysout in the class level it gives error we can write only inside the block why? */
	System.out.println("prod1: "+prod1); //op :  [lenovo , 45000]
	System.out.println("prod2: "+prod2); //op :  [lenovo , 45000]  //Deepcopy
	}
	
}

