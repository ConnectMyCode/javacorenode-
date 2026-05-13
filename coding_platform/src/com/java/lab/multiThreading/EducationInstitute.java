package com.java.lab.multiThreading;

import java.util.Arrays;

public class EducationInstitute {
	
	
	private Course[] courses;
	private OfferText[] offers;
	
	private String name;
	private Integer courseIdSelected;
	
	
	public EducationInstitute(Course[] courses , OfferText[] offer ) {
		
		this.courses = courses;
		
		this.offers = offer;
		
	}
	
	
	
	public void displayCoursesAndOffers() {
		System.out.println("=======================Courses========================");
		int i =0 ;
		
		for(Course course : courses) {
			
			System.out.println(" ID :"+course.getId()+"\n " + "Name :"+course.getName() +"\n Course Fees :" +course.getFee() + "\n Offer :"+offers[i].getOfferDescription() + "\n" );
			
			i++;
			
		}
		System.out.println("***************************End*************************");   
			
	}
	
	
	
	public void studentEnrollement(String name , Integer courseIdSelected) {
		
		this.name = name;
		
		this.courseIdSelected = courseIdSelected; 
		
		int i =0 ;
		
		Boolean isFlag = false;
		
		for(Course course : courses) {
			
			if(course.getId().equals(this.courseIdSelected)) {
				isFlag = true;
				System.out.println(course.toString() + "\nOffers :"+ offers[i].getOfferDescription() + "\nThank you for selecting our Course we Wish you all the best for your Future Learning Journey." );
				
			}
			i++;
		}
		
		if(isFlag.equals(false)) {
			System.out.println("Course is not available");
		}
		
	}
	
	
	
	public void displayOffers() {
		
		System.out.println(Arrays.toString(offers));     
	}
	
	
}	
