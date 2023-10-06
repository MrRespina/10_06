package com.ji.oop05;

public class OMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.category="국어";
		t.day=5;
		t.month=11;
		t.hour=14;
		t.useTime=1;
		
		t.hateTest();
		t.printInfo();
		
		Test t2 = t;
		System.out.println(t);
		System.out.println(t2);
		t=null;
		System.out.println(t);
		System.out.println(t2);
		t2=null;
		System.out.println(t);
		System.out.println(t2);
		
	}

}
