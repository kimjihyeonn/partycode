<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- �߰� -->
<%@ page import="com.company.model1board.user.UserDO" %>
<%@ page import="com.company.model1board.user.UserDAO" %>
<%@ page errorPage="error_page.jsp" %>
<% //�ڹ��ڵ�
//1.����� �Է����� ����
String id= request.getParameter("id");
String password=request.getParameter("password");
//2. UserDO Ŭ������ü ���� �� setter �޼ҵ�ȣ���Ͽ� '�߰� �����'�� �� �ʱ�ȭ �۾�
UserDO userDO = new UserDO();
userDO.setId(id);
userDO.setPassword(password);

//3.UserDAO Ŭ������ü ���� �� getUser()�޼ҵ�  ȣ��
UserDAO userDAO = new UserDAO();
UserDO user = userDAO.getUser(userDO);

//4.ȭ�� �׺���̼�=>������=>����(response)
if(user!=null){
	//�α��� ����!
	session.setAttribute("IdKey", id);
	response.sendRedirect("getBoardList.jsp");
	//out.println("<script>alert('�α��� ����!');</script>");
}else{
	response.sendRedirect("login.jsp");
	//out.println("<script>alert('�α��� ����!');</script>");
}




%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login_proc.jsp ������ => MVC ĿƮ�ѷ� �������̴�.</title>
</head>
<body>

</body>
</html>