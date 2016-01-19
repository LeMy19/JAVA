
/**
 * 2016-01-18 Assignmnet
 * @author Kiyeon Lee
 *
 */

import java.util.Scanner;

public class SecondSolution {

	public static void main(String[] args) {

		double numberOne;
		double numberTwo;
		double result = 0;

		String operator;
		Scanner userInput = new Scanner(System.in);

		// 사칙연산 시작
		while (inputAgain) {

			System.out.println("사칙연산을 할 2 가지 숫자를 입력하세요.");

			System.out.print("첫번째 숫자 :");
			numberOne = userInput.nextDouble();

			System.out.print("두번째 숫자 :");
			numberTwo = userInput.nextDouble();

			System.out.print("원하는 연산자를 입력하세요 : ");
			operator = userInput.next();

			if (operator.equals("+"))
				result = numberOne + numberTwo; break;
			
			else if (operator.equals("-"))
				result = numberOne - numberTwo; break;
			
			else if (operator.equals("*"))
				result = numberOne * numberTwo; break;
			
			else if (operator.equals("/"))
				result = numberOne / numberTwo; break;
			
			else if (operator.equals("%"))
				result = (int) numberOne % (int) numberTwo; break;
			
			else {
				System.out.println("잘 못 입력하셨습니다.");
				inputAgain = true;
				continue;
			}

			System.out.println("결과는 :" + numberOne + " " + operator + " " + numberTwo + " = " + result);
		} //while

	} //main

} //class
