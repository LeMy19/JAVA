
public class Variables {
	public static void main(String[] args){
		
		//������ ���� ���
		//������ ������ = ��; 
		//������ ������ �����Ѵ�.
		int numberOne = 10; 
		int numberTwo = 20;
		
		int additionResult; //�ƹ� ���� �Ҵ����� ���� �� �ִ�
		//additionResult = 10 + 20;
		additionResult = numberOne + numberTwo;
		
		System.out.println(numberOne+"+"+numberTwo+"="+additionResult);
		
		//��Ģ���� : + - * / % = 
		
		//numberOne�� 12�� �ٲٰ� ���� ��� 
		//numberOne = numberOne + 2;
		//System.out.println(numberOne); //�̰��� ª�� ����� �ִ� ���� "��Ģ ���� ������"
		
		//��Ģ ���� ������ : += -+ *= ++ -- 
		System.out.println(numberOne+=2); //�̷��� ��Ģ������ = �տ� ���� �ٲٱ⸸ �ϸ� �ȴ�
		
	}

}
