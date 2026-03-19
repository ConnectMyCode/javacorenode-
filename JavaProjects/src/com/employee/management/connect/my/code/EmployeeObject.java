package com.employee.management.connect.my.code;

public class EmployeeObject {
	
	/*When Manager Clicks Add Employee this Class Employee is loaded and the new Employee object is created*/
	
	private int id;
	private String name;
	private String contact; 
	private double salary ;
	private String position;  //{SE-1 , SE-2, SE-3 ,SE-4}
	
	
	private EmployeeObject(int id ,String name , String contact , double salary , String position) 
	{
		this.id= id;
		this.name= name; 
		this.contact =contact; 
		this.salary =salary; 
		this.position = position; 
	} 
	
	
	
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}







	public void setName(String name) {
		this.name = name;
	}







	public void setContact(String contact) {
		this.contact = contact;
	}







	public void setSalary(double salary) {
		this.salary = salary;
	}







	public void setPosition(String position) {
		this.position = position;
	}







	public int getId() {
		return id;
}





	public String getName() {
		return name;
	}





	public String getContact() {
		return contact;
	}





	public double getSalary() {
		return salary;
	}





	public String getPosition() {
		return position;
	}
	
		
	
	
	
	public static EmployeeObject getEmployeeObject(int id , String name ,String contact , double salary , String position) 
	{
		return new EmployeeObject( id , name , contact , salary , position ); 
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id= ,"+id +"name=" + name + ", contact=" + contact + ", salary=" + salary + ", position=" + position
				+ "]";
	}
	
}
