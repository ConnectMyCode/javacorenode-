package com.functional.interfaces.learn;

public class LambdaExpressionDemo2 implements InterfaceLambdaExpression01Demo2 , InterfaceLambdaExpression02Demo2 , InterfaceLambdaExpression03Demo2 
{			 						

//	Error: the type LambdaExpressionDemo2 must implement the inherited abstract method InterfaceLambdaExpression03Demo2.doSum()		
//WHY ERROR:Functional Interface abstract Methods are not yet overriden   	
	
	public void findLength() 
	{
		System.out.println("find Length Method");
		
	}
	
	public void display()
	{
		
		System.out.println("display Method");
	}
	
	public void doSum() {
		System.out.println("do sum Method");
	}
	
	
	
	
	
	/*Anonymous Inner Class*/
	InterfaceLambdaExpression03Demo2 express1 = new InterfaceLambdaExpression03Demo2()
	{
		/*Anonymous Function*/   /*But it will create a class and insde that class we have to override the Abstract method so that will not statisfy the Outter Anonymous class implementing Functional Interface and will still give error */ 
		//Possible to write

		/*This Overriding the INterface Abstract method satisfies only the Anonymous Inner class i.e, express1 and  ot the outter class*/
		public void doSum()
		{
			System.out.println("Display Method inside Anonymous Class. ");
		} 
		
		
	};
	

	
		public static void main(String []args)
		{
	/*Anonymous Functions*/
			
			/*Lambda Expression only works with Functional Interface */
			
			/*
	public void doSum() {
		System.out.println("do sum Method");
	}*/   
			
			
			/*No access Modifier 
			 * No return Type
			 * No method name 
			 * If parameters >  No datatypes  
			 * if multiple parameters >> (int a, int b) >>>>> (a,b)
			 * if return keyword >>>    Compulsory {} braces 
			 * if single Line Statement >>>> No need of {} braces
			 * */
			
			/*This anonymous Function does not satisfy the class "LambdaExpressionDemo2" as it is implementing deom01, Demo02 , Demo03 Interfaces so each Functional Interface abstract method has to be overriden Here Anonymous  Function  creates internal Class and Object of their own. */
			
			
			
			InterfaceLambdaExpression01Demo2 one = () -> System.out.println("Do Sum Method");
			
			one.display();
			
			/*	public void findLength() 
	{
		System.out.println("find Length Method");
		
	}
			 */
			
			InterfaceLambdaExpression02Demo2 two = () -> System.out.println("Find Length Method");
			
			two.findLength();
			
			/*	public void display()
	{
		
		System.out.println("display Method");
	}
			 */     
			InterfaceLambdaExpression03Demo2 three = () -> System.out.println("Display Method");
			
			three.doSum();
		
		}

}
