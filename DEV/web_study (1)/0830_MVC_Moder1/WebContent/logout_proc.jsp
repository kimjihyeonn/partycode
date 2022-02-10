<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page errorPage="error_page.jsp" %>
    
<%

   session.invalidate();
   response.sendRedirect("login.jsp");
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>logout_proc.jsp</title>
</head>
<body>

</body>
</html>