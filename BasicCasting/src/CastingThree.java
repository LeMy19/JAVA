
public class CastingThree {
	public static void main(String[] args){
		
		//ũ�Ⱑ ū ������ ���� ������ ���� ����� ĳ���� 
		double numberOne = 100000;
		short numberTwo = (short)numberOne; //8byte > 2byte
		
		
		System.out.println(numberTwo);
		
		int numberThree = (int)numberOne; 
		System.out.println(numberThree);
		
		char chr= 'A';
		char chrTwo = 66; //char���� ���ڿ� ���� ��� �� �� �ִ�. 
		System.out.println(chr);
		System.out.println(chrTwo);
		
		//��ȣȭ ��Ŀ��� ���� ���
		//chr + 1 ������ chr�� 2byte �̰� int���� 1�� 4 byte�̹Ƿ� ū size ���� ����� ĳ���� �ʿ�
		char chrThree = (char) (chr + 1); 
		System.out.println(chrThree);
		
	}

}
