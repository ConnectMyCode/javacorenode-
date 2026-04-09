package com.abstraction.learn;

public class AbstractMethodAsABuisnessRuleBirdDemo3 extends  AbstractMethodAsABuisnessRuleAnimalDemo3{
	
	public  AbstractMethodAsABuisnessRuleBirdDemo3(String name) 
	{
		super(name);
	}

	@Override
	public void regularHealthCheckup()
	{
		System.out.println(this.name+"Bird is going for a regula healthcheckup");
	}
	
	
	
}
