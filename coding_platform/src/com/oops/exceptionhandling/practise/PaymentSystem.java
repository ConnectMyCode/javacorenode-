package com.oops.exceptionhandling.practise;

import java.util.Scanner;

/*Sealed + Exception Handling*/

public class PaymentSystem {

	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);	
		
		String userName = sc.nextLine();
		
		System.out.println("Enter a payment choice: \n 1.CreditCardPayment  \n 2.UPIPayment   \n3. WalletPayment   ");
		int choice =sc.nextInt();
		
		
		
		switch(choice)
		{
		case 1 -> 
		case 2 -> 
		case 3 ->
		}
		
		
	}
	
}
