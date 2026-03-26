package com.inheritance.learn;

public class HierarchichalInheritanceDaySchollarExtendsStudentDemo9 extends HierarchichalInheritanceStudentParentClassDemo9 {

	
	protected double transportFee; 
	
	protected double total; 
	
	public HierarchichalInheritanceDaySchollarExtendsStudentDemo9(double examFees , double transportFee) 
	{
		super(examFees);      
		this.transportFee = transportFee; 
		total = super.examFees+transportFee; //examFees is "Protected" access modifier therefore we can access the field across the class which also the parent class (Inheritance )
		
	}


	@Override
	public String toString() {
		return "HierarchichalInheritanceDaySchollarExtendsStudentDemo9 [transportFee=" + transportFee + ", total="
				+ total + "]";
	}
	
	
	
	
}




