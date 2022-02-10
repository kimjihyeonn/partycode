<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include_test 페이지</title>
</head>
<body>
<h2>include 지시어 테스트</h2>
<hr>
<%@ include file="menu.jsp" %>
<p>
<table border="0" cellpadding="5">
   <tr>
   <td><font size="3"><%@ include file="news.jsp" %></font></td>
   <td width="30">&nbsp;</td>
    <td><font size="-1"><%@ include file="shopping.jsp" %></font></td>
        
   </tr>
</table>
</body>
</html>