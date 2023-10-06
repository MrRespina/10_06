package com.ji.prac.oop1;

import java.util.Scanner;

public class Guest {

	String name;
	double height, weight;
	Scanner s = new Scanner(System.in);

	public double getHeight() {

		System.out.print("키 입력 : ");
		double h = s.nextDouble();
		return h;

	}

	public String getName() {
		
		System.out.print("이름 입력 : ");
		String name = s.nextLine();
		return name;

	}

	public double getWeight() {

		System.out.print("몸무게 입력 : ");
		double w = s.nextDouble();
		return w;

	}

}
