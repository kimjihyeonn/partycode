<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>insertBoard.jsp 페이지=> 게시글 입력 페이지</title>
<style>
#div_box {
 position:absolute;
 top:10%;
 left:20%;

}

</style>
</head>
<body>
<div id="div_box">
  <h1>새 게시글 등록</h1>
  <a href="logout.do">로그아웃</a> 
  <hr>
  <form name="insetForm" method="POST" action="insertBoard.do">
  <table border ="1" cellpadding="0" cellspacing="0">
    <tr>
       <td bgcolor="orange" width="70">제목</td>
       <td align="left"><input type="text" name="title" /></td>
       
       
    </tr>
   
      <tr>
       <td bgcolor="orange">작성자</td>
       <td align="left"><input type="text" name="writer" /></td>
       
       
    </tr>
      <tr>
       <td bgcolor="orange">내용</td>
       <td align="left"><textarea name="content" rows="10" cols="40"></textarea></td>       
    </tr>
    
    <tr >
       <td colspan="2" align="center"><input type="submit" value="글 등록" /></td>
    </tr>
  
  </table>
  
  </form>
 <a href ="getBoardList.jsp">전체 게시글 목록 보기</a>


</div>

</body>
</html>