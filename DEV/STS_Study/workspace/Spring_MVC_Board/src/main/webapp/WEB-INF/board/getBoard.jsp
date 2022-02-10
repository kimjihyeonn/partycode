<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.company.Spring_MVC_Board.board.BoardDO" %>
<%@ page import="com.company.Spring_MVC_Board.board.BoardDAO" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
  //[중요] 세션에 등록한 게시글 객체를 가져온다.
  BoardDO board = (BoardDO)session.getAttribute("board");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp 페이지=> 특정 게시글에대한  상세보기 페이지</title>
<style>


</style>
</head>
<body>
  <center>
    <h1>게시글 상세 보기</h1>
    <a href="logout.do">로그아웃</a>
    <hr>
  
    <form name="getBoardForm" method="POST" action="updateBoard.do">
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
    <a href="deleteBoard.do?seq=${board.seq}">게시글 삭제</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getBoardList.do">전체 게시글 목록 보기</a>  
  </center>
</body>
</html>