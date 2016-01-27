package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {

	public void start() {
		
		TheaterBiz biz = new TheaterBiz();
		biz.program();
		
	}

	public static void main(String[] args) {

		Theater theatre = new Theater();
		theatre.start();

	}

}
