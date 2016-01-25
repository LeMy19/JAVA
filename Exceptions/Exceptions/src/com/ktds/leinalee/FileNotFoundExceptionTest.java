package com.ktds.leinalee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileNotFoundExceptionTest {

	public void start() {
		
//		file을 찾는 것 new File(file url) 들어간다. 
		File file = new File("D:\\hello");

//		예외를 반드시 만들어야 하는 것들.. 에러가 발생할 확률이 매우 높다.. 		
//		InputStream is1 = new FileInputStream(file);

		try {
			InputStream is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		FileNotFoundExceptionTest test = new FileNotFoundExceptionTest();
		test.start();
		
	}
}
