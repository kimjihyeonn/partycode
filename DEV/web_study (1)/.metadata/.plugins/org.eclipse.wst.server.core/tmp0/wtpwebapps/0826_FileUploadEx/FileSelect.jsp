<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>FileSelect.jsp 페이지</title>
</head>
<body>

<form name="fileUploadForm" method="POST" 
enctype="multipart/form-data" action="ViewPage.jsp">
작성자<br>
          <input type="text" name="name"/><br>
          
  제목<br>
          <input type="text" value="subject"/><br>
    업로드할 파일<br>
    <input type="file" name="uploadFile"/>
  <br><br>
  
  <input type="submit" value="파일 올리기"/>
          


</form>

</body>
</html>