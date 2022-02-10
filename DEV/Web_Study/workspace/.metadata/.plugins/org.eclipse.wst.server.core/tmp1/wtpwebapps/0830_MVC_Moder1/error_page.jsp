<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 추가 -->

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>error_page.jsp 페이지</title>
</head>
<!-- 추가 -->
<jsp:useBean id="now" class="java.util.Date"/>
<body>
<div>
  <h2>에러 페이지</h2>
  
  <hr>
  <table>
    <tr width=100% bgcolor="pink">
       <td>
             예외 유형, 상태 코드, 요청실패 URI 에러정보 보기
             빠르 시이래에 해결합시다.
       </td>
    </tr>
    <tr>
       ${now}<p>
       요청실패 URI : ${pageContext.errorData.requestURI}<br>
       상태코드 : ${pageContext.errorData.statusCode}<br>
    예외유형 :  ${pageContext.errorData.throwable}
    </tr>
    
  
  </table>
</div>

</body>
</html>