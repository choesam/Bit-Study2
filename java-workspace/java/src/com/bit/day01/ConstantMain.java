package com.bit.day01;

public class ConstantMain {
	
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		number = 20;
		System.out.println(number);
		
		// 상수명은 대문자, 스네이크 케이스 활용
		final int CONST_NUMBER = 10;
		System.out.println(CONST_NUMBER);
//		CONST_NUMBER = 20;
		
		final double PI = 3.1415;
		System.out.println(PI);
	}
	
}
