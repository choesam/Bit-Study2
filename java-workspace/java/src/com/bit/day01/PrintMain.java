package com.bit.day01;

public class PrintMain {
	
	public static void main(String[] args) {
		System.out.println(12);
		System.out.print(12.34);
		System.out.println('A');
		System.out.print("ABC");
		
		System.out.println();
		
		System.out.printf("%d\n%c\n", 12, 'A');
		
		System.out.printf("%d\r\n%c\n", 12, 'A');
		System.out.printf("%d\r%c\n", 12, 'A');
		System.out.printf("%d\n%c\n", 12, 'A');
		System.out.printf("%d\n\r%c\n", 12, 'A');
		
		System.out.printf("%d%n%c\n", 12, 'A');
		System.out.print("Hello~%n");
		System.out.println("Hello~");
		
		System.out.println();
		System.out.println(12 + ' ' + 12.34);
		System.out.println(12 + " " + 12.34);
	}
	
}
