package com.company.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView; //ModerANdView 클래스, Controller는 인터페이스
import org.springframework.web.servlet.mvc.Controller;

import com.company.Spring_MVC_Board.user.UserDAO;
import com.company.Spring_MVC_Board.user.UserDO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("로그인 처리");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setPasswd(password);
		
		UserDAO userDAO = new UserDAO();
		UserDO user = userDAO.getUser(userDO);
		
		//MVC_FW 와 차이점
		ModelAndView mav=new ModelAndView();
		
		if(user != null) {
			
			
			HttpSession session =request.getSession();
			session.setAttribute("IdKey", id);
			mav.setViewName("redirect:getBoardList.do");
		
			
		}else {
			
			//System.out.println("로그인실패");
			mav.setViewName("redirect:login.jsp");
		}
		return mav;
	}

}
