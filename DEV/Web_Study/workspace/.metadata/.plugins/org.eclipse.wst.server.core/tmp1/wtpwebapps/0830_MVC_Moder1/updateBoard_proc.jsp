<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page errorPage="error_page.jsp" %>

<%
     request.setCharacterEncoding("EUC-KR");

    //1. ����� �Է� ���� ����

      String seq = request.getParameter("seq");
      String title = request.getParameter("title");
      String content = request.getParameter("content");
    //2. BoardDO ��ü �����Ͽ� setter �޼ҵ� ȣ���Ͽ� �߰� ����ҿ� �� �ʱ�ȭ
    BoardDO boardDO = new BoardDO();
    boardDO.setSeq(Integer.parseInt(seq));
    boardDO.setTitle(title);
    boardDO.setContent(content);
    //3.BoardDAO ��ü ���� �� ȣ��
    BoardDAO boardDAO=new BoardDAO();
    boardDAO.updateBoard(boardDO);  
    
    //4. ������ =>  ����
    response.sendRedirect("getBoardList.jsp");
%>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>updateBoard_proc.jsp=> �Խñ� ���� ������</title>
</head>
<body>

</body>
</html>