import java.util.Scanner;

public class ScannerTwo {
	public static void main(String[] args){
		
		//int�� ���� �ΰ��� �����Ѵ� 
		int numberOne;
		int numberTwo;
		
		//int�� ���� ������ Scanner�� ���� ���� �Է¹޴´�
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 2���� ���ϴ� ���α׷��Դϴ�."); //println: printline 
		System.out.print("ù���� ���ڸ� �Է��ϼ���. "); //print�� �����ٷ� �������� �ʴ´�.
		numberOne = scanner.nextInt();
		System.out.print("�ι��� ���ڸ� �Է��ϼ���. ");
		numberTwo = scanner.nextInt();
		
		//int�� ���� �� ���� ���� �ٸ� ������ �����Ѵ�
		int additionalResult = numberOne + numberTwo;
		
		//�� ���� ���� ����� ����Ѵ�.
		System.out.println(
				numberOne + "+" +
				numberTwo + "=" +
				additionalResult);
	}

}
