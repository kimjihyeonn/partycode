<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>

<%@ page errorPage="error_page.jsp" %>

<%
   request.setCharacterEncoding("EUC-KR");
   String seq = request.getParameter("seq");
   
   BoardDO boardDO= new BoardDO();
   boardDO.setSeq(Integer.parseInt(seq));
   
   BoardDAO boardDAO=new BoardDAO();
   boardDAO.deleteBoard(boardDO);
   
   response.sendRedirect("getBoardList.jsp");
  

%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>deleteBoard_proc.jsp 페이지 => 게시글 삭제 페이지</title>
</head>
<body>

</body>
</html>