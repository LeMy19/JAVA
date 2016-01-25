package com.ktds.leinalee;

import java.util.Scanner;

public class ArithmaticExceptionTest {

	public void start() {
		
		Scanner input = new Scanner (System.in);
		
		int numberOne = 0;
		int numberTwo = 0;
		double result = 0.0;
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		numberOne = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		numberTwo = input.nextInt();
		
		try {
			result = numberOne / (double) numberTwo;
			System.out.println("결과는 " + result + "입니다");
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
