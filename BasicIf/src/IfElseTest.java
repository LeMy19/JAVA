
public class IfElseTest {
	public static void main(String[] args) {
		//�̻ڰ� ���� ���� ���� �߿�. �������� �������� �����̴�. 	
		int money = 1200; 
		
		if ( money >= 1200 ) { //�̶�, money�� 1200�̹Ƿ� true�̴�.
			System.out.println("ĵĿ�Ǹ� ��ϴ�.");
		}
		
		int age = 27;
		
		if ( age >= 30) {
			System.out.println("30�� �Դϴ�.");
		} else {
			System.out.println("����� ���̴� 30�밡 �ƴմϴ�.");
		}
			
		if( age >= 30 && money >= 1200 ){
			System.out.println("ĵĿ�Ǹ� ��� 30�� �Դϴ�.");
		} else { //else�� ������ if���� �׳� ����ģ��. 
			
		}
		
		//���̰� 20�� �̻��̰�, ���� ���� �ݾ��� 4,500�� �̻��� ��,
		//"��踦 ��ϴ�"��� ����ϴ� ��ɹ��� ���弼��. 
		
		if( age >=20 && money >= 4500 ) {
			System.out.println("��踦 ��ϴ�.");
		} else if ( age <20 || money < 4500 ) {
			System.out.println("��踦 �� ��ϴ�.");			
		}
		
		//���ڴ� 0, ���ڴ�1
		//������ ������ ��� "�������� ������" 
		//������ ������ ��� "�������� ������"
		int sex = 1;
		if ( sex == 1 ) {
			System.out.println("�������� ������.");
		} else if (sex == 0) {
			System.out.println("�������� ������.");
		}
		
		
		//if������ 5���� ��ܽ� if���� �����ϸ� ���� �ȵȴ�. 
		//if�������� ���� ���ϱ�
		int score = 77;
		
		if ( score >= 90 && score <= 100) {
			System.out.println("����� ������ A �Դϴ�.");
		} 
		else if ( score >= 80 && score <= 89 ) {
			System.out.println("����� ������ B �Դϴ�.");
		} 
		else if ( score >= 70 && score <= 79 ) {
			System.out.println("����� ������ C �Դϴ�.");
		} 
		else if ( score >= 60 && score <= 69) {
			System.out.println("����� ������ D �Դϴ�.");
		} 
		else {
			System.out.println("����� ������ F �Դϴ�");
		}
		
		
		//����. �� ������ ����� ���Ѵ�. 
		//��� ���� 50 �̻��̶��, "���"�� ����ϰ� 
		//��� ���� 75 �̻��̶���, "�հ�"�� ����ϰ� 
		//��� ���� 100�̶��, "���� �հ�"�� ����Ѵ�. 
		int num1 = 80;
		int num2 = 95;
		int avg = (num1 + num2) / 2;
		
		if(avg == 100) {
			System.out.println("�����հ�");
		} else if (avg >= 75) {
			System.out.println("�հ�");
		} else if (avg > 50) {
			System.out.println("���");
		}
			
		//���ڿ� String 
		//���� char **�ǹ����� ���� ������ �ʴ´�** 
		String operator = "+";
		/*
		if ( operator == "���ϱ�" ) {
			System.out.println("���ϱ⸦ �մϴ�.");
		}
		*/
		
		//������ �񱳴� ==�� �ϸ� �� �ȴ�.
		if ( operator.equals("+") ) {
			System.out.println("���ϱ⸦ �մϴ�.");
		}
		
		
	}
}


