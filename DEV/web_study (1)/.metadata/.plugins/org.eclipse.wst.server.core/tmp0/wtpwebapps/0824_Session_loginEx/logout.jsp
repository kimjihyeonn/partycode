<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- logout ������ -->
<%
 //1.������  ���� �����͸� ��� ���� (��ȿȭ)
 session.invalidate();

 //2. �α��� �������� �̵���Ŵ
 response.sendRedirect("loginForm.jsp");
 
%>
