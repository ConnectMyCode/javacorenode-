package com.object.oriented.programming.oop.blc;

public class MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer
{
	private String balance;   //String is immutable thats why took type string 
	private String customerId ; 
	
	public MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer(String balance , String customerId)  
	{
		this.balance= balance; 
		this.customerId = customerId; 
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
		
		
		
}