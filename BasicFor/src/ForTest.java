/*
 * for���� �����ϴ� ��� 
 * web����Ʈ�� ���� ��, for���� ����ϸ鼭 �Խ����� ����� �ҷ��´�. 
 * for���� ����� ������ for���� ��ø Ȱ���� ��Ʊ� �����̴�.
 * <for���� ��ø Ȱ��>
 * �迭�� ���� ���� ���� �� for���� ��ø�ؼ� ����Ѵ�. 
 * 2�� ��ø�ϸ� 2D, 3�� ��ø�ϸ� 3D ��, ���..?
 * for �������� ���ǽ� ������ ��κ� i�� ����Ѵ�. 
 * (������)�� ������ ���� ����..? ���⿡ �����ڸ� �� ���� �� �ִ� ���ΰ�?
 * 
 * while�� 99.9%������ ���ѹݺ��� ���� �� ����Ѵ�. 
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		for(i = 0 ; i < 10 ; i++ ) {
			System.out.println(i);
		}

		System.out.println();
		
		for(i = 0 ; i < 10 ; ) {
			i++;
			System.out.println(i);
		}
		
		System.out.println();
		
		for(i = 0 ; i < 10 ; ) {
			++i;
			System.out.println(i);
		}
		
		//���� ������ �ܿ��
		System.out.println("(���ϱ�����)8���� ����!");
		for(int n=1; n<10; n++) {
			System.out.println("8 X " + n + " = " + (8*n));
		}
		
		
		//������ ����ϱ� ��ø for���� ����־���Ѵ�. 
		for (int n = 1; n<10; n++) {
			System.out.println(n+"�� �������� ����!");
			for(int m = 1; m<10; m++){
				System.out.println(n+" X " + m +" = " + (n*m));
			}
		}
		
		
		//�ϳ��� for���� �̿��Ͽ� **********(10��)�� �Է��ϼ���.
		for(int n=0; n<10; n++) {
			System.out.print("*");
		}
		System.out.println();
		
		//��ø for���� �̿��Ͽ� 
		// *
		// **
		// ***
		// ****
		// *****
		// �� ����Ͻÿ� 
		
		for(int n=1; n<6; n++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
