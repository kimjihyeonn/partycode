package com.company.view.user;


import javax.servlet.http.HttpSession;

import org.bouncycastle.asn1.ocsp.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.Spring_Annotation_Board.user.UserDAO;
import com.company.Spring_Annotation_Board.user.UserDO;

/*
 * POJO클래스  => 클래스로부터 상속받지도 않고  인터페이스로부터 구현받지 도 않는 클래스
 * 특별한 규칙이 없는 단순하고 가벼운 자바 객체이므로 POJO를 관리한다는 것은
 * 기존의 EJB객체를 관리하는 것보다 훨씬 가볍고 빠를 수 밖에 없다.
 * 
 */

@Controller
public class LoginController  {
    @RequestMapping("/login.do")
	public String login(UserDO userDO, UserDAO userDAO,HttpSession session) {
		UserDO user = userDAO.getUser(userDO);
		
		
		
		
		
		if(user != null) {
			session.setAttribute("userName", user.getName());
			System.out.println("로그인 성공");
			return "getBoardList.do";
		}else {
			
			System.out.println("로그인실패");
			return "login.jsp";
		}
		
		
		
		
		
	}

}
