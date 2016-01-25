package com.ktds.leinalee;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class NumberFormatExceptionTest {

	public int parseInt(String str) {
		
		try {
			return Integer.parseInt(str);
		} 
		catch (NumberFormatException nfe) {
			return 0;
		}
	}
	
	public void start() {
		
		Scanner input = new Scanner(System.in);
		String numberString = input.next();

//		[���ڸ� ������ ��ȯ�Ѵ�] 
//		���ڸ� long type���� ��ȯ�Ѵ�. 
//		���ڸ� short type���� ��ȯ�Ѵ�. 
//		���ڸ� int type���� ��ȯ�ϴ�. 
		
		try {
//		parseInt(���ڰ� �� ���ڸ� �ִ´�);
			int integerNumber = Integer.parseInt(numberString);
			System.out.println(integerNumber);
			
			
		}
		catch ( NumberFormatException nfe ) {
			System.out.println("���� ��ȯ�� �����߽��ϴ�.");
			System.out.println(nfe.getMessage());
		}
		
/*		short shortNumber = Short.parseShort(numberString);
		System.out.println(shortNumber);
		
		long longNumber = Long.parseLong(numberString);
		System.out.println(longNumber);*/
				
		
//		[���ڸ� �Ǽ��� ��ȯ�Ѵ�] 
//		���ڸ� double tpye���� ��ȯ��. 
//		���ڸ� float type���� ��ȯ�Ѵ�. 
		
//		[���ڸ� �������� ��ȯ�Ѵ�] 
		
		try {
			Exception e = new Exception("���Ƿ� ������ �߻���ų �� ����");
			throw e;
		} 
		catch ( Exception e) {
			System.out.println("������ �߻� ���׽��ϴ�.");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		NumberFormatExceptionTest test = new NumberFormatExceptionTest();
		test.start();
	}
}
