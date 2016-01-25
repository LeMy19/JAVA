package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExceptionTest {
	
	public void start() {
		
		System.out.println("������ �Է��ϼ���.");
		
		Scanner input = new Scanner( System.in );
		int number = 0;

//		����ڰ� ������ �Է��� ������ �ݺ��Ѵ�. 
		while (true) {
//			���ܰ� �߻����� �ƴ��� �𸣰�����, �켱 �����غ���. 
			try {
//				���ܰ� �߻��� ���ɼ��� �ִ� �ڵ��... 
				number = input.nextInt();
				break;
			}
//			try ������ �ڵ尡 InputMisMatchException �� �����ٸ� 
//			���ܸ� �޾ƿ´�. 
//			catch�� ����Ǵ� ������ program�� ������� �ʴ´�. 
			catch (InputMismatchException ime ) {
				input = new Scanner (System.in);
				System.out.println("�� �� �Է��ϼ̽��ϴ�! ������ �Է��� �� �־��.");	
				
//				���� �ȵǴ� �ڵ� 
//				������ ��ü���� ������ �˰� ���� �� ����. 
//				��ü���� ������ �˰� �� �ڿ��� �ݵ�� ������ �Ѵ�. 
//				ime.printStackTrace();
				
//				�ֿ��ؾ��ϴ� �ڵ�
//				� ���ܰ� �߻��ߴ��� ������ �˷��ش�. 
				System.out.println( 
						ime.getClass().getName() + "���ܰ�" +
						ime.getMessage() + "������ �߻��߽��ϴ�.");
				
			}

		} //while 
		
		System.out.println("����� �Է��� ������ " + number + " �Դϴ�.");
		
		int numberOne = 0;
		int numberTwo = 0;
		int numberThree = 0;
//		switch ���� ����ϱ� ���� ���̽� ����
		int currentStatus = 1;
		
		while(true) {
			try {
				switch( currentStatus ) {
				case 1 : 
					System.out.println("ù ��° �� �Է� : ");
					numberOne = input.nextInt();
//					case 1 �� �� �ȴٸ�, currentStatus�� 2�� �ٲ��ְ� �������� �����ϵ����Ѵ�
					currentStatus = 2;
				case 2 :
					System.out.println("�� ��° �� �Է� : ");
					numberTwo = input.nextInt();
					currentStatus = 3;
				case 3 : 
					System.out.println("�� ��° �� �Է� : ");
					numberThree = input.nextInt();
					currentStatus = 1;
				}
				break;
			} catch (InputMismatchException ime) {
				input = new Scanner (System.in);
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
			
		} //while
		
		System.out.println("����� �Է��� ���� " + numberOne);
		System.out.println("����� �Է��� ���� " + numberTwo);
		System.out.println("����� �Է��� ���� " + numberThree);
		
	}
	
	
	public static void main(String[] args) {

		InputMissMatchExceptionTest test = new InputMissMatchExceptionTest();
		test.start();
		
	}

}
