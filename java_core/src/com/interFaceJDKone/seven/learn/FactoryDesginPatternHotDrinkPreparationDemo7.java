package com.interFaceJDKone.seven.learn;

public class FactoryDesginPatternHotDrinkPreparationDemo7 {
	
	

	//*Inside class Creating Anonymous Inner Class :  Creating Class + Object Creation(Object of outter class is created inner class object is created) + Implementing Interface Hot Drink*/
	
	
	
	
		//HotDrink drink = new HotDrink(){} 
		FactoryDesginPatternHotDrinkDemo7  tea = new FactoryDesginPatternHotDrinkDemo7() 
		{
			public void prepare() 
			{
				System.out.println("Preparing Irani Tea");    
			}
		};
		
		
		
	//Static method >> Why Inside Static Method Written Anonymous Inner Class ?  >>>> Reason: Read the "AICNotes.java" 	
		public static 	FactoryDesginPatternHotDrinkDemo7 getCofee() 
		{
			FactoryDesginPatternHotDrinkDemo7  coffee = new FactoryDesginPatternHotDrinkDemo7()
			{
				@Override
				public void prepare() 
				{
					System.out.println("Preparing Hot Drink Coffee ☕🍵!!!");  
				}
			};
			
			return coffee;
		}
		
//Difference In the way  Return statement is written +  While a Anonymous class Created + Object Creation(At The Time of Method Calling) + Factory Design Pattern(Return Type of Method is Interface) + 		
		public   FactoryDesginPatternHotDrinkDemo7 getSweetTea() 
		{
			return new 	FactoryDesginPatternHotDrinkDemo7() 
			{
				@Override
				public void prepare() 
				{ 
					System.out.println("Sweet Tea is Getting Prepared!!!");  
				}
			}; 	 	
		}
			
		//Is this Anonymous class referenced by Tea having prepare() Method accessible outside the HotDrink Class.	
	// 	YES > How :  Tea :Field  >>For Class "HotDrinkPreparation{}" so  If we >>>>Create Object of "HotDrinkPreparation{}" and use its Reference Type lets say "hotDrink" --->>> we can access the field i.ee, Tea Reference Variable and >>>>> Access Method prepare() 
		//    
		/*
		 * public class Test {e
    			public static void main(String[] args) {

        				FactoryDesginPatternHotDrinkPreparationDemo7 obj =
                		new FactoryDesginPatternHotDrinkPreparationDemo7();

        				obj.tea.prepare();   // ✅ Accessible   
    			}
			}
			
		  	
		  1. Method Chaining	
		 * 2.Anonymous Class 
		 * 
		 * */
		
		
		/*Best Case Scenario : 
		 * 
		 * public FactoryDesginPatternHotDrinkDemo7 getTea() {
		 * 
    				return new FactoryDesginPatternHotDrinkDemo7() 
    				{
        				public void prepare() 
        				{
            				System.out.println("Preparing Irani Tea");
        				}
    		};
		}
		1.Factory Design Pattern
		2.Anonymous Class 
		3.Method Chaining
		 * 
		 * */

}
