<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� id, ���� �����ð� ���� ����</title>
</head>
<body>
   <h2>session ���� ��ü�� �ֿ� �޼ҵ� �׽�Ʈ</h2>
   <hr>
   <%
      //isNew() �޼ҵ带 �̿��� ���� ���� ������ Ȯ���� �� �ִ�.
      if(session.isNew()){
    	  out.println("<script>alert('������ �����Ǿ� �ٽ� ������!')</script>");
    	  session.setAttribute("login", "ȫ�浿");
      }
   %>
   <%=session.getAttribute("login") %>�� ȯ���մϴ�.<br>
   1.���� ID: <%=session.getId()%><br>
   2.���� ���� �ð�:<%=session.getMaxInactiveInterval() %><br>
   3.login ������ ���� ��: <%=session.getAttribute("login") %>
   
</body>
</html>