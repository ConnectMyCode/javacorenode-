package com.java.lab.multiThreading;

import java.util.Scanner;

public class Chairman {     //WHY final ?? 
	
	private  Integer numberOfCOurse; 
	private  Course []courses; 	
	private   OfferText[] offers;          
	
	private  Scanner sc = new Scanner(System.in);
	
	
	public void decideNumberOfCourse() {
		System.out.println("Enter number of Courses want to create");    
		numberOfCOurse = sc.nextInt();
		System.out.println("Number of courses decided is : "+ numberOfCOurse);  
		
		CreateCourse(numberOfCOurse);
	}


	public void CreateCourse(Integer numberOfCOurse) { 
		
		
		
		
		courses = new Course[numberOfCOurse];
		 offers = new OfferText[numberOfCOurse];    
		
		
		for(int i =0 ; i<numberOfCOurse ; i++) {
			System.out.println("Enter the Course Name , Id , Fee: ");
			
			System.out.println("Course ID: ");
			Integer courseId = sc.nextInt(); 
			sc.nextLine();

			System.out.println("Course Name: ");
			String courseName = sc.nextLine();
			
			System.out.println("Course Fees: ");
			Double fee = sc.nextDouble(); 
			sc.nextLine();
			
			courses[i] = new Course(courseId , courseName , fee);
			
			System.out.println("Enter Offer for this course Created " + courses[i].getName());
			String offersDescription =  sc.nextLine();
			offers[i]  = new OfferText(offersDescription);
			
		}
	}

	
	
	public Course[] getCourses() {
		return courses;
	}
	
	
	public OfferText[] getOffers() {
		return offers;
	}

	
}
