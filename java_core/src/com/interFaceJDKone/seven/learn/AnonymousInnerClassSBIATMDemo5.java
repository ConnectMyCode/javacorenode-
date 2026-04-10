package com.interFaceJDKone.seven.learn;


//This class Cannot be inherited by another class.
final public class AnonymousInnerClassSBIATMDemo5 implements BankDemo5 
{		
	double amount;
					
	
	
	public void deposit(double amount) 
	{
		if(amount == 0) 
		{
			System.out.println("Invalid Aamount entered"+amount);
		}
		else {
			this.amount += amount;			
		}
	}
	
	public void withdraw(double amount) {
		if(this.amount > getBalance() || amount == 0) 
		{
			System.out.println("Insdufficient Balance");
		}
		else 
		{
			this.amount -= amount;			
		}
	}
	
	
	public double getBalance() 
	{
		return amount;
	}
	
}


