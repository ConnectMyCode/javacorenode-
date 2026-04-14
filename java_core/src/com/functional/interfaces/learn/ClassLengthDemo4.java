package com.functional.interfaces.learn;

public class ClassLengthDemo4 {

	public static void main(String []args)
	{
		
		/*Lambda expression used to implement the Interface Abstract method : Reduced boilerPlate code of Anonymous Inner class */
		IntefaceLengthDemo4 length = str ->{ 
			System.out.println("Length of String is "+ (str.length()));
			return str.length();  
		};                     //public void FindLength(string str){} 
	
	
		
	/*Anonymous Inner Class : Boiler PLate Code*/	
		IntefaceLengthDemo4 length0 = new IntefaceLengthDemo4()
		{
			
			 public int length(String str) 
			 {
				 System.out.println("Length of string 0 is : "+ str.length());
				 return str.length();  
			 }
		};
		
		
		length.length("KeepIng In Touch of God ");
	
		length0.length("Magic is Happening");
	
		
		
		
	}
	
	
}
