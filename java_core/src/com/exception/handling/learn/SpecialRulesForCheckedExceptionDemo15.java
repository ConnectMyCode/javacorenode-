package com.exception.handling.learn;

public class SpecialRulesForCheckedExceptionDemo15 {

	public static void main(String []args) 
	{

		try {
			//Try block is not throwing Checked Exception 
			//BUt still  we have mentioned inside catch() block.  i.e, InterruptedException e
		}
		catch(InterruptedException e)     
		{
			// ERROR: Unreachable catch block for InterruptedException. This exception is never thrown from the try statement body.
		}
	
		/*Same Rule is not applicable for Unchecked Exception : */
	try {
		
	}
	catch(ArithmeticException e)    //No ERROR: WHY?? >> Uncheked Exception can be written inside catch block even though the Try block does not throws any Exception.
	{
		
	}
	
	
	
	/*RULE 2*/
	
	try 
	{
		
	}
	catch(Throwable e)      //We can write THROWABLE and EXCEPTION in catch block though  try{} block is not throwing any exception >>WHY?? >> because They represent both Checked and Unchecked Exceptions so its allowed.
	{
		e.printStackTrace();
		e.getMessage();
	}
	
	
	}
	
	
	
	
	/*RULE 3: Time of Method Overriding */
	
	
}
