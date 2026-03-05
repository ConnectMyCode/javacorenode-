package com.object.oriented.programming.oop.blc;

public class ConstructorGetterSetterRectangle{ 
	
	private  double width;
	private  double height; 
	
	private double perimeter;
	private double area; 
	
	public ConstructorGetterSetterRectangle(double width , double height){
		this.width = width; 
		this.height=height; 
		this.perimeter = 2*(height+width);
		this.area = width*height;
	}
	
	
	public double getArea(){
		return area;
	}
	
	public double getPerimeter(){
		return perimeter; 		
	}
	
	
	
	
	

}
