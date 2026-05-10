package com.multithreading.learn;

public class CustomerDemo16 extends Thread {
	
	
	private String name;
	
	public CustomerDemo16(String name) 
	{
		this.name = name;
	}
	
	
	@Override
	public void run() 
	{
		OnlinePortalDemo16.ticketConfirmationSystem(name);
	}
	

}
