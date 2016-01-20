package com.ktds.leinalee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int numberOne;
		int numberTwo;
		String operator;
		
		double computeResult;
		
		Computer computer = new Computer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<<2개의 수를 연산하기 위한 프로그램입니다>>");
		System.out.println("2개의 수를 입력하세요.");
		
		System.out.print("첫번째 수 입력:");
		numberOne = scanner.nextInt();
		
		System.out.print("두번째 수 입력:");
		numberTwo = scanner.nextInt();
		
		System.out.print("연산자를 입력하세요 :");
		operator = scanner.next();
		
		computeResult = computer.computeNumber(numberOne, numberTwo, operator);
		if ( operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") )
			System.out.println(numberOne + operator + numberTwo + "=" + computeResult);
		
		scanner.close();
	}
}
