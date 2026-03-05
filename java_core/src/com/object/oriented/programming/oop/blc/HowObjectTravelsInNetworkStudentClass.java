package com.object.oriented.programming.oop.blc;

public class HowObjectTravelsInNetworkStudentClass {   
	
 private String name; 
 private int marks; 
 
 public HowObjectTravelsInNetworkStudentClass(String name , int marks){
	 this.name = name;   
	 this.marks= marks;     
	 
 }
 
 public void setName(String name)
 {
	 this.name = name; 
 }
 
 public String getName(){
	 return this.name;
 }

 public int getMarks() {
	return marks;
 }

 public void setMarks(int marks) {
	this.marks = marks;
 }

 @Override
 public String toString() {
	 
	 System.out.println("The Student Raj has"+ "Grade");
	return "HowObjectTravelsInNetworkStudentClass [name=" + name + ", marks=" + marks + "]";
 }
 
 
}
