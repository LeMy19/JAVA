package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirlineBiz {

	private InputPackage input;

	public static int ROW = 3;
	public static int CELL = 5;
	
	private Map<Integer, List<String>> row;
	private List<String> cell;
	private int flag;
	private int remainSeatCount;
	
	private Map<String, CustomerVO> customerInfo;
	
	public Map<String, CustomerVO> getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(Map<String, CustomerVO> customerInfo) {
		this.customerInfo = customerInfo;
	}

	public int getRemainSeatCount() {
		return remainSeatCount;
	}

	public void setRemainSeatCount(int remainSeatCount) {
		this.remainSeatCount = remainSeatCount;
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public InputPackage getInput() {
		return input;
	}

	public void setInput(InputPackage input) {
		this.input = input;
	}

	public Map<Integer, List<String>> getRow() {
		return row;
	}

	public void setRow(Map<Integer, List<String>> row) {
		this.row = row;
	}

	public List<String> getCell() {
		return cell;
	}

	public void setCell(List<String> cell) {
		this.cell = cell;
	}

	public AirlineBiz () {
		input = new InputPackage();
		row = new HashMap<Integer, List<String>>();
		customerInfo = new HashMap<String, CustomerVO>();
		
		this.setRemainSeatCount(CELL * ROW);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		this.initializedSeat();
		
		while (true && remainSeatCount > 0) {
			this.menu();
			this.setFlag(this.input.inputInt());
			
			if ( this.getFlag() == 1 ) {
				this.bookSeat();
			} else if ( this.getFlag() == 2) {
				this.cancelSeat();
			} 
		}
		
	}

	public void initializedSeat() {
		for (int i = 0; i < ROW; i++) {
			this.cell = new ArrayList<String>();
			for (int j = 0; j < CELL; j++) {
				this.getCell().add("□");
			}
			this.getRow().put(i, this.cell);
		}
	}
	
	public void menu () {
		System.out.println("<비행기 예약>");
		System.out.println( ROW + "줄 " + CELL + "칸 인 비행기입니다.");
		System.out.println(remainSeatCount + "석 남았습니다");
		this.printSeat();
		System.out.println("1) 예약 2) 예약취소 ");
	}
	
	public void printSeat () {
		
		for (int i = 0; i < ROW; i++) {
			List<String> seats = getRow().get(i);
			for (String seat : seats) {
				System.out.print(seat);
			}
			System.out.println();
		}
	}
	
	public void bookSeat () {
		String tempName;
		CustomerVO tempCustomerInfo = new CustomerVO();
		
		System.out.println("<예약>");
		System.out.println("1) 이름 2) 좌석 입력하세요");
		
		tempName = input.inputString();
		tempCustomerInfo.setSeatNumber(input.inputSeat());
		
		if ( !isNamed(tempName) && !isSeated(tempCustomerInfo) ) {
			this.getCustomerInfo().put(tempName, tempCustomerInfo);
			
			int tempRow = tempCustomerInfo.getSeatNumber()[0];
			int tempCell = tempCustomerInfo.getSeatNumber()[1];
			List<String> seat = getRow().get(tempRow);
			seat.set(tempCell, "■");
			this.checkDate(tempCustomerInfo);
			
			remainSeatCount--;
			System.out.println(tempCustomerInfo.getHour()+"시 " 
					+ tempCustomerInfo.getMinute()+"분에 예약 완료");
		}
		else {
			System.out.println("예약할 수 없습니다.");
		}
	}
	
	private boolean isNamed (String name) {
		if ( this.getCustomerInfo().containsKey(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isSeated (CustomerVO customerInfo) {
		List<String> tempCell = this.getRow().get(customerInfo.getSeatNumber()[0]);
		
		if ( tempCell.get(customerInfo.getSeatNumber()[1]).equals("■") ) {
			return true;
		}
		return false;
	}
	
	public void checkDate (CustomerVO customerInfo) {
		Calendar now = Calendar.getInstance();
		
		int hour = now.get( Calendar.HOUR );
		int minute = now.get( Calendar.MINUTE );
		
		customerInfo.setHour(hour);
		customerInfo.setMinute(minute);
	}
	
	public void cancelSeat () {
		System.out.println("<예약 취소>");
		System.out.println("1) 이름 입력하세요");
		
		String tempName = input.inputString();

		
		if ( isNamed(tempName) ) {
			int seatNumber[] = this.getCustomerInfo().get(tempName).getSeatNumber();
			List<String> seats = this.getRow().get(seatNumber[0]);
			seats.set(seatNumber[1], "□");
			remainSeatCount++;
		} 
		else {
			System.out.println("예약 내역이 없습니다.");
		}
	}
}
