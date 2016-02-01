package com.ktds.leinalee;

public class Main {
	

	public void start () {
		AirlineBiz biz = new AirlineBiz();
		biz.run();
	}

	public static void main(String[] args) {
		
		Main main = new Main();
		main.start();
	}
}
