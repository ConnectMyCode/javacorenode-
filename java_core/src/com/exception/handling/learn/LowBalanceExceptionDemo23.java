package com.exception.handling.learn;

public class LowBalanceExceptionDemo23  extends Exception {      //User defined function must be a part of Exception hierarchy if want to throw it as a Exception. 
			//Checked Exception
	
	
	
	public LowBalanceExceptionDemo23() 
	{
		System.out.println(getClass()+"@"+ Integer.toHexString(hashCode()) );
	}
	
	public LowBalanceExceptionDemo23(String message)
	{
		 
		super(message);
	}
	
}