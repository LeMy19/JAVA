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
		ConvertAtoB converter = new ConvertAtoB();

		// ���ѹݺ�
		while (true) {

			System.out.println("<<�µ��� ��ȯ�ϴ� ���α׷��Դϴ�>>");
			System.out.println("1. ������ ȭ���� ����");
			System.out.println("2. ȭ���� ������ ����");
			System.out.println("3. ����");

			typeChoice = userInput.nextInt(); // ������ �޾ƿ��ڴ�.

			if (typeChoice == 1) {

				converter.converAndPrintCeltoFah(userInput);

			} else if (typeChoice == 2) {
				converter.converAndPrintFahtoCel(userInput);
				
			} else if (typeChoice == 3) {
				break;
								
			} else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");

			}

			
		}
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
