import java.util.Scanner;

public class ConvertAtoB {
	
	//scanner�� �Է¹��� �����ִ�.
	public void converAndPrintCeltoFah ( Scanner userInput) {
		
		System.out.println("������ ȭ���� �����մϴ�.");
		System.out.print("������ �Է����ּ���:");
		int cel = userInput.nextInt();
		double fah = (cel * 1.8) + 32;
		System.out.println("���� " + cel + "���� ȭ�� " + fah + "�� �Դϴ�.");
	}
	
	public void converAndPrintFahtoCel ( Scanner userInput ) {
		
		System.out.println("ȭ���� ������ �����մϴ�.");
		System.out.print("ȭ���� �Է����ּ���:");
		// ���⼭ fah�� cel�� ������ �Ȱ��� ���� ������ �� �ִ� ������
		// �߰�ȣ���� ����Ǿ��� ������ �� �κ��� ������ ������ ��������.
		int fah = userInput.nextInt();
		double cel = (fah - 32) / 1.8;
		System.out.println("ȭ�� " + fah + "���� ���� " + cel + "�� �Դϴ�.");
	}

}
