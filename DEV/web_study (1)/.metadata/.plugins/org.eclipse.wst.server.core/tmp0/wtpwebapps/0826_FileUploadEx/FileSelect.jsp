<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>FileSelect.jsp ������</title>
</head>
<body>

<form name="fileUploadForm" method="POST" 
enctype="multipart/form-data" action="ViewPage.jsp">
�ۼ���<br>
          <input type="text" name="name"/><br>
          
  ����<br>
          <input type="text" value="subject"/><br>
    ���ε��� ����<br>
    <input type="file" name="uploadFile"/>
  <br><br>
  
  <input type="submit" value="���� �ø���"/>
          


</form>

</body>
</html>