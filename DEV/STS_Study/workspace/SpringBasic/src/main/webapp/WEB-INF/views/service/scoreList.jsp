<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>점수목록화면</h3>


<!-- 화면에서 삭제시에 필요한 값을 넘겨줘야한다. -->
<c:forEach var="vo"  items="${list }" varStatus="i" >
${i.index}
  이름:${vo.name }
  국어:${vo.kor }
  영어:${vo.eng }
  수학:${vo.math }
  <button type="button" onclick="location.href='scoreDelete?num=${i.index}'">삭제</button>
  <br/>
</c:forEach>
<hr/>

<a href="scoreRegist">재등록하기</a>



</body>
</html>