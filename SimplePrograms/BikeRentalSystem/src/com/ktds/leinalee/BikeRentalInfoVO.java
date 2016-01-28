package com.ktds.leinalee;

public class BikeRentalInfoVO {

	private String name;
	private int bikeType;
	private int nowTime;
	private int returnTime;
	private int totalFee;

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBikeType() {
		return bikeType;
	}

	public void setBikeType(int bikeType) {
		this.bikeType = bikeType;
	}

	public int getNowTime() {
		return nowTime;
	}

	public void setNowTime(int nowTime) {
		this.nowTime = nowTime;
	}

	public int getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}

}
