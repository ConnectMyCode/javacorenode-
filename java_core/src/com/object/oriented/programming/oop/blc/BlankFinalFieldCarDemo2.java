package com.object.oriented.programming.oop.blc;

public class BlankFinalFieldCarDemo2 {	
	
	private int model; 
	private String name;
	private final BlankFinalFieldEngineDemo2 engine; 
	
	public BlankFinalFieldCarDemo2(int model ,String name) 
	{
		this.model = model; 
		this.name = name;
		this.engine= new BlankFinalFieldEngineDemo2("Battery",8080);
	}
	
	public String toString() 
	{
		return "Car [model="+model+", name="+name+", engine="+engine+"]"; 
	}
	
}



