package com.multithreading.learn;

public class FormulaCarsDemo17 extends Thread{

	protected String formulaNum;
	
	
	public FormulaCarsDemo17( String formulaNum)
	{
		this.formulaNum = formulaNum;
		
	}
	
	
	@Override
	public void run() 
	{
		//For next car to wait for 3 sec so there is a distance on between the 2 cars to avoid any accidents at the start.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println( formulaNum +"Engine Start");
		
		RaceTrackDemo17.startLine(this) ;   //passing these car object as a parameter
		
		
	}	
		
			
	
	
	//As per SetPriority mthod theses method does not give 100 % assurance that it will execute as per the priority. At the end the JVM Scheduler decides which thread gets the prirority. 
	
	
	
	
}
