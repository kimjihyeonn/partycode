<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
#div_box {
 position:absolute;
 top:10%;
 left:20%;

}


</style>
</head>
<body>
<div id="div_box">
  <h1>�� �Խñ� ���</h1>
  <a href="logout.do">�α׾ƿ�</a> 
  <hr>
  <form name="insetForm" method="POST" action="insertBoard.do">
  <table border ="1" cellpadding="0" cellspacing="0">
    <tr>
       <td bgcolor="orange" width="70">����</td>
       <td align="left"><input type="text" name="title" /></td>
       
       
    </tr>
   
      <tr>
       <td bgcolor="orange">�ۼ���</td>
       <td align="left"><input type="text" name="writer" /></td>
       
       
    </tr>
      <tr>
       <td bgcolor="orange">����</td>
       <td align="left"><textarea name="content" rows="10" cols="40"></textarea></td>       
    </tr>
    
    <tr >
       <td colspan="2" align="center"><input type="submit" value="�� ���" /></td>
    </tr>
  
  </table>
  
  </form>
 <a href ="getBoardList.jsp">��ü �Խñ� ��� ����</a>


</div>


</body>
</html>