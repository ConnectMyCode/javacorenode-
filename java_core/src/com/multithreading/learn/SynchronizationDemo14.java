package com.multithreading.learn;

import java.util.Scanner;

public class SynchronizationDemo14 {


	
	/*Read Notes :     
	 * 
	 * In another Demo14 file 
	 * 2 types of  synchronization  >>>> 1.Method Level   2.Block Level 
	 * 
	 * 
	 * 
	 * */
	
	
	
	//1.  Below is a block level example;
	
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of times you want to spin the wheel");
		
		int loops = sc.nextInt();
		
		SpinWheelDemo14 spin1 = new SpinWheelDemo14(loops);  //Lock 1 is Created 
		
		
		Thread t1 = new Thread(spin1 , "Golu"); 
		
		Thread t2 = new Thread(spin1 , "Bolu");
		
/*		t1.start();    //Uncomment If you want to see the execution right away.
		t2.start();*/
	
		
	//Limitation or DRAWBACK of BLOCK Level Synchronization   
		
		//If 2 Objects Lets say "Mela 1" (Object 1) ,   "Mela 2" (Object 2). And there are 4 players >> t1 , t2  , t3 , t4
																								//	  Golu , Bolu , Senu , Penu 
		//T1 , T2 >>> Object 1          //T3 , T4 >>>> Object 2  
		
	   SpinWheelDemo14 spin2 = new  SpinWheelDemo14(loops);    //Lock 2 is created 
	   
	   
	   Thread t3 = new Thread(spin2, "Senu");

	   Thread t4 = new Thread(spin2, "Penu");
	   
	/* t3.start();
	   t4.start(); */

	   
//Conclusion:-> 	//Purpose or The Idea of Having the Synchronization fails because at same time there are 2 threads  that are entering into  the  synchronized area that are of different 2 objects
	//That is why  "Static synchronization" introduced . 
	   
	   
	   // In java enviorment  >> Class also has Lock  >>>> In a package there is only one class cannot be another class with same name
	  
	  // Static Synchronized Block , Method 
	   
	  // Static Synchronized Method >    public static synchronized void paintWhite(){}   
	  //Static Synchronized Block >      public static synchronized void paintWhite(){    
	   //                                       	   synchronized(ClassName.class){}     }   
	  
	  
	  //During Static Synchronized Method Implementation <A new Game was Developed named as Static Synchronized ShootTheBall game 2 more new PLayers game in the park >     T5 , T6  < Munni , Sunni > 
	 //  3 Games >>> Game1 , Game2 , Gmae3 >>> There are 3 Groups from exxah group a single player can play this games simultaneously  so there are 3 players playing the game each player belonging to different group
	 //But when it comes to the "Shoot The Ball"  game out of these only 1 Player out of these toatl 6 players i.e., 3 Groups can play at a time 
	
	   SpinWheelDemo14 spin3 = new SpinWheelDemo14(loops); 
	   
	   Thread t5 = new Thread(spin3 , "Munni");
	   
	   Thread t6= new Thread(spin3 , "Sunni");

	   
	   t1.start();
	   t2.start();
	   
	   t3.start();
	   t4.start();
	   
	   t5.start();
	   t6.start();
   
	
	}
	
}	 