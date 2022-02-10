<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!-- 액션태그 추가 -->
<jsp:useBean id="mem" scope="page" class="member.DBBean"/>

<%
	String mem_id = request.getParameter("mem_id");
	int idCheck = mem.confirmId(mem_id);	//ID중복확인 메소드 호출	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>idCheck.jsp 페이지 </title>
</head>
<body>
	<table border="0" align="center">
		<tr>
			<td align="center">
				<%
					if( idCheck == 1 ){	//id가 중복인 경우
				%>
				<br>
				<%= mem_id %>는 이미 존재하는 ID입니다. &nbsp; <br><br>
				<input type="button" value="닫기" onclick="javascript:self.close(); opener.document.memberForm.mem_id.focus();"/>	  <!-- 중복이면 창닫고 멤버폼의 아이디에 포커스 하라는 로직 -->
				<%
					}else{
				%>
				<br>
				<%= mem_id %>는 사용 가능한 ID입니다.  &nbsp; <br><br>
				<input type="button" value="닫기" onclick="javascript:self.close(); opener.document.memberForm.mem_passwd.focus();"/>	  <!-- 멤버폼의 비밀번호에 포커스 하라는 로직 -->
				<%
					}
				%>
			</td>
		</tr>
		
	</table>
</body>
</html>