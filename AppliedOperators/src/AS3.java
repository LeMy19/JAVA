import java.util.Scanner;

/**
 * 3. ���� �µ��� ȭ���µ��� ��ȯ�ؼ� ����ϱ�
 * (1.8 * ���� �µ�) + 32
 * @author 206-025
 *
 */
public class AS3 {
	public static void main(String[] args){
		
		double fad;
		double cel;
		
		System.out.println("3. �����µ��� ȭ���µ��� ��ȯ�ؼ� ����ϱ�");
		System.out.println("��ȯ�� �����µ��� �Է����ּ���");
		
		Scanner console = new Scanner(System.in);
		cel = console.nextInt();
		fad = (1.8 * cel) + 32;
		
		System.out.println("��ȯ�� ȭ���µ��� " + fad + " �Դϴ�.");
	}

}
