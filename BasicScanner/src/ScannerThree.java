import java.util.Scanner;

//ù��°, �ι�° ���ڸ� �޾ƿ� ũ�⸦ ���ϴ� ���α׷�
public class ScannerThree {
	
	public static void main(String[] args){
		
		//int�� ���� �� ���� �����Ѵ�. 
		int numberOne;
		int numberTwo;
		//int numberOne, numberTwo; �̷��� �� �� ������ �ҽ��� �������� ������ ��������. 
		
		//int�� ���� �� ���� Scanner�� �̿��ؼ� ���� �����Ѵ�. 
		Scanner console = new Scanner (System.in);
		System.out.println("ù ��° ���ڰ� �� ��° ���ں��� ū �� �˾ƺ��� ���α׷��Դϴ�.");
		System.out.print("ù ��° ���ڸ� �Է��ϼ���.");
		numberOne = console.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���.");
		numberTwo = console.nextInt();
		
		//ù ��° �Է��� ���ڰ� �� ��° �Է��� ���ں��� ū �� �˾ƺ���. 
		boolean compareResult = numberOne > numberTwo;
				
		//�� ����� ����Ѵ�.
		System.out.println(
					numberOne + "�� " +
					numberTwo + "���� ū����? " +
					compareResult); //���ڿ��� �������� ������ �ٷ� ���ڿ�(treu/false)�� ��µȴ�.
	}

}
