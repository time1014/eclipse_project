package com.yedam.java.ch0204;

import java.util.Scanner;


public class ScannerCommonExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String inputData = sc.nextLine();
		System.out.println(inputData);
		
		System.out.println("프로그램 종료");
		sc.close();	
	}
}


