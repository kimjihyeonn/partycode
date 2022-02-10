package ����_����_�ý���_���;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public enum PayGroup {
	/*
	 *  �������� ���� ������ �������� ������� ����
	 */
    CASH("����",Arrays.asList("������ü","�������Ա�","�������",
    		"�佺")),
    CARD("ī��",Arrays.asList("������","�ſ�ī��","īī������","�������")),
    ETC("��Ÿ����",Arrays.asList("����Ʈ","����")),
    EMPTY("����",Collections.EMPTY_LIST);
	
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
	//����� ���� �޼ҵ�
	
	public static PayGroup findByPayCode(String code) {
		return Arrays.stream(PayGroup.values())
				.filter(payGroup -> payGroup.payListCode(code))
				.findAny().orElse(EMPTY);
	}
	//����� ���� �޼ҵ�
	public boolean payListCode(String code) {
		return payList.parallelStream()
				.anyMatch(pay->pay.contentEquals(code));
	}
    
}
