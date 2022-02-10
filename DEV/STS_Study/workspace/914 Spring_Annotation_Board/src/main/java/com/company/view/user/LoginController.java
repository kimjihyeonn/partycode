package com.company.view.user;


import javax.servlet.http.HttpSession;

import org.bouncycastle.asn1.ocsp.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.Spring_Annotation_Board.user.UserDAO;
import com.company.Spring_Annotation_Board.user.UserDO;

/*
 * POJOŬ����  => Ŭ�����κ��� ��ӹ����� �ʰ�  �������̽��κ��� �������� �� �ʴ� Ŭ����
 * Ư���� ��Ģ�� ���� �ܼ��ϰ� ������ �ڹ� ��ü�̹Ƿ� POJO�� �����Ѵٴ� ����
 * ������ EJB��ü�� �����ϴ� �ͺ��� �ξ� ������ ���� �� �ۿ� ����.
 * 
 */

@Controller
public class LoginController  {
    @RequestMapping("/login.do")
	public String login(UserDO userDO, UserDAO userDAO,HttpSession session) {
		UserDO user = userDAO.getUser(userDO);
		
		
		
		
		
		if(user != null) {
			session.setAttribute("userName", user.getName());
			System.out.println("�α��� ����");
			return "getBoardList.do";
		}else {
			
			System.out.println("�α��ν���");
			return "login.jsp";
		}
		
		
		
		
		
	}

}
