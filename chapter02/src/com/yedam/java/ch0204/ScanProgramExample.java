package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExample {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String inputData = null;
		
		while (true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열 : %s\n",inputData);
			if(inputData.equals("q")){
				System.out.println("종료");
				break;
			}
		}
		sc.close();
	}
}
