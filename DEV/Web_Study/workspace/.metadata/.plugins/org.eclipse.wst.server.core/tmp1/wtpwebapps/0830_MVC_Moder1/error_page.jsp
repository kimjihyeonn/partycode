<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- �߰� -->

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>error_page.jsp ������</title>
</head>
<!-- �߰� -->
<jsp:useBean id="now" class="java.util.Date"/>
<body>
<div>
  <h2>���� ������</h2>
  
  <hr>
  <table>
    <tr width=100% bgcolor="pink">
       <td>
             ���� ����, ���� �ڵ�, ��û���� URI �������� ����
             ���� ���̷��� �ذ��սô�.
       </td>
    </tr>
    <tr>
       ${now}<p>
       ��û���� URI : ${pageContext.errorData.requestURI}<br>
       �����ڵ� : ${pageContext.errorData.statusCode}<br>
    �������� :  ${pageContext.errorData.throwable}
    </tr>
    
  
  </table>
</div>

</body>
</html>