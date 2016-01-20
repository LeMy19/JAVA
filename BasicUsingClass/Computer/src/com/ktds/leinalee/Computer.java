package com.ktds.leinalee;

public class Computer {
	
	/**
	 * 반환이 없는 메소드
	 * @param numberOne
	 * @param numberTwo
	 */
	public void printAddition ( int numberOne, int numberTwo ) {
		int additionResult = numberOne + numberTwo;
		System.out.println(additionResult);
	}
	
	public void printSubstraction ( int numberOne, int numberTwo ) {
		int substractionResult = numberOne - numberTwo;
		System.out.println(substractionResult);
	}
	
	public void printDivision ( int numberOne, int numberTwo ) {
		double divisionResult = numberOne / (double)numberTwo;
		System.out.println(divisionResult);
	}
	
	public void printMultiplication ( int numberOne, int numberTwo ) {
		int multiplication = numberOne * numberTwo;
		System.out.println(multiplication);
	}
	/**
	 * return 반환을 하는 메소드
	 * @param numberOne
	 * @param numberTwo
	 * @return
	 */
	public int computeAddition ( int numberOne, int numberTwo ) {
		int computeAdditionResult = numberOne + numberTwo;
		return computeAdditionResult;
	}

	public int computeSubstraction ( int numberOne, int numberTwo ) {
		int computeSubstractionResult = numberOne - numberTwo;
		return computeSubstractionResult;
	}
	
	public double computeDivision ( int numberOne, int numberTwo ) {
		double computeDivisionResult = numberOne / (double)numberTwo;
		return computeDivisionResult;
	}
	
	public int computeMultiplicatoin ( int numberOne, int numberTwo ) {
		int computeMultiplicatoinResult = numberOne * numberTwo;
		return computeMultiplicatoinResult;
	}
}
