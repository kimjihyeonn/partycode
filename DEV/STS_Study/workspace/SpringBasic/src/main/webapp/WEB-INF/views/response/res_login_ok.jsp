<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



 <script>
 //JS 함수기반언어(즉시실행함수)
 (function (){ 
	 var msg = '${msg}';
 
 if(msg !==''){
	   alert(msg);
 }
	 
 })();
  
 </script>
  
</body>
</html>