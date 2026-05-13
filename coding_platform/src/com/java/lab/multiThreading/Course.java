package com.java.lab.multiThreading;

public record Course(Integer id , String name , Double fee) 
{
	
	//Dynamically the Array grows as the number of courses increase
	
	
	
	//Use fixed size array to store the courses details
	
	
	
	

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getFee() {
		return fee;
	}
	
}

