<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP 스크립트 요소들 실습 예제</title>
</head>
<body>
    <H2>선언문, 스크립트릿, 표현식의 쓰임새 알아보는 예제</H2>
    <%! //선언문=> 전역변수 선언 
        String str1 = "전역변수입니다.";
        
    %>
    <%! //선언문=>메소드를 선언 할 수 있다.
       String getStr(){
    	 return str1;
    }
    
    %>
    <%  //스크립트릿=> 자바코드를 기술 할 수 잇따.
       String str2="지역변수입니다.";
            
    %>
    스크립트릿에서 선언한 변수 str2는
    <%= str2
     %> <br>
   선언문에서 선언한 변수는 str1은<%=getStr() %>
</body>
</html>