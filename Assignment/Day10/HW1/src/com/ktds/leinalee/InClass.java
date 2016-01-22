package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InClass {

	public void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		TakeTest test = new TakeTest();
		
		List<Integer> grade = new ArrayList<Integer>();
		
		System.out.println("점수를 입력하세요.");
		for ( int i = 0; i < 10; i++ ) {
			int score = scanner.nextInt();
			grade.add(score);
		}
		
//		점수 보내기
		test.getTestResult(grade);
		
//		평균계산
		test.getGradeAverage();
//		평균출력
		test.printGrade();
		
//		학점계산
		test.getStudentGPA();
//		학점출력
		test.printGPA();
	}
	
	public static void main(String[] args) {
		
		InClass inClass = new InClass();
		inClass.start();
	}
}
