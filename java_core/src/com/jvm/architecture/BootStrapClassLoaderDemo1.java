package com.jvm.architecture;
	
	
public class BootStrapClassLoaderDemo1 {
	
	public static void main(String[] args) 
	{
		
	/*	
		int num = Integer.parseInt(sc.next()); 
		System.out.println("Learn Debugging"+num);
		
		
		String name = sc.next();
		System.out.println("Learn Debugging"+name);
		
		
		double carry = sc.nextDouble();
		System.out.println("Learn Debugging"+carry);
	*/
		
		System.out.println("BootStrap (String): "+String.class.getClassLoader());
		
		System.out.println("Platform (DriverManager): "+ ClassLoader.getPlatformClassLoader());
		
		System.out.println("Application (This Class): "+ClassLoader.getSystemClassLoader());
		
		
		
		
	}
}	