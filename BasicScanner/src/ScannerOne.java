import java.util.Scanner;

public class ScannerOne {
	public static void main(String[] args) {
		
		//���� ����� ���ÿ� ���� �ʱ�ȭ�� ��
		int numberOne = 15;
		System.out.println(numberOne);
		
		//������ ������ 
		int numberTwo; 
		
		//����� ������ ���� �ʱ�ȭ �Ѵ�. 
		numberTwo = 35; 
		System.out.println(numberTwo);
		
		//������ ������ 
		int numberThree;
		//System.out.println(numberThree); //���� result�� �⺻�� 0���� dedault�Ǿ� �ִ�.
		
		//Scanner�� �̿��� ������ ���� �ʱ�ȭ �� 
		Scanner input = new Scanner(System.in); //�������� ������ �Է��� ���� �� �ִ�. input�� �������̶� �ƹ� naming �����ϴ�  
		numberThree = input.nextInt(); //������ ������ ���� �� �ְ� �ϴ� ��
		System.out.println(numberThree + "�� �Է��ϼ̽��ϴ�.");
		
		//next + (�⺻��) ���� �� ���� 
		boolean isBoolean = input.nextBoolean();
		System.out.println(isBoolean);
	}


}
