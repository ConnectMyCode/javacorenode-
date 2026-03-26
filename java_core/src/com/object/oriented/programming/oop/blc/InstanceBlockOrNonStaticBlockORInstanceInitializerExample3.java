package com.object.oriented.programming.oop.blc;

public class InstanceBlockOrNonStaticBlockORInstanceInitializerExample3
{

	/*It is accessible across any package*/ 
	public int x;
	
	{//NS blocks
		x= 100; 
		System.out.println("1st Block: "+x);
	}

	{
		x= 200; 
		System.out.println("2nd Block: "+x);
	}
	
	{
		x= 300; 
		System.out.println("3rd Block: "+x);
	}
	
	{
		x= 400; 
		System.out.println("4th Block: "+x);
	}
	
	{
		x= 500; 
		System.out.println("5th Block: "+x);
	}
	
	
}
