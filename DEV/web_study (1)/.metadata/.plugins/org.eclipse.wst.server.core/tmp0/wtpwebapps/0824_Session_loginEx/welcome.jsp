<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- //������ ������ ���� ���, �ش� �������� �� �� ������. -->
<%
  if(session.getAttribute("signedUser")==null)
	  response.sendRedirect("logout.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>welcome ������</title>
</head>
<body>
<h1><%=session.getAttribute("signedUser") %> �� <small>ȯ���մϴ�.</small></h1>
<a href="logout.jsp">�α׾ƿ�</a>
</body>
</html>