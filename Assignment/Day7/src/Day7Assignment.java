import java.util.Scanner;

/*
 *  1) 점수 10개 받아서 평균내기
 *  2) 숫자 5개를 배열에 받아서 오름차순으로 정렬하기 
 *  3) 숫자 5개를 배열에 받아서 내림차순으로 정렬하기
 */


public class Day7Assignment {
	
	public static void main(String[] args) {
		
		//solutionOne();
			
		/**************************문제2번3번********************************/
		int array[] = new int[5];
				
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("숫자 5개를 차례로 입력해주세요");
		
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
		
		System.out.println("문제1. 점수 10개를 차례로 입력해주세요");
		
		for(int i = 0; i < 10; i ++) {
			
			array[i] = userInput.nextInt();
			average += array[i];
			
		}
		
		System.out.println("입력하신 점수의 평균은 " + average/10 +" 입니다.");
		System.out.println("문제 1번이 끝났습니다.");
		
		
	}
	
	public static void solutionTwo (int array[]) {
		
		int temp = 0;
		
		System.out.println("입력하신 숫자를 오름차순으로 정렬합니다.");
		
		for ( int i = 0; i < array.length ; i++ ) {
			
			for ( int j = 0; j < array.length -i -1 ; j++) {
				
				if( array[j] > array[j+1] ) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
				
		}
		
		System.out.println("결과 출력합니다.");
		for ( int name : array ) {
			System.out.print(name+ " ");
		}
		
	}
	
	public static void solutionThree (int array[]) {
		
		int temp = 0;
		
		System.out.println("입력하신 숫자를 내림차순으로 정렬합니다.");
		
		for ( int i = 0; i < array.length ; i++ ) {
			
			for ( int j = 0; j < array.length -i -1 ; j++) {
				
				if( array[j] < array[j+1] ) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
				
		}
		
		System.out.println("결과 출력합니다.");
		for ( int name : array ) {
			System.out.print(name+ " ");
		}
		
		
	}
	

}
