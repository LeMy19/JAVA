package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

/**
 * Biz : Business
 * 전화번호부가 가져야할 기능들을 정의한다.  
 * Create : 전화번호 등록
 * Read : 전화번호 찾기
 * Update : 전화번호 업데이트
 * Delete : 전화번호 삭제
 * ==============================
 * CRUD 라고 한다.
 * 
 * @author 206-025
 *
 */
public class PhoneBookBiz {

	private List<PhoneInfoVO> phoneInfoList;
	
	public PhoneBookBiz () {
		this.phoneInfoList = new ArrayList<PhoneInfoVO>();
	}
	
//	Getter & Setter
	public List<PhoneInfoVO> getPhoneInfoList() {
		return phoneInfoList;
	}

	public void setPhoneInfoList(List<PhoneInfoVO> phoneInfoList) {
		this.phoneInfoList = phoneInfoList;
	}

//	Create
	public void addNewPhoneBookInfo (PhoneInfoVO phoneInfo) {
		this.phoneInfoList.add(phoneInfo);
	}
	
//	Read
	public PhoneInfoVO getPhoneInforByName (String name) {
		
//		이름으로 사람을 검색함 
		for ( PhoneInfoVO phoneInfo : this.phoneInfoList ) {
			if ( phoneInfo.getName().equals(name)) {
				return phoneInfo;
			}
		}
		
//		리스트에 검색한 결과가 없을 때는 새로운 인스턴스를 만들어 리턴한다. 
		return new PhoneInfoVO();
	}
}
