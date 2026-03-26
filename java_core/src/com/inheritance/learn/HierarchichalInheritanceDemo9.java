package com.inheritance.learn;

import java.util.Scanner;

public class HierarchichalInheritanceDemo9 {
																
	/*
	 * Student class has  2 childrens 1.Hostellars 2.Day Scholaars 
	 * Similarity: Exam Fees 
	 * Diiffernce : HostelFees\Hotellars
	 * TransportFess: Day Scholars
	 * In each children constructor I have invoked super(args), with an argument because the parent class has Argument constructor i.e, examFees  
	 * So 
	 * */
	
	
	/* Access Modifiers: 
	 * Public :If members of class are declared with public modifier then they are accessible from anywhere. 
	 * Protected:  If members of class are declared with protected modifier then accessed within the package and in subclasses(Using Inheritance) even if the subclasses are outside the package. 
	 * private: If members of class are declared with private modifier then they are accessible in class only
	 * default:  If members of class are declared with default modifier then accessible within the same package only    
	 * */
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String []args) 
	{
		System.out.println("Enter the Exam Fees: ");
		double examFees= sc.nextDouble();
		
		System.out.println("Enter the Transport Fees: ");
		double transportFees = sc.nextDouble();
		
		/*1ST class of Student Class */
		HierarchichalInheritanceDaySchollarExtendsStudentDemo9 std = new HierarchichalInheritanceDaySchollarExtendsStudentDemo9(examFees , transportFees); 
		
		System.out.println(std); 
		
		System.out.println("------------------------------------------------------------------------------------\n Enter hostel Fees: ");
		double hostelFee =sc.nextDouble(); 
		
		/*2ND child of Student Class*/
		HierarchichalInheritanceHostellerExtendsStudentDemo9 hostelStd = new HierarchichalInheritanceHostellerExtendsStudentDemo9(examFees,hostelFee); 
		System.out.println(hostelStd);
	} 
	 
}													

