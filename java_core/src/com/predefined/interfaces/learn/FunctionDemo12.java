package com.predefined.interfaces.learn;

import java.util.function.Function;

public class FunctionDemo12 {
	
	public static void main(String []args) 
	{
		//    public record CompanyRecordsDemo12(Double sells , Double toatlInvestment , String CompanyName)
		 														//	return  Double;  Automatically will be returned
		 Function<CompanyRecordsDemo12 , Double> fn2 = company ->  company.sells() - company.toatlInvestment() ; /*return profit;*/  
		 //Input : <T> : CompanyRecordsDemo12    
		 //Return: <R> : Double 
		 CompanyRecordsDemo12 company = new CompanyRecordsDemo12(1200000D, 100000D ,"Maaza");
		  
		 Double profit = fn2.apply(company);  //I have set the return type to Double So I  will have to store the value in Double data type. 
		 
		 System.out.println("Comany Details: "+ "\nCompany name: "+ company.CompanyName()+"\nSells:"+company.sells()+"\nCompany Investment:"+company.toatlInvestment()+"\nProfits: "+profit);
		 
		 
		 
		 
	}
}
		