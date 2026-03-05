package com.object.oriented.programming.oop.blc;

public class ShallowCopyDemo1 {
	
	private double price; 
	
	public ShallowCopyDemo1(double price){
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
		return "ShallowCopyDemo1 [price=" + price + "]";
	}
		
}
