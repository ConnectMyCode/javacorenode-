package com.object.oriented.programming.oop.blc;
	
public class CopyConstructorPassingAnObjectReferenceToConstructorEmployee {
	
	private String employeName ; 
	private String employeId;
	
	public CopyConstructorPassingAnObjectReferenceToConstructorEmployee(String employeName , String employeId)
	{
		this.employeName = employeName;
		this.employeId = employeId; 
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getEmployeId() {
		return employeId;
	}

	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}

	@Override
	public String toString() {
		return "CopyConstructorPassingAnObjectReferenceToConstructorEmployee [employeName=" + employeName
				+ ", employeId=" + employeId + ", getEmployeName()=" + getEmployeName() + ", getEmployeId()="
				+ getEmployeId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	 
	
	
	
	
	
}	
	