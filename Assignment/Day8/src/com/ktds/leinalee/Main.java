package com.ktds.leinalee;

import java.util.Scanner;

public class Main {

	public static void main ( String[] args ) {
		
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		
		//���� 2���� ���� ����
		String operatorOne="";
		
		//���� 3���� ���� ����
		int numberOne;
		int numberTwo;
		String operatorTwo;
		String exitCheck;
		
		//���� 1�� 
		System.out.println("<<�λ��ϴ� �޼ҵ� �����>>");
		System.out.print("�̸��� �Է����ּ��� :");
		Solution.name = scanner.next();
		
		System.out.print("�ּ��� �Է����ּ��� :");
		Solution.address = scanner.next();
		
		System.out.print("������ �Է����ּ��� :");
		Solution.age = scanner.nextInt();
		
		solution.sayHello();
		
		//���� 2�� 
		System.out.println("<<����ڰ� �Է��� ������ �˾ƺ���>>");
		System.out.print("�����ڸ� �Է��ϼ��� :");
		operatorOne = scanner.next();
		operatorOne = solution.catchOperator(operatorOne);
		System.out.println("����ڰ� �Է��� �����ڴ� " + operatorOne + " �Դϴ�.");
		
		//���� 3��
		while(true) {
			System.out.println("<<��Ģ���� ���α׷�>>");
			System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
			numberOne = scanner.nextInt();
			
			System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
			numberTwo = scanner.nextInt();
			
			System.out.print("�����ڸ� �Է��ϼ���(+ - * /)  :");
			operatorTwo = scanner.next();
			
			solution.computer(numberOne, numberTwo, operatorTwo);
			
			System.out.print("exit�� �Է��ϸ� ����˴ϴ�.");
			exitCheck = scanner.next();
			if(exitCheck.equals("exit")) {
				System.out.println("���α׷��� ����˴ϴ�. �����մϴ�.");
				break;
			}	
		}

		
	}
}
