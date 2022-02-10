<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- 추가요 -->
<jsp:useBean id="calc" scope="page" class="calc.CalcBean"/>
<!-- page생략가능, -->

<jsp:setProperty property="*" name="calc"/>
<!-- "*" all을 의미 -->
<% calc.calculate(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
   <h3>간단한 사칙연산 계산기</h3>
   <hr>
   <br>
   <form name="CalForm" method="POST">
    <input type="text" name="num1" width="200" size="7" />
     <select name="operator">
     <option selected>선택</option>
     <option>+</option>
     <option>-</option>
     <option>*</option>
     <option>/</option>
     </select>
     <input type="text" name="num2" width="200" size="7"  />
     <input type="submit" value="계산" />
     <input type="reset" value="다시입력"/>
   
   </form>
   
   <br>
   <hr><br>
  계산 결과:<jsp:getProperty property="result" name="calc"/>
  
  
   
   </center>
</body>
</html>