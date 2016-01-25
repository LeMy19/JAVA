package com.ktds.leinalee;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DictionaryProgram {

//	단어 저장용 변수의 선언과 초기화 
	private String english = "";
	private String korean = "";
	private int flag = 0;

	//	인스턴스 생성 
	private Map<String, String> dictionary;
	private Scanner console;
	
	//	getter & setter 
	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getKorean() {
		return korean;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
//	만들 필요가 없음 
	public Map<String, String> getDictionary() {
		return dictionary;
	}
	
	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	/**
	 * 인스턴스를 생성하는 만드는 메소드
	 */
	public DictionaryProgram() {
		this.dictionary= new HashMap<String, String>();
		this.console = new Scanner(System.in);
	}
	
	/**
	 * intruduction
	 */
	public void introduction () {
//		인삿말
		System.out.println("--------------------------------");
		System.out.println("         간단한 단어장");
		System.out.println("--------------------------------");

	}
	
	/**
	 * menu를 프린트 하는 메소드 
	 */
	public void printMenu() {

		System.out.println("*******메뉴를 선택하세요********");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 조회");
		System.out.println("3. 단어 삭제");
		System.out.println("9. 종료");
	}
	
	/**
	 * menu를 고르는 메소드 
	 */
	public int choiceMenu(Scanner console) {
//		메뉴를 입력 받음
		return console.nextInt();
	}
	
	/**
	 * 선택 메뉴 매칭 
	 */
	public void matchMenu() {
		
//		예외 처리 위한 while문 
		while(true) {
			
			try {
	//			메뉴를 입력 받음 
				setFlag(choiceMenu(console));
	//			Scanner reset
				console = new Scanner(System.in);
				
				if(flag == 1) {
					addNewWord(console);
				}
				else if (flag == 2) {
					findWord(console);
				} 
				else if (flag == 3) {
					removeWord(console);
				}
				else {
					System.out.println("시스템이 종료됩니다");
					break;
				}
			} //try
			catch (InputMismatchException ime) {
				System.out.println(ime.getMessage()+"라는 오류가 발생했습니다.");
				System.out.println("다시 메뉴를 입력하세요.");
				console = new Scanner(System.in);
			} //catch
			
		} //while
		
	}
	
	/**
	 * 새로운 영어 단어 등록 
	 */
	public void addNewWord (Scanner console) {
		System.out.println("등록하고 싶은 영어 단어를 입력하세요.");
		setEnglish(console.next());
		System.out.println("등록하고 싶은 영어 단어의 뜻을 한국어로 입력하세요.");
		setKorean(console.next());
		
//		Map에 단어를 등록함
		dictionary.put(english, korean);
	}
	
	/**
	 * 단어를 찾습니다.
	 */
	public void findWord (Scanner console) {
		System.out.println("찾고 싶은 영어 단어를 입력하세요.");
		setEnglish(console.next());

//		Map에서 단어를 가져옴 
		setKorean(dictionary.get(english));
		
		if (korean == null) {
			System.out.println("해당 단어가 존재하지 않습니다.");
		} 
		else {
			System.out.println(english + "의 뜻은" + getKorean() + "입니다.");
		}
	}
	
	/**
	 * 단어를 삭제한다
	 */
	public void removeWord(Scanner console) {
		System.out.println("삭제하고 싶은 영어 단어를 입력하세요.");
		setEnglish(console.next());
	
//		Map에서 단어를 가져옴 
		setKorean(dictionary.get(english));
		if(korean == null) {
			System.out.println("해당 단어는 존재하지 않습니다.");
		} 
		else {
//			Map에서 단어를 삭제함 
			dictionary.remove(english);
			System.out.println(english +"를(을) 삭제했습니다.");
		}
	}
	
	public void ProgramStart() {

		this.printMenu();
		this.matchMenu();
		
	}
}
