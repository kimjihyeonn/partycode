package com.company.view.controller;

public class ViewResolver {
	
	public String prefix;  //���λ�
	public String suffix;  //���̻�
	
	//setter �޼ҵ常 �ʿ�
	
	/*
	 *  ��) �������Ҷ� =? ./getBoardList.jsp
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	//����� ���� �޼ҵ�
 
	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}
}