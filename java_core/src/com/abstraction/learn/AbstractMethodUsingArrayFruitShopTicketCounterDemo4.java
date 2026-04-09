package com.abstraction.learn;

public class AbstractMethodUsingArrayFruitShopTicketCounterDemo4 {
	
	final private String fruitChoice ;
	
	//This class Is a Ticket Counter WHere the Customer Request is processed and a Coupon is generated (Object Of  Chosen Fruit --> Apple, Orange); this is returned to the customer 
	
	public AbstractMethodUsingArrayFruitShopTicketCounterDemo4(final String fruitChoice) 
	{
		this.fruitChoice = fruitChoice;     
	}
	
	
	 public AbstractMethodUsingArrayFruitDemo4 generateCoupon() 
	 {	
		      
		final String fruitSelected = this.fruitChoice.toLowerCase();	
		 
		if(fruitSelected.equalsIgnoreCase("orange")) 
		{
			return  new AbstractMethodUsingArrayOrangeDemo4();   
		}
		else if(fruitSelected.equalsIgnoreCase("apple")) 
		{
			return new AbstractMethodUsingArrayAppleDemo4();    
		}
		
		return null;
	 }
	
	
}
