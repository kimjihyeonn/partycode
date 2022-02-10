<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- MVC패턴에서 Controller 역할의 페이지이다.-->
    
 <% request.setCharacterEncoding("EUC-KR"); %>
 <jsp:useBean id="mem" scope="page" class="member.DBBean"/>
 <jsp:setProperty property="*" name="mem"/>
 
 <%
   String action =request.getParameter("action");
 
 if(action.equals("insert")){
	 if(mem.insertDB()){
		response.sendRedirect("welcome.jsp");
		System.out.println("member 테이블에 데이터 입력성공함!");
	 }
	 else{
		 response.sendRedirect("Member_Form.jsp");
			System.out.println("member 테이블에 데이터 입력실패함!");
	 }
 }
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Member_control.jsp 페이지</title>
</head>
<body>

</body>
</html>