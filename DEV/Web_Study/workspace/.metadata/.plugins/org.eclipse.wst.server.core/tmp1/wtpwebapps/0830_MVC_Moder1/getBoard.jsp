<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- �ʿ��� Ŭ���� import �߰� -->
<%@ page import="com.company.model1board.board.BoardDO" %>
<%@ page import="com.company.model1board.board.BoardDAO" %>
<%@ page errorPage="error_page.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%  //�ڹ� �ڵ� ���
    //1.getBoardList.jsp ���������� GET ������� �Ѿ�� seq�� ����
    String seq = request.getParameter("seq");
    //2.BoardDO ��ü�� ���� �� setSeq() �޼ҵ� ȣ���Ͽ� ���� �ʱ�ȭ
    BoardDO boardDO= new BoardDO();
    boardDO.setSeq(Integer.parseInt(seq));
    
    //3.BoardDAO ��ü ���� �� �ʿ��� �޼ҵ� ȣ��
    BoardDAO boardDAO = new BoardDAO();
    BoardDO board =boardDAO.getBoard(boardDO);
    
    //4.��� 
    request.setAttribute("board", board);
    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp ������=> Ư�� �Խñۿ�����  �󼼺��� ������</title>
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
    <h1>�Խñ� �� ����</h1>
    <a href="logout_proc.jsp">�α׾ƿ�</a>
    <hr>
    <form name="getBoardForm" method="POST" action="updateBoard_proc.jsp">
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
    <a href="deleteBoard_proc.jsp?seq=${board.seq}">�Խñ� ����</a>&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="getBoardList.jsp">��ü �Խñ� ��� ����</a>  
  </div>
</body>
</html>