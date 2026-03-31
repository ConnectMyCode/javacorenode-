package com.polymorphism.learn;

public class MethodOverridingVaraibleHidingInstanceFieldMethodDemo5 {
	
	
	public static void main(String []args) 
	{
	    // RBI bank = new SBI(); 
		MethodOverridingVaraibleHidingInstanceFieldMethodRBIDemo5 rbi = new MethodOverridingVaraibleHidingInstanceFieldMethodSBIDemo5();
		
		System.out.println(rbi.ifscCode+" "+rbi.loan());
		
		//o/p:-> RBIIND00001        SBI Bank provide loan to the customer @9.8 ROI
		
		//rbi.ifsc --> NSF --> Executed based on Reference Type 
		//rbi.loan() --> NSM -->Executed by JVM based on Current Object 
		
		
		
	}
}
