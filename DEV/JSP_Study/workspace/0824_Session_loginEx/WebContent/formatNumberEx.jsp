<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!-- �߰��� -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

    
<!DOCTYPE html>

<html>
<head>
<meta charset="EUC-KR">
<title>JSTL ���ÿ���=>taglib ���þ� ����</title>
</head> 
<body>
<div>
  <c:set var="price"  value="53000000"/>
  <h2>��ǰ����: ${price}��</h2>
  <ul>
  <b><li>�ݾ׿� 3�ڸ� ���� ��ǥ ���:<fmt:formatNumber type="number"
   value="${price}" pattern="#,###"/>��</li></b>
   <b><li>�ݾ׿� 3�ڸ� ���� ��ǥ ���:<fmt:formatNumber type="number"
   value="${price}" maxFractionDigits="3"/>��</li></b>
   
   <b><li>�ѱ���ȭ:<fmt:setLocale value="ko_KR"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
   <b><li>USA��ȭ:<fmt:setLocale value="en_US"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
   <b><li>�Ϻ���ȭ:<fmt:setLocale value="ja_JP"/><fmt:formatNumber type="currency" value="${price}"/></li></b>
  </ul>
</div>

</body>
</html>