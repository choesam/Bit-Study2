package com.bit.day01;

public class ArithMain {
	
	public static void main(String[] args) {
		// 산술 연산자
		int n1 = 7;
		int n2 = 3;
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
		
		result = n1 - n2;
		System.out.println("뺄셈 결과 : " + result);
		
		System.out.println("곱셈 결과 : " + n1 * n2);
		System.out.println("나눗셈 몫 결과 : " + n1 / n2);
		System.out.println("나눗셈 나머지 결과 : " + n1 % n2);
		System.out.println();
		
		// 나누기 연산
		System.out.println(10 / 3);
		System.out.println(10. / 3.);
		System.out.println(10. / 3);
		System.out.println();

		// 나머지 연산
		System.out.println(44 % 3);
		System.out.println(-7 % 3);
		System.out.println(7 % -3);
		System.out.println();
		
		// 복합대입 연산자
		double e = 3.1;
		e += 2.1;
		e *= 2;
		System.out.println(e);
		System.out.println();
		
		// 관계 연산자
		int a = 10, b = 20;
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		System.out.println();
		
		// 논리 연산자
		int num1 = 10, num2 = 20;
		boolean re1 = (num1 == 10) && (num2 == 20);
		boolean re2 = (num1 < 12) || (num2 >= 30);
		System.out.println(re1 + " " + re2);
		System.out.println();
		
		// 증감 연산자
		int aa = 7;
		int bb, cc;
		bb = ++aa;
		cc = --aa;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println();
		
		bb = aa++;
		cc = aa--;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println();
		
		// 비트 연산자
		int iNum1 = 5;	// 0000 0000 0000 1001
		int iNum2 = 3;	// 0000 0000 0000 0011
		int iNum3 = -1; // 1111 1111 1111 1111
		
		System.out.println(iNum1 & iNum2);
		System.out.println(iNum1 | iNum2);
		System.out.println(iNum1 ^ iNum2);
		System.out.println(~iNum3);
		System.out.println();
		
		int key = 230948;
		int password = 1234;
		int sub = 0;
		int re = 0;
		
		// 암호화
		sub = password ^ key;
		System.out.println(sub);
		// 복호화
		re = sub ^ key;
		System.out.println(re);
		System.out.println();
		
		// swap
		int aaa = 10, bbb = 6;
		System.out.println(aaa);
		System.out.println(bbb);
		aaa ^= bbb;
		bbb ^= aaa;
		aaa ^= bbb;
		System.out.println(aaa);
		System.out.println(bbb);
		
		// 비트 이동 연산자
		System.out.println("3 << 4 : " + (3 << 4));
		System.out.println("48 >> 4 : " + (48 >> 4));
		System.out.println("48 >>> 4 : " + (48 >>> 4));
		
		int iiNum1 = 2100000000;
		int iiNum2 = 2050000000;
		System.out.println((iiNum1 + iiNum2) / 2);
		System.out.println((iiNum1 + iiNum2) >>> 1);
		System.out.println();
		
		System.out.println("===========================================");
		
		// 조건 연산자
		int i = 0, j = 0, res = 0;
		i = 3;
		j = 4;
		res = (i > j) ? i : j;
		System.out.println("result : " + res);
		
		res = (i < j) ? i++ + --j : i-- + ++j;
		System.out.println("result : " + res);
		System.out.println("i : " + i + ", j : " + j);
	}
	
}
