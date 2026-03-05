package com.object.oriented.programming.oop.blc;
	
public class CopyConstructorPassingAnObjectReferenceToConstructorManager {
	
	private String managerName; 
	private String  managerId;
	
																	//Copy Conmstructor;
	public CopyConstructorPassingAnObjectReferenceToConstructorManager( CopyConstructorPassingAnObjectReferenceToConstructorEmployee employee) 
	{
		this.managerName = employee.getEmployeName(); 
		this.managerId = employee.getEmployeId();  
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerId() {
		return managerId;
	}

	@Override
	public String toString() {
		return "CopyConstructorPassingAnObjectReferenceToConstructorManager [managerName=" + managerName
				+ ", managerId=" + managerId + ", getManagerName()=" + getManagerName() + ", getManagerId()="
				+ getManagerId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	
	
	
	
	
}	
