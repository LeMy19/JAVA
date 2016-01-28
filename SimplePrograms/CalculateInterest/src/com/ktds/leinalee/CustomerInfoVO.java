package com.ktds.leinalee;

/**
 * name : 이름 
 * phonNumber : 전화번호 
 * guarantee : 담보 
 * loanAmount : 대출금액 
 * loanDate : 대출일자
 * totalRentTime : 총 대출 시간 
 * ownCash : 소지 금액
 * 
 * @author 206-025
 *
 */
public class CustomerInfoVO {

	private String name;
	private String phoneNumber;
	private String guarantee;
	private long loanAmount;
	private int loanDate;
	private int totalRentTime;
	private long ownCash;
	private long payBackMoney;

	public long getPayBackMoney() {
		return payBackMoney;
	}

	public void setPayBackMoney(long payBackMoney) {
		this.payBackMoney = payBackMoney;
	}

	public int getTotalRentTime() {
		return totalRentTime;
	}

	public void setTotalRentTime(int totalRentTime) {
		this.totalRentTime = totalRentTime;
	}

	public long getOwnCash() {
		return ownCash;
	}

	public void setOwnCash(long ownCash) {
		this.ownCash = ownCash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(int loanDate) {
		this.loanDate = loanDate;
	}

	public String getPayBackDate() {
		return payBackDate;
	}

	public void setPayBackDate(String payBackDate) {
		this.payBackDate = payBackDate;
	}

	private String payBackDate;

}
