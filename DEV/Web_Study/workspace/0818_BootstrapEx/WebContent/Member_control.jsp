<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- MVC���Ͽ��� Controller ������ �������̴�.-->
    
 <% request.setCharacterEncoding("EUC-KR"); %>
 <jsp:useBean id="mem" scope="page" class="member.DBBean"/>
 <jsp:setProperty property="*" name="mem"/>
 
 <%
   String action =request.getParameter("action");
 
 if(action.equals("insert")){
	 if(mem.insertDB()){
		response.sendRedirect("welcome.jsp");
		System.out.println("member ���̺� ������ �Է¼�����!");
	 }
	 else{
		 response.sendRedirect("Member_Form.jsp");
			System.out.println("member ���̺� ������ �Է½�����!");
	 }
 }
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Member_control.jsp ������</title>
</head>
<body>

</body>
</html>