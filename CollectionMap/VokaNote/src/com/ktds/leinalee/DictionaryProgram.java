package com.ktds.leinalee;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DictionaryProgram {

//	�ܾ� ����� ������ ����� �ʱ�ȭ 
	private String english = "";
	private String korean = "";
	private int flag = 0;

	//	�ν��Ͻ� ���� 
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
	
//	���� �ʿ䰡 ���� 
	public Map<String, String> getDictionary() {
		return dictionary;
	}
	
	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	/**
	 * �ν��Ͻ��� �����ϴ� ����� �޼ҵ�
	 */
	public DictionaryProgram() {
		this.dictionary= new HashMap<String, String>();
		this.console = new Scanner(System.in);
	}
	
	/**
	 * intruduction
	 */
	public void introduction () {
//		�λ�
		System.out.println("--------------------------------");
		System.out.println("         ������ �ܾ���");
		System.out.println("--------------------------------");

	}
	
	/**
	 * menu�� ����Ʈ �ϴ� �޼ҵ� 
	 */
	public void printMenu() {

		System.out.println("*******�޴��� �����ϼ���********");
		System.out.println("1. �ܾ� ���");
		System.out.println("2. �ܾ� ��ȸ");
		System.out.println("3. �ܾ� ����");
		System.out.println("9. ����");
	}
	
	/**
	 * menu�� ���� �޼ҵ� 
	 */
	public int choiceMenu(Scanner console) {
//		�޴��� �Է� ����
		return console.nextInt();
	}
	
	/**
	 * ���� �޴� ��Ī 
	 */
	public void matchMenu() {
		
//		���� ó�� ���� while�� 
		while(true) {
			
			try {
	//			�޴��� �Է� ���� 
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
					System.out.println("�ý����� ����˴ϴ�");
					break;
				}
			} //try
			catch (InputMismatchException ime) {
				System.out.println(ime.getMessage()+"��� ������ �߻��߽��ϴ�.");
				System.out.println("�ٽ� �޴��� �Է��ϼ���.");
				console = new Scanner(System.in);
			} //catch
			
		} //while
		
	}
	
	/**
	 * ���ο� ���� �ܾ� ��� 
	 */
	public void addNewWord (Scanner console) {
		System.out.println("����ϰ� ���� ���� �ܾ �Է��ϼ���.");
		setEnglish(console.next());
		System.out.println("����ϰ� ���� ���� �ܾ��� ���� �ѱ���� �Է��ϼ���.");
		setKorean(console.next());
		
//		Map�� �ܾ �����
		dictionary.put(english, korean);
	}
	
	/**
	 * �ܾ ã���ϴ�.
	 */
	public void findWord (Scanner console) {
		System.out.println("ã�� ���� ���� �ܾ �Է��ϼ���.");
		setEnglish(console.next());

//		Map���� �ܾ ������ 
		setKorean(dictionary.get(english));
		
		if (korean == null) {
			System.out.println("�ش� �ܾ �������� �ʽ��ϴ�.");
		} 
		else {
			System.out.println(english + "�� ����" + getKorean() + "�Դϴ�.");
		}
	}
	
	/**
	 * �ܾ �����Ѵ�
	 */
	public void removeWord(Scanner console) {
		System.out.println("�����ϰ� ���� ���� �ܾ �Է��ϼ���.");
		setEnglish(console.next());
	
//		Map���� �ܾ ������ 
		setKorean(dictionary.get(english));
		if(korean == null) {
			System.out.println("�ش� �ܾ�� �������� �ʽ��ϴ�.");
		} 
		else {
//			Map���� �ܾ ������ 
			dictionary.remove(english);
			System.out.println(english +"��(��) �����߽��ϴ�.");
		}
	}
	
	public void ProgramStart() {

		this.printMenu();
		this.matchMenu();
		
	}
}
