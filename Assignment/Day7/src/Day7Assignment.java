import java.util.Scanner;

/*
 *  1) ���� 10�� �޾Ƽ� ��ճ���
 *  2) ���� 5���� �迭�� �޾Ƽ� ������������ �����ϱ� 
 *  3) ���� 5���� �迭�� �޾Ƽ� ������������ �����ϱ�
 */


public class Day7Assignment {
	
	public static void main(String[] args) {
		
		//solutionOne();
			
		/**************************����2��3��********************************/
		int array[] = new int[5];
				
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("���� 5���� ���ʷ� �Է����ּ���");
		
		for(int i = 0; i < 5; i ++) {
			
			array[i] = userInput.nextInt();
			
		}
		long startTime = System.currentTimeMillis();
		solutionTwo(array);
		long endTime = System.currentTimeMillis();
		
		long lTime = endTime - startTime;
		System.out.println("TIME : " + lTime + "(ms)");
		
		
		solutionThree(array);
	}
	
	public static void solutionOne () {
		
		Scanner userInput = new Scanner(System.in);
		
		int array[] = new int[10];
		int average = 0;
		
		System.out.println("����1. ���� 10���� ���ʷ� �Է����ּ���");
		
		for(int i = 0; i < 10; i ++) {
			
			array[i] = userInput.nextInt();
			average += array[i];
			
		}
		
		System.out.println("�Է��Ͻ� ������ ����� " + average/10 +" �Դϴ�.");
		System.out.println("���� 1���� �������ϴ�.");
		
		
	}
	
	public static void solutionTwo (int array[]) {
		
		int temp = 0;
		
		System.out.println("�Է��Ͻ� ���ڸ� ������������ �����մϴ�.");
		
		for ( int i = 0; i < array.length ; i++ ) {
			
			for ( int j = 0; j < array.length -i -1 ; j++) {
				
				if( array[j] > array[j+1] ) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
				
		}
		
		System.out.println("��� ����մϴ�.");
		for ( int name : array ) {
			System.out.print(name+ " ");
		}
		
	}
	
	public static void solutionThree (int array[]) {
		
		int temp = 0;
		
		System.out.println("�Է��Ͻ� ���ڸ� ������������ �����մϴ�.");
		
		for ( int i = 0; i < array.length ; i++ ) {
			
			for ( int j = 0; j < array.length -i -1 ; j++) {
				
				if( array[j] < array[j+1] ) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
				
		}
		
		System.out.println("��� ����մϴ�.");
		for ( int name : array ) {
			System.out.print(name+ " ");
		}
		
		
	}
	

}
