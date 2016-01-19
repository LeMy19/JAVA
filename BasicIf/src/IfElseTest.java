
public class IfElseTest {
	public static void main(String[] args) {
		//이쁘게 쓰는 것이 가장 중요. 가독성이 높아지기 때문이다. 	
		int money = 1200; 
		
		if ( money >= 1200 ) { //이때, money는 1200이므로 true이다.
			System.out.println("캔커피를 삽니다.");
		}
		
		int age = 27;
		
		if ( age >= 30) {
			System.out.println("30대 입니다.");
		} else {
			System.out.println("당신의 나이는 30대가 아닙니다.");
		}
			
		if( age >= 30 && money >= 1200 ){
			System.out.println("캔커피를 사는 30대 입니다.");
		} else { //else가 없으면 if문을 그냥 지나친다. 
			
		}
		
		//나이가 20세 이상이고, 현재 가진 금액이 4,500원 이상일 때,
		//"담배를 삽니다"라고 출력하는 명령문을 만드세요. 
		
		if( age >=20 && money >= 4500 ) {
			System.out.println("담배를 삽니다.");
		} else if ( age <20 || money < 4500 ) {
			System.out.println("담배를 못 삽니다.");			
		}
		
		//남자는 0, 여자는1
		//성별이 남자일 경우 "남탕으로 가세요" 
		//성별이 여자일 경우 "여탕으로 가세요"
		int sex = 1;
		if ( sex == 1 ) {
			System.out.println("여탕으로 가세요.");
		} else if (sex == 0) {
			System.out.println("남탕으로 가세요.");
		}
		
		
		//if문내에 5개의 계단식 if문을 설정하면 절대 안된다. 
		//if구문으로 학점 정하기
		int score = 77;
		
		if ( score >= 90 && score <= 100) {
			System.out.println("당신의 학점은 A 입니다.");
		} 
		else if ( score >= 80 && score <= 89 ) {
			System.out.println("당신의 학점은 B 입니다.");
		} 
		else if ( score >= 70 && score <= 79 ) {
			System.out.println("당신의 학점은 C 입니다.");
		} 
		else if ( score >= 60 && score <= 69) {
			System.out.println("당신의 학점은 D 입니다.");
		} 
		else {
			System.out.println("당신의 학점은 F 입니다");
		}
		
		
		//문제. 두 정수에 평균을 구한다. 
		//평균 값이 50 이상이라면, "대기"을 출력하고 
		//평균 값이 75 이상이라혐, "합격"을 출력하고 
		//평균 값이 100이라면, "수석 합격"을 출력한다. 
		int num1 = 80;
		int num2 = 95;
		int avg = (num1 + num2) / 2;
		
		if(avg == 100) {
			System.out.println("수석합격");
		} else if (avg >= 75) {
			System.out.println("합격");
		} else if (avg > 50) {
			System.out.println("대기");
		}
			
		//문자열 String 
		//문자 char **실무에서 거의 쓰이지 않는다** 
		String operator = "+";
		/*
		if ( operator == "더하기" ) {
			System.out.println("더하기를 합니다.");
		}
		*/
		
		//문지열 비교는 ==로 하면 안 된다.
		if ( operator.equals("+") ) {
			System.out.println("더하기를 합니다.");
		}
		
		
	}
}


