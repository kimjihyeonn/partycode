<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p>애러발생!

예외 클래스:<%=exception.getClass().getName() %> 
예외 내용: <%=exception.getMessage() %>
</p>

</body>
</html>