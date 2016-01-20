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
		
		System.out.println("<<2���� ���� �����ϱ� ���� ���α׷��Դϴ�>>");
		System.out.println("2���� ���� �Է��ϼ���.");
		
		System.out.print("ù��° �� �Է�:");
		numberOne = scanner.nextInt();
		
		System.out.print("�ι�° �� �Է�:");
		numberTwo = scanner.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ��� :");
		operator = scanner.next();
		
		computeResult = computer.computeNumber(numberOne, numberTwo, operator);
		if ( operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") )
			System.out.println(numberOne + operator + numberTwo + "=" + computeResult);
		
		scanner.close();
	}
}
