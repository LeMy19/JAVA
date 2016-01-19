import java.util.Scanner;

/*
 * [2016-01-18]
 * 1) Scanner을 이용해 숫자 2개를 입력받는다.
 * 2) Scanner을 이용해 연산자 하나를 입력받는다. 
 * 3) 입력받을 수 있는 연산자는 +, -, / , %으로 제한한다.
 * 4) 입력받은 연산자에 해당하는 계산을 한 뒤, 결과를 출력한다.
 * 5) 문자열을 입력받는 Scanner 기능은 .next();를 사용한다. nextString()은 없다. 
 * 
 */
public class AS20160118 {

	public static void main(String[] args) {

		int num1; // 계산하고 싶은 첫번째 정수
		int num2; // 계산하고 싶은 두번째 정수
		String operator; // 계산하고 싶은 연산자

		Scanner userInput = new Scanner(System.in);
		System.out.println("계산하고 싶은 정수 변수 2개를 차례로 입력하세요.");

		System.out.print("첫번째 정수를 입력하세요 :");
		num1 = userInput.nextInt();

		System.out.print("두번째 정수를 입력하세요 :");
		num2 = userInput.nextInt();

		System.out.println("계산하고 싶은 연산자를 입력하세요. (단 연산자는 +, -, *, /, % 으로 제한됩니다)");
		operator = userInput.next();
		// if(operator.equals("+" || "-" || "*" || "/")) { equal 안에서는 비교연산을
		// 이요용하지 못 한다.

		System.out.println(num1 + "과 " + num2 + "의 " + operator + "연산이 시작됩니다.");

		if (operator.equals("+")) {

			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));

		} else if (operator.equals("-")) {

			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));

		} else if (operator.equals("*")) {

			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));

		} else if (operator.equals("/")) {

			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 / num2));

		} else if (operator.equals("%")) {

			System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 % num2));

		} else {

			System.out.println("잘못입력하셨습니다.");
		}

		System.out.println("프로그램이 종료됩니다.");


	}//main

} //class
