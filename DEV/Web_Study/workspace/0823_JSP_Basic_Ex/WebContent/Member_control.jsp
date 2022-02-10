<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- MVC 패턴에서 C에 해당하는 일을 하는 Controller 역할의 페이지. 
model : DBBean.java
view  : Member_Form.html
controller: Member_control.jsp -->
<% request.setCharacterEncoding("EUC-KR"); %>
<!-- 액션태그 추가 -->
<jsp:useBean id="mem" scope="page" class="member.DBBean" />
<jsp:setProperty name="mem" property="*" />

<%
	//자바 코드 기술
	
	/* action객체를 가져온다 : 폼에보면  input type="hidden" name="action" value="insert" 이거 .*/	
	String action = request.getParameter("action");	//insert를 가리킨다.
	
	//action이 가리키는게 action과 같으면 insert 하기
	if(action.equals("insert")){
		if(mem.insertDB()){
			response.sendRedirect("welcome.jsp");
			System.out.println("member 테이블에 데이터 입력 성공함.!!!!!!!!");
		}else{
			response.sendRedirect("Member_Form.html");
			System.out.println("member 테이블에 데이터 입력 실패함.");
		}
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>membercontrl 페이지 </title>
</head>
<body>

</body>
</html>