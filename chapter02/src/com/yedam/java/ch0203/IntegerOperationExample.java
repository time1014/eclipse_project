package com.yedam.java.ch0203;

public class IntegerOperationExample {

	public static void main(String[] args) {
		// int 보다 밑의 타입 자동 타입 변환
		byte x = 30;
		byte y = 50;
//		byte z = (byte)(x + y);
		int z = x + y;
		
		//long 포함 long으로 자동 타입 변환
		int a = 100;
		long b = 150L;
		long c = a + b;
		
		
		

	}

}
