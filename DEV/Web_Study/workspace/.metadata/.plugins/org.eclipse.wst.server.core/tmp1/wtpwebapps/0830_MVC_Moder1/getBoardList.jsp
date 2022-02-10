<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page import="java.util.List" %>
<!-- JSTL 적용하기 위해 추가요 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page errorPage="error_page.jsp" %>



<% 
  request.setCharacterEncoding("EUC-KR");

  String searchField = "";
  String searchText = "";
  if(request.getParameter("searchCondition") != "" &&  request.getParameter("searchKeyword") !=""){
	  searchField = request.getParameter("searchCondition");
	  searchText = request.getParameter("searchKeyword");
  }
  //BoardDAO 클래스 객체 생성
  BoardDAO boardDAO = new BoardDAO();
  List<BoardDO>  boardList = boardDAO.getBoardList(searchField, searchText);
  
  request.setAttribute("boardList", boardList);
  
  int totalList = boardList.size();
  
  request.setAttribute("totalList", totalList);
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>getBoardList.jsp 페이지 => board 테이블의 데이터를 select하여 모든 게시물 보여주기</title>
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
   <h1>전체 게시글 목록보기</h1>
   <h3>${IdKey}님 환영합니다.&nbsp;&nbsp;&nbsp;&nbsp; <a href="logout_proc.jsp">로그아웃</a> </h3>
<form name="BoardListForm" method="POST" action="getBoardList.jsp">
 <p>총 게시글: ${totalList}건</p>
 <table border ="1" cellpadding="0" cellspacing="0" width="700">
 <tr>
 <td align="right">
   <select name="searchCondition">
     <option value="TITLE">제목</option>
     <option value="WRITER">작성자</option>
     <input type="text" name="searchKeyword"/>
     <input type="submit" value="검색"/>
   </select>
 
 </td>
 
 </tr>
 
 </table>


</form>
 <table border ="1" cellpadding="0" cellspacing="0" width="700">
 <tr>
 <th bgcolor="orange" width="100">번호</th>
 <th bgcolor="orange" width="200">제목</th>
 <th bgcolor="orange" width="150">작성자</th>
 <th bgcolor="orange" width="150">등록일</th>
 <th bgcolor="orange" width="100">조회수</th>
 </tr>
  <%-- 
 <% for(BoardDO newboard : boardList) { %>
 <tr>
 <td align="center"><%= newboard.getSeq() %></td>
 <td align="left"><a href="getBoard.jsp?seq=<%= newboard.getSeq() %>"><%= newboard.getTitle() %></a></td>
 <td align="center"><%= newboard.getWriter() %></td>
 <td align="center"><%= newboard.getRegdate() %></td>
 <td align="center"><%= newboard.getCnt() %></td>
 
 </tr>
 
 <%} %>--%>
 <%--위 소스를 표현언어와 JSTL을 적용하여 소스를 변경하면... --%>
 
 
 <c:forEach var="board"  items="${boardList}">
 <tr>
  <td align="center">${board.seq}</td>
  <td align="center"><a href="getBoard.jsp?seq=${board.seq}">${board.title}</a></td>
  <td align="center">${board.writer}</td>
  <td align="center">${board.regdate}</td>
  <td align="center">${board.cnt}</td>
 </tr>
 
 </c:forEach>
 
 
 
 
</table>
<br>
<a href="insertBoard.jsp">새 게시글 등록</a>
<a href="getBoardList.jsp">전체 게시글 목록보기</a>
</div>


</body>
</html>