<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- �߰� ������ �Ѿ���� �ѱ��� ���� ���� -->
<% request.setCharacterEncoding("EUC-KR"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>request �׽�Ʈ ��� �����ֱ�</title>
</head>
<body>

  <center>
     <h2>request �׽�Ʈ ���- 1</h2>
     <hr>
      <table border="1" cellpadding="5" cellspacing="1">
    <tr>
    
      <td bgcolor="orange">�̸�</td>
      <td><%= request.getParameter("username") %></td>
      </tr>
       <tr>
    
      <td bgcolor="orange">����</td>
      <td><%= request.getParameter("job") %></td>
      </tr>
      
      <td bgcolor="orange">���ɺо�</td>
      <td><% //�ڹ��ڵ�
           String[] favorites = request.getParameterValues("favorite");
         for(int i=0; i<favorites.length;i++){
        	 out.println(favorites[i] + "<br>");
        	 
         }
      
      %></td>
      </tr>
  </table>
  </center>

</body>
</html>