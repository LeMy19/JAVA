
public class Test {
	public static void main(String[] args) {
		
		int numberOne = 10; 
		
		numberOne++; 
		//numberOne += 1;
		//numberOne = numberOne + 1 ;
		
		System.out.println(numberOne);

		System.out.println(numberOne++  
				+" 여기서 12가 나와야하지만 11이 출력"); 
		//여기서 12가 나와야 한다. 
		//OO++는 바로 증가하지 않는다. 세미클론을 만나야지 증가한다. 
		
		System.out.println(numberOne);
		//++numberOne; //numberOne++의 차이점은 뭘까?
		System.out.println(++numberOne);
		
	}

}
