<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ�������뿹�� => �ڹ��� RandomŬ���� ����</title>
</head>
<body>
<%//��ũ��Ʈ��=>�ڹ��ڵ带 ���
  String[] str={"�ڹ�","HTML","CSS","Javascript","JSP"};
  Random rnd=new Random();
  
  int i = rnd.nextInt(5); //0~4 ������ ���� �߻�
  

%>

<%=str[i] %> ������ ���� �޽��ϴ�.

</body>
</html>