
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

		// ��Ģ���� ����
		while (inputAgain) {

			System.out.println("��Ģ������ �� 2 ���� ���ڸ� �Է��ϼ���.");

			System.out.print("ù��° ���� :");
			numberOne = userInput.nextDouble();

			System.out.print("�ι�° ���� :");
			numberTwo = userInput.nextDouble();

			System.out.print("���ϴ� �����ڸ� �Է��ϼ��� : ");
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
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				inputAgain = true;
				continue;
			}

			System.out.println("����� :" + numberOne + " " + operator + " " + numberTwo + " = " + result);
		} //while

	} //main

} //class
