package com.exception.handling.learn;

import java.util.Arrays;

public class NestedTryCatchDemo19 {
	
	public static void main(String []args) 
	{
		
		
		try 
		{		//IF -3 :NegativeArraySizeException Generated at runtime its is a unchecked exception so no compulsion to handle it , JVM finds nearest catch block if not found then its handled by JVM default exception handler as it propogates automaatically >>> Reults>> Abnormall Termination of not handled .  
			Object []obj = new Object[-3];   //Inline initialization of array			
		try 
		{
			obj[0] = "Java";
			obj[1] = 67;
			obj[2] = "Platform Independent language";
			
			System.out.println(Arrays.toString(obj)); //prints array elements at once 
		
		}
		catch( ArrayStoreException e ) 
		{
			System.err.println("Array Element data is illegal");
		}
	}
		catch(NegativeArraySizeException e) 
		{
			System.err.println(" Array size cannot be negative. Must be positive. "); 
			
		} 
	}
	

}



/*

| Feature        | Unchecked | Checked                        |
| -------------- | --------- | ------------------------------ |
| Propagation    | Automatic | Explicit (`throws`)            |
| Compiler force | ❌ No     | ✅ Yes                         |
| Can reach JVM  | ✅ Yes    | ✅ Yes (if declared up to main)|   

*/
