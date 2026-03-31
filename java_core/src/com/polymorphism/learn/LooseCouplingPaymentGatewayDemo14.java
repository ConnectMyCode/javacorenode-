package com.polymorphism.learn;

public class LooseCouplingPaymentGatewayDemo14 {


	 // abstract  String message();   -->Advance concpet : -> If there is a method taht  is common in all the subclasses then we can created a abstract method in super class it deiosnot have the method body

	public String message() 
	{
		return "Welcome to the Payment Gateway Chose the Payment Gateway you want to continue>>>";
	}
}
