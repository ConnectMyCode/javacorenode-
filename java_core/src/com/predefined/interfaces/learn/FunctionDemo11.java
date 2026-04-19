package com.predefined.interfaces.learn;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo11 {
	
	
	public static void main(String []args) 
	{
		Scanner sc= new Scanner(System.in);
		
		/*
		public interface Function<T,R>  
		{
			public abstract R apply(T x);          
		}
	
		
		Note: <T> : Input Type 
			  <R> : Return Type
			  
			  Both are decided by developer  
			  You have to think more when using these Predefined Interface functions. 
			  
		 * */
				
	//	function< T , R  >   public void apply(T t){ return r; }     >>> t -> return r;
		Function<String ,Integer> fn1 = city -> city.length();
		
		String cityName = sc.nextLine();
		
		System.out.println("Length of"+ cityName +" is "+ fn1.apply(cityName)); 
		
		
	}
	
	

}
