
public class CastingOne {
	
	public static void main(String[] args){
		
		//2 byte
		short shortNumber = 10; //맨 처음 정의하는 부분
		
		//명시적 캐스팅
		//4 byte : integer
		int number = (int) shortNumber; //(int)하면 int 타입으로 강제 변환
		//8 byte : long
		long longNumber = (long) shortNumber; 
		
		System.out.println("number is " + number);
		System.out.println("long number is " + longNumber);
		
		shortNumber = 35; //이미 정의되어있기 때문에 name 앞에 short type을 적을 필요가 없다

		//묵시적 캐스팅 
		number = shortNumber;
		longNumber = shortNumber;
		
		System.out.println("number is " + number);
		System.out.println("long number is " + longNumber);
		
	}
}
