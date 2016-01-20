package com.ktds.leinalee;

public class Solution {
	
	public static String name="";
	public static String address="";
	public static int age;
	
	/**
	 * ���� 1��, �λ��ϴ� �޼ҵ�
	 * @param name
	 * @param address
	 * @param age
	 */
	public void sayHello () {
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.\n"
				+ "��� ���� " + address + "�Դϴ�.\n"
						+ "���̴� "+ age + "�� �Դϴ�.");
	}
	
	/**
	 * ���� 2��, ������ �˾ƺ���
	 * @param userInput
	 * @return
	 */
	public String catchOperator ( String userInput ) {
		
		if ( userInput.equals("+") )
			return "���ϱ�";
		else if ( userInput.equals("-") )
			return "����";
		else if ( userInput.equals("*") || userInput.equalsIgnoreCase("X") )
			return "���ϱ�";
		else if ( userInput.equals("/") ) 
			return "������";
		else
			return "�ش��ϴ� �����ڰ� �����ϴ�.";
	}
	
	
	/**
	 * ���� 3��, ��Ģ���� �޼ҵ�
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
			System.out.println("�����ڸ� �� �� �Է��ϼ̽��ϴ�.");
		}
	
	}

}
