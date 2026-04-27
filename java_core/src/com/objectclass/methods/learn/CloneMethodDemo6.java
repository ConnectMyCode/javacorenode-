package com.objectclass.methods.learn;

public class CloneMethodDemo6 {

	public static void main(String []args) 
	{
		ProductDemo6 prod = new ProductDemo6(1234 , "Piano");	
		System.out.println("Original Object: "+prod);   
		
		
		try {
			
			ProductDemo6 prodClone1 = (ProductDemo6)prod.clone();     //clone() method returns Object Type using downcasting / 
			System.out.println("Duplicate Object: "+prodClone1); 
			
			
			
			if(prod.getClass() == prodClone1.getClass()) 
			{				
				System.out.println("Prod: "+prod.getClass() +" prodClone1: "+prodClone1.getClass());       //DEEP Copy  2 differenct objects are created 
				System.out.println("Same  using .getClass()");
			}
			if(prod.equals(prodClone1))
			{
				System.out.println("Prod: " + prod.hashCode() + "prodClone1: "+ prodClone1.hashCode());
				
				System.out.println("Equal using .equals() method whhich cheks if the 2 reference variable are pi=ointing to the same class using hashcode value as it is unoque to each object");
			}
			
			
			
		}
		catch(CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
