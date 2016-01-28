package com.ktds.leinalee;

public class BikeRental {

	public void start () {
		BikeRentalBiz biz = new BikeRentalBiz();
		biz.program();
	}
	
	public static void main(String[] args) {
		BikeRental rental = new BikeRental();
		rental.start();
	}
}
