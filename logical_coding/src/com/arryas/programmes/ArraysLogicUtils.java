package com.arryas.programmes;

public class ArraysLogicUtils {
	
	
	public static double findMinimum(double[] array1)  
	{
		double min =array1[0] ; 
		for(int i= 0; i<=array1.length-2; i++){ 
 
				if(array1[i] > array1[i+1])  
				{ 
					min = array1[i+1]; 
				}     
				else 
				{
					min = array1[i]; 
				}
			}
			
		return min;   
	}
	

}

