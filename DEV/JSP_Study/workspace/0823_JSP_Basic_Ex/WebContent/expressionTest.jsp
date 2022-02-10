<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현식응용예제 => 자바의 Random클래스 적용</title>
</head>
<body>
<%//스크립트릿=>자바코드를 기술
  String[] str={"자바","HTML","CSS","Javascript","JSP"};
  Random rnd=new Random();
  
  int i = rnd.nextInt(5); //0~4 까지의 난수 발생
  

%>

<%=str[i] %> 과목이 선택 햇습니다.

</body>
</html>