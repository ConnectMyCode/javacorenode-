package com.jvm.architecture;

public class StaticBlockDemo2 {

	public static void main(String []args) 
	{
		Demo.print(); 
	}
	
	
	
	class Demo{
		
		public static void print()
		{
			x= 120; 
			System.out.println("x value is: "+x); //class Name is not required
		}
		
		static int x; //post Declaration
	}
	
}
