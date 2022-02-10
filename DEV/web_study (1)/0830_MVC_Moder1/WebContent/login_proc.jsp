<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 추가 -->
<%@ page import="com.company.model1board.user.UserDO" %>
<%@ page import="com.company.model1board.user.UserDAO" %>
<%@ page errorPage="error_page.jsp" %>
<% //자바코드
//1.사용자 입력정보 추출
String id= request.getParameter("id");
String password=request.getParameter("password");
//2. UserDO 클래스객체 생성 후 setter 메소드호출하여 '중간 저장소'에 값 초기화 작업
UserDO userDO = new UserDO();
userDO.setId(id);
userDO.setPassword(password);

//3.UserDAO 클래스객체 생성 후 getUser()메소드  호출
UserDAO userDAO = new UserDAO();
UserDO user = userDAO.getUser(userDO);

//4.화면 네비게이션=>포워딩=>응답(response)
if(user!=null){
	//로그인 성공!
	session.setAttribute("IdKey", id);
	response.sendRedirect("getBoardList.jsp");
	//out.println("<script>alert('로그인 성공!');</script>");
}else{
	response.sendRedirect("login.jsp");
	//out.println("<script>alert('로그인 실패!');</script>");
}




%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login_proc.jsp 페이지 => MVC 커트롤러 페이지이다.</title>
</head>
<body>

</body>
</html>