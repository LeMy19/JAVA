package com.ktds.leinalee;

public class Market {
	
	private int appleCount = 15;
	private int money = 4000;
	public static final int APPLE_PRICE = 500; // »ó¼ö
	
	// ÁøÂ¥ ·ÎÁ÷Àº start¿¡ µé¾î°¨
	public void start(){
		
		Customer ±è±¤¹Î = new Customer();
		±è±¤¹Î.setMoney(5300);
		±è±¤¹Î.setAppleCount(0);
		
		while ( true) {
		
			if ( this.appleCount == 0 || ±è±¤¹Î.getMoney() < Market.APPLE_PRICE ) {
				System.out.println("¾È ÆÈ¾Æ¿ä.");
				break;
			}
			
			// ¼ÒºñÀÚ¿¡°Ô µ·À» ¹Þ´Â´Ù.
			±è±¤¹Î.pay(1000);
			this.money += 1000;
			
			// ¼ÒºñÀÚ¿¡°Ô »ç°ú¸¦ ÁØ´Ù.
			this.appleCount -= 1;
			±è±¤¹Î.getApple(1);
			
			// °Å½º¸§µ·À» ³²°Ü ÁØ´Ù.
			int money = 1000 - ( Market.APPLE_PRICE * 1 );
			this.money -= money;
			±è±¤¹Î.takeMoney(money);
			
			// ¼ÒºñÀÚÀÇ Á¤º¸¸¦ Ãâ·ÂÇÑ´Ù.
			±è±¤¹Î.printMyInfo();
		}
		
	}
	
	// ¾ÕÀ¸·Î ¸ÞÀÎ¹®Àº ÀÌ·¸°Ô ¾µ°Í
	// ¸ÞÀÎÀº Á¦ÀÏ ¹ØÀ¸·Î
	public static void main(String[] args){
		
		Market market = new Market();
		market.start();
		
	}

}
