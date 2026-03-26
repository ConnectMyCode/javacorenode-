package com.object.oriented.programming.oop.elc;
import java.util.*;

import com.object.oriented.programming.oop.blc.ShallowCopyDemo1; 
public class ShallowCopyDemo1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		
		ShallowCopyDemo1 dem1 = new ShallowCopyDemo1(price); //3000; 
		ShallowCopyDemo1 dem2 = dem1;     //SHALLOPW COPY   : multiple reference variable pointing to Single object;  dem2 store addrres of object and dem1 already had the addreess of the object so it just got assinged to dem2 ;     
		
		System.out.println(dem1.getPrice()); //3000 	 
		System.out.println(dem2.getPrice()); //3000 
		
		dem2.setPrice(90000);  //Updated price using "dem2" reference variable 
		
		System.out.println(dem1.getPrice()); //90000; 	 
		System.out.println(dem2.getPrice()); //90000;  
		
		
		//BOTH are pointing to the same memory location if using any one we change anything in object properties then object  properties is changed. 
		
		
		
		
	}
	
}
