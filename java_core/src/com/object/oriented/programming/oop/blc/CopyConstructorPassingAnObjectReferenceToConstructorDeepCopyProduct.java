package com.object.oriented.programming.oop.blc;

public class CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct {

	private String productName;
	private double productPrice; 
	
	
public CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct(String productName , double productPrice){
		this.productName = productName; 
		this.productPrice = productPrice;  
	}
	
	/* Constructor Overloading */ 
public CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct( CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct product)
	{
		this.productName = product.getProductName();  
		this.productPrice = product.getProductPrice();  
	}

	@Override
	public String toString() {
		return "CopyConstructorPassingAnObjectReferenceToConstructorDeepCopyProduct [productName=" + productName
				+ ", productPrice=" + productPrice + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	
	
}
