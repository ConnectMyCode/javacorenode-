package com.exception.handling.learn;

import java.io.Closeable;
import java.io.IOException;    

public class FileResource implements Closeable{
									/*Closeable implements Autocloseable*/
	@Override   
	public void close() throws IOException
	{
		System.out.println("File resources closed!!!");
		
		
	}
	
	//Close() method in Closeable Interface : throws Checked Exception >>>  It is not compulsory for Overriding method to throw a checked exception
	
/*Declaration */       	
//	 public interface Closeable extends AutoCloseable {

    /**
     * Closes this stream and releases any system resources associated
     * with it. If the stream is already closed then invoking this
     * method has no effect.
     *
     * <p> As noted in {@link AutoCloseable#close()}, cases where the
     * close may fail require careful attention. It is strongly advised
     * to relinquish the underlying resources and to internally
     * <em>mark</em> the {@code Closeable} as closed, prior to throwing
     * the {@code IOException}.
     *
     * @throws IOException if an I/O error occurs
     *
     */
 //   public void close() throws IOException;


}
