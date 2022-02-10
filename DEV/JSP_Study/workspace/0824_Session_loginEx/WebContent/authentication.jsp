<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 추가authentication 페이지 -->
<% 
  String[] users = {"park","kim","hong"};

  String[] passwords= {"park1234","kim777","hong567"};
  
  String id=request.getParameter("id");
  String pw=request.getParameter("pw");
  
  int i;
  for(i=0;i<users.length;i++){
	  if(users[i].equals(id)&&passwords[i].equals(pw)){
		  //세션 값 등록하기
		  session.setAttribute("signedUser", id);//인증이 되었음
		  response.sendRedirect("welcome.jsp");
		  
		  
	  }
  }
	  if(i==users.length){ 
		  out.println("<script>alert('아이디가 일치하지 않습니다.');history.go(-1);</script>");
	  }
	 
 
 
  
%>
