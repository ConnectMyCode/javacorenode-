package com.polymorphism.learn;

public class LooseCouplingUpiPaymentDemo14 extends LooseCouplingPaymentGatewayDemo14
{
	
	public String challenge() 
	{
		return "You have won a Earbuds set @999 by comleting challenge of 30 Transacetions in a day.";
	} 
	
	
	
	public String message() 
	{
		return "UPI payment Gateway started!";
	}
}
