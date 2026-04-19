package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo7 {

	public static void main(String []args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
										//	boolean test(T t) {}    ---->    student -> if(student.marks()>=80){return true; } else{return false;}   
		Predicate<StudentRecordCommon> exam = student->student.marks()>=75; 					
		
		
		
		
		//Array of students:   //int []arr = new int[5]    syntax 
		System.out.println("Enter number of students wnat to add ");
		
		int index = sc.nextInt();
		StudentRecordCommon students[] = new StudentRecordCommon[index];
		
		
		for(int i=0; i<index;i++) 
		{			
			System.out.println("Enter id , marks ,name of student: "+i+"\n"); 
			Integer id = sc.nextInt();
			
			
			Double marks= sc.nextDouble();
			
			
			sc.nextLine();
			/*sc.nextLine(); // ✅ consume leftover newline*/

			
			String name = sc.nextLine();
			
		
	
			students[i] = new StudentRecordCommon(id, marks, name);	
			
			
		}
		sc.close();
		
		for(StudentRecordCommon student : students) 
		{	
			if(exam.test(student))  
			{
					System.out.println(student.name()+"Passed the exam : ✅");
			}
			else {
				System.out.println(student.name()+"Failed the exam : ☠️");				
			}
			
		}
	}
}
