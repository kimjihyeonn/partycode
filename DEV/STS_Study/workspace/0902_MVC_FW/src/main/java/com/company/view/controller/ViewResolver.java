package com.company.view.controller;

public class ViewResolver {
	
	public String prefix;  //접두사
	public String suffix;  //접미사
	
	//setter 메소드만 필요
	
	/*
	 *  예) 포워딩할때 =? ./getBoardList.jsp
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	//사용자 정의 메소드
 
	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}
}