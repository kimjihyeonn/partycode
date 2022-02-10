<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%@ page import="com.company.model2board.board.BoardDO" %>
<%@ page import="com.company.model2board.board.BoardDAO" %>
<%@ page import="java.util.List" %>
<!-- JSTL �����ϱ� ���� �߰��� -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
  List<BoardDO> boardList = (List)session.getAttribute("boardList");%>
<%
  int totalList = boardList.size();

   request.setAttribute("totalList", totalList);
%>

<%

  BoardDO board = (BoardDO)session.getAttribute("board");


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
   <h3>${IdKey}�� ȯ���մϴ�.&nbsp;&nbsp;&nbsp;&nbsp; <a href="logout.do">�α׾ƿ�</a> </h3>
<form name="BoardListForm" method="POST" action="getBoardList.do">
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
  <td align="center"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
  <td align="center">${board.writer}</td>
  <td align="center">${board.regdate}</td>
  <td align="center">${board.cnt}</td>
 </tr>
 
 </c:forEach>
 
 
 
 
</table>
<br>
<a href="insertBoard.jsp">�� �Խñ� ���</a>
<a href="getBoardList.do">��ü �Խñ� ��Ϻ���</a>
</div>


</body>
</html>