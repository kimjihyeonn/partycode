<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- 추가요 -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

    
<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>JSTL 관련예제=>taglib 지시어 예제</title>
</head> 
<body>
<div>
  <c:set var="price"  value="53000000"/>
  <h2>상품가격: ${price}원</h2>
  <ul>
  <b><li>금액에 3자리 마다 쉼표 찍기:<fmt:formatNumber type="number"
   value="${price}" pattern="#,###"/>원</li></b>
   <b><li>금액에 3자리 마다 쉼표 찍기:<fmt:formatNumber type="number"
   value="${price}" maxFractionDigits="3"/>원</li></b>
   
   <b><li>한국통화:<fmt:setLocale value="ko_KR"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
   <b><li>USA통화:<fmt:setLocale value="en_US"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
   <b><li>일본통화:<fmt:setLocale value="ja_JP"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
  </ul>
</div>

</body>
</html>