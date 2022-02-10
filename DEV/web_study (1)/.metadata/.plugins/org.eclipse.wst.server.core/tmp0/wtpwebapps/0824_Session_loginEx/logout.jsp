<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- logout 페이지 -->
<%
 //1.기존의  세션 데이터를 모두 삭제 (무효화)
 session.invalidate();

 //2. 로그인 페이지로 이동시킴
 response.sendRedirect("loginForm.jsp");
 
%>
