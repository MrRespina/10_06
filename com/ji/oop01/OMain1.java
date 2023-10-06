package com.ji.oop01;

public class OMain1 {
	
	public static void main(String[] args) {
		
		Transportation t = new Transportation();
		t.type = "지하철";
		t.number = 9;
		t.fee = 1500;
		t.seat = true;
		t.station = "신논현";
		
		t.go();
		t.printInfo();
		
		Phone p = new Phone();
		p.name = "V40";
		p.cooperation = "LG";
		p.price = 400000;
		p.number = "010-7151-7524";
		
		p.phoneCall();
		p.print();
		
	}

}
