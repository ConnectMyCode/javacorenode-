package com.file.handling.learn;

import java.io.Serializable;

public class CustomerDemo3 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String name;
	private transient double balance;    //this will not be serialized. 
  	private transient long mobileNumber;  //Will not be serialized
	
	public CustomerDemo3(Integer Id , String name , double balance , long mobileNumber) 
	{
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.mobileNumber = mobileNumber ;
	}
	
	
	public String toString() 
	{
		return "Customer [id ="+id+", name="+name+", balance="+balance+", mobileNumber="+mobileNumber+"]";
	}

}



