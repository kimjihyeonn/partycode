package com.company.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView; //ModerANdView Ŭ����, Controller�� �������̽�
import org.springframework.web.servlet.mvc.Controller;

import com.company.Spring_MVC_Board.user.UserDAO;
import com.company.Spring_MVC_Board.user.UserDO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("�α��� ó��");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		UserDO userDO = new UserDO();
		userDO.setId(id);
		userDO.setPasswd(password);
		
		UserDAO userDAO = new UserDAO();
		UserDO user = userDAO.getUser(userDO);
		
		//MVC_FW �� ������
		ModelAndView mav=new ModelAndView();
		
		if(user != null) {
			
			
			HttpSession session =request.getSession();
			session.setAttribute("IdKey", id);
			mav.setViewName("redirect:getBoardList.do");
		
			
		}else {
			
			//System.out.println("�α��ν���");
			mav.setViewName("redirect:login.jsp");
		}
		return mav;
	}

}
