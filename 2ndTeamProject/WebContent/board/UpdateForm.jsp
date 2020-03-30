<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/siren/main/project/css/style.css">

<style type="text/css">
table {
				border-collapse: collapse;
				width: 800px;
				height: 150px;
}

tr, td {
				border: 3px solid black;
				padding: 10px;
				text-align: center;
}

.accent {
				font-size: 20px;
				color: red;
				font-weight: bold;
}

body {
				background-attachment: fixed;
				background-image: url('images/Confidential.jpg');
}
border
:
 
3
px
 
solid
 
black
;

	
padding
:
 
10
px
;

	
text-align
:
 
center
;


}
</style>

</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="50">
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

			<a class="navbar-brand" href="/siren/main/main.jsp"> <img
				src="/siren/main/project/img/logo.png" alt="" class="img-responsive">
			</a>
		</div>

		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">

				<li><a href="/siren/board/listForm.jsp">お知らせ</a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> メニュー紹介</a>
					<ul class="dropdown-menu">
						<li><a href="/siren/menulist.do">注文する</a></li>
						<li><a href="/siren/orderlist.do">注文照会</a></li>
					</ul>
				</li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> 顧客ページ</a>
					<ul class="dropdown-menu">
						<li><a href="/siren/board/questionAnswer.jsp">Q&A</a></li>
						<li><a href="/siren/board2/board.jsp">お客様の声</a></li>
					</ul>
				</li>
				<c:if test="${user.grade eq 'admin' }">
					<li><a href="/siren/showallmember.do">お客様管理</a></li>
				</c:if>
				<c:if test="${user.grade eq 'client'}">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="/siren/member/memberUpdate.jsp"> マイページ</a>
						<ul class="dropdown-menu">
							<li><a href="/siren/member/memberUpdate.jsp">私の情報管理(修正・脱退)</a></li>
						</ul>
					</li>
				</c:if>
				
				<li><c:if test="${empty user}">
						<li><a href="/siren/member/login.jsp">ログイン</a></li>
					</c:if></li>
				<li><c:if test="${!empty user}">
						<li><a href="/siren/logout.do">ログアウト</a></li>
					</c:if>
				</li>
			</ul>
		</div>
	</div>
	</nav>

	<marquee behavior="alternate" scrolldelay="200" direction="right">
		<span class="accent">-------------管理者専用ページです。-------------</span>
	</marquee>
	<form action="UpdatePro.jsp" method="post">

		<center>
			<img src="/siren/images/7.jpg" width="30%" height="30%"> <font
				size="4"> リストを修正します。 </font>


			<table border="1">
				<tr>
					<td>タイトル</td>
					<td><input type="text" name="title" size="45" /></td>
				</tr>

				<tr>
					<td>内容</td>
					<td><textarea rows="30" cols="40" name="content"></textarea></td>
				</tr>
				<tr>
				
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修正"></td>
				</tr>
			</table>
		</center>
	</form>
	<marquee behavior="alternate" scrolldelay="200" direction="right">
		<span class="accent">-------------管理者専用ページです。-------------</span>
	</marquee>

</body>
</html>