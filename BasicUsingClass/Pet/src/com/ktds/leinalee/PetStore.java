

package com.ktds.leinalee;

public class PetStore {
	
	public static void main(String[] args) {
		
		System.out.println("�⸦ �� �ִ� �ֿ� ������ ���� " + Pet.petCount);
		
/*		Pet.test = 17;
		System.out.println(Pet.test);*/
		
		//���� Ŭ�������� 2���� �ٸ� �ν��Ͻ��� ������ �� �ִ�.
		Pet dog = new Pet();
		dog.petCount++;
		System.out.println(dog.petCount);
		
		Pet cat = new Pet();
		cat.petCount++;
		System.out.println(cat.petCount);
	
		//public�� ��쿡 ����ߴ� ��� 
/*		dog.type = "��";
		dog.name = "�ٵ���";
		
		cat.type = "�����";
		cat.name = "����";*/
		
		dog.setType("��");
		dog.setName("�ٵ���");
		
		cat.setType("�����");
		cat.setName("����");
		
		System.out.println("�ֿϵ����� ������ " + dog.getType() + " �̰�, �̸��� " + dog.getName() + " �Դϴ�.");
		System.out.println("�ֿϵ����� ������ " + cat.getType() + " �̰�, �̸��� " + cat.getName() + " �Դϴ�.");
		
	}

}
