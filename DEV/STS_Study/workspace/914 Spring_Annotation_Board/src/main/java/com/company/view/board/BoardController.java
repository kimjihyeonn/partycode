package com.company.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.Spring_Annotation_Board.board.BoardDAO;
import com.company.Spring_Annotation_Board.board.BoardDO;

/*
 * board 테이블 select, insert, update, delete 작업에대한
 * 통합컨트롤러 클래스
 * POJO 클래스로 구현=> 스프링 프레임워크의 중요한 특징
 */
@Controller
public class BoardController {
	//전체게시글목록 조회 select
  @RequestMapping("/getBoardList.do")
  public String getBoardList(BoardDO boardDO,BoardDAO boardDAO, Model model ,String searchField,String searchText) {
		
   model.addAttribute("boardList", boardDAO.getBoardList(searchField, searchText));
	  return "getBoardList.jsp";
  }
  //상세보기 컨트롤러
  
  @RequestMapping("/getBoard.do")
  public String getBoard(BoardDO boardDO,BoardDAO boardDAO,Model model) {
	  
	  model.addAttribute("board", boardDAO.getBoard(boardDO));
	  return "getBoard.jsp";
  }
  
  //게시글 수정
  @RequestMapping("/updateBoard.do")
  public String updateBoard(BoardDO boardDO , BoardDAO boardDAO) {
	  boardDAO.updateBoard(boardDO);
	  return "getBoardList.do";
	  
  }
  
  @RequestMapping("/insertBoard.do")
  public String insertBoard(BoardDO boardDO , BoardDAO boardDAO) {
	  boardDAO.insertBoard(boardDO);
	  return "getBoardList.do";
	  
  }
  @RequestMapping("/deleteBoard.do")
  public String deleteBoard(BoardDO boardDO , BoardDAO boardDAO) {
	  boardDAO.deleteBoard(boardDO);
	  return "getBoardList.do";
	  
  }
}
