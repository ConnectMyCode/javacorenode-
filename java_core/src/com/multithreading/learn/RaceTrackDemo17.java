package com.multithreading.learn;

public class RaceTrackDemo17 {

	
	
	public static String Commentator(FormulaCarsDemo17 formulaeCar) 
	{
		return "Here "+ formulaeCar.formulaNum + "Starts from The start Line and Fromulas are waiting patiently  for thier turn to come \n\n";
	}
	
	
	public static synchronized void startLine(FormulaCarsDemo17 formulaeCar)     
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(  formulaeCar.formulaNum + "  Boom!!!!!!!!");
		System.out.println(	 Commentator(formulaeCar));
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	
	
}
