<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% //스크립트릿에 자바코드 입력
      int result = 0; //지역변수
      if(request.getMethod().equals("POST")){
    	  int num1 =Integer.parseInt(request.getParameter("num1"));
    	  String operatorStr=request.getParameter("operator");
    	  
    	  int num2 =Integer.parseInt(request.getParameter("num2"));
    	  if(operatorStr.equals("+")){
    		  result=num1+num2;
    	  }
    	  else if(operatorStr.equals("-")){
    		  result=num1-num2;
    	  }
    	  else if(operatorStr.equals("*")){
    		  result=num1*num2;
    	  }
    	  else if(operatorStr.equals("/")){
    		  result=num1/num2;
    	  }
      }


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>간단한 사칙연산 계산기 구현 => 분리 시키지 않은 방법</title>
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
  계산 결과: <%=result %>
  
  
   
   </center>
</body>
</html>