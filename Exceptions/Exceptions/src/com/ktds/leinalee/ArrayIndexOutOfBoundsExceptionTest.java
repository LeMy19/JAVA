package com.ktds.leinalee;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsExceptionTest {

	public void start() {
		caseOne();
		caseTwo();
	}
	
	public void caseOne() {
//		�迭�� ����� 
		int numbers[] = new int[5];
		
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i;
		}
		
		
//		���� �̷� ����ó���� ���ִ� ���� �ƴ϶�, ���ʿ� ���ܰ� �߻����� �ʵ��� ���ش�. 
		try {
			numbers[5] = 10;
		} 
		catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe.getMessage() + 
					" �� �ε����� �������� �ʽ��ϴ�.");
		}
		/*
		 * ���
		 * ==========
		 * 0 : ù ��° �ε���
		 * 1 : �� ��° �ε���
		 * 2 : �� ��° �ε���
		 * 3 : �� ��° �ε���
		 * 4 : �ټ� ��° �ε���
		 * ==========
		 */
		
		for(int number : numbers) {
			System.out.println(number);
		}
	
	}
	
	public void caseTwo() {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0 ; i < 5; i++) {
			numbers.add(i);
		}
		
//		System.out.println(numbers.get(5));
		
		for( int i = 0; i <= numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		
/*		for(int number : numbers) {
			System.out.println(number);
		}*/
		
	}

	public static void main(String[] args) {
		ArrayIndexOutOfBoundsExceptionTest test = new ArrayIndexOutOfBoundsExceptionTest ();
		test.start();
		
	}
}
