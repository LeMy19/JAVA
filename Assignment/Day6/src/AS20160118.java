import java.util.Scanner;

/*
 * [2016-01-18]
 * 1) Scanner�� �̿��� ���� 2���� �Է¹޴´�.
 * 2) Scanner�� �̿��� ������ �ϳ��� �Է¹޴´�. 
 * 3) �Է¹��� �� �ִ� �����ڴ� +, -, / , %���� �����Ѵ�.
 * 4) �Է¹��� �����ڿ� �ش��ϴ� ����� �� ��, ����� ����Ѵ�.
 * 5) ���ڿ��� �Է¹޴� Scanner ����� .next();�� ����Ѵ�. nextString()�� ����. 
 * 
 */
public class AS20160118 {

	public static void main(String[] args) {

		int num1; // ����ϰ� ���� ù��° ����
		int num2; // ����ϰ� ���� �ι�° ����
		String operator; // ����ϰ� ���� ������

		Scanner userInput = new Scanner(System.in);
		System.out.println("����ϰ� ���� ���� ���� 2���� ���ʷ� �Է��ϼ���.");

		System.out.print("ù��° ������ �Է��ϼ��� :");
		num1 = userInput.nextInt();

		System.out.print("�ι�° ������ �Է��ϼ��� :");
		num2 = userInput.nextInt();

		System.out.println("����ϰ� ���� �����ڸ� �Է��ϼ���. (�� �����ڴ� +, -, *, /, % ���� ���ѵ˴ϴ�)");
		operator = userInput.next();
		// if(operator.equals("+" || "-" || "*" || "/")) { equal �ȿ����� �񱳿�����
		// �̿������ �� �Ѵ�.

		System.out.println(num1 + "�� " + num2 + "�� " + operator + "������ ���۵˴ϴ�.");

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

			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

		System.out.println("���α׷��� ����˴ϴ�.");


	}//main

} //class
