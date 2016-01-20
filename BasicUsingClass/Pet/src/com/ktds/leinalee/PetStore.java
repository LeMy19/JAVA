

package com.ktds.leinalee;

public class PetStore {
	
	public static void main(String[] args) {
		
		System.out.println("기를 수 있는 애완 동물의 수는 " + Pet.petCount);
		
/*		Pet.test = 17;
		System.out.println(Pet.test);*/
		
		//동일 클래스에서 2개의 다른 인스턴스를 생성할 수 있다.
		Pet dog = new Pet();
		dog.petCount++;
		System.out.println(dog.petCount);
		
		Pet cat = new Pet();
		cat.petCount++;
		System.out.println(cat.petCount);
	
		//public인 경우에 사용했던 방법 
/*		dog.type = "개";
		dog.name = "바둑이";
		
		cat.type = "고양이";
		cat.name = "나비";*/
		
		dog.setType("개");
		dog.setName("바둑이");
		
		cat.setType("고양이");
		cat.setName("나비");
		
		System.out.println("애완동물의 종류는 " + dog.getType() + " 이고, 이름은 " + dog.getName() + " 입니다.");
		System.out.println("애완동물의 종류는 " + cat.getType() + " 이고, 이름은 " + cat.getName() + " 입니다.");
		
	}

}
