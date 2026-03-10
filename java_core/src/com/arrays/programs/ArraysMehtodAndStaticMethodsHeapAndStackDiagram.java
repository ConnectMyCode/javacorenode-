package com.arrays.programs;

public class ArraysMehtodAndStaticMethodsHeapAndStackDiagram {
	
	public static void main(String args[]) 
	{
		Alpha am1 = new Alpha(9);
		Alpha am2 = new Alpha(2);
		
		Alpha []arrr = fill(am1 ,am2); 
		
		arrr[0] =am1;  
		System.out.println(arrr[0].val);
		System.out.println(arrr[1].val);
	}
	
	public static Alpha[] fill(Alpha a1 , Alpha a2)  
	{
		a1.val = 15; 
		Alpha fa[] = new Alpha[]{a2,a1};
		
		return fa; 
	}
}

class Alpha
{
		int val; //NSF
		
		static int sval = 200; 
		static ArraysMehtodAndStaticMethodsHeapAndStackDiagram b = new ArraysMehtodAndStaticMethodsHeapAndStackDiagram();
	
		public Alpha(int val){
			this.val = val;
		}
		
}


