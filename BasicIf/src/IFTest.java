
public class IFTest {
	public static void main(String[] args) {
		//�̻ڰ� ���� ���� ���� �߿�. �������� �������� �����̴�. 	
		int money = 1200; 
		
		if ( money >= 1200 ) { //�̶�, money�� 1200�̹Ƿ� true�̴�.
			System.out.println("ĵĿ�Ǹ� ��ϴ�.");
		}
		
		int age = 37;
		int age2 = 27;
		
		if ( age >= 30) {
			System.out.println("30�� �Դϴ�.");
		}
			
		if( age >= 30 && money >= 1200 ){
			System.out.println("ĵĿ�Ǹ� ��� 30�� �Դϴ�.");
		}
		
		//���̰� 20�� �̻��̰�, ���� ���� �ݾ��� 4,500�� �̻��� ��,
		//"��踦 ��ϴ�"��� ����ϴ� ��ɹ��� ���弼��. 
		
		if( age >=20 && money >= 4500 ) {
			System.out.println("��踦 ��ϴ�.");
		}
		
		//���ڴ� 0, ���ڴ�1
		//������ ������ ��� "�������� ������" 
		//������ ������ ��� "�������� ������"
		int sex = 1;
		if ( sex == 1 ) {
			System.out.println("�������� ������.");
		}
		if ( sex == 0 ) {
			System.out.println("�������� ������.");
		}
		
		
	}
	

}
