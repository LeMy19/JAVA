import java.util.Scanner;

/**
 * 
[2016-01-13]
1. ü���� ���� ����ϱ� : ������ / (Ű * Ű)
2. ȭ���µ��� ���ÿµ��� ��ȯ�ؼ� ����ϱ� 
(ȭ���µ� - 32 ) / 1.8 
3. ���� �µ��� ȭ���µ��� ��ȯ�ؼ� ����ϱ� 
(1.8 * ���� �µ�) + 32
 * @author 206-025
 *
 */
public class AS1 {
	public static void main(String[] args){
		
		double weight; //����ڰ� �Է��� ���ڸ� ������ ���� 
		double height;
		double result; 
		
		//1. ü���� ���� ����ϱ� : ������ / (Ű * Ű) 
		System.out.println("1. ü���� ���� ����ϱ�");
		System.out.println("ü���� ������ ����ϱ� ���ؼ� �����Ը� �Է����ּ���(kg�� ����) : ");
		Scanner console1 = new Scanner( System.in );
		weight = console1.nextInt(); //����ڷκ��� int �����͸� �Է¹޴´�. 
		
		System.out.println("�����մϴ�.");
		System.out.println("ü���� ������ ����ϱ� ���ؼ� Ű�� �Է����ּ���(cm�� ����) : ");
		Scanner console2 = new Scanner(System.in);
		height = console2.nextInt();
		
		result = (weight / (height * height)) * 100;
		System.out.println("����� ü���� ������ :" + result + "% �Դϴ�");
		
	}

}
