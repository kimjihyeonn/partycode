package com.company.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 
 * ��ü���� Controller Ŭ�������� �����ϱ⿡ �ռ�
 * ��� Controller�� ���� Ÿ������ �����ϱ� ���� �������̽��� �����.
 *
 */

public interface Controller {

	//�߻� �޼ҵ�
	
	String handleRequest(HttpServletRequest request,HttpServletResponse response);
	
	
}
