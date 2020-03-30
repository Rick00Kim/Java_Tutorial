function loginCheck(){
	if(document.frm.id.value.length==0){
		alert("아이디를 써주세요");
		frm.id.focus();
		return false;
	}
	if(document.frm.pw.value==""){
		alert("암호는 반드시 입력해야 합니다.");
		frm.pw.focus();
		return false;
	}
	return true;
}
//아이디 중복체크
function idCheck(){
	if(document.frm.id.value==""){
		alert('아이디를 입력하여 주십시오.');
		document.frm.id.focus();
		return;
	}
	var url = "/siren/idCheck.do?id="+document.frm.id.value;
	window.open(url,"_blank_1",
			"toolbar=no, menubar=no, scrollerbar=yes, resizable=no, width=450, height=200");
}

// 아이디 중복체크 완료 처리를 위한
function idok(){
	opener.frm.id.value=document.frm.id.value;
	opener.frm.reid.value=document.frm.id.value;
	self.close();
}

//회원 정보의 유효성을 체크하기 위한 
function joinCheck(){
	if(document.frm.name.value.length==0){
		alert("이름을 써주세요.");
		frm.name.focus();
		return false;
	}
	if (document.frm.id.value.length==0){
		alert("아이디를 써주세요");
		frm.id.focus();
		return false;
	}
	if(document.frm.id.value.length<3){
		alert("아이디는 3글자이상이어야 합니다.");
		frm.id.focus();
		return false;
	}
	if(document.frm.pw.value==""){
		alert("암호는 반드시 입력해야 합니다.");
		frm.pw.focus();
		return false;
	}
	if(document.frm.reid.value.length==0){
		alert("중복 체크를 하지 않았습니다.");
		frm.id.focus();
		return false;
	}
	return true;
}
function readyOrder(){
	if(document.frm.usersized.value=="Grande"){
		frm.userprice.value=frm.userprice.value+500;
	}
	if(document.frm.usersized.value=="Venti"){
		frm.userprice.value=frm.userprice.value+500;
	}
}