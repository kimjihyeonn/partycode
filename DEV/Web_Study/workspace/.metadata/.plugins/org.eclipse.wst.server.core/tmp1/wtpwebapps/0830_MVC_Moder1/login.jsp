<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page errorPage="error_page.jsp" %>
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
<title>�α��� ������=> login.jsp</title>
</head>
<body>
   <div id="div_box">
      <h1 align="center">�α���</h1>
      <form name="loginForm" method="POST" action="login_proc.jsp">
       <table border ="1" cellpadding="0" cellspacing="0">
       <tr>
       <td bgcolor="orange">���̵�</td>
       <td><input type="text" name="id"/></td>
       </tr>
        <tr>
       <td bgcolor="orange">��й�ȣ</td>
       <td><input type="password" name="password"/></td>
       </tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" value="�α���" />
       
       </td>
       </tr>
       
       </table>
      
      </form>
     
   
   </div>
</body>
</html>