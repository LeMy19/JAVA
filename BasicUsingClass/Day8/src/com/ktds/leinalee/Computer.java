package com.ktds.leinalee;

public class Computer {
	
	public double computeNumber(int numberOne, int numberTwo, String operator) {
		
		double computeResult;
		
		if ( operator.equals("+") ) {
			computeResult = numberOne + numberTwo;
			return computeResult;
			//System.out.println(numberOne + operator + numberTwo + "=" + (int)computeResult);
		}
		else if ( operator.equals("-") ) {
			computeResult = numberOne - numberTwo;
			return computeResult;
			//System.out.println(numberOne + operator + numberTwo + "=" + (int)computeResult);
		}
		else if ( operator.equals("*") ) {
			computeResult = numberOne * numberTwo;
			return computeResult;
			//System.out.println(numberOne + operator + numberTwo + "=" + (int)computeResult);
		}
		else if ( operator.equals("/") ) {
			computeResult = numberOne / (double) numberTwo;
			return computeResult;
			//System.out.println(numberOne + operator + numberTwo + "=" + computeResult);
		}
		else {
			System.out.println("������ �Է��� �ùٸ��� �ʽ��ϴ�.");
			return 0;
		}
	}

}
