package com.ktds.leinalee;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
/*		computer.printAddition(30, 50);
		computer.printSubstraction(100, 50);
		computer.printMultiplication(10, 5);
		computer.printDivision(10, 2);*/

		//int numberOne = Scanner.nextInt(); 이런식으로의 nextInt(); 메소드를 받는 것이다. 
		int additionResult = computer.computeAddition(100, 200);
		System.out.println(additionResult);

		int substractionResult = computer.computeSubstraction(100, 50);
		System.out.println(substractionResult);
		
		double divisionResult = computer.computeDivision(25, 5);
		System.out.println(divisionResult);
		
		int multiplicatoinResult = computer.computeMultiplicatoin(10, 5);
		System.out.println(multiplicatoinResult);

	}

}
