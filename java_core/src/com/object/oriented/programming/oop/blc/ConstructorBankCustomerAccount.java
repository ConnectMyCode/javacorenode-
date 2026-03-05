package com.object.oriented.programming.oop.blc;



public class ConstructorBankCustomerAccount {
	
	/*Disciplined Thinking : Everytime dont start coding think about a scenario about what is asked and how then aprroach the problem and think how the client is giving input and how to properly recieve those inpiuts , and use store them, */
	/*---non static private---*/
	private String customerName;
	private int customerAccountNumber;
	private double customerCurrentBalance;
	
	/*--static public----*/
	static String bankName ="RBI";
	static String bankAddress = "New Delhi";
	static String bankIFSCCode = "RBIAMPQ12390000";
	
	
	
	/*public void setCustomerDetails(String name , int accNumber , double balance); 
	 *public void withdraw(double amount);
	 *public void deposit(double amount);
	 *public double getCurrentBalance(); //no parameter 
	 *public String displayDetails(); //no parameter
	 * 
	 */
	
	/*Initialization --> setCustomerDetails()*/
	/*Buisness logic --> Withdraw() and Deposit()*/
	/*Access Methods --> Get CurrentBalance()*/
	/*Utility/Presentation Method ---> dsiplayDetails()*/
	
	
	
	/*Initialization --> setCustomerDetails()*/
	public void setCustomerDetails(String name , int accountNumber , double balance){
		customerName = name;
		customerAccountNumber= accountNumber;
		if(balance == 0 || balance <0){
			System.err.println("Error: Balance equals zero or negative not allowed");
			System.exit(0);
		}
		else{
			customerCurrentBalance = balance;} 
		
	}
	
	
	public void withdraw(double amount){
		if(amount>customerCurrentBalance){
			System.err.println("Error: You have insufficient balance");
			System.exit(0);
		}
		else{
			customerCurrentBalance = customerCurrentBalance-amount;
			System.out.println("Withdraw amount is: "+amount+"\n"+"Available balance is"+customerCurrentBalance);
		}
	}
	
	
	public void deposit(double  amount){
		if(amount ==0 || amount<0){
			System.err.println("Error: Invalid amount entered");
		}
		else{
			customerCurrentBalance = customerCurrentBalance+ amount;
			System.out.println("Amount Deposited:"+amount+"Current Balance is: "+ customerCurrentBalance);
		}
	}
	
	/*Utility/Presentation Method or Behaviour*/
	public void getCurrentBalance(){
		System.out.println("Current Balance is: "+customerCurrentBalance); 
	}
	
	public String displayDetails(){
		return "{"+" Bank Name: "+bankName+" Customer Name :"+customerName+" Balance Amount: "+customerCurrentBalance+"\n";
	}
	
	
	
	
	
	
	
}	
