package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerDemo9 {

	
	public static void main(String []args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		// void accept(T t) 
		Consumer<Double> c1 = num -> System.out.println("Salary is: "+num);
		c1.accept(120000.9090);
		
		
		c1.accept(234.5433);
		/*Use multiple consumers when tier are multiple roles and responsibilites*/
		
		
		
		Consumer<EmployeeDemo9> empName = employeeName -> System.out.println("Name:"+employeeName.name()); 
				
		Consumer<EmployeeDemo9> empSalary = employeeSalary -> System.out.println("Salary:"+employeeSalary.salary()); 
		
		Consumer<EmployeeDemo9> empId = employeeId -> System.out.println("Employee ID is: "+ employeeId.id());
		
		System.out.println("Enter How many Employees Data want to Enter: ");
		int index = sc.nextInt();
		EmployeeDemo9 []employeeData = new EmployeeDemo9[index]; 
		
		System.out.println("Enter Id , Name, Salary" );
		for(int i = 0; i<index ;i++)
		{
			Integer id = sc.nextInt();
			sc.nextLine();
			String name =  sc.nextLine(); 
			Double salary = sc.nextDouble();
			sc.nextLine();
			
			employeeData[i] = new EmployeeDemo9(id, name, salary);
			
			
		}	
		
		/*Display  details of Employee using Consumer Interface*/
		
		
		for(EmployeeDemo9 employee: employeeData) 
		{
			empName.accept(employee);
			empSalary.accept(employee);
			empId.accept(employee);
			System.out.println();
		}
		
		
		
	}
}
