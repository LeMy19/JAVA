package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BikeRentalBiz {
	
	public static final int TOTALBIKE = 15;
	public static int A_BIKE = 1;
	public static int B_BIKE = 2;
	public static int C_BIKE = 3;
	
	public static final int BIKE_PRICE[] = {1000, 2000, 5000};
	
	private int aBike;
	private int bBike;
	private int cBike; 
	
	private List<BikeRentalInfoVO> info;
	private InputPackage input;
	private BikeRentalTime check;
	
	private int flag;

	public List<BikeRentalInfoVO> getInfo() {
		return info;
	}

	public void setInfo(List<BikeRentalInfoVO> info) {
		this.info = info;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getaBike() {
		return aBike;
	}

	public void setaBike(int aBike) {
		this.aBike = aBike;
	}

	public int getbBike() {
		return bBike;
	}

	public void setbBike(int bBike) {
		this.bBike = bBike;
	}

	public int getcBike() {
		return cBike;
	}

	public void setcBike(int cBike) {
		this.cBike = cBike;
	}

	public BikeRentalBiz () {
		input = new InputPackage();
		info = new ArrayList<BikeRentalInfoVO>();
		check = new BikeRentalTime();
		
//		자전거 초기화
		aBike = 10;
		bBike = 3;
		cBike = 2;
	}
	
	public void menu () {
		System.out.println("<자전거 대여>");
		this.currentBikeNumber();
		System.out.println("---------------------");
		System.out.println("1. 대여");
		System.out.println("2. 반납");
		System.out.println("3. 종료 ");
		this.setFlag(input.inputInt());
	}
	
	public void currentBikeNumber () {
		System.out.println("1)보급형 자전거: "+ aBike);
		System.out.println("2)중급형 자전거: "+ bBike);
		System.out.println("3)고급형 자전거: "+ cBike);
	}

	public void rentBike () {
		BikeRentalInfoVO temp = new BikeRentalInfoVO();
		
		System.out.println("<대여>");
		System.out.println("이름: ");
		temp.setName(input.inputString());
		
		System.out.println("자전거 종류: ");
		temp.setBikeType(input.inputInt());
		
//		자전거 대여할 수 있는지 확인 & 시간 확인
		if ( this.bikeCheck(temp.getBikeType())) {
			temp.setNowTime(this.check.timeCheck());
			this.getInfo().add(temp);
		}
	}
	
	public BikeRentalInfoVO nameCheck (String name) {

		for ( BikeRentalInfoVO temp : this.getInfo()) {
			if ( temp.getName().equals(name) ) {
				return temp;
			}
		}
		return new BikeRentalInfoVO();
	}
	
	public boolean bikeCheck (int number) {
		if ( number == A_BIKE && aBike > 0 ) {
			aBike--;
			return true;
		} 
		else if ( number == B_BIKE && bBike > 0  ) {
			bBike--;
			return true;
		}
		else if ( number == C_BIKE && cBike > 0  ) {
			cBike--;
			return true;
		} 
		else {
			System.out.println("자전거를 대여할 수 없습니다.");
		}
		return false;
	}
	
	public void returnBike () {
		BikeRentalInfoVO temp = new BikeRentalInfoVO();
		
		System.out.println("<반납>");
		System.out.println("이름: ");
		temp = this.nameCheck(input.inputString());
		
		if ( temp != null ) {
			int result;
			int fee;
			
			temp.setReturnTime(this.check.timeCheck());
			result = this.check.totalRentalTime( temp.getNowTime(), temp.getReturnTime());
			System.out.println("총 대여 시간(분/min): " + result);
			fee = this.rentalFee(result, temp.getBikeType());
			System.out.println("대여료는 : " +fee);
			this.getInfo().remove(temp);
			this.backBike(temp.getBikeType());
		}
	}
	
	public void backBike (int type) {
		if ( type == A_BIKE ) {
			aBike++;
		} 
		else if ( type == B_BIKE ) {
			bBike++;
		}
		else if ( type == C_BIKE ) {
			cBike++;
		} 
	}
	
	public int rentalFee (int time, int type) {
		int resultTime = (int) Math.round(time/10.0);
		return BikeRentalBiz.BIKE_PRICE[type] * resultTime;
	}
	

	
	public void program () {
		
		while(true) {
			this.menu();
			if ( this.getFlag() == 1 ) {
				this.rentBike();
			} 
			else if ( this.getFlag() == 2) {
				this.returnBike();
			}
			else {
				System.out.println("종료합니다.");
				System.exit(0);
			}
				
		}
	}
}
