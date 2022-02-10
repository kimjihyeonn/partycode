package com.company.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.Spring_Annotation_Board.board.BoardDAO;
import com.company.Spring_Annotation_Board.board.BoardDO;

/*
 * board ���̺� select, insert, update, delete �۾�������
 * ������Ʈ�ѷ� Ŭ����
 * POJO Ŭ������ ����=> ������ �����ӿ�ũ�� �߿��� Ư¡
 */
@Controller
public class BoardController {
	//��ü�Խñ۸�� ��ȸ select
  @RequestMapping("/getBoardList.do")
  public String getBoardList(BoardDO boardDO,BoardDAO boardDAO, Model model ,String searchField,String searchText) {
		
   model.addAttribute("boardList", boardDAO.getBoardList(searchField, searchText));
	  return "getBoardList.jsp";
  }
  //�󼼺��� ��Ʈ�ѷ�
  
  @RequestMapping("/getBoard.do")
  public String getBoard(BoardDO boardDO,BoardDAO boardDAO,Model model) {
	  
	  model.addAttribute("board", boardDAO.getBoard(boardDO));
	  return "getBoard.jsp";
  }
  
  //�Խñ� ����
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
