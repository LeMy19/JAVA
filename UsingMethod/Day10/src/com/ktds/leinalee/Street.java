package com.ktds.leinalee;

public class Street {

	public static void main (String[] args) {
		
//		create Machine instance
		Machine machine = new Machine();
		
		machine.setColaQuantity(15);
		machine.setSpriteQuantity(5);
		machine.setfantaQuantity(7);
		
		machine.setColaPrice(1300);
		machine.setSpritePrice(1100);
		machine.setFantaPrice(1100);
		
//		create Customer instance 
		People customer = new People();
		customer.setColaQuantity(0);
		customer.setSpriteQuantity(0);
		customer.setFantaQuantity(0);
		customer.setMoney(3000);
		
//		program start!!
		while(true) {
			
			if ( customer.getMoney() <= 0 ) {
				break;
			}
				
			machine.printMenu();
			machine.getMoney(3000, customer);
			machine.giveDrink(1, 1, customer);
			customer.printInfo();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
