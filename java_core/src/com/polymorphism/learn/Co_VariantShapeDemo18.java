package com.polymorphism.learn;

public class Co_VariantShapeDemo18 {
	
	/*Method oVERRIRDING -> Contd:-> 1. Meethod Signatuire ust be same  
	 * 								 2Return type must be compatible.
	 * Same here but with add on rules we call it Co_variant		 
	 * 
	 * */
	
		
     //Animal return type method will be overriden in the sub class it is possible mainly because these few reasons: 
	//1.CO-VARIANT concept:-> 2 return types have a relationship in between them of a single level inheritance  that is  IS-A relationship
   //2.Super and Sub class are compatible return type of 2 different methods being Overriden . 
  //3.CO_variant will not work with primitive dataype will only work with the Reference Datatype. i.e. here Dog, Animal; 							
			            //Animal      -->       Return type 
	public Co_VariantAnimalDemo18 draw()     
	{
		System.out.println("Super class draw"); 
		return null; 
	} 
}
