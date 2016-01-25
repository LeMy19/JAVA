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
//		배열을 상요함 
		int numbers[] = new int[5];
		
		for(int i = 0 ; i < numbers.length ; i++) {
			numbers[i] = i;
		}
		
		
//		원래 이런 예외처리를 해주는 것이 아니라, 애초에 예외가 발생하지 않도록 해준다. 
		try {
			numbers[5] = 10;
		} 
		catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe.getMessage() + 
					" 빈 인덱스는 존재하지 않습니다.");
		}
		/*
		 * 결과
		 * ==========
		 * 0 : 첫 번째 인덱스
		 * 1 : 두 번째 인덱스
		 * 2 : 세 번째 인덱스
		 * 3 : 네 번째 인덱스
		 * 4 : 다섯 번째 인덱스
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
