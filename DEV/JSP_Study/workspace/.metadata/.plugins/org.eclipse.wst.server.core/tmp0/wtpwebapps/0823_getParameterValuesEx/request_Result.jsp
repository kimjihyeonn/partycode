<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 추가 폼에서 넘어오는 한글이 깨짐 방지 -->
<% request.setCharacterEncoding("EUC-KR"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>request 테스트 결과 보여주기</title>
</head>
<body>

  <center>
     <h2>request 테스트 결과- 1</h2>
     <hr>
      <table border="1" cellpadding="5" cellspacing="1">
    <tr>
    
      <td bgcolor="orange">이름</td>
      <td><%= request.getParameter("username") %></td>
      </tr>
       <tr>
    
      <td bgcolor="orange">직업</td>
      <td><%= request.getParameter("job") %></td>
      </tr>
      
      <td bgcolor="orange">관심분야</td>
      <td><% //자바코드
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