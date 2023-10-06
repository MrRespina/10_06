package com.ji.prac.oop3;

public class Main {

	// 컴퓨터 동전 20개 소지 , 컴퓨터가 유저한테 동전 몇개로 할지 물음.
	// 유저 동전 갯수로 대답 (2개 이상 최대 갯수 이하.) > 컴퓨터가 짤짤이를 함 .(랜덤으로 숫자 뽑기)
	// 유저가 홀/짝 대답하고 컴퓨터가 정답 여부 판정 .
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User("지병천",20);
		Computer c = new Computer();
		c.start(u);

	}

}
