package com.java.lab.multiThreading;

public record Student(String name , EducationInstitute institute) {
	
	
	public void viewCourseAndFees() { institute.displayCoursesAndOffers(); } 
	
	public void viewOffers() { institute.displayOffers(); }
	
	public void enrollInCourse(String name , Integer courseId) { institute.studentEnrollement(name, courseId);  }

	
	
}
