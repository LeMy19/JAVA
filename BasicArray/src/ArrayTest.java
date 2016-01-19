
public class ArrayTest {

	public static void main(String[] args) {

		// 5개의 문자열이 들어가는 배열 변수를 만든다.
		String list[] = new String[5];

		list[0] = "김광민";
		list[1] = "백지경";
		list[2] = "김현섭";
		// list[3] = "남준호"; //배열을 꽉 안 채워도 괜찮다.
		// list[4] = "황성재";

		/*
		 * int index = 0; System.out.println(list[index++]);
		 * System.out.println(list[index++]); System.out.println(list[index++]);
		 * System.out.println(list[index++]); System.out.println(list[index++]);
		 */

		/*
		 * for (int i = 0; i < list.length; i++) { // list.length 는 list의 길이를 받는
		 * 것 System.out.println(list[i]); }
		 * 이것과 비교한다면, 속도가 훨씬 느리다
		 */ 

		int scores[] = new int[] { 10, 20, 30 }; // 이때, new int[] 에 수를 안 넣어줘도 괜찮다. 넣지 않는다.

		/*
		 * for (int score : scores) { 
		 * System.out.println(score); 
		 * }
		 */
		
		for( String name : list) {
			System.out.println(name);
		}
		
		//다차원배열- 2차원 배열 
		//배열은 학교를 생각해 보면 된다.
		String classRoom[][] = new String[2][3];
		
		classRoom[0][0] = "james gosling";
		classRoom[0][1] = "Dennis Richie";
		classRoom[0][2] = "linus Benedict Tnrvalds";
		
		classRoom[1][0] = "Bill Gates";
		classRoom[1][1] = "Steve Jobs";
		classRoom[1][2] = "Eric Emerson schmidt";

	}

}
