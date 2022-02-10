package com.company.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.company.Spring_MVC_Board.board.BoardDAO;
import com.company.Spring_MVC_Board.board.BoardDO;

public class GetBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("상세글보기");
        String seq = request.getParameter("seq");
		
		BoardDO boardDO = new BoardDO();
		boardDO.setSeq(Integer.parseInt(seq));
		
		
		BoardDAO boardDAO = new BoardDAO();
		BoardDO board= boardDAO.getBoard(boardDO);
		
		ModelAndView mav = new ModelAndView();
		//Model 정보를 "boardList"에 저장
		
	    mav.addObject("board", board);
		mav.setViewName("getBoard");
		
		
		return mav;
	}
		
	
}
