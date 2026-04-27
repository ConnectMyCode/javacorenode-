package com.exception.handling.learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/* 
  
  exceptions produced by failed or
 * interrupted I/O operations.
 *
 * @see     java.io.InputStream
 * @see     java.io.OutputStream
 *
 * */


public class NestedTryMethodDemo18 {
	
	public static void main(String []args) 
	{
		try( BufferedReader br = new BufferedReader(new FileReader("C:/java_core_workspace/java_core/src/com/exception/handling/learn/data")  ) )
		{
			try 
			{
				String line = br.readLine();    //IOException may come; 
				int num  = Integer.parseInt(line);     //NumberFormatException
				int result = 100/num;   //Arithmetic Exception
			
				System.out.println("Result: "+result);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot Divide by zero. ");
			}
			catch(NumberFormatException e) 
			{
				System.out.println("Invalid number format"); 
			}
		} 
		catch(IOException e) 
		{
			System.out.println("Error with file or closing resourcces"+e.getMessage());
		}
	}	
	
	
}
