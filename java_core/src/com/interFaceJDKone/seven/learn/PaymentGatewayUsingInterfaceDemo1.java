package com.interFaceJDKone.seven.learn;

import java.util.Scanner;

public class PaymentGatewayUsingInterfaceDemo1 {
	
	
	public static void main(String []args){
		
		Scanner sc= new Scanner(System.in);
		
		
		String paymentChoice;
		System.out.println("Enter the payment choice: \n 1.upi  \n  2.credit  ");
		
		paymentChoice  = sc.nextLine();
		sc.close();
		
		
		PaymentGatewayDemo1 gate1 = new PaymentGatewayDemo1();  // Class object "PaymentGatewayDemo1".  
		PaymentDemo1 Paymentprocess = gate1.initiatePayment(paymentChoice);  //"PaymentGatewayDemo1"Class  Object returns a UPI Or Credit Object depending on the User input here "PaymentDemo1"class is Interface and is implemented by UPI & Credit Object So IF AN object of UPi Or CREDIT is created then it can be saved in "PaymentDemo1" Reference Variable. 
	
		if(Paymentprocess instanceof UPIPaymentDemo1 upi)  //Downcasting and Verifying done in a single line of code
		{	System.out.println("UPI Payment is initiated!");
			upi.processPayment();
			upi.applyDiscount();
			upi.freeCoupon();
		}
		else if(Paymentprocess instanceof CreditCardPaymentDemo1 credit) 
		{
		    System.out.println("Credit Payment is initiated");
		    credit.processPayment();
		    credit.applyDiscount();
		    credit.freeCoupon();
		}
		
	}

	
	
	
}
