/*
 * switch 문은 잘 사용하지 않는다. 
 * 하지만, 가끔씩 여러차례의 인증절차를 거칠 때 switch를 사용할 수 있다.
 * 그렇지만 순서만으로 switch를 사용하기에는 낭비다.
 * 그럼에도불구하고 switch가 있는 이유는 분명 용도가 있기 때문이다. 
 * 서버.. 에... 엄청나게 복잡한 flow가 있을 때 종종 쓰인다.. 
 * 
 * 1) switch 문을 if문으로 바꿔서 사용하는 것이 좋다. 
 * 
 */
public class SwitchTest {
	
	public static void main(String[] args) {
		
		int numberOne = 1;
		
		
		switch (numberOne) { //비교연산이나 논리연산은 들어가지 못한다. 그러나 연산자는 들어갈 수 있다. 
		case 1 : //numberOne이 1이라면.. 
			System.out.println("numberOne의 값은 1입니다.");
			break;
		case 2 :
			System.out.println("numberOne의 값은 2입니다.");
			break;
		case 3 : 
			System.out.println("numberOne의 값은 3입니다.");
			break;
		default : //아무것도 맞지 않는 경우에 쓴다.
			System.out.println("numberOne의 값은 알 수 없습니다.");
			break;
		}
		
		//switch문을 if문으로 바꾼 형태 
		if(numberOne==1) {
			System.out.println("numberOne의 값은 1입니다.");
		} else if (numberOne == 2) {
			System.out.println("numberOne의 값은 2입니다.");
		} else if (numberOne == 3 ) {
			System.out.println("numberOne의 값은 3입니다.");
		} else {
			System.out.println("numberOne의 값은 알 수 없습니다.");
		}
		
		
		
	}

}
