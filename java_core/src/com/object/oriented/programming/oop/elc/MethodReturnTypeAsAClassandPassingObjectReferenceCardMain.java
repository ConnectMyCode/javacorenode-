package com.object.oriented.programming.oop.elc;
import java.util.*;

import com.object.oriented.programming.oop.blc.MethodReturnTypeAsAClassandPassingObjectReferenceCardCardType;
import com.object.oriented.programming.oop.blc.MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer;

public class MethodReturnTypeAsAClassandPassingObjectReferenceCardMain
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		 String balance = sc.next();
		 String customerId = sc.next();
		 
		 
		MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer cust1  =  new MethodReturnTypeAsAClassandPassingObjectReferenceCardCustomer(balance , customerId);  
		
		String cardType = MethodReturnTypeAsAClassandPassingObjectReferenceCardCardType.cardType(cust1);
		
		System.out.println(cust1);
		System.out.println(cardType);
		
		 
		
	}	
}		
