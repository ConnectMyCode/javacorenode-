package com.object.oriented.programming.oop.blc;

public class ConstructorGetterSetterEmployee {
	private  long employeeNumber; 
	private String employeeName; 
	private double employeeSalary;
	
	
	
	public ConstructorGetterSetterEmployee( long employeeNumber , String employeeName , double employeeSalary){
		
		/*For VALIDATION OF EMPLOYEE NUMBER*/
		String empnum = ""+employeeNumber;
		for(int i =0;i<=empnum.length()-1;i++){
			char literal = empnum.charAt(i);
			if(literal>=0 || literal<=9){
			}
			else {
				System.err.println("Invlaid input only enter digits/numbers from 0-9");
				System.exit(0);
			}
		}
		if(empnum.length() < 10 || empnum.length()>10){
			System.err.println("Invalid input Employee number must have 10 digits number");
			System.exit(0);
		}
		
		
		/*VALIDATION OF EMPLOYEE NAME*/
		if(employeeName.isBlank() || employeeName == "null"){
			System.err.println("Invalid Input please enter your name");
			System.exit(0);
		}
		
		
		/*VALIDATION OF EMPLOYEE SALARY*/
		if(employeeSalary<=0){
			System.err.println("Invalid Input Salary cannot be negative or zer");
			System.exit(0);
		}
		
		
		
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName ;
		this.employeeSalary =employeeSalary; 
		
	}
	

	public void setEmployeeSalary(double incrementAmount) {
		if(incrementAmount<=0){
			System.err.println("Invalid increment amount entered");
			System.exit(0);
		}
		this.employeeSalary += employeeSalary;
	}



	public String getEmployeeDesignation(double updatedSalary){
		setEmployeeSalary(updatedSalary); 
		if(employeeSalary >= 120000){
			return "Employee is a HR Manager";
		}
		if(employeeSalary >= 90000){
			return "Employee is a Developer";
		}
		if(employeeSalary>=60000){
			return "Employee is a Designer";
		}
		return "Employee is a Tester";
	}


	@Override
	public String toString() {
		return "ConstructorGetterSetterEmployee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName
				+ ", employeeSalary=" + employeeSalary + "]";
	} 
	
	
	
	
	
}	
