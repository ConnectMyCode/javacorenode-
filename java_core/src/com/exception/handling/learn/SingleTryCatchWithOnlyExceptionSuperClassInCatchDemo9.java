package com.exception.handling.learn;

public class SingleTryCatchWithOnlyExceptionSuperClassInCatchDemo9 {

	
		public static void main(String []args) 
		{
			try {
				
				String []str = new String[3];
				Integer x = 10/0;
			}
			catch(Exception e) 
			{
				System.out.println("Array INdex OutOf Bound");
			}

			//>Actual Error : AirthmeticException but it is showing  error message: "Array Index Out Of Bound".    >>Wrong Approach. 
		   //> Never use the Super   class >> Exception / Throwable / ERROR   in Catch Block . 
			
		//Industry >> Should Write Multiple Catch blocks with specific exceptions in Catch() block and write the Super Class at  the end of Multiple Catch Blocks	
		
			
			try{
				
				int z = 10/0;
				System.out.println("Z value is :"+z); 
				
				int []arr = {100, 200, 300, 400};
				System.out.println(arr[4]);  
				
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Array is Out of Bounds!!");
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Divide by Zero problem!!");
			}
			catch(Exception e) 
			{
				System.out.println("Some Other Problem!!");
			}
			
			
			System.out.println("Main Method Completed!!!");
			
			
			//This is the appropriate way to handle the exception. 

			
			
			
			/*Using  " | "  Reduce the code in a single Catch Block multiple Exception Handled
			 * 
			
			 * */
			
			
		// int x = Integer.parseInt(String) 👉 Converts String → primitive (int).                           
	   //  Integer y = Integer.valueOf()    👉 Converts String → Integer object (Wrapper Class Integer).		
	        try 
			{
				String str1 = null;
				System.out.println(str1.toUpperCase()); //NULL
				
				String str2 = "Ravi";     //  valueOf() >> used to Wrapp string into Integer. internalyy it converts the String into primitive int and wraps the int into Integer.
				int x =Integer.valueOf(str2); 
				
			}
			catch(NumberFormatException | NullPointerException e) 
			{
				if (e instanceof NumberFormatException) 
				{
					System.out.println("Number is not in a proper Format");
				}
				else if(e instanceof NullPointerException) 
				{
					System.out.println("ref variable is pointing to null");
				}
			}
	        
	        System.out.println("Main Method is ended!!");     
		
		
		}			
			
	
		
		/*TASK:  Create a array of Exceptions when a exception occurs object goes to catch block catch(Trhowable t)    parameter then inside catch we will run for loop on array and search which Exception it matches and accordingly give message */
		
}
