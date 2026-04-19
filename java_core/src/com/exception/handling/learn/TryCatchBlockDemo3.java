package com.exception.handling.learn;

import java.util.Scanner;

public class TryCatchBlockDemo3 {
	
	public static void main(String []args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main Method Started");
		
		try 
		{
			Integer x = Integer.valueOf(sc.nextInt());    
			Integer y = Integer.valueOf(sc.nextInt());
			Integer z = x/y;   //exceotion object will be created if any occurs it will search for nearest catch block 
			
			System.out.println("z value is :"+ z);
			System.out.println("End of Try Block");;
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			System.err.println(e);
		}
		
		System.out.println("Main Method ended");
	
		
		
	//	IF: input> 12    23  >  Catch Block will not be executed > Reason: there is no Error object Created because there is no error encountered.
   //	IF: input> 12   0    >  Catch Block will catch the Exception Object created by JVM when it encountered error : and Catch block will catch it .
		//Notice: Here we have normal termination  even though there was an error in program . > Main Method Ended.
		//This normal termination is possible because try catch block .
		
	}

}
