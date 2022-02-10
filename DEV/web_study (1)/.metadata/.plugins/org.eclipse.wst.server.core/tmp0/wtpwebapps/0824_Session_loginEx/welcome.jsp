<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- //인증된 세션이 없는 경우, 해당 페이지를 볼 수 없게함. -->
<%
  if(session.getAttribute("signedUser")==null)
	  response.sendRedirect("logout.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>welcome 페이지</title>
</head>
<body>
<h1><%=session.getAttribute("signedUser") %> 님 <small>환영합니다.</small></h1>
<a href="logout.jsp">로그아웃</a>
</body>
</html>