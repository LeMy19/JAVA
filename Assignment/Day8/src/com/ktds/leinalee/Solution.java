package com.ktds.leinalee;

public class Solution {
	
	public static String name="";
	public static String address="";
	public static int age;
	
	/**
	 * 문제 1번, 인사하는 메소드
	 * @param name
	 * @param address
	 * @param age
	 */
	public void sayHello () {
		System.out.println("안녕하세요. 저는 " + name + "입니다.\n"
				+ "사는 곳은 " + address + "입니다.\n"
						+ "나이는 "+ age + "세 입니다.");
	}
	
	/**
	 * 문제 2번, 연산자 알아보기
	 * @param userInput
	 * @return
	 */
	public String catchOperator ( String userInput ) {
		
		if ( userInput.equals("+") )
			return "더하기";
		else if ( userInput.equals("-") )
			return "빼기";
		else if ( userInput.equals("*") || userInput.equalsIgnoreCase("X") )
			return "곱하기";
		else if ( userInput.equals("/") ) 
			return "나누기";
		else
			return "해당하는 연산자가 없습니다.";
	}
	
	
	/**
	 * 문제 3번, 사칙연산 메소드
	 * @param numberOne
	 * @param numberTwo
	 * @param operator
	 */
	public void computer ( int numberOne, int numberTwo, String operator ) {
		
		double result;
		
		if( operator.equals("+")) {
			result = numberOne + numberTwo;
			System.out.println(numberOne + operator + numberTwo + "=" + (int)result);
		} else if ( operator.equals("-")) {
			result = numberOne - numberTwo;
			System.out.println(numberOne + operator + numberTwo + "=" + (int)result);
		} else if ( operator.equals("*")) {
			result = numberOne * numberTwo;
			System.out.println(numberOne + operator + numberTwo + "=" + (int)result);
		} else if ( operator.equals("/") ) {
			result = numberOne / (double)numberTwo;
			System.out.println(numberOne + operator + numberTwo + "=" + result);
		} else {
			System.out.println("연산자를 잘 못 입력하셨습니다.");
		}
	
	}

}
