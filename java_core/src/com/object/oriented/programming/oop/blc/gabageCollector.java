package com.object.oriented.programming.oop.blc;

public class gabageCollector { 

	private float hameoglobin; 
	
	private double bloodPressure; 
	
	public gabageCollector(float hameoglobin, double bloodPressure){
		this.hameoglobin = hameoglobin; 
		this.bloodPressure = bloodPressure; 
	}

	public float getHameoglobin() {
		return hameoglobin;
	}
    
	public void setHameoglobin(float hameoglobin) {
		this.hameoglobin = hameoglobin;
	}

	public double getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	@Override
	public String toString() {
		return "gabageCollector [hameoglobin=" + hameoglobin + ", bloodPressure=" + bloodPressure
				+ ", getHameoglobin()=" + getHameoglobin() + ", getBloodPressure()=" + getBloodPressure()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
