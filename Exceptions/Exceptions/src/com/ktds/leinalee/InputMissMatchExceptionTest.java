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
	}
	
	
	public static void main(String[] args) {

		InputMissMatchExceptionTest test = new InputMissMatchExceptionTest();
		test.start();
		
	}

}
