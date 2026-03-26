package com.inheritance.learn;

public class SingleLeevelnheritanceTempEmpDemo2{
		
	private int id; 
	private String tempEmp; 
	private double salary;  		
	
	
	public SingleLeevelnheritanceTempEmpDemo2(int id, String tempEmp , double salary)
	{   
		this.id = id; 
		this.tempEmp = tempEmp; 
		this.salary= salary; 
	}


	@Override
	public String toString() {
		return "SingleLeevelnheritanceTempEmpDemo2 [id=" + id + ", tempEmp=" + tempEmp + ", salary=" + salary + "]";
	}				
	
	
	
	
	
}

