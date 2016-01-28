package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public void start() {
		List<String> movie = new ArrayList<String>();
		
		movie.add("반지의 제왕");
		movie.add("인사이드 아웃");
		movie.add("굳 다이노");
		

		Iterator<String> testIterator = movie.iterator();

		while ( testIterator.hasNext()) {
			String s = testIterator.next();
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.start();
	}
}
