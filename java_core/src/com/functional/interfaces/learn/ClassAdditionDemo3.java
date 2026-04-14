package com.functional.interfaces.learn;

public class ClassAdditionDemo3 {
	
	public static void main(String []args) 
	{
		
		/*no anonymous Method created need to call it to execute it*/    
		
		
		
		InterfaceAdditionDemo3 lambda0 = (x,y) -> System.out.println("Sum is :" + (x+y));   
		
		
		InterfaceAdditionDemo3 lambda1 = new InterfaceAdditionDemo3()  	
		{
			public void doSum(int x, int y) 
			{
				System.out.println("Sum is : "+ (x+y) );    
			}
		};
		
		
		
		lambda0.doSum(10,20);      //Accessing via  Lambda function implementing Interface	
		lambda1.doSum(20, 20);     //Accessing via Anonymous Inner Class
		
		
		
		
	}

}
