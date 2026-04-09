package com.abstraction.learn;

public class AbstractClassAndAbstractMethodUsingArrayDemo6 {

	public static void main(String []args) 
	{
		AbstractClassAndAbstractMethodUsingArrayShapeDemo6 shapes[] = new AbstractClassAndAbstractMethodUsingArrayShapeDemo6[3];
		
		shapes[0] = new AbstractClassAndAbstractMethodUsingArraySquareDemo6();
		shapes[1] = new AbstractClassAndAbstractMethodUsingArrayRectangleDemo6();
		shapes[2] = new AbstractClassAndAbstractMethodUsingArrayCircleDemo6();
		
		//Shapes[0] = new square(); 
		//Shapes[1] = new rectangle(); 
		//Shapes[2] = new circle();    
		
		for(AbstractClassAndAbstractMethodUsingArrayShapeDemo6 shape : shapes) 
		{
			shape.draw();
		}
	}	    
	
	
}
