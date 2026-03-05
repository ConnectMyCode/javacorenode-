package com.object.oriented.programming.oop.blc;

public class DeepCopyDemo1{
	
	private double price;
	
	
	public DeepCopyDemo1(){
		price= 0.0;
	}
	
	public DeepCopyDemo1(double price){
		this.price = price; 
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DeepCopyDemo1 [price=" + price + "]";
	}
	
	
}
