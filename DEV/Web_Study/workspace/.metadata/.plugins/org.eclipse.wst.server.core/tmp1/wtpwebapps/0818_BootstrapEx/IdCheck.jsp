<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!-- �׼��±� �߰� -->
<jsp:useBean id="mem" scope="page" class="member.DBBean"/>

<%
	String mem_id = request.getParameter("mem_id");
	int idCheck = mem.confirmId(mem_id);	//ID�ߺ�Ȯ�� �޼ҵ� ȣ��	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>idCheck.jsp ������ </title>
</head>
<body>
	<table border="0" align="center">
		<tr>
			<td align="center">
				<%
					if( idCheck == 1 ){	//id�� �ߺ��� ���
				%>
				<br>
				<%= mem_id %>�� �̹� �����ϴ� ID�Դϴ�. &nbsp; <br><br>
				<input type="button" value="�ݱ�" onclick="javascript:self.close(); opener.document.memberForm.mem_id.focus();"/>	  <!-- �ߺ��̸� â�ݰ� ������� ���̵� ��Ŀ�� �϶�� ���� -->
				<%
					}else{
				%>
				<br>
				<%= mem_id %>�� ��� ������ ID�Դϴ�.  &nbsp; <br><br>
				<input type="button" value="�ݱ�" onclick="javascript:self.close(); opener.document.memberForm.mem_passwd.focus();"/>	  <!-- ������� ��й�ȣ�� ��Ŀ�� �϶�� ���� -->
				<%
					}
				%>
			</td>
		</tr>
		
	</table>
</body>
</html>