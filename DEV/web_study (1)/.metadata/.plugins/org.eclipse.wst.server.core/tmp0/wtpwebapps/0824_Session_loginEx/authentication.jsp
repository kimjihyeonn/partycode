<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �߰�authentication ������ -->
<% 
  String[] users = {"park","kim","hong"};

  String[] passwords= {"park1234","kim777","hong567"};
  
  String id=request.getParameter("id");
  String pw=request.getParameter("pw");
  
  int i;
  for(i=0;i<users.length;i++){
	  if(users[i].equals(id)&&passwords[i].equals(pw)){
		  //���� �� ����ϱ�
		  session.setAttribute("signedUser", id);//������ �Ǿ���
		  response.sendRedirect("welcome.jsp");
		  
		  
	  }
  }
	  if(i==users.length){ 
		  out.println("<script>alert('���̵� ��ġ���� �ʽ��ϴ�.');history.go(-1);</script>");
	  }
	 
 
 
  
%>
