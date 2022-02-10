package 결제_정산_시스템_사례;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public enum PayGroup {
	/*
	 *  열거형은 서로 연관된 제한적인 상수들의 집합
	 */
    CASH("현금",Arrays.asList("계좌이체","무통장입금","현장결제",
    		"토스")),
    CARD("카드",Arrays.asList("페이코","신용카드","카카오페이","배민페이")),
    ETC("기타결제",Arrays.asList("포인트","쿠폰")),
    EMPTY("없음",Collections.EMPTY_LIST);
	
	private String title;
	private List<String> payList;
	
	PayGroup(String title,List<String> payList) {
		this.title=title;
	    this.payList=payList;
		
	}

	public String getTitle() {
		return title;
	}

	public List<String> getPayList() {
		return payList;
	}
	//사용자 정의 메소드
	
	public static PayGroup findByPayCode(String code) {
		return Arrays.stream(PayGroup.values())
				.filter(payGroup -> payGroup.payListCode(code))
				.findAny().orElse(EMPTY);
	}
	//사용자 정의 메소드
	public boolean payListCode(String code) {
		return payList.parallelStream()
				.anyMatch(pay->pay.contentEquals(code));
	}
    
}
