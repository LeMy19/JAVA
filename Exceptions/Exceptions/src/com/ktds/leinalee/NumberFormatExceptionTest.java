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

//		[문자를 정수로 변환한다] 
//		문자를 long type으로 변환한다. 
//		문자를 short type으로 변환한다. 
//		문자를 int type으로 변환하다. 
		
		try {
//		parseInt(숫자가 들어간 문자를 넣는다);
			int integerNumber = Integer.parseInt(numberString);
			System.out.println(integerNumber);
			
			
		}
		catch ( NumberFormatException nfe ) {
			System.out.println("숫자 변환에 실패했습니다.");
			System.out.println(nfe.getMessage());
		}
		
/*		short shortNumber = Short.parseShort(numberString);
		System.out.println(shortNumber);
		
		long longNumber = Long.parseLong(numberString);
		System.out.println(longNumber);*/
				
		
//		[문자를 실수로 변환한다] 
//		문자를 double tpye으로 변환다. 
//		문자를 float type으로 변환한다. 
		
//		[문자를 논리형으로 변환한다] 
		
		try {
			Exception e = new Exception("고의로 오류를 발생시킬 수 있음");
			throw e;
		} 
		catch ( Exception e) {
			System.out.println("오류를 발생 시켰습니다.");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		NumberFormatExceptionTest test = new NumberFormatExceptionTest();
		test.start();
	}
}
