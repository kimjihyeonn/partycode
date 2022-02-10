<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>세션 id, 세션 유지시간 얻어내기 예제</title>
</head>
<body>
   <h2>session 내장 객체의 주요 메소드 테스트</h2>
   <hr>
   <%
      //isNew() 메소드를 이용해 최초 세션 설정을 확인할 수 있다.
      if(session.isNew()){
    	  out.println("<script>alert('세션이 해제되어 다시 설정함!')</script>");
    	  session.setAttribute("login", "홍길동");
      }
   %>
   <%=session.getAttribute("login") %>님 환영합니다.<br>
   1.세션 ID: <%=session.getId()%><br>
   2.세션 유지 시간:<%=session.getMaxInactiveInterval() %><br>
   3.login 세션의 설정 값: <%=session.getAttribute("login") %>
   
</body>
</html>