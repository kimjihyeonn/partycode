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
<p>�ַ��߻�!

���� Ŭ����:<%=exception.getClass().getName() %> 
���� ����: <%=exception.getMessage() %>
</p>

</body>
</html>