
public class IFTest {
	public static void main(String[] args) {
		//이쁘게 쓰는 것이 가장 중요. 가독성이 높아지기 때문이다. 	
		int money = 1200; 
		
		if ( money >= 1200 ) { //이때, money는 1200이므로 true이다.
			System.out.println("캔커피를 삽니다.");
		}
		
		int age = 37;
		int age2 = 27;
		
		if ( age >= 30) {
			System.out.println("30대 입니다.");
		}
			
		if( age >= 30 && money >= 1200 ){
			System.out.println("캔커피를 사는 30대 입니다.");
		}
		
		//나이가 20세 이상이고, 현재 가진 금액이 4,500원 이상일 때,
		//"담배를 삽니다"라고 출력하는 명령문을 만드세요. 
		
		if( age >=20 && money >= 4500 ) {
			System.out.println("담배를 삽니다.");
		}
		
		//남자는 0, 여자는1
		//성별이 남자일 경우 "남탕으로 가세요" 
		//성별이 여자일 경우 "여탕으로 가세요"
		int sex = 1;
		if ( sex == 1 ) {
			System.out.println("여탕으로 가세요.");
		}
		if ( sex == 0 ) {
			System.out.println("남탕으로 가세요.");
		}
		
		
	}
	

}
