package com.exception.handling.learn;

public class DatabaseResource implements AutoCloseable{
    
	//Compulsory to override "close()" method. because it here implemented a Functional INterface containing  close() method.
	@Override
	public void close() throws Exception      //If a resource is not closed then throws Exception
	{
		System.out.println("Database Connection closed!!!");
	}
	/*Open Declaration: */
    
	//void close() throws Exception;
	
}
