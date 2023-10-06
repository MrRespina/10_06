package com.ji.prac.oop2;

import java.util.Scanner;

public class Coffee {

	Scanner s = new Scanner(System.in);
	String name;
	Double weight;
	int price;

	public void printInfo() {

		System.out.println("====================");
		System.out.print("커피 이름 : " + name);
		System.out.print("커피 무게 : " + weight + "g");
		System.out.print("커피 가격 : " + price + "원");

	}

	public void setName() {

		System.out.println("커피 이름 : ");
		this.name = s.nextLine();

	}

	public void setWeight() {

		System.out.println("커피 무게 : ");
		this.weight = s.nextDouble();

	}

	public void setPrice() {

		System.out.println("커피 가격 : ");
		this.price = s.nextInt();

	}

	public void start() {

		setName();
		setWeight();
		setPrice();
		printInfo();

	}

}
