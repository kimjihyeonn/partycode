/**
 *  회원가입 시 ID 중복체크 검사하는 함수
 */

function idCheck(id){
	if(id==""){
		alert('아이디를 입력하세요.');
	}
	else{
		url="IdCheck.jsp?mem_id="+id;
		window.open(url,"post","width=350, height=150");
	}
}