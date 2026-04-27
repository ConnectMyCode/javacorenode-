package com.exception.handling.learn;

public class TryWithResourcesAutomaticClossingFacilityDemo17{
	
	
	
	public static void main(String []args) throws Exception
	{
		DatabaseResource db= new DatabaseResource();
		FileResource fs = new FileResource();
		
		try(db;fs)      
			/*db and fs  automatically these resources are closed . to close them a method close() is invoked and close() method throws IOException and Exception both are checked Exception :-> so Compiler forces dev to handle this exceptions. */
		{
			/*Else it gives error. */
				System.out.println(10/0);
			}
		catch(ArithmeticException e)
		{
				System.out.println(" Do not divide a number by zero. ");
		}
	/*		
			| Thing                    | Reality                                                                |
			| ------------------------ | ---------------------------------------------------------------------- |
			| Exception from `10/0`    | Runtime (ArithmeticException)                                          |
			| Exception from `close()` | Checked (must handle)  IOException: close() throws IOException : Closeable functional Interface; Exception: close() throws Exception  > AutoCloseable Interface Implemented                                                   |
			| Who calls `close()`      | JVM (automatically)                                                    |
			| Who handles exception    | YOU (compiler forces)                                                  |
			| What compiler does       | It automatically adds a `finally` block to call `close()` on resources |

			
			
			
			
			
			
DatabaseResource db = new DatabaseResource();
FileResource fs = new FileResource();

try {
    System.out.println(10/0);
} finally {
    if (fs != null) {
        fs.close();   // may throw IOException
    }
    if (db != null) {
        db.close();   // may throw Exception
    }
}





*/
		/*Nested try-block*/
			
	//we are hadling the checked exception using this nested try-catch blocks
	try(db;fs)				
	{
		try 
		{
			System.out.println(10/0);
		}
		catch(Exception e) 
		{	
			System.out.println("Inner Catch: Divide By Zero. ");
		}
	}
/*Uncomment*/ catch(Exception e) 
	{
		System.out.println("Outter catch: resource closing error. ");
	}
			
	
	//If Outter Block is exceuted then Inner Block does not executes.
			
//op:     
	/*
	 Inner Catch: Divide By Zero. 			//        
	 File resources closed!!!              //automatic finally block is added by compiler  ; finally block always executes even if exception does not occur or occurs  so inside finally block the method close() is executed. 
	 Database Connection closed!!!
	 * */
			
			
			
		} 
	}


