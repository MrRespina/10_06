package com.ji.oop01;

public class Transportation {

	String type;
	int number;
	int fee;
	boolean seat;
	String station;

	public void go() {
		System.out.println("칙칙폭폭");
	}

	public void printInfo() {
		System.out.println("내가 타고 온 대중교통 : " + type);
		System.out.println("내가 타고 온 호선 : " + number);
		System.out.println("사용한 요금 : " + fee);
		System.out.println((seat == true ? "앉아서 왔음" : "일어나서 왔음"));
		System.out.println("내린 역 : " + station);
	}

}
