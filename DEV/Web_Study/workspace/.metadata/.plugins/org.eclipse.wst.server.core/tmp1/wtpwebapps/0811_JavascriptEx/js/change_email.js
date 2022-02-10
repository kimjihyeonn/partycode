/**
 * 이메일 옵션 선택 후 주소 자동 저장하는 함수
 */

function change_email() {
	//id에 의해 Element를 얻어옴, Element는 객체, 자바스크립트와 html의 상호작용
	//var 객체 이름 = document.getElementById("객체ID");
	var email_add = document.getElementById("email_add");
	var email_sel = document.getElementById("email_sel");
	
	//사용자가 선택한 옵션의 인덱스와 값(value) 가져오기
	//email_sel.options = 주소
	var idx = email_sel.options.selectedIndex;
	var val = email_sel.options[idx].value;
	
	email_add.value = val;
}