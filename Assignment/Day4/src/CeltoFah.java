import java.util.Scanner;

public class CeltoFah {
	public static void main(String[] args) { // main �κ��� �߰�ȣ�� ������ ���� ���α׷��� ������.

		/*
		 * ���� > ȭ�� : F = C * 1.8 - 32 ȭ�� > ���� : C = ( F - 32 ) / 1.8
		 */

		/**
		 * 
		 */

		// ���⼭ ����� ������ ��� ����� �� ������, �߰�ȣ �ȿ��� ���� ������ �ۿ��� �� ����Ѵ�.
		int typeChoice = 0;
		Scanner userInput = new Scanner(System.in);

		// ���ѹݺ�
		while (true) {

			System.out.println("<<�µ��� ��ȯ�ϴ� ���α׷��Դϴ�>>");
			System.out.println("1. ������ ȭ���� ����");
			System.out.println("2. ȭ���� ������ ����");
			System.out.println("3. ����");

			typeChoice = userInput.nextInt(); // ������ �޾ƿ��ڴ�.

			if (typeChoice == 1) {
				System.out.println("������ ȭ���� �����մϴ�.");
				System.out.print("������ �Է����ּ���:");
				int cel = userInput.nextInt();
				double fah = (cel * 1.8) + 32;
				System.out.println("���� " + cel + "���� ȭ�� " + fah + "�� �Դϴ�.");

			} else if (typeChoice == 2) {
				System.out.println("ȭ���� ������ �����մϴ�.");
				System.out.print("ȭ���� �Է����ּ���:");
				// ���⼭ fah�� cel�� ������ �Ȱ��� ���� ������ �� �ִ� ������
				// �߰�ȣ���� ����Ǿ��� ������ �� �κ��� ������ ������ ��������.
				int fah = userInput.nextInt();
				double cel = (fah - 32) / 1.8;
				System.out.println("ȭ�� " + fah + "���� ���� " + cel + "�� �Դϴ�.");

			} else if (typeChoice == 3) {
				break;
								
			} else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");

			}

			
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
