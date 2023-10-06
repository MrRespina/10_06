package com.ji.prac.oop3;

import java.util.Random;
import java.util.Scanner;

public class Computer {

	public Computer() {

		money = 20;

	}

	Scanner s = new Scanner(System.in);
	Scanner c = new Scanner(System.in);
	int money, rand, stacks;
	String check = "", myCheck = "";
	boolean b = true;
	boolean b2 = true;

	public void play(User u) {

		System.out.println("====== 홀짝 게임 ======");
		payMoney(u);
		randomizeNumber();
		getNumber();
		calc(check, myCheck, u);
		result(u);

	}

	public int payMoney(User u) {

		while (b == true) {
			System.out.print("몇개의 동전을 거시겠어요 ? : ");
			stacks = s.nextInt();
			if (stacks > u.penny || stacks < 2 || stacks > money) {
				System.out.println("최소 가능 동전 갯수는 2개 이며");
				int max = (u.penny >= money) ? money : u.penny;
				System.out.println("최대 가능 동전 갯수는 " + max + "개 입니다.");
				System.out.println("정확히 입력해주세요!");
			} else {
				b = false;
			}
		}

		b = true;
		return stacks;

	}

	public void randomizeNumber() {

		rand = new Random().nextInt(10) + 1;
		if (rand % 2 == 1) {
			check = "홀수";
		} else {
			check = "짝수";
		}

	}

	public String getNumber() {

		while (b2 == true) {

			System.out.print("홀수일까요 짝수일까요 ? : ");
			myCheck = c.nextLine();

			if ((myCheck).equals("홀수") || (myCheck).equals("짝수")) {
				b2 = false;
			} else {
				System.out.println("홀수나 짝수를 입력해주세요!");
			}

		}
		b2 = true;
		return myCheck;

	}

	public void calc(String check, String myCheck, User u) {

		System.out.println("====================");
		System.out.println("나온 숫자 : " + rand);
		System.out.println("내가 낸 답 : " + myCheck);
		System.out.println("컴퓨터의 답 : " + check);

		if (check.equals(myCheck)) {
			System.out.println("정답입니다 !");
			this.money -= stacks;
			u.penny += stacks;
		} else {
			System.out.println("오답입니다 !");
			u.penny -= stacks;
			this.money += stacks;
		}
		System.out.println("====================");

	}

	public void result(User u) {

		System.out.println("내게 남은 동전 : " + u.penny);
		System.out.println("컴퓨터가 가진 동전 : " + money);
		if (u.penny == 0) {
			System.out.println("컴퓨터의 승리!");
		} else if (money == 0) {
			System.out.println(u.name + "님의 승리!");
		}

	}

	public void start(User u) {

		System.out.println("안녕하세요 " + u.name + "님!");
		System.out.println("게임을 시작하겠습니다.");

		while ((u.penny != 0) || money != 0) {

			play(u);
			if ((u.penny == 0) || (money == 0)) {
				s.close();
				c.close();
				break;

			}

		}

	}

}
