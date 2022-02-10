<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page import="java.util.List" %>
<!-- JSTL �����ϱ� ���� �߰��� -->
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
  //BoardDAO Ŭ���� ��ü ����
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
<title>getBoardList.jsp ������ => board ���̺��� �����͸� select�Ͽ� ��� �Խù� �����ֱ�</title>
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
   <h1>��ü �Խñ� ��Ϻ���</h1>
   <h3>${IdKey}�� ȯ���մϴ�.&nbsp;&nbsp;&nbsp;&nbsp; <a href="logout_proc.jsp">�α׾ƿ�</a> </h3>
<form name="BoardListForm" method="POST" action="getBoardList.jsp">
 <p>�� �Խñ�: ${totalList}��</p>
 <table border ="1" cellpadding="0" cellspacing="0" width="700">
 <tr>
 <td align="right">
   <select name="searchCondition">
     <option value="TITLE">����</option>
     <option value="WRITER">�ۼ���</option>
     <input type="text" name="searchKeyword"/>
     <input type="submit" value="�˻�"/>
   </select>
 
 </td>
 
 </tr>
 
 </table>


</form>
 <table border ="1" cellpadding="0" cellspacing="0" width="700">
 <tr>
 <th bgcolor="orange" width="100">��ȣ</th>
 <th bgcolor="orange" width="200">����</th>
 <th bgcolor="orange" width="150">�ۼ���</th>
 <th bgcolor="orange" width="150">�����</th>
 <th bgcolor="orange" width="100">��ȸ��</th>
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
 <%--�� �ҽ��� ǥ������ JSTL�� �����Ͽ� �ҽ��� �����ϸ�... --%>
 
 
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
<a href="insertBoard.jsp">�� �Խñ� ���</a>
<a href="getBoardList.jsp">��ü �Խñ� ��Ϻ���</a>
</div>


</body>
</html>