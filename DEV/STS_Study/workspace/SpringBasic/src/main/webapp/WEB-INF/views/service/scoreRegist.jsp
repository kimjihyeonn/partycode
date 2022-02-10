<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<h3>점수목록화면</h3>

 <form action="registForm" method="post">
    이름:<input type="text" name="name" required/>
  국어:<input type="number" name="kor"  required/>
  영어:<input type="number"  name="eng" required/>
  수학:<input type="number" name="math" required/>
  
  <button type="submit">등록하기</button>  
 
 </form>

</body>
</html>