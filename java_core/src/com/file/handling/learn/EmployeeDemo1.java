package com.file.handling.learn;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
																								//Marker Interface : Interface used to tell JVM . 
public record EmployeeDemo1(Integer id , String name, Double salary , LocalDateTime hireDate) implements Serializable 
{	
		public static EmployeeDemo1  getEmployeeObject(Integer id , String name, Double salary , LocalDateTime localDateTime) 
		{
			return new  EmployeeDemo1(id , name,  salary ,localDateTime);				
		}
		
		
		
		
	
}	

