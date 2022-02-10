<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>파라미터 값 전달</h3>

<form action="param1" method="post">
   ID:<input type="text" name="id"><br/>
   pW:<input type="password" name="pw"><br/>
   Name:<input type="text" name="name"><br/>
   
   관심분야
   <input type="checkbox" name="inter" value="자바">자바
   <input type="checkbox" name="inter" value="스프링">스프링
   <input type="checkbox" name="inter" value="오라클">오라클
   
   <button type="submit">확인</button>
   
</form>
</body>
</html>