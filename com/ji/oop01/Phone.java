package com.ji.oop01;

public class Phone {
	
	String name,cooperation,number;
	int price;
	
	public void phoneCall() {
		
		System.out.println("띠리링");
		
	}
	
	public void print() {
		
		System.out.println("핸드폰 이름 : "+name);
		System.out.println("핸드폰 회사 : "+cooperation);
		System.out.println("핸드폰 가격 : "+price);
		System.out.println("핸드폰 번호 : "+number);
		
	}

}
