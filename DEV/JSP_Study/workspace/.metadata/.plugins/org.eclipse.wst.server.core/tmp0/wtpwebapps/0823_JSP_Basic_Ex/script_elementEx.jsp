<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP ��ũ��Ʈ ��ҵ� �ǽ� ����</title>
</head>
<body>
    <H2>����, ��ũ��Ʈ��, ǥ������ ���ӻ� �˾ƺ��� ����</H2>
    <%! //����=> �������� ���� 
        String str1 = "���������Դϴ�.";
        
    %>
    <%! //����=>�޼ҵ带 ���� �� �� �ִ�.
       String getStr(){
    	 return str1;
    }
    
    %>
    <%  //��ũ��Ʈ��=> �ڹ��ڵ带 ��� �� �� �յ�.
       String str2="���������Դϴ�.";
            
    %>
    ��ũ��Ʈ������ ������ ���� str2��
    <%= str2
     %> <br>
   ���𹮿��� ������ ������ str1��<%=getStr() %>
</body>
</html>