<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!-- �߰��� -->
<jsp:useBean id="calc" scope="page" class="calc.CalcBean"/>
<!-- page��������, -->

<jsp:setProperty property="*" name="calc"/>
<!-- "*" all�� �ǹ� -->
<% calc.calculate(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
   <h3>������ ��Ģ���� ����</h3>
   <hr>
   <br>
   <form name="CalForm" method="POST">
    <input type="text" name="num1" width="200" size="7" />
     <select name="operator">
     <option selected>����</option>
     <option>+</option>
     <option>-</option>
     <option>*</option>
     <option>/</option>
     </select>
     <input type="text" name="num2" width="200" size="7"  />
     <input type="submit" value="���" />
     <input type="reset" value="�ٽ��Է�"/>
   
   </form>
   
   <br>
   <hr><br>
  ��� ���:<jsp:getProperty property="result" name="calc"/>
  
  
   
   </center>
</body>
</html>