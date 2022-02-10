<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 필요한 클래스 import 추가 -->
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page errorPage="error_page.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%  //자바 코드 기술
    //1.getBoardList.jsp 페이지에서 GET 방식으로 넘어온 seq를 추출
    String seq = request.getParameter("seq");
    //2.BoardDO 객체를 생성 후 setSeq() 메소드 호출하여 값을 초기화
    BoardDO boardDO= new BoardDO();
    boardDO.setSeq(Integer.parseInt(seq));
    
    //3.BoardDAO 객체 생성 후 필요한 메소드 호출
    BoardDAO boardDAO = new BoardDAO();
    BoardDO board =boardDAO.getBoard(boardDO);
    
    //4.등록 
    request.setAttribute("board", board);
    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp 페이지=> 특정 게시글에대한  상세보기 페이지</title>
<style>
#div_box {
 position:absolute;
 top:10%;
 left:20%;

}

</style>
</head>
<body>
  <div id="div_box">
    <h1>게시글 상세 보기</h1>
    <a href="logout_proc.jsp">로그아웃</a>
    <hr>
    <form name="getBoardForm" method="POST" action="updateBoard_proc.jsp">
      <input type="hidden" name="seq" value="${board.seq}"/>
       <table border ="1" cellpadding="0" cellspacing="0">
       <tr>
       <td bgcolor="orange" width="70">제목</td>
       <td align="left"><input type="text" name="title" value="${board.title}"/></td>
       </tr>
       <tr>
       <td bgcolor="orange">작성자</td>
       <td align="left">${board.writer}</td>
       
       
       </tr>
       
       <tr>
       <td bgcolor="orange">내용</td>
       <td align="left"><textarea name="content" rows="10" cols="40">${board.content}</textarea></td>
       </tr>
      <tr>
        <td bgcolor="orange">등록일</td>
       <td align="left">${board.regdate}</td>
       
</tr>
       
       <tr>
        <td bgcolor="orange">조회수</td>
       <td align="left">${board.cnt}</td>
       
</tr>
       <tr>
         <td colspan="2" align="center"><input type="submit" value="글수정"/></td>
         
       </tr>
       </table>
    </form>
    <a href="insertBoard.jsp">새 게시글 등록</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="deleteBoard_proc.jsp?seq=${board.seq}">게시글 삭제</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getBoardList.jsp">전체 게시글 목록 보기</a>  
  </div>
</body>
</html>