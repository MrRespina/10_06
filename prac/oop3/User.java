package com.ji.prac.oop3;

public class User {
	
	int penny;
	String name;
	
	public User(String name,int penny) {
		
		setPenny(penny);
		setName(name);
		
	}
	
	public void setPenny(int penny) {
		
		this.penny = penny;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}

}
