package com.interFaceJDKone.seven.learn;

import java.util.Scanner;  

public class PaymentGatewayDemo1 {
	
									 
	public PaymentDemo1  initiatePayment(String paymentChoice) 
	{
		switch(paymentChoice = paymentChoice.toLowerCase()) 
		{
		  case "upi"->
		  {
			  UPIPaymentDemo1 upi = new UPIPaymentDemo1();
			  return upi;
		}   
		  case "credit"->{ 
			  CreditCardPaymentDemo1 credit = new CreditCardPaymentDemo1();
			  return credit;
		  	}  
		}  
		
		return null;       
	}	
	

}
