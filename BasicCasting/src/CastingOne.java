
public class CastingOne {
	
	public static void main(String[] args){
		
		//2 byte
		short shortNumber = 10; //�� ó�� �����ϴ� �κ�
		
		//����� ĳ����
		//4 byte : integer
		int number = (int) shortNumber; //(int)�ϸ� int Ÿ������ ���� ��ȯ
		//8 byte : long
		long longNumber = (long) shortNumber; 
		
		System.out.println("number is " + number);
		System.out.println("long number is " + longNumber);
		
		shortNumber = 35; //�̹� ���ǵǾ��ֱ� ������ name �տ� short type�� ���� �ʿ䰡 ����

		//������ ĳ���� 
		number = shortNumber;
		longNumber = shortNumber;
		
		System.out.println("number is " + number);
		System.out.println("long number is " + longNumber);
		
	}
}
