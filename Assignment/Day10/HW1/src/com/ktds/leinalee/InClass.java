package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InClass {

	public void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		TakeTest test = new TakeTest();
		
		List<Integer> grade = new ArrayList<Integer>();
		
		System.out.println("������ �Է��ϼ���.");
		for ( int i = 0; i < 10; i++ ) {
			int score = scanner.nextInt();
			grade.add(score);
		}
		
//		���� ������
		test.getTestResult(grade);
		
//		��հ��
		test.getGradeAverage();
//		������
		test.printGrade();
		
//		�������
		test.getStudentGPA();
//		�������
		test.printGPA();
	}
	
	public static void main(String[] args) {
		
		InClass inClass = new InClass();
		inClass.start();
	}
}
