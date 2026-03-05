package com.object.oriented.programming.oop.blc;

public class BlankFinalFieldEngineDemo2 
{
	private String type; 
	private int horsePower; 
	
	public BlankFinalFieldEngineDemo2(String type , int horsePower)   
	{
		super(); 
		this.type = type; 
		this.horsePower = horsePower; 
	}
	
	public String toString() 
	{
		return "Engine [type="+type+", horsePower="+horsePower+"]";
	}
	
}
