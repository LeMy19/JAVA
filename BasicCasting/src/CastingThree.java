
public class CastingThree {
	public static void main(String[] args){
		
		//크기가 큰 곳에서 작은 곳으로 가는 명시적 캐스팅 
		double numberOne = 100000;
		short numberTwo = (short)numberOne; //8byte > 2byte
		
		
		System.out.println(numberTwo);
		
		int numberThree = (int)numberOne; 
		System.out.println(numberThree);
		
		char chr= 'A';
		char chrTwo = 66; //char에는 문자와 숫자 모두 들어갈 수 있다. 
		System.out.println(chr);
		System.out.println(chrTwo);
		
		//암호화 방식에서 많이 사용
		//chr + 1 에서는 chr이 2byte 이고 int형인 1이 4 byte이므로 큰 size 따라서 명시적 캐스팅 필요
		char chrThree = (char) (chr + 1); 
		System.out.println(chrThree);
		
	}

}
