package com.ktds.leinalee;

public class Customer {
   
   // �����ڰ� ������ �Ӽ�
   // �ν��Ͻ� �ʵ�
   
   /**
    *  �����ڰ� ������ �ִ� �ݾ�
    */
   private int money;
   
   /**
    *  �����ڰ� ������ �ִ� ����� ��
    */
   private int appleCount;
   
   public void setMoney( int money ) {
      this.money = money;
   }
   
   public void setAppleCount( int appleCount ) {
      this.appleCount = appleCount;
   }
   
   public int getMoney() {
      return this.money;
   }
   
   public int getAppleCount() {
      return this.appleCount;
   }
   
   // �� ���� �޼ҵ�� �ϳ��� ��ɸ� �����ؾ� �Ѵ�.
   // ���� �ش�.
   public int pay( int money ) {
      this.money -= money;
      return money;
   }
   
   // ����� �޴´�.
   public void getApple( int appleCount) {
      this.appleCount += appleCount;
   }
   
   // �Ž������� �޴´�.
   public void takeMoney( int money ) {
      this.money += money;
   }
   
   public void printMyInfo() {
      System.out.println("�����ڰ� ���� ����� �� : " + this.appleCount);
      System.out.println("�����ڰ� ���� �� : " + this.money);
   }
   
}