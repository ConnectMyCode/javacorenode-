package com.object.oriented.programming.oop.blc;

public class BlankFinalFieldDemo1 {
	
	
	private final double salary ;
 
	
	/*Final type Field can be Inintialize In -->   
	 * Non-Static Block
	 *Inside Constructor[User Defined]*/ 
	
	/*Final type Field cannot be Inintialized In -->
	 * Methods 
	 * No args Default Constructor[Added by compiler]*/
	
	/*Cant initialize twice 
	 * Only ONCE it can be initialized , either in the non static block or inside constructir body. */
	
	/*Purpose of usng these 
	 * Imagine :-> Engine a neccessity for a car to run  ,So when you purchase a car I ddont have to 
	 * tell that put the engine also , it is an compulsory part of the car 
	 * obviously it will be there , similarly the 
	 * final type field is a neccessary part of the class and without it 
	 * the class cannot be complete or it will be useless so to make it 
	 * for such things we use the  "Final keyword"*/
	
	
	/*Here a default no args constructor will be created that cannot initialize the 
	 * final type field . 
	 * */
	
	{
		salary = 9090; //commment this and an error wil occur . 
		System.out.println("I am  alone and Ecstatic");
	}

}
