import java.util.Scanner;

/**
 * 2. ȭ���µ��� �����µ��� ��ȯ�ؼ� ����ϱ� 
 * (ȭ���µ� - 32 ) / 1.8 
 * @author 206-025
 *
 */
public class AS2 {
	public static void main(String[] args){
		
		double fad; //ȭ���µ�
		double cel; //�����µ�
		
		System.out.println("2. ȭ���µ��� �����µ��� ��ȯ�ؼ� ����ϱ�");
		System.out.println("��ȯ�� ȭ���µ��� �Է����ּ���");
		
		Scanner console = new Scanner(System.in);
		fad = console.nextInt();
		cel = ((fad - 32) / 1.8) ;
		
		System.out.println("��ȯ�� �����µ��� : " + cel + "�Դϴ�.");
	}

}
