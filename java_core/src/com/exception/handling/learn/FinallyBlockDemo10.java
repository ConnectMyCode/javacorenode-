package com.exception.handling.learn;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class FinallyBlockDemo10 {
	
	
	
	public static void main(String []args) 
	{
		System.out.println("Main Method Started!!!");
		
		
		/*
		 * ✔ Common cases:
	Calling method on null → obj.method()
	Accessing field of null → obj.field
	Using null array → arr.length, arr[0]
	Unboxing null → Integer x = null; int y = x;
	throw null
💡 Key idea:

null has no object in memory → any operation on it causes NPE

🧠 One-line:
null + operation → NullPointerException 💥
		 * 
		 * */
		
/* Umcommnet this code:*/ 		
		try {
				//NullPointerException object created
				int arr[] = null; 
				arr[0] = 1;
				
				System.out.println("JVM skips try block remaining code as error occurs and this becomes unreachable code !! ");
				
		}
		finally 
		{
				System.out.println("Final Block is used only for handling Resources and not Exception and This Block exceutes everytime try block is excuted it doesn matter if any exception occured or  not."); 
		}
		
	
		/*JVM searches for NUllPointerException but main method is not handling the exception so it directly goes to  Default Exception Handler exception is handled their  : Results in Code getting Terminated Abnormally so "Main Method ended" does not prints..*/
	
		/*User Handles Exception >>> Code Terminates Normally. 
		 *Default Exception Handler >>> Code Terminates Abnormally. */
		
		
		
		/*No data available + trying to access → NoSuchElementException 💥
*/
		Scanner sc = new Scanner(System.in);
		try {
			sc.nextInt();
/*Uncomment*/ // sc.close(); //Sc Resource is closed still trying to access it gives Exception error /IllegalState Exception object is created.   
			sc.next();  //Sc is a resource which Type >> InputStream so it needs to be closed after its use else Memory lEakage happens .    
		//	sc.close(); // Instead of Closing Resource here we should Close resource in finally block Industry best Practice. 
		}
		catch(IllegalStateException e)    // NOTe: RuntimeException : Can Wrote insd a catch block even if no error in try block occur because it is a Unchecked Exxcpetion |||   Checked Exception : Can only be written when there is 100% sure  of  a checked exception object being created occuring and if  not then cannot write/ handle this excception. 
		{
			System.out.println("Input Resource  closed too early Illegal State Exception");   
		}
		finally //InputStream Resource is handled 
		{	
			if(sc!=null) 
			{
				sc.close();
				System.out.println("Scanner Resource inside Final  Block Closed!!!");
			}
		}
		
		
	
	/*When Final block  will not be executed*/
		//1.System.exit(0) in try block
		//2. Infinite Loop inside try block.
		try 
		{
			System.out.println("Final Block will not be exceuted System Exits with 0");
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally Block");
		}
	
		System.out.println("Main method ended");
	}   					
	

	
	//What are different types of Resources to handle on finally block: ??? 
	
	/*   

	 * 🔥 FINAL UNDERSTANDING

		Resources like files, database connections, streams, and sockets are closed in the finally block to ensure cleanup, regardless of whether an exception occurs or not.

		🧠 ONE-LINE MEMORY
			Resource opened → must be closed → finally block ensures it

	 * */
	
	
	/*Extraw Notes below only read if want to : 
	 * 
	 * .

🔥 Types of Resources handled in finally block
🔹 1. File Resources 📄

Used when working with files

✔ Examples:
FileInputStream fis = new FileInputStream("data.txt");
BufferedReader br = new BufferedReader(new FileReader("data.txt"));

✔ Why close?

👉 File remains locked / memory leak

🔹 2. Database Resources 🗄️
✔ Examples:
Connection con;
Statement stmt;
ResultSet rs;

✔ Why close?

👉 DB connections are limited → must release

🔹 3. Network Resources 🌐
✔ Examples:
Socket socket;
ServerSocket serverSocket;

✔ Why close?

👉 Keeps ports busy if not closed

🔹 4. Scanner / Input Streams ⌨️
✔ Examples:
Scanner sc = new Scanner(System.in);
InputStream is;

✔ Why close?

👉 Holds input stream (keyboard/file)

🔹 5. Output Streams 🖨️
✔ Examples:
FileOutputStream fos;
PrintWriter pw;

✔ Why close?

👉 Data may not be fully written

🔹 6. Custom Resources (User-defined)
✔ Example:
class MyResource {
    void close() {
        System.out.println("Closed");
    }
}
	 * 
	 * */

}
