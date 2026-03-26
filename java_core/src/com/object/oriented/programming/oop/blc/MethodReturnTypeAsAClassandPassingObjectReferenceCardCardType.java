package com.object.oriented.programming.oop.blc;

public class MethodReturnTypeAsAClassandPassingObjectReferenceCardCardType 
{	
	
	
	
	private MethodReturnTypeAsAClassandPassingObjectReferenceCardCardType() 
	{
		
	}
	
	public static String cardType(MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer customer1)
	{	  
		
		//	CalculateCreditPoints ccp = CalculateCreditPoints(balance);  //Created object before wrtitting in eclipse the class is in my minds just need to import into the class import com.mind.currentthought.learning.java.oops.calculateCreditPoints              
		
	String creditPoints = MethodReturnTypeAsAClassandPassingObjectReferenceCardCalculateCreditPoints.calcualteCreditPoints(customer1);
	
	float creditPointsAssigned = Float.valueOf(creditPoints); //String to float Narrowing using valueOf() ; 
	
	String cardType = ""; 

	if(creditPointsAssigned == 200f)
	{
		cardType = cardType+"Bronze Credit Card";
		return "Card Type: "+cardType+"\nCredit Score: "+creditPointsAssigned;  
	}
	else if(creditPointsAssigned == 500f){ //500 900 2000
		cardType += "Silver Credit Card";
		return "Card Type: "+cardType+"\nCredit Score: "+creditPointsAssigned;
	}
	else if(creditPointsAssigned == 900f){ //500 900 2000
		cardType += "Gold Credit Card";
		return "Card Type: "+cardType+"\nCredit Score: "+creditPointsAssigned;
	}
	else if(creditPointsAssigned == 2000f){ //500 900 2000
		cardType += "Platinum Credit Card";
		return "Card Type: "+cardType+"\nCredit Score: "+creditPointsAssigned; 
	}
	
	return "abc"; 
	
	
	}	
	
	
}	
	
	