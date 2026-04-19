package com.exception.handling.learn;

public class ExceptionPropagationDemo12 {

// NOTE: Only for UNCHECKED Exception Propagation Happens : FOR CHECKED Exception  :HAve to compulsorily handle using try-catch before runtime  or Declare using throws.		
	
	public static void main(String []args) 
	{
		
		System.out.println("main method Started");
		m1();
		System.out.println("main method Ended");
	}
	
	
	public static void m1()
	{
		System.out.println("m1() method Started");
		m2();
		System.out.println("m1() method Started");
	}	

	public static void m2()
	{
		System.out.println("m2() method Started");
		Integer x = 10/0;     //At runtime Arithmetic Exception Object is created .
		System.out.println("m2() method ended");
	}
	
//	Exception Propagation:    
/*											
						[JVM]		Default Exception Handler   [handles USing method   1.printStackTrace()  2.getMessage()  3.toString()  ]                           Results: Abnormal Termination of program  // the program did not execute normaly so  remaining line of code was not executed.
											⬆️
										  main()	[Is main() handling error > No > JVM Handles by itself using > Default Exception Handler > Handles the Error;   ]
											⬆️
										   m1()     [Is m1() handling error > No > JVM goes to caller method ( main() ) ]
											⬆️
					(calle Method)		   m2()     [Is m2() handling error > No > JVM goes to Caller method( m1() ) ]     
*/						   	
	
	/*   
		Memory Diagram in Stack 
		
		|			|				
		|	m2()	|		m2() method not handling the error using (try-catch) || throws  then it is removed from the stack area. same goes for the Caller methods  <m1() and main()>
		|			|		
		|___________|			
		|			|			
		|	m1()	|
		|___________|		
		|			|
		|	main()	|
		|			|
		-------------
		
		
		What IF? the method is handling the Exception will it be removed from the stack area? --> 
		ANS: ->    1.Yes , but normally the  method Completes Execution whole and then Is removed from stack Area. 
				   2. Method is not removed abruptly. 
				   3. Control continues after catch  Block
	 * */
			
	
}
