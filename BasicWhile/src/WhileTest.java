import java.util.Scanner;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int i = 0; 
		
		//for문처럼 사용하는 법 (이런식이면 for문을 사용하는 것이 좋다) 
		while (i < 10) {
			
			System.out.println(i);
			i++;
		}
		
		//real while을 사용하는 법 
		boolean isRunning = true;
		
		Scanner input = new Scanner(System.in);
		String inputValue = "";
		
		
		while(isRunning) {
			
			System.out.println("출력 중 ... 종료하시려면 exit을 입력해주세요.");
			inputValue = input.next();
			
			if(inputValue.equalsIgnoreCase("exit")) //equals 는 대소문자를 가린다. 
				isRunning = false;
		
		} //while 
	
		
		/*
		 * 홀수나오는 방법 1,3,5,7,9
		 */
		
		//1번 
		for(int j = 0; j < 10; j++) {
			System.out.println(j+1);
		}
		
		//2번
		for(int j = 1; j < 10; j+=2 ) {
			System.out.println(j);
		}
		
		//3번 
		for(int j = 1; j < 10; j++) {
			if(j%2 == 1)
				System.out.println(j);
		}
		
		//4번
		for(int j = 1; j < 10; j++) {
			if(j%2 == 0)
				continue; //이번 케이스를 건너뛰는 방법, break;는 그냥 나가는 방법 
			System.out.println(j);
		}

	} //main

} //class
