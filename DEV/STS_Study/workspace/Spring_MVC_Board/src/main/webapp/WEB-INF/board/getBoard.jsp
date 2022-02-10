<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.company.Spring_MVC_Board.board.BoardDO" %>
<%@ page import="com.company.Spring_MVC_Board.board.BoardDAO" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
  //[�߿�] ���ǿ� ����� �Խñ� ��ü�� �����´�.
  BoardDO board = (BoardDO)session.getAttribute("board");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp ������=> Ư�� �Խñۿ�����  �󼼺��� ������</title>
<style>


</style>
</head>
<body>
  <center>
    <h1>�Խñ� �� ����</h1>
    <a href="logout.do">�α׾ƿ�</a>
    <hr>
  
    <form name="getBoardForm" method="POST" action="updateBoard.do">
      <input type="hidden" name="seq" value="${board.seq}"/>
       <table border ="1" cellpadding="0" cellspacing="0">
       <tr>
       <td bgcolor="orange" width="70">����</td>
       <td align="left"><input type="text" name="title" value="${board.title}"/></td>
       </tr>
       <tr>
       <td bgcolor="orange">�ۼ���</td>
       <td align="left">${board.writer}</td>
       
       
       </tr>
       
       <tr>
       <td bgcolor="orange">����</td>
       <td align="left"><textarea name="content" rows="10" cols="40">${board.content}</textarea></td>
       </tr>
      <tr>
        <td bgcolor="orange">�����</td>
       <td align="left">${board.regdate}</td>
       
</tr>
       
       <tr>
        <td bgcolor="orange">��ȸ��</td>
       <td align="left">${board.cnt}</td>
       
</tr>
       <tr>
         <td colspan="2" align="center"><input type="submit" value="�ۼ���"/></td>
         
       </tr>
       </table>
    </form>
    <a href="insertBoard.jsp">�� �Խñ� ���</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="deleteBoard.do?seq=${board.seq}">�Խñ� ����</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getBoardList.do">��ü �Խñ� ��� ����</a>  
  </center>
</body>
</html>