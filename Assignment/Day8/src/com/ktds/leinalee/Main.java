package com.ktds.leinalee;

import java.util.Scanner;

public class Main {

	public static void main ( String[] args ) {
		
		Scanner scanner = new Scanner(System.in);
		Solution solution = new Solution();
		
		//���� 1���� ���� ����
		String name="";
		String address="";
		int age;
		
		//���� 2���� ���� ����
		String operatorTwo="";
		
		//���� 3���� ���� ����
		int numberOne;
		int numberTwo;
		String operatorThree;
		String exitCheck;
		
		//���� 1�� 
		System.out.println("<<�λ��ϴ� �޼ҵ� �����>>");
		System.out.print("�̸��� �Է����ּ��� :");
		name = scanner.next();
		
		System.out.print("�ּ��� �Է����ּ��� :");
		address = scanner.next();
		
		System.out.print("������ �Է����ּ��� :");
		age = scanner.nextInt();
		
		solution.sayHello(name, address, age);
		
		//���� 2�� 
		System.out.println("<<����ڰ� �Է��� ������ �˾ƺ���>>");
		System.out.print("�����ڸ� �Է��ϼ��� :");
		operatorTwo = scanner.next();
		operatorTwo = solution.catchOperator(operatorTwo);
		System.out.println("����ڰ� �Է��� �����ڴ� " + operatorTwo + " �Դϴ�.");
		
		//���� 3��
		while(true) {
			System.out.println("<<��Ģ���� ���α׷�>>");
			System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
			numberOne = scanner.nextInt();
			
			System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
			numberTwo = scanner.nextInt();
			
			System.out.print("�����ڸ� �Է��ϼ���(+ - * /)  :");
			operatorThree = scanner.next();
			
			solution.computer(numberOne, numberTwo, operatorThree);
			
			System.out.print("exit�� �Է��ϸ� ����˴ϴ�.");
			exitCheck = scanner.next();
			if(exitCheck.equals("exit")) {
				System.out.println("���α׷��� ����˴ϴ�. �����մϴ�.");
				break;
			}	
		}

		
	}
}
