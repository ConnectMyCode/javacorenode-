package com.java.lab.multiThreading;

import java.util.Scanner;

public class StudentEnrollementProcess {

	public static void main(String []args) {
		
		
		//1st call Chairman to create course and offers
			//	A. Decide number of courses  internally calls Create Course method.    
			//  B. Create Courses
		
		//2nd pass these course and offers to Insititue object
		
		//3rd Student Object created 
		
		//use the student object  methods 
		//	1. 	public void viewCourseAndFees() {  }
		
	//	public void viewOffers() {  }
		
   //	public void enrollInCourse(Integer courseId) {  }

		Scanner sc = new Scanner(System.in);
		
		Chairman director = new Chairman();
			
		director.decideNumberOfCourse();
		
		
		//Parameterized contructor >>  EducationInstitute(Course[] courses , OfferText[] offer )
		EducationInstitute institute = new EducationInstitute(director.getCourses() , director.getOffers());		
		
		
		
		System.out.println("Enter your name:  ");
		String name = sc.next();
		
//Student Class parameterized Constructor >> public record Student(String name , EducationInstitute institute) {
// 		 Inside Records a parameterized constructor is generated automatically . 
		Student student1 = new Student(name , institute); 
		
		//a.student see the course 
		//b. decide the ourse enters his/her name and course id 
		//c. display offers
		
		student1.viewCourseAndFees();
		
		System.out.println("Enter the Course Id of selected course : ");
		Integer id = sc.nextInt();
		student1.enrollInCourse(name, id);
		
		student1.viewOffers();
		
		
	}
	
	
}
