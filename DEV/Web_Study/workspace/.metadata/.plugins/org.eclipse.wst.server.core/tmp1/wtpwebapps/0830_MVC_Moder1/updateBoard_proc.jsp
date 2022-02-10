<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page errorPage="error_page.jsp" %>

<%
     request.setCharacterEncoding("EUC-KR");

    //1. 사용자 입력 정보 추출

      String seq = request.getParameter("seq");
      String title = request.getParameter("title");
      String content = request.getParameter("content");
    //2. BoardDO 객체 생성하여 setter 메소드 호출하여 중간 저장소에 값 초기화
    BoardDO boardDO = new BoardDO();
    boardDO.setSeq(Integer.parseInt(seq));
    boardDO.setTitle(title);
    boardDO.setContent(content);
    //3.BoardDAO 객체 생성 후 호출
    BoardDAO boardDAO=new BoardDAO();
    boardDAO.updateBoard(boardDO);  
    
    //4. 포워딩 =>  응답
    response.sendRedirect("getBoardList.jsp");
%>    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>updateBoard_proc.jsp=> 게시글 수정 페이지</title>
</head>
<body>

</body>
</html>