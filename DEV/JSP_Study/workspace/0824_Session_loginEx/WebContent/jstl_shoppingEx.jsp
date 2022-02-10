<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSTL을 쇼핑몰에 적용 예제</title>
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
  <h3>오픈 마켓</h3>
  <h2>상품 목록 리스트</h2>
  <div id="apple">
   <div>
     <img src="images/appleImage.jpg"/>
   </div>
   <div>
     <b><c:out value="청송 꿀사과"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="12000" pattern="#,###원"/></b>
   </div>
   <div>
      <small><c:out value="고당도 아삭한 사과의 감칠맛"/></small>
   </div>
  </div>
  
   <div id="grape">
   <div>
     <img src="images/grapeImage.jpg"/>
   </div>
   <div>
     <b><c:out value="홍성 샤인 머스캣 포도"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="20000" pattern="#,###원"/></b>
   </div>
   <div>
      <small><c:out value="껍질째 먹는 씨 없는 신품종 포도"/></small>
   </div>
  </div>
  
  <div id="strawberry">
   <div>
     <img src="images/strawberryImage.jpg"/>
   </div>
   <div>
     <b><c:out value="강진 딸기"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="30000" pattern="#,###원"/></b>
   </div>
   <div>
      <small><c:out value="달콤한 딸기 해외에서도 유명"/></small>
   </div>
  </div>

<div id="watermelon">
   <div>
     <img src="images/watermelon.jpg"/>
   </div>
   <div>
     <b><c:out value="함안 수박"/></b>
   </div>
   <div>
     <b><fmt:formatNumber value="40000" pattern="#,###원"/></b>
   </div>
   <div>
      <small><c:out value="당도 높은 유명 수박"/></small>
   </div>
  </div>
  <br><br>
  <input type="image" src="images/top_image.png" 
  id="scroll_to_top" onClick="javascript:window.scrollTo(0,0)" alt="맨위로" />
  
  
  
  
  
  
</body>
</html>