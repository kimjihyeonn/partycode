<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL�� ���θ��� ���� ����</title>
<style>
 #scroll_to_top {
   width:50px;
   height:50px;
   position:fixed;
   bottom:3rem;
   right:3rem;
   opacity:0.2;
 }

</style>
</head>
<body>
  <h3>���� ����</h3>
  <h2>��ǰ ��� ����Ʈ</h2>
  <div id="apple">
   <div>
     <img src="images/appleImage.jpg"/>
   </div>
   <div>
     <b><c:out value="û�� �ܻ��"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="12000" pattern="#,###��"/></b>
   </div>
   <div>
      <small><c:out value="��絵 �ƻ��� ����� ��ĥ��"/></small>
   </div>
  </div>
  
   <div id="grape">
   <div>
     <img src="images/grapeImage.jpg"/>
   </div>
   <div>
     <b><c:out value="ȫ�� ���� �ӽ�Ĺ ����"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="20000" pattern="#,###��"/></b>
   </div>
   <div>
      <small><c:out value="����° �Դ� �� ���� ��ǰ�� ����"/></small>
   </div>
  </div>
  
  <div id="strawberry">
   <div>
     <img src="images/strawberryImage.jpg"/>
   </div>
   <div>
     <b><c:out value="���� ����"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="30000" pattern="#,###��"/></b>
   </div>
   <div>
      <small><c:out value="������ ���� �ؿܿ����� ����"/></small>
   </div>
  </div>

<div id="watermelon">
   <div>
     <img src="images/watermelon.jpg"/>
   </div>
   <div>
     <b><c:out value="�Ծ� ����"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="40000" pattern="#,###��"/></b>
   </div>
   <div>
      <small><c:out value="�絵 ���� ���� ����"/></small>
   </div>
  </div>
  <br><br>
  <input type="image" src="images/top_image.png" 
  id="scroll_to_top" onClick="javascript:window.scrollTo(0,0)" alt="������" />
  
  
  
  
  
  
</body>
</html>