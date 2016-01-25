package com.ktds.leinalee;

import java.util.Scanner;

public class ArithmaticExceptionTest {

	public void start() {
		
		Scanner input = new Scanner (System.in);
		
		int numberOne = 0;
		int numberTwo = 0;
		double result = 0.0;
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		numberOne = input.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		numberTwo = input.nextInt();
		
		try {
			result = numberOne / (double) numberTwo;
			System.out.println("����� " + result + "�Դϴ�");
		} 
		catch ( ArithmeticException ae ) {
			System.out.println(ae.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		ArithmaticExceptionTest test = new ArithmaticExceptionTest();
		test.start();
	}
}
