function orderModify(num){
	var url = "/siren/getoneorder.do?num="+num;
	window.open(url,"_blank_1",
			"toolbar=no, menubar=no, scrollerbar=yes, resizable=no, width=1000, height=700");
}
function updateOX(){
	opener.location.href="orderlist.do";
	self.close();
}