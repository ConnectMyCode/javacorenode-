package com.object.oriented.programming.oop.blc;

public class Account {
	
	private String userName;  
	private String password; 
	
	private Account(String userName , String password){
		this.userName = userName; 
		this.password = password; 
	}
	
	public static Account createAccountMethod(String userName , String password){
		return new Account(userName , password);
	}
}