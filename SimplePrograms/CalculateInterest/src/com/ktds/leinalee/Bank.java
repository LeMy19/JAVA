package com.ktds.leinalee;

public class Bank {

	public void start() {
		BankBiz biz = new BankBiz();
		biz.program();
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.start();
	}
}
