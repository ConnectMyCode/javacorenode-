package com.polymorphism.learn;

public class instanceofDemo16 {

//ALPHA -> BETA -> GAMMA
	public static void main(String []args)
	{
		//GAMMA gamma = new Gamma(); 
		instanceofGammaDemo16 gamma = new instanceofGammaDemo16();
		
		boolean isTrue = gamma instanceof instanceofBetaDemo16; //True
		boolean isTrue1 = gamma instanceof instanceofGammaDemo16;//True
		boolean isTrue2 = gamma instanceof instanceofAlphaDemo16;//True
		
		//Object class : Every object has to pass through the Object class. 
		boolean isTrue3 = gamma instanceof Object; //True
		
		
		
	}
}
