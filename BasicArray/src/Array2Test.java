// import�� �����ϸ� �޸𸮸� ���� ����ϴ� ���̴�. 
// ���� �뷮�� �þ�� ���� �ƴϴ�. ��, import file 10kb �̰� �� ������Ʈ�� 3kb����ϸ�
// ���� 13kb�� �Ǵ� ���� �ƴ϶�� ���̴�.
public class Array2Test {

	public static void main(String[] args) {

		
		//java.util.Scanner package ����ϱ�
		//�켱 import�� ���ش�

		java.util.Scanner scanner = new java.util.Scanner (System.in);
		scanner.nextLine();
		
		//��ü������ ���� Scanner ����ϱ�
		Scanner scanner2 = new Scanner();
		scanner2.sayHello();

		// �迭�� ����� ������� new�� �ٴ´�. �׸��� type�� �����ش�.
		String students[][] = new String[5][6];
		

		students[0][0] = "Ȳ�Ҹ�";
		students[0][1] = "������";
		students[0][2] = "����ȣ";
		students[0][3] = "����ǥ";
		students[0][4] = "������";
		students[0][5] = "������";

		students[1][0] = "�̶�";
		students[1][1] = "�輺��";
		students[1][2] = "������";
		students[1][3] = "������";
		students[1][4] = "Ȳ����";
		students[1][5] = "����ȣ";

		students[2][0] = "������";
		students[2][1] = "�Ǽ���";
		students[2][2] = "�赿��";
		students[2][3] = "���ϴ�";
		students[2][4] = "������";
		students[2][5] = "����ȣ";

		students[3][0] = "�豤��";
		students[3][1] = "������";
		students[3][2] = "�̱⿬";
		students[3][3] = "������";
		students[3][4] = "������";

		students[4][0] = "�̽¼�";
		students[4][1] = "�����";
		students[4][2] = "�ȽŹ�";
		students[4][3] = "����ȭ";
		students[4][4] = "�迬";

		int teamCount = students.length; // 5 input
		int studentCount = 0;

		// ������� 6 6 6 6 6 �̴�. ���� �� 6 6 6 5 5 �� ������ �ʴ´�.
		// ������� ���� �� ���� null�� ä�����ִ�. (null�� �ǹ� == ����)
		//���° ������ ã�ƾ� �� ���� �ݵ�� ù��° �迭 ��� ����� ����Ѵ�.

		for (int i = 0; i < teamCount; i++) { //
			
			System.out.println(students[i].length);
			studentCount = students[i].length; // �迭 ���� �迭�� ���� length�� ���ؾ��Ѵ�.
			
			for (int j = 0; j < studentCount; j++) {
				
				System.out.println(students[i][j]);
			}
		}

		/*
		 * for(int i = 0; i<5 ; i++) { for(int j = 0; j<6; j++) {
		 * System.out.println(students[i][j]); } }
		 */

		// ���� for��
		// ������ �迭���� �ϳ��� ������ �迭�� ���´�.
		for (String[] team : students) {
			for (String person : team) {
				System.out.println(person);
			}

			System.out.println("================");
		}
		

	}

}
