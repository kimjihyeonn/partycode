<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- MVC ���Ͽ��� C�� �ش��ϴ� ���� �ϴ� Controller ������ ������. 
model : DBBean.java
view  : Member_Form.html
controller: Member_control.jsp -->
<% request.setCharacterEncoding("EUC-KR"); %>
<!-- �׼��±� �߰� -->
<jsp:useBean id="mem" scope="page" class="member.DBBean" />
<jsp:setProperty name="mem" property="*" />

<%
	//�ڹ� �ڵ� ���
	
	/* action��ü�� �����´� : ��������  input type="hidden" name="action" value="insert" �̰� .*/	
	String action = request.getParameter("action");	//insert�� ����Ų��.
	
	//action�� ����Ű�°� action�� ������ insert �ϱ�
	if(action.equals("insert")){
		if(mem.insertDB()){
			response.sendRedirect("welcome.jsp");
			System.out.println("member ���̺� ������ �Է� ������.!!!!!!!!");
		}else{
			response.sendRedirect("Member_Form.html");
			System.out.println("member ���̺� ������ �Է� ������.");
		}
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>membercontrl ������ </title>
</head>
<body>

</body>
</html>