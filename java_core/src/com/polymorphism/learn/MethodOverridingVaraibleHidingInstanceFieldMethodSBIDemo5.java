package com.polymorphism.learn;

public class MethodOverridingVaraibleHidingInstanceFieldMethodSBIDemo5 extends MethodOverridingVaraibleHidingInstanceFieldMethodRBIDemo5{
	
	protected String ifscCode = "SBIIND00001";
	
	@Override
	public String loan() 
	{
		return "SBI Bank provide loan to the customer @9.8 ROI"; 
	}
	
	
}
