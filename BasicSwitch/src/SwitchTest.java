/*
 * switch ���� �� ������� �ʴ´�. 
 * ������, ������ ���������� ���������� ��ĥ �� switch�� ����� �� �ִ�.
 * �׷����� ���������� switch�� ����ϱ⿡�� �����.
 * �׷������ұ��ϰ� switch�� �ִ� ������ �и� �뵵�� �ֱ� �����̴�. 
 * ����.. ��... ��û���� ������ flow�� ���� �� ���� ���δ�.. 
 * 
 * 1) switch ���� if������ �ٲ㼭 ����ϴ� ���� ����. 
 * 
 */
public class SwitchTest {
	
	public static void main(String[] args) {
		
		int numberOne = 1;
		
		
		switch (numberOne) { //�񱳿����̳� �������� ���� ���Ѵ�. �׷��� �����ڴ� �� �� �ִ�. 
		case 1 : //numberOne�� 1�̶��.. 
			System.out.println("numberOne�� ���� 1�Դϴ�.");
			break;
		case 2 :
			System.out.println("numberOne�� ���� 2�Դϴ�.");
			break;
		case 3 : 
			System.out.println("numberOne�� ���� 3�Դϴ�.");
			break;
		default : //�ƹ��͵� ���� �ʴ� ��쿡 ����.
			System.out.println("numberOne�� ���� �� �� �����ϴ�.");
			break;
		}
		
		//switch���� if������ �ٲ� ���� 
		if(numberOne==1) {
			System.out.println("numberOne�� ���� 1�Դϴ�.");
		} else if (numberOne == 2) {
			System.out.println("numberOne�� ���� 2�Դϴ�.");
		} else if (numberOne == 3 ) {
			System.out.println("numberOne�� ���� 3�Դϴ�.");
		} else {
			System.out.println("numberOne�� ���� �� �� �����ϴ�.");
		}
		
		
		
	}

}
