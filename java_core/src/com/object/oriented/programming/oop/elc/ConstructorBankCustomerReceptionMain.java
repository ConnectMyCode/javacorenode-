package com.object.oriented.programming.oop.elc;
import com.object.oriented.programming.oop.blc.*;
import java.util.*;
import java.lang.*;
public class ConstructorBankCustomerReceptionMain {
	public static void main(String args[]) {
		/*1st customer came at 9:00Am ---> "bankCustA" */		
		Scanner sc = new Scanner(System.in); 
		
		ConstructorBankCustomerAccount bankCustA = new ConstructorBankCustomerAccount();  
		
		System.out.println("========Welcome to ICICI Bank==========\n\n");
		
		System.out.println("Enter Customer Name: ");
		String cstName=sc.next();
		
		System.out.println("Enter Account Number: ");
		int cstAccountNum = sc.nextInt();
		
		System.out.println("Enter Opening Balance: ");
		double cstBalance  = sc.nextDouble();
		
		
		/*Setting the Customer Details : */
		bankCustA.setCustomerDetails(cstName, cstAccountNum, cstBalance);
		
		
		
		System.out.println("======MENU=======");
		
		System.out.println("1.Deposit"); 
		System.out.println("2.Withdraw"); 
		System.out.println("3.Check Balance"); 
		System.out.println("4.Display Customer Details"); 
		System.out.println("5.Exit");
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		
		/*Client Interaction*/
		while(choice!=5){
			switch (choice){			
			case 1->{//deposit amount
				System.out.println("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				bankCustA.deposit(depositAmount);
			}
			case 2->{ 
				System.out.println("Enter Withdraw amount:");
				double withdrawAmount =sc.nextDouble();
				bankCustA.withdraw(withdrawAmount);
			}
			case 3->{
				bankCustA.getCurrentBalance();
			}
			
			case 4->{
				System.out.println(bankCustA.displayDetails());
				}
			case 5->{
				choice = 5;
				}
			}
			System.out.println("======MENU=======");
			
			System.out.println("1.Deposit"); 
			System.out.println("2.Withdraw"); 
			System.out.println("3.Check Balance"); 
			System.out.println("4.Display Customer Details"); 
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
		}
		
		System.out.println("Thank you for banking with RBI BANK\n"); 
		
		
		
		
		
		
		
		
	}	
}
