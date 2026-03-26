package com.inheritance.learn;

public class HasARelationCompositionEngineDemo11 {
	
	
	private String engineType; 
	private double mileage; 
	
	public HasARelationCompositionEngineDemo11(String engineType , double mileage) 
	{
		this.engineType =engineType;
		this.mileage =mileage;
	}

	@Override
	public String toString() {
		return "HasARelationCompositionEngineDemo11 [engineType=" + engineType + ", mileage=" + mileage + "]";
	}
	
	
	
	
}
