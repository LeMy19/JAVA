
public class CastingTwo {
	
	public static void main(String[] args){
		//sudo coding
		
		int numberOne = 15; 
		
		//���� 15�� 2�� ������. 
		int numberTwo = numberOne / 2;
		
		//����� ����Ѵ�. 
		System.out.println(numberOne + " ������ 2�� ����� " + numberTwo + "�Դϴ�");
		
		/* 
		double numberThree = numberOne / 2;
		System.out.println(numberOne + " ������ 2�� ����� " + numberThree + "�Դϴ�");
		>> int�� int�� ������ ����� int 
		>> ���� 7.0�� ��� ������ ����Ǵ� ���̴�. 
		>> ������ double/2�� double�̴�. 
		*/
		
		//double numberThree = (double)numberOne / 2;
		double numberThree = numberOne / 2.0; //���� �����ϰ� result�� double�� ���� �� �ִ�.
		System.out.println(numberOne + " ������ 2�� ����� " + numberThree + "�Դϴ�");
		
		//���� 15�� �Ǽ��� ��ȯ�Ѵ�. 
		//4 byte(int) > 8 byte(double) 
		double numberFour = numberOne;
		
		//�Ǽ� 15�� 2�� ������. 
		double numberFive = numberFour / 2;
		
		//�׸��� ����� ����Ѵ�. 
		
		System.out.println(numberFour + " ������ 2�� ����� " + numberFive + " �Դϴ�.");
	}

}
