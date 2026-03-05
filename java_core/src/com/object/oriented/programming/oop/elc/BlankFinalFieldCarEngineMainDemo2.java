package com.object.oriented.programming.oop.elc;

import com.object.oriented.programming.oop.blc.BlankFinalFieldCarDemo2;

import java.util.*; 

public class BlankFinalFieldCarEngineMainDemo2 {
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int model = Integer.parseInt(sc.next());
		String name = sc.next(); 
		BlankFinalFieldCarDemo2 car =new BlankFinalFieldCarDemo2(model , name);
		System.out.println(car);
	}
}

