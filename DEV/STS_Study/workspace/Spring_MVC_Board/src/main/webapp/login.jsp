<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login ������ </title>
</head>
<body>
 <center>
  <h1>�α���</h1>
  <hr>
  <form name="loginForm" method="POST" action="login.do">
     <table border="1" cellpadding="0" cellspacing="0">
      <tr>
       <td bgcolor="orange">���̵�
       </td>
       <td><input type="text" name="id"/></td>
       </tr>
      <tr>
       <td bgcolor="orange">�н�����
       </td>
       <td><input type="password" name="password"/></td>
       </tr>
       
       <tr>
       <td colspan="2" align="center">
       <input type="submit" value="�α���">
       </td>
       </tr>
     </table>
     
  
  </form>
 </center>

</body>
</html>