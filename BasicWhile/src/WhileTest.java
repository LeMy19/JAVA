import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int i = 0; 
		
		//for��ó�� ����ϴ� �� (�̷����̸� for���� ����ϴ� ���� ����) 
		while (i < 10) {
			
			System.out.println(i);
			i++;
		}
		
		//real while�� ����ϴ� �� 
		boolean isRunning = true;
		
		Scanner input = new Scanner(System.in);
		String inputValue = "";
		
		
		while(isRunning) {
			
			System.out.println("��� �� ... �����Ͻ÷��� exit�� �Է����ּ���.");
			inputValue = input.next();
			
			if(inputValue.equalsIgnoreCase("exit")) //equals �� ��ҹ��ڸ� ������. 
				isRunning = false;
		
		} //while 
	
		
		/*
		 * Ȧ�������� ��� 1,3,5,7,9
		 */
		
		//1�� 
		for(int j = 0; j < 10; j++) {
			System.out.println(j+1);
		}
		
		//2��
		for(int j = 1; j < 10; j+=2 ) {
			System.out.println(j);
		}
		
		//3�� 
		for(int j = 1; j < 10; j++) {
			if(j%2 == 1)
				System.out.println(j);
		}
		
		//4��
		for(int j = 1; j < 10; j++) {
			if(j%2 == 0)
				continue; //�̹� ���̽��� �ǳʶٴ� ���, break;�� �׳� ������ ��� 
			System.out.println(j);
		}

	} //main

} //class
