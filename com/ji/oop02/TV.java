package com.ji.oop02;

public class TV {

	int maxChannel=100;
	int bolume=10;
	boolean onOf=true;
	int channel;
	
	public void printInfo() {
		
		System.out.println("모든 채널 수 : "+maxChannel);
		System.out.println("볼륨 : "+bolume);
		System.out.println("온 오프? : "+(onOf==true?"On":"Off"));
		System.out.println("현재 채널 : "+channel);
		
	}
	
}
