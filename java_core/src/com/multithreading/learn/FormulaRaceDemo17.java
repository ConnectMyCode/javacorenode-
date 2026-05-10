package com.multithreading.learn;

public class FormulaRaceDemo17 {
	
	
	
	public static void main(String []args) 
	{
		FormulaCarsDemo17 Formulae1 = new FormulaCarsDemo17 ("Formula 1"); 
		Formulae1.setName("Formula 1");    
		Formulae1.setPriority(10);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae2 = new FormulaCarsDemo17 ("Formula 2"); 
		Formulae2.setName("Formula 2");    
		Formulae2.setPriority(9);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae3 = new FormulaCarsDemo17 ("Formula 3"); 
		Formulae3.setName("Formula 3");    
		Formulae3.setPriority(8);   //Highest Priority   	

		FormulaCarsDemo17 Formulae4 = new FormulaCarsDemo17 ("Formula 4"); 
		Formulae4.setName("Formula 4");    
		Formulae4.setPriority(7);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae5 = new FormulaCarsDemo17 ("Formula 5"); 
		Formulae5.setName("Formula 5");    
		Formulae5.setPriority(6);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae6 = new FormulaCarsDemo17 ("Formula 6"); 
		Formulae6.setName("Formula 6");    
		Formulae6.setPriority(5);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae7 = new FormulaCarsDemo17 ("Formula 7"); 
		Formulae7.setName("Formula 7");    
		Formulae7.setPriority(4);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae8 = new FormulaCarsDemo17 ("Formula 8 "); 
		Formulae8.setName("Formula 8");    
		Formulae8.setPriority(3);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae9 = new FormulaCarsDemo17 ("Formula 9"); 
		Formulae9.setName("Formula 9");    
		Formulae9.setPriority(2);   //Highest Priority   	
		
		FormulaCarsDemo17 Formulae10 = new FormulaCarsDemo17 ("Formula 10"); 
		Formulae10.setName("Formula 10");    
		Formulae10.setPriority(Thread.MIN_PRIORITY);   //Highest Priority   	
		
		
		 FormulaCarsDemo17[] FormulasList = { Formulae1, Formulae2, Formulae3, Formulae4, Formulae5, Formulae6, Formulae7, Formulae8, Formulae9,  Formulae10};
		  	 
		//Can also create a file and save in it.
		  
		  
		  
		  
		  
		//Race Flag raised    >>>Randomly a Formulae car will start his engine and  cross the start Line  
/*		Formulae1.start();
		Formulae2.start();
		Formulae3.start();
		Formulae4.start();
		Formulae5.start();
		Formulae6.start();
		Formulae7.start();
		Formulae8.start();
		Formulae9.start();
		Formulae10.start();   
		*/
	
		
		//I want  these Formulas to start the engine s and enter the race in serial wise and in a orderly fashion.
		try {
			Formulae1.start();
			Formulae1.join();
			
			Formulae2.start();
			Formulae2.join();
				
			Formulae3.start();
			Formulae3.join();
			
			Formulae4.start();
			Formulae4.join();
			
			
			Formulae5.start();
			Formulae5.join();
		
			Formulae6.start();
			Formulae6.join();
			
			Formulae7.start();
			Formulae7.join();
			
			Formulae8.start();
			Formulae8.join();
			
			Formulae9.start();
			Formulae9.join();

			Formulae10.start();   
			Formulae10.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		System.out.println("Crowd Cheers and The Grand Race begins 😉😎😎🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️🏎️");
		
		dashBoard(FormulasList);
		
				
		
	}
	
//THREAD GROUPS 	  BY DEFAULT >> MAIN GROUPS
	
	
	//These method displays on whom the Bets and Investments are dome most 1->lowest Investment and Bet   10-> Highest Bet to win
	public static void dashBoard(FormulaCarsDemo17[] list) 
	{			
		
			System.out.println("-************* DASHBOARD *************-");
				for(FormulaCarsDemo17 formulae :list) 
				{
					System.out.println(formulae.formulaNum + "Bet no . is " + formulae.getPriority()+"\n"); 																																											
				}
				
				int max; 
				int min;
				
				FormulaCarsDemo17 maxFromulaCar =null;
				FormulaCarsDemo17 minFromulaCar = null;
				
				if(list[0].getPriority() < list[1].getPriority()) {	max = list[1].getPriority(); min= list[0].getPriority(); maxFromulaCar = list[1]; minFromulaCar = list[0];}
				else{ max = list[0].getPriority();   min = list[1].getPriority(); maxFromulaCar = list[0]; minFromulaCar = list[1]; }

				for(int j = 1; j<list.length ;j++) 
				{
					if(  max < list[j].getPriority() )
					{ max = list[j].getPriority(); maxFromulaCar = list[j]; System.out.println(list[j].getPriority());   }
					if(min > list[j].getPriority()) 
					{ min = list[j].getPriority(); minFromulaCar = list[j];	  }
				}
				
				System.out.println(" MAX Priority: "+ maxFromulaCar.formulaNum + " : " +  max   +" MIN Priority: "+ min + " : " + minFromulaCar.formulaNum);
		   System.out.println("-************* DASHBOARD *************-");
			
	}
	
	
	
}
