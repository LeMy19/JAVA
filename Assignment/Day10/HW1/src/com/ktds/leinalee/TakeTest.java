package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakeTest {
	
//	GPA ���� 
	public static List<Integer> GPA_A = Arrays.asList(90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
	public static List<Integer> GPA_B = Arrays.asList(80, 81, 82, 83, 84, 85, 86, 87, 88, 89);
	public static List<Integer> GPA_C = Arrays.asList(70, 71, 72, 73, 74, 75, 76, 77, 78, 79);
	public static List<Integer> GPA_D = Arrays.asList(60, 61, 62, 63, 64, 65, 66, 67, 68, 69);
	
	private List<Integer> grade = new ArrayList<Integer>();
	private String gpa;
	private double average;
	
//	getter & setter
	public List<Integer> getGrade() {
		return grade;
	}

	public void setGrade(List<Integer> grade) {
		this.grade = grade;
	}
	
	public String getGpa() {
		return gpa;
	}
	
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
//	method

//	�л� ���� �޾ƿ���
	public void getTestResult ( List<Integer> studentGrade ) {
		for ( int i =0; i < studentGrade.size(); i++) {
			this.setGrade(studentGrade);			
		}
	}
	
//	�л� ���� ��� ���ϱ�
	public void getGradeAverage () {
		for ( int tempGrade : this.grade ) {
			this.average += tempGrade;
		}
		this.average = this.average/grade.size();
	}
	
//	�л� ��� ���� ����ϱ�
	public void printGrade () {
		System.out.println(this.getAverage());
	}
	
//	�л� ���� ���ϱ�
	public void getStudentGPA () {
		if( GPA_A.contains( (int)average ) ) {
			gpa = "A";
		} 
		else if ( GPA_B.contains( (int)average ) ) {
			gpa = "B";
		}
		else if ( GPA_C.contains( (int)average ) ) {
			gpa = "C";
		}
		else if ( GPA_D.contains( (int)average ) ) {
			gpa = "D";
		}
		else {
			gpa = "F";
		}
	}
	
//	�л� ���� ����ϱ�
	public void printGPA () {
		System.out.println(gpa);
	}
	
	

}
