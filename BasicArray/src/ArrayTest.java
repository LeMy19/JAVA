
public class ArrayTest {

	public static void main(String[] args) {

		// 5���� ���ڿ��� ���� �迭 ������ �����.
		String list[] = new String[5];

		list[0] = "�豤��";
		list[1] = "������";
		list[2] = "������";
		// list[3] = "����ȣ"; //�迭�� �� �� ä���� ������.
		// list[4] = "Ȳ����";

		/*
		 * int index = 0; System.out.println(list[index++]);
		 * System.out.println(list[index++]); System.out.println(list[index++]);
		 * System.out.println(list[index++]); System.out.println(list[index++]);
		 */

		/*
		 * for (int i = 0; i < list.length; i++) { // list.length �� list�� ���̸� �޴�
		 * �� System.out.println(list[i]); }
		 * �̰Ͱ� ���Ѵٸ�, �ӵ��� �ξ� ������
		 */ 

		int scores[] = new int[] { 10, 20, 30 }; // �̶�, new int[] �� ���� �� �־��൵ ������. ���� �ʴ´�.

		/*
		 * for (int score : scores) { 
		 * System.out.println(score); 
		 * }
		 */
		
		for( String name : list) {
			System.out.println(name);
		}
		
		//�������迭- 2���� �迭 
		//�迭�� �б��� ������ ���� �ȴ�.
		String classRoom[][] = new String[2][3];
		
		classRoom[0][0] = "james gosling";
		classRoom[0][1] = "Dennis Richie";
		classRoom[0][2] = "linus Benedict Tnrvalds";
		
		classRoom[1][0] = "Bill Gates";
		classRoom[1][1] = "Steve Jobs";
		classRoom[1][2] = "Eric Emerson schmidt";

	}

}
