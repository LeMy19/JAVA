package com.ktds.leinalee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileNotFoundExceptionTest {

	public void start() {
		
//		file�� ã�� �� new File(file url) ����. 
		File file = new File("D:\\hello");

//		���ܸ� �ݵ�� ������ �ϴ� �͵�.. ������ �߻��� Ȯ���� �ſ� ����.. 		
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
