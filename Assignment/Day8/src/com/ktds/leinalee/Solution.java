package com.ktds.leinalee;

public class Solution {
	/**
	 * ���� 1��, �λ��ϴ� �޼ҵ�
	 * @param name
	 * @param address
	 * @param age
	 */
	public void sayHello (String name, String address, int age) {
		System.out.println("�ȳ��ϼ���. ���� " + name + "�Դϴ�.\n"
				+ "��� ���� " + address + "�Դϴ�.\n"
						+ "���̴� "+ age + "�� �Դϴ�.");
	}
	
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
