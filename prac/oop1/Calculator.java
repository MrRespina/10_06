package com.ji.prac.oop1;

public class Calculator {

	double h, w, bmi;
	String name, result;
	
	public void setName(Guest s) {
		
		name = s.getName();
		
	}

	public void calcBMI(Guest s) {

		h = s.getHeight();
		w = s.getWeight();
		bmi = w / ((h / 100) * (h / 100));

	}

	public void bmiCheck(Guest s) {

		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 25) {
			result = "정상";
		} else if (bmi >= 25 && bmi < 30) {
			result = "과체중";
		} else if (bmi >= 30 && bmi < 35) {
			result = "경도비만";
		} else if (bmi >= 35 && bmi < 40) {
			result = "중등도비만";
		} else {
			result = "고도비만";
		}

	}

	public void printGuest(Guest s) {

		System.out.println("이름 : " + name);
		System.out.println("키 : " + h/100+"m");
		System.out.println("몸무게 : " + w);
		System.out.printf("BMI 지수 : %.3f%%\n", bmi);
		System.out.println("결과 : " + result);

	}

	public void start() {

		Guest s = new Guest();
		setName(s);
		calcBMI(s);
		bmiCheck(s);
		printGuest(s);

	}

}
