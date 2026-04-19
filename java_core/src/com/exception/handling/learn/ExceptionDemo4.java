package com.exception.handling.learn;

public class ExceptionDemo4 {

	
	public static void main(String []args)
	{
		try 
		{
			//int x=100        //We are creating a AirthmeticException Object. and throwing it to the nearest Catch Block 
			throw new ArithmeticException("Bharat Is Stronger");   //After "throw"--> keyword we cannot write anything after that  WHY? : It is unreachable the controller goes from  [ throw -->--> catch() block ]
		   //System.out.println("Unreachable Code");
		}
		catch(Exception e)   //Exception e = stores the reference to the Exception object created in the Heap memory 
		{																	       			
/* 🔥 Final Understanding (Perfect Answer)

In a try-catch block, the exception object is created in the heap, and the catch parameter e stores only the reference to that object, not the actual object itself.*/
			System.out.println(e); 
			
			/*These are the non static methods that are decalred insiide Airthemetic Exception class and can be called because the object of airthmetic is created and reference is stored in "e">>>> so can call Instance methods below: */
			System.out.println(e.getMessage());
			e.printStackTrace();   //-> Provide  complete details regarding exception like exception class name, exception error message , exception class location , exception method name  and exception line number;
			System.out.println(e.toString()); 
		}
		
		System.out.println("Main Method ends");
		
		try {
		//	throw new DummyFooDemo4();      //ERROR : No exception of type DummyFooDemo4 can be thrown; an exception type must be a subclass of Throwable
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	
}
