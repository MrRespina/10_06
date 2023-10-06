package com.ji.oop05;

public class Test {
	
	int month,day,hour,useTime;
	String category;
	
	public void hateTest() {
		
		System.out.println("으아아악!!");
		
	}
	
	public void printInfo() {
		
		System.out.printf("%02d월 ",month);
		System.out.printf("%02d일 ",day);
		System.out.printf("%02d시",hour);
		System.out.print("\n"+category+"과목 시험이 ");
		System.out.println(useTime+"시간 만큼 있습니다.");
		
	}
	
	//월 일 시 과목명 걸리는 시간 , hateTest() > 으아아악!! printInfo() > 시험 관련 모든 정보 출력

}
