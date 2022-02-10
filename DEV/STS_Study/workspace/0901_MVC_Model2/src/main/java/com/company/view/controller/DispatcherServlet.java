package com.company.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.model2board.board.BoardDAO;
import com.company.model2board.board.BoardDO;
import com.company.model2board.user.UserDAO;
import com.company.model2board.user.UserDO;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DispatcherServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");	
		process(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		process(request,response);
		
	}
  //����� ���� �޼ҵ� ����
	
	private void process(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		//1. Ŭ���̾�Ʈ�� ��û PATH��� ������ �����Ѵ�.
		String uri= request.getRequestURI();
		String path= uri.substring(uri.lastIndexOf("/"));
		
		//2. Ŭ���̾�Ʈ�� ��û path�� ���� ������ �б�ó���Ѵ�.
		
		if(path.equals("/login.do")) {
			//1.����� �Է����� ����
			String id= request.getParameter("id");
			String password=request.getParameter("password");
			//2. UserDO Ŭ������ü ���� �� setter �޼ҵ�ȣ���Ͽ� '�߰� �����'�� �� �ʱ�ȭ �۾�
			UserDO userDO = new UserDO();
			userDO.setId(id);
			userDO.setPassword(password);

			//3.UserDAO Ŭ������ü ���� �� getUser()�޼ҵ�  ȣ��
			UserDAO userDAO = new UserDAO();
			UserDO user = userDAO.getUser(userDO);

			//4.ȭ�� �׺���̼�=>������=>����(response)
			if(user!=null){
				//System.out.println("�α��� ����");
				HttpSession session = request.getSession();
				session.setAttribute("IdKey", id);
				response.sendRedirect("getBoardList.do");
				
			}else{
				System.out.println("�α��� ����");
				response.sendRedirect("login.jsp");
				
			}
	
			
		}else if(path.equals("/getBoardList.do")) {
			 String searchField = "";
			  String searchText = "";
			  if(request.getParameter("searchCondition") != "" &&  request.getParameter("searchKeyword") !=""){
				  searchField = request.getParameter("searchCondition");
				  searchText = request.getParameter("searchKeyword");
			  }
			  //BoardDAO Ŭ���� ��ü ����
			  BoardDAO boardDAO = new BoardDAO();
			  List<BoardDO>  boardList = boardDAO.getBoardList(searchField, searchText);
			  HttpSession session = request.getSession();
			  
			  session.setAttribute("boardList", boardList);
			 //������
			  response.sendRedirect("getBoardList.jsp");
		}else if(path.equals("/getBoard.do")) {
			System.out.println("�Խñ� �󼼺��� ó����.");
			//1.�˻��� �Խñ� ��ȣ ����
			String seq = request.getParameter("seq");
			//2.BoardDO ��ü ���� �� seq �߰�����ҿ�  �Խñ۹�ȣ �ʱ�ȭ
			BoardDO boardDO = new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			//3.BoardDAO ��ü�� �޼ҵ� ȣ�� 
			BoardDAO boardDAO= new BoardDAO();
			BoardDO board = boardDAO.getBoard(boardDO);
			//4. �˻������ session�� �����ϰ� ������
			HttpSession session = request.getSession();
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
			
		}else if(path.equals("/updateBoard.do")) {
			System.out.println("�Խñ� ���� �Ϸ�.");
			
			
			String seq = request.getParameter("seq");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			boardDO.setTitle(title);
			boardDO.setContent(content);
			
			BoardDAO boardDAO =new BoardDAO();
			boardDAO.updateBoard(boardDO);
			
			HttpSession session = request.getSession();
			
			response.sendRedirect("getBoardList.do");
			
			
		}else if(path.equals("/insertBoard.do")) {
			System.out.println("�Խñ� ��� �Ϸ�.");
			String title =request.getParameter("title");
			String writer = request.getParameter("writer");
			String content =request.getParameter("content");
			
			BoardDO boardDO = new BoardDO();
			boardDO.setTitle(title);
			boardDO.setWriter(writer);
			boardDO.setContent(content);
			BoardDAO boardDAO=new BoardDAO();
			boardDAO.insertBoard(boardDO);
			
			HttpSession session =request.getSession();
			response.sendRedirect("getBoardList.do");
		}else if(path.equals("/deleteBoard.do")) {
			String seq = request.getParameter("seq");
			BoardDO boardDO= new BoardDO();
			boardDO.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDAO=new BoardDAO();
			boardDAO.deleteBoard(boardDO);
			
			HttpSession session =request.getSession();
			
			response.sendRedirect("getBoardList.do");
					
					
			
		}else if(path.equals("/logout.do")){
			
			HttpSession session =request.getSession();
			session.invalidate();
			response.sendRedirect("login.jsp");
		}
		
		
		
	}
}





