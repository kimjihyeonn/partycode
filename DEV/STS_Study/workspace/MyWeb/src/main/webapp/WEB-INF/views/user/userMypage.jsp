﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>인덱스를 만들어 보자</title>
	
	<!-- 제이쿼리 추가(가장먼저 로딩 되어야 하기때문에 첫째줄에 선언) -->
	<script src="${pageContext.request.contextPath }/resources/js/jquery.js"></script>
	
	
    <link href="${pageContext.request.contextPath }/resources/css/bootstrap.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!--개인 디자인 추가-->
    <link href="${pageContext.request.contextPath }/resources/css/style.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>
	

	
</head>
    <script>
(function(){
	  var msg = "${msg}";
	  
	  if(msg !==''){
		  alert(msg);
	  }
})();
</script>
<body>
	<%@ include file="../include/header.jsp" %>
	<section>
        <!--Toggleable / Dynamic Tabs긁어옴-->
        <div class="container">
            <div class="row">
                <div class="col-sm-12 col-md-10 col-lg-9 myInfo">
                    <div class="titlebox">
                        MEMBER INFO                    
                    </div>
                    
                    <ul class="nav nav-tabs tabs-style">
                        <li class="active"><a data-toggle="tab" href="#info">내정보</a></li>
                        <li><a data-toggle="tab" href="#myBoard">내글</a></li>
                        <li><a data-toggle="tab" href="#menu2">Menu 2</a></li>
                    </ul>
                    <div class="tab-content">
                        <div id="info" class="tab-pane fade in active">
 
                            <p>*표시는 필수 입력 표시입니다</p>
                            <form>
                            <table class="table">
                                <tbody class="m-control">
                                    <tr>
                                        <td class="m-title">*ID</td>
                                        <td><input class="form-control input-sm"value="${userVO.id }"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*이름</td>
                                        <td><input class="form-control input-sm" value="${userVO.name }"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*비밀번호</td>
                                        <td><input class="form-control input-sm" value="${userVO.pw }"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*비밀번호확인</td>
                                        <td><input class="form-control input-sm"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*E-mail</td>
                                        <td>
                                            <input class="form-control input-sm">@
                                            <select class="form-control input-sm sel">
                                                <option>naver.com</option>
                                                <option>gmail.com</option>
                                                <option>daum.net</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*휴대폰</td>
                                        <td>
                                            <select class="form-control input-sm sel">
                                                <option>010</option>
                                                <option>011</option>
                                                <option>017</option>
                                                <option>018</option>
                                            </select>
                                            <input class="form-control input-sm">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*우편번호</td>
                                        <td><input class="form-control input-sm" readonly>
                                        	<button type="button" class="btn btn-primary" id="addBtn">중복확인</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*주소</td>
                                        <td><input class="form-control input-sm add"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*상세주소</td>
                                        <td><input class="form-control input-sm add"></td>
                                    </tr>
                                </tbody>
                            </table>
                            </form>

                            <div class="titlefoot">
                                <button class="btn">수정</button>
                                <button class="btn">목록</button>
                            </div>
                        </div>
                        <!-- 첫번째 토글 끝 -->
                        <div id="myBoard" class="tab-pane fade">
                            <p>*내 게시글 관리</p>
                            <form>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <td>번호</td>
                                        <td>제목</td>
                                        <td>작성일</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td><a href="##">첫글</a></td>
                                        <td>~~~~~</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td><a href="##">두글</a></td>
                                        <td>~~~~~</td>
                                    </tr>
                                </tbody>
                            </table>
                            </form>
                        </div>
                        <!-- 두번째 토글 끝 -->
                        <div id="menu2" class="tab-pane fade">
                            <h3>Menu 2</h3>
                            <p>Some content in menu 2.</p>
                        </div>
                    </div>
                </div>
            </div>

        </div>


    </section>
    
    <%@ include file="../include/footer.jsp" %>
    
</body>
</html>