<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% //��ũ��Ʈ���� �ڹ��ڵ� �Է�
      int result = 0; //��������
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
<title>������ ��Ģ���� ���� ���� => �и� ��Ű�� ���� ���</title>
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
  ��� ���: <%=result %>
  
  
   
   </center>
</body>
</html>