package com.bit.day01;

public class VariableMain {
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		
		int a;
		a = 20;
		System.out.println(a);
		
		byte b = 10;
		short s = 100;
		int i = 10;
		long l = 1000;
		float f = 3.14f;
		// 실수형 리터럴 상수의 기본 타입은 double
		// 접미사 f를 붙여서 리터럴 상수의 타입을 float로 변환
		
		// 정수형 리터럴 상수의 기본 타입은 int
		// CPU는 int형 데이터의 크기만 연산 가능
		// 연산직전에 short형 데이터는 int형으로 형 변환
		// 변환 연산의 과정이 추가로 동작하는 단점
		
		// 속도보다 데이터의 양이 중요시 되는 상황
		// 데이터의 성격이 강하다면, short, byte 활용
		// mp3, 영상 파일 등...
		double d = 3.14;
		char c = 'A';
		boolean bool = true;
		
		String str = "Hi";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		System.out.println(str);
		
		// character
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 97;
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		
		// reference type (참조형, 참조변수)
		Circle circle = new Circle();
		circle.radius = 5;
		circle.area = 5 * 5 * 3.14;
		System.out.println(circle.area);
	}
	
}

class Circle {
	int radius;
	double area;
}