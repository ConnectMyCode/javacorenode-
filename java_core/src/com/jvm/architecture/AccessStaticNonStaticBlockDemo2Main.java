package com.jvm.architecture;

public class AccessStaticNonStaticBlockDemo2Main 
{	
	
	int x= 10; 
	
	public void getDonation()
	{
		System.out.println("Non Static Block1 ");
	}
	
	{
		System.out.println("Instance bLock1 ");
	}
	static {
		System.out.println("Static Block at Initilaization phase executed");
	}
	
	public static void print() 
	{
		System.out.println("Static Mehotd accessible directly from static old main() method");
	}
	
	
	//For accessing the non static blocks create a object of that class and access the nonstatic members no Direct access is possible. 
	public  static void main(String []args)  //In .class File this main method is called  using ClassName.main 
	{
		System.out.println("hi");                       
		
		print();

	
		//getDonation(); //Error: Cannot make a static reference to the non-static method getDonation() from the type AccessStaticNonStaticBlockDemo2Main
		
	//	System.out.println(x); // Error: Cannot make a static reference to the non-static field x
		
	/* WHY cant static reference to the non static members ? --> 
	 * Static main() method is stored in Layer-1 and the other non-static members are Layer-2 Data
	 * 	So Layer-1 Data cannot access the Layer-2 Data to access object creation is needed so that the the Layer-2 is created and using the refernece we can access the nonstatic members inside Layer-2 Data*/
		
		/*To access create an Object of class*/
		AccessStaticNonStaticBlockDemo2Main accessLayer2 = new AccessStaticNonStaticBlockDemo2Main();
		
		System.out.println(accessLayer2.x);
		accessLayer2.getDonation();
		
		
	}
	
	
}	
