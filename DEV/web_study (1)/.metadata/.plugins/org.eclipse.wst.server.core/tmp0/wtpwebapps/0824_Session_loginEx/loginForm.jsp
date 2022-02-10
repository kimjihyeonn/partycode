<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>loginForm 페이지</title>
</head>
<body>

  <form name="login" action="authentication.jsp" method="POST">
   <label for="id">ID: </label>
   <input type="text" name="id"/>
  <br>
  <label for="id">PASSWORD: </label>
   <input type="password" name="pw"/>
   <Br><Br>
   <input type="submit" value="로그인"/>
  
  
  
  </form>

</body>
</html>