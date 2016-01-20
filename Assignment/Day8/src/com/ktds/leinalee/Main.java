package com.ktds.leinalee;

import java.util.Scanner;

public class Main {

	public static void main ( String[] args ) {
		
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		
		//문제 2번을 위한 변수
		String operatorOne="";
		
		//문제 3번을 위한 변수
		int numberOne;
		int numberTwo;
		String operatorTwo;
		String exitCheck;
		
		//문제 1번 
		System.out.println("<<인사하는 메소드 만들기>>");
		System.out.print("이름을 입력해주세요 :");
		Solution.name = scanner.next();
		
		System.out.print("주소을 입력해주세요 :");
		Solution.address = scanner.next();
		
		System.out.print("나이을 입력해주세요 :");
		Solution.age = scanner.nextInt();
		
		solution.sayHello();
		
		//문제 2번 
		System.out.println("<<사용자가 입력한 연산자 알아보기>>");
		System.out.print("연산자를 입력하세요 :");
		operatorOne = scanner.next();
		operatorOne = solution.catchOperator(operatorOne);
		System.out.println("사용자가 입력한 연산자는 " + operatorOne + " 입니다.");
		
		//문제 3번
		while(true) {
			System.out.println("<<사칙연산 프로그램>>");
			System.out.print("첫 번째 숫자를 입력하세요 : ");
			numberOne = scanner.nextInt();
			
			System.out.print("두 번째 숫자를 입력하세요 : ");
			numberTwo = scanner.nextInt();
			
			System.out.print("연산자를 입력하세요(+ - * /)  :");
			operatorTwo = scanner.next();
			
			solution.computer(numberOne, numberTwo, operatorTwo);
			
			System.out.print("exit을 입력하면 종료됩니다.");
			exitCheck = scanner.next();
			if(exitCheck.equals("exit")) {
				System.out.println("프로그램이 종료됩니다. 감사합니다.");
				break;
			}	
		}

		
	}
}
