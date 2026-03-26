package com.object.oriented.programming.oop.blc;

/*purpose of this class : We are calcualting the grade somwhere else and We are storinng  the result to this file for only access purpose */
public class HowObjectTravelsInNetworkStudentClassStudentGrade {
	
	private HowObjectTravelsInNetworkStudentClass student;   
	/*If only object is created we can access the  properties and behaviour of 
	 * object:HowObjectTravelsInNetworkStudentClassObject */
	
	private char studentGrade; 								/*Stdent class object*/	               /*Calling static method -> calculateGrade(student)*/           /*After finding the grade of a student we are returning and creating object of class: StudentGrade */             
															/*Student stud = new Student()  -->>  calculateStudentGrade.calculateGrade(stud) -->>                  StudentGrade studGrad = new StudentGrade(student , grade) */          
		public HowObjectTravelsInNetworkStudentClassStudentGrade( HowObjectTravelsInNetworkStudentClass student,char studentGrade){
			this.student = student;   
			this.studentGrade= studentGrade; 
			}

		public HowObjectTravelsInNetworkStudentClass getStudent() {
			return student;
		}

		public void setStudent(HowObjectTravelsInNetworkStudentClass student) {
			this.student = student;
		}

		public char getStudentGrade() {
			return studentGrade;
		}

		public void setStudentGrade(char studentGrade) {
			this.studentGrade = studentGrade;
		}

		@Override
		public String toString() {
			return "HowObjectTravelsInNetworkStudentClassStudentGrade [studentGrade=" + studentGrade + "]";
		}
		
		
		
		
}