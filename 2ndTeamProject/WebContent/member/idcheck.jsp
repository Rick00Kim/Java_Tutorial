<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>中腹チェック</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<h2>ID中腹チェック</h2>
	<form action="idCheck.do" method="get" name="frm">
	ID<input type ="text" name = "id" value="${id}">
			<input type = "submit" value="中腹チェック">
	<br>
	<c:if test="${result == 1}">
		<script type = "text/javascript">
				opener.document.frm.userid.value="";
		</script>
		${userid}はもう使われております。
		</c:if>
		<c:if test="${result==-1 }">
			${userid}は使えます。
			<input type = "button" value="使用" class="cancel" onclick="idok()">
		</c:if>
	</form>
</body>
</html>