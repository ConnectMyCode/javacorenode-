package com.predefined.interfaces.learn;

import java.util.function.Consumer;

public class ConsumerDemo10 {

	//CustomerDemo10(Double pendingBill , Double paidBill , String purchaseItem
	
	public static void main(String []args) 
	{
		Consumer<CustomerDemo10>  c1 = cust -> System.out.println("Customer Details: \n"+"Purrchased Items: "+cust.purchaseItem()+"\nCustomer Paid Bill: "+ cust.paidBill()+ "\nPending Bill: "+ cust.pendingBill());    					
	
	
		CustomerDemo10 customer = new CustomerDemo10(10000D, 5000D, "paint");
		
		c1.accept(customer);
		
		
	} 
	 
	
}	




