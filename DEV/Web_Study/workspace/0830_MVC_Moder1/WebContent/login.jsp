<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<style>
#div_box {
 position:absolute;
 top:10%;
 left:40%;

}

</style>
<html>
<head>
<meta charset="EUC-KR">
<title>로그이 페이지=> login.jsp</title>
</head>
<body>
   <div id="div_box">
      <h1 align="center">로그인</h1>
      <form name="loginForm" method="POST" action="login_proc.jsp">
       <table border ="1" cellpadding="0" cellspacing="0">
       <tr>
       <td bgcolor="orange">아이디</td>
       <td><input type="text" name="id"/></td>
       </tr>
        <tr>
       <td bgcolor="orange">비밀번호</td>
       <td><input type="text" name="password"/></td>
       </tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" value="로그인" />
       
       </td>
       </tr>
       
       </table>
      
      </form>
   
   </div>
</body>
</html>