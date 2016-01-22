package com.ktds.leinalee;

public class Machine {
	
	public static final int MAX_QUANTITY= 15;
	
	private String[] cola;
	private String[] sprite;
	private String[] fanta;
	
	private int colaPrice;
	private int spritePrice;
	private int fantaPrice;
	
	private int money;
	
	/**
	 * �����ڰ� ���Ǳ⿡ ���� �ݾ�
	 */
	private int customerMoney;

//	Getters and Setters
	public String[] getCola() {
		return cola;
	}

	public void setCola(String[] cola) {
		this.cola = cola;
	}

	public String[] getSprite() {
		return sprite;
	}

	public void setSprite(String[] sprite) {
		this.sprite = sprite;
	}

	public String[] getFanta() {
		return fanta;
	}

	public void setFanta(String[] fanta) {
		this.fanta = fanta;
	}

	public int getColaPrice() {
		return colaPrice;
	}

	public void setColaPrice(int colaPrice) {
		this.colaPrice = colaPrice;
	}

	public int getSpritePrice() {
		return spritePrice;
	}

	public void setSpritePrice(int spritePrice) {
		this.spritePrice = spritePrice;
	}

	public int getFantaPrice() {
		return fantaPrice;
	}

	public void setFantaPrice(int fantaPrice) {
		this.fantaPrice = fantaPrice;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCustomerMoney() {
		return customerMoney;
	}
	
	public void setCustomerMoney(int customerMoney) {
		this.customerMoney = customerMoney;
	}

//	Method
	/**
	 * �ݶ��� ������ �����Ѵ�.
	 * @param quantity �ݶ����
	 */
	public void setColaQuantity(int quantity)	{
		if ( !this.isExceedQuantity(quantity) ) {
			this.cola = new String[quantity];
			this.setDrink( this.cola, "�ݶ�" );
		}
	}
	
	/**
	 * ��������Ʈ�� ������ �����Ѵ�.
	 * @param quantity ��������Ʈ����
	 */
	public void setSpriteQuantity(int quantity)	{
		if ( !this.isExceedQuantity(quantity) ) {
			this.sprite = new String[quantity];
			this.setDrink( this.sprite, "��������Ʈ" );
		}
	}
	/**
	 * ȯŸ�� ������ �����Ѵ�.
	 * @param quantity ȯŸ����
	 */
	public void setfantaQuantity(int quantity)	{
		if ( !this.isExceedQuantity(quantity) ) {
			this.fanta = new String[quantity];
			this.setDrink( this.fanta, "ȯŸ" );
		}
	}
	
	/**
	 * ������ ���� ���� �� �ִ� ������ �ʰ��ϴ��� üũ�Ѵ�. 
	 * @param quantity �Է� ���� 
	 * @return �Է� ���� > �ִ� ������ ��� 
	 */
	private boolean isExceedQuantity (int quantity) {
		boolean isExceed = quantity > Machine.MAX_QUANTITY;
		if( isExceed ) {
			System.out.println("�ִ� �뷮�� " + Machine.MAX_QUANTITY + "�Դϴ�.");
		}
		return isExceed;
	}
	
	/**
	 * ������ ������ �̸��� �����Ѵ�.
	 * @param drink �ν��Ͻ� �ʵ� ( cola, sprite, fanta )
	 * @param name ������ �̸� 
	 */
	private void setDrink( String drink[], String name ) {
		for ( int i = 0; i < drink.length; i++ ) {
			drink[i] = "name";
		}
	}
	
	
	/**
	 * ���Ǳ⿡ ���� �ִ´�. 
	 * @param money ���Ǳ⿡ ���� �ݾ� 
	 * @param customer ���� ���� ��
	 */
	public void getMoney (int money, People customer ) {
		this.money += money;
		
		this.customerMoney = 0; //�ʱ�ȭ ����
		this.customerMoney = money;
		
		customer.pay(money);
	}
	
	/**
	 * �޴��� ����Ѵ�
	 */
	public void printMenu() {
		System.out.println("�Ʒ� ��ǰ�� �����ϼ���");
		System.out.println("�ݶ� (" + this.getColaPrice() + ") :" 
				+ this.getDrinkQuantity(1) + "��");
		System.out.println("��������Ʈ (" + this.getSpritePrice() + ") :" 
				+ this.getDrinkQuantity(2) + "��");
		System.out.println("ȯŸ (" + this.getFantaPrice() + ") :" 
				+ this.getDrinkQuantity(3) + "��");
		System.out.println("�ݶ�� 1��, ��������Ʈ�� 2��, ȯŸ�� 3�� �Դϴ�.");
	}
	
	/**
	 * �� ������ ������ ���´�.
	 * @param drinkNumber
	 * @return
	 */
	public int getDrinkQuantity ( int drinkNumber ) {
		
		if( drinkNumber == 1 ) {
			return getDrinkQuantity( this.cola, "�ݶ�");
		} 
		else if ( drinkNumber == 2) {
			return getDrinkQuantity (this.sprite, "��������Ʈ");
		} 
		else if ( drinkNumber == 3) {
			return getDrinkQuantity(this.fanta, "ȯŸ");
		} 
		
		return 0;
	}
	

	private int getDrinkQuantity ( String drinks[], String drinkName) {
		
		int drinkQuantity  = 0;
		
		for ( String drink : drinks ) {
			if( drink.equals(drinkName)) {
				drinkQuantity++;
			}
		}
		return drinkQuantity;
	}
	
	/**
	 * ���Ḧ �����ڿ��� �ش�. 
	 * @param drinkNumber ���� ��ȣ ( 1: �ݶ� , 2: ��������Ʈ, 3: ȯŸ)
	 * @param quantity ���� ���� 
	 * @param customer
	 */
	public int giveDrink( int drinkNumber, int quantity, People customer ) {

//		�ݶ�
		if( drinkNumber == 1 ) {
//			1. �����ڰ� ���� �ݾ��� ���ᰡ��X���� �� �����ϴ��� Ȯ��
//			   ���� �ݾ��� ����ܴٸ� ���� �Ұ� 
			if ( this.customerMoney >= (this.getColaPrice() * quantity) ) {
//				2. ���Ḧ �Һ��ڿ��� �ش� 
				this.saleDrink(this.cola, quantity);
//				3. �Ž������� �Һ��ڿ��� �ش� 
				int remainMoney = this.customerMoney - (this.getColaPrice() * quantity );
				customer.getRaminMoney(remainMoney);
			} 
			else {
				System.out.println("�ݾ��� ���ڶ��ϴ�.");
				customer.getRaminMoney(this.customerMoney);
			}
		} 
		
//		��������Ʈ
		else if ( drinkNumber == 2) {
//			1. �����ڰ� ���� �ݾ��� ���ᰡ��X���� �� �����ϴ��� Ȯ��
//			   ���� �ݾ��� ����ܴٸ� ���� �Ұ� 
			if ( this.customerMoney >= (this.getSpritePrice() * quantity) ) {
//				2. ���Ḧ �Һ��ڿ��� �ش� 
				this.saleDrink(this.sprite, quantity);
//				3. �Ž������� �Һ��ڿ��� �ش� 
				int remainMoney = this.customerMoney - (this.getSpritePrice() * quantity );
				customer.getRaminMoney(remainMoney);
			}
			else {
				System.out.println("�ݾ��� ���ڶ��ϴ�.");
				customer.getRaminMoney(this.customerMoney);
			}
		} 
		
//		ȯŸ
		else if ( drinkNumber == 3) {
//			1. �����ڰ� ���� �ݾ��� ���ᰡ��X���� �� �����ϴ��� Ȯ��
//			   ���� �ݾ��� ����ܴٸ� ���� �Ұ� 
			if ( this.customerMoney >= (this.getFantaPrice() * quantity) ) {
//				2. ���Ḧ �Һ��ڿ��� �ش� 
				this.saleDrink(this.fanta, quantity);
//				3. �Ž������� �Һ��ڿ��� �ش� 
				int remainMoney = this.customerMoney - (this.getFantaPrice() * quantity );
				customer.getRaminMoney(remainMoney);
			}
			else {
				System.out.println("�ݾ��� ���ڶ��ϴ�.");
				customer.getRaminMoney(this.customerMoney);
			}
		} 
		
//		�ش� �޴� ����
		else {
			System.out.println("�ش� �޴��� �����ϴ�.");
		}
		
		return 0;
	}
	
	
	private void saleDrink( String drinks[], int quantity ) {
		
		int saleCount = 0; 
		
		for ( int i = 0; i < drinks.length ; i ++) {
			
			if ( saleCount == quantity ) {
				break;
			}
			
			if ( drinks[i].equals("�Ǹŵ�") ) {
				drinks[i] = "�Ǹŵ�";
				saleCount++;
			}
		} //for
		
		
	}

	

}
