// import를 많이하면 메모리를 많이 사용하는 것이다. 
// 파일 용량이 늘어나는 것은 아니다. 즉, import file 10kb 이고 원 프로젝트가 3kb라고하면
// 합이 13kb가 되는 것이 아니라는 말이다.
public class Array2Test {

	public static void main(String[] args) {

		
		//java.util.Scanner package 사용하기
		//우선 import를 해준다

		java.util.Scanner scanner = new java.util.Scanner (System.in);
		scanner.nextLine();
		
		//자체적으로 만든 Scanner 사용하기
		Scanner scanner2 = new Scanner();
		scanner2.sayHello();

		// 배열을 만드는 방법에는 new가 붙는다. 그리고 type을 적어준다.
		String students[][] = new String[5][6];
		

		students[0][0] = "황소리";
		students[0][1] = "공정민";
		students[0][2] = "구본호";
		students[0][3] = "엄기표";
		students[0][4] = "조윤후";
		students[0][5] = "문석현";

		students[1][0] = "이람";
		students[1][1] = "배성진";
		students[1][2] = "전민정";
		students[1][3] = "조형근";
		students[1][4] = "황성재";
		students[1][5] = "김장호";

		students[2][0] = "김현섭";
		students[2][1] = "권순길";
		students[2][2] = "김동규";
		students[2][3] = "김하늘";
		students[2][4] = "양지한";
		students[2][5] = "남준호";

		students[3][0] = "김광민";
		students[3][1] = "백지경";
		students[3][2] = "이기연";
		students[3][3] = "조민제";
		students[3][4] = "유병훈";

		students[4][0] = "이승섭";
		students[4][1] = "백수경";
		students[4][2] = "안신미";
		students[4][3] = "오평화";
		students[4][4] = "김연";

		int teamCount = students.length; // 5 input
		int studentCount = 0;

		// 결과문은 6 6 6 6 6 이다. 예상 값 6 6 6 5 5 는 나오지 않는다.
		// 선언되지 않은 곳 또한 null로 채워져있다. (null의 의미 == 없다)
		//몇번째 문에서 찾아야 될 때는 반드시 첫번째 배열 출력 방법을 사용한다.

		for (int i = 0; i < teamCount; i++) { //
			
			System.out.println(students[i].length);
			studentCount = students[i].length; // 배열 안의 배열에 대한 length를 구해야한다.
			
			for (int j = 0; j < studentCount; j++) {
				
				System.out.println(students[i][j]);
			}
		}

		/*
		 * for(int i = 0; i<5 ; i++) { for(int j = 0; j<6; j++) {
		 * System.out.println(students[i][j]); } }
		 */

		// 향상된 for문
		// 다차원 배열에서 하나를 꺼내면 배열이 나온다.
		for (String[] team : students) {
			for (String person : team) {
				System.out.println(person);
			}

			System.out.println("================");
		}
		

	}

}
