package com.object.oriented.programming.oop.blc;

public class MethodReturnTypeAsAClassandPassingObjectReferenceCardCalculateCreditPoints  
{
	private MethodReturnTypeAsAClassandPassingObjectReferenceCardCalculateCreditPoints()
	{
		
	} 
	
	public static String calcualteCreditPoints(MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer customer1)
	{
		double balance = Double.valueOf(customer1.getBalance()); //ERROR Possible  
		
		String creditPoints;  
		
		if(balance <30000)  
		{
			creditPoints = "200";     
			return creditPoints;           
		}
		else if(balance < 50000)  
		{
			creditPoints = "500";
			return creditPoints;
		}
		else if(balance < 80000)  
		{
			creditPoints = "900";
			return creditPoints;
		}
		else if(balance > 100000)  
		{
			creditPoints = "2000";
			return creditPoints;
		}
		return " "; 

	}
	
	
}
