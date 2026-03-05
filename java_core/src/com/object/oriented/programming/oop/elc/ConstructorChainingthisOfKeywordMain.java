package com.object.oriented.programming.oop.elc;

import com.object.oriented.programming.oop.blc.ConstructorChainingthisOfKeyword;

public class ConstructorChainingthisOfKeywordMain 
{
    public static void main(String []args)
    {
    	/*Chained one constructor with the another constructor with the help of the  this(): keyword  
    	 * Internally:  Step1: Class"ConstructorChainingthisOfKeyword" is loaded
    	 * 				Step2: Object is created lets say "OBJ1" AT LOCATION 1000X refernced by --> "chain1" 
    	 * 				Step3: at the time of the object creation inside the constructor that is called "new ConstructorChainingthisOfKeyword()" we have this() keyword
    	 * 						this() pointing to the current onject constructor , 
    	 * 				Step4: Depending on the parameter passed inside the this() --> this(12454545 , 45458.3021) jvm searches for a constructor woth the same sequence of parameters 
    	 * 				Step5: If it finds it then it will execute that constructor so we need not have to create an another object to access the other constructors present inside the  class 
    	 * 				Step6: We can chain all the constructors that are present inside the class With a single object creation 
    	 * 				Step7: this() iniside the constructor will be  in the 1st line and so it will execute 1st then the constructor body will start executing 
    	 * 				Step8: super() keyword will be added automatically by the compiler at the end of the chain it is automated thing in java inside constructor 
    	 * 						putting the super at the 1 st line in the constructor which as the end  of the chain ; 
    	 * 
    	 * */

    	ConstructorChainingthisOfKeyword chain1 = new ConstructorChainingthisOfKeyword();

System.out.println(chain1);


    	
   }
    
	
	
}
