<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name=viewport content="width=device-width, initial-scale=1">
<link rel=stylesheet
	href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css>
<script
	src=https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
<script
	src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" />
<link
	href="http://cdn.syncfusion.com/15.1.0.41/js/web/bootstrap-theme/ej.web.all.min.css"
	rel="stylesheet" />
<script
	src="http://cdn.syncfusion.com/js/assets/external/jquery-1.10.2.min.js"></script>
<script
	src="http://cdn.syncfusion.com/js/assets/external/jquery.easing.1.3.min.js"></script>
<script
	src="http://cdn.syncfusion.com/js/assets/external/jsrender.min.js"></script>
<script
	src="http://cdn.syncfusion.com/15.1.0.41/js/web/ej.web.all.min.js"></script>

<script>
   
    $(function () {

        $("#content").ejRTE({ width: "98%" });

        $("#Btn").ejButton({ width: "100px", height: "40px" });

    });
    </script>
<title>作成</title>


<style>
.btn.btn-default {
	color: #ffffff;
	background-color: #c8c8c8;
	background-image: linear-gradient(to bottom, #c8c8c8, #c8c8c8);
	border-color: #c8c8c8 #c8c8c8 #c8c8c8;
}

.button {
	text-align: right;
}

.b {
	margin: 10px;
	width: 1140px;
	height: 30px;
	margin-left: 60px;
}

.accent {
	font-size: 20px;
	color: red;
	font-weight: bold;
}

.blank2 {
	width: 1140px;
	height: 55px;
}

.form-group {
	text-align: right;
	padding-right: 150px;
}

.blank {
	width: 1140px;
	height: 30px;
}
</style>
<script type="text/javascript">
function goUrl(url){
	location.href=url;
}
</script>
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
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> 顧客ページ</a>
					<ul class="dropdown-menu">
						<li><a href="/siren/board/questionAnswer.jsp">Q&A</a></li>
						<li><a href="/siren/board2/board.jsp">お客様の声</a></li>
					</ul></li>
				<c:if test="${user.grade eq 'admin' }">
					<li><a href="/siren/showallmember.do">お客様管理</a></li>
				</c:if>
				<c:if test="${user.grade eq 'client'}">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="/siren/member/memberUpdate.jsp">
							マイページ</a>
						<ul class="dropdown-menu">
							<li><a href="/siren/member/memberUpdate.jsp">私の情報管理(修正・脱退)</a></li>
						</ul></li>
				</c:if>

				<li><c:if test="${empty user}">
						<li><a href="/siren/member/login.jsp">ログイン</a></li>
					</c:if></li>
				<li><c:if test="${!empty user}">
						<li><a href="/siren/logout.do">ログアウト</a></li>
					</c:if></li>
			</ul>
		</div>
	</div>
	</nav>

	<div style="width: auto; height: 60px;"></div>


	<c:if test="${user.grade eq 'admin'}">

		<div class="blank2"></div>

		<marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span>
		</marquee>
		<div class="b">
			<h2>
				<img src="/siren/images/opinion.jpg">
			</h2>
		</div>
		<form action="boardWritePro.jsp" method="post">
			<div class="blank"></div>
			<div id="container">
				<div class="col-lg-12" id="Comments">
					<div class="form-horizontal" style="padding-top: 25px;">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">タイトル</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title" name="title"
									placeholder="タイトル">
							</div>
						</div>
						<p>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">作成者</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title" name="title"
									value="${user.name }" readonly>
							</div>
						</div>
						<div class="form-group">
							<label for="emailID" class="col-sm-2 control-label">メール</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="email" name="email"
									value="${user.email }" readonly>
							</div>
						</div>
						<p>
						<div class="form-group">
							<label for="comments" class="col-sm-2 control-label">内容</label>
							<div class="col-sm-10">
								<textarea type="text" class="form-control" id="content"
									name="content"></textarea>
							</div>
						</div>

						<p>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" class="btn btn-default" value="作成">
								<input type="button" class="btn btn-default" value="戻る"
									onclick="goUrl('board.jsp')">
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
		<marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span>
		</marquee>
	</c:if>

	<c:if test="${user.grade ne 'admin'}">
		<div class="blank2"></div>
		<div class="b">
			<h2>
				<img src="/siren/images/opinion.jpg">
			</h2>
		</div>
		<form action="boardWritePro.jsp" method="post">
			<div class="blank"></div>
			<div id="container">
				<div class="col-lg-12" id="Comments">
					<div class="form-horizontal" style="padding-top: 25px;">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">タイトル</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title" name="title"
									placeholder="タイトル">
							</div>
						</div>

						<c:if test="${!empty user }">
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">作成者</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="writer" name="writer"
										value="${user.name }" readonly>
								</div>
							</div>
						</c:if>
						<c:if test="${empty user }">
							<div class="form-group">
								<label for="name" class="col-sm-2 control-label">作成者</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="writer" name="writer"
										value="${user.name }" placeholder="お名前を書いてください。">
								</div>
							</div>
						</c:if>
						<div class="form-group">
							<label for="emailID" class="col-sm-2 control-label">メール</label>
							<div class="col-sm-10">
							
								<input type="text" class="form-control" id="email" name="email"
									value="${user.email }">
									
							</div>
						</div>
						<div class="form-group">
							<label for="comments" class="col-sm-2 control-label">内容</label>
							<div class="col-sm-10">
								<textarea type="text" class="form-control" id="content"
									name="content"></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<br> <input type="submit" class="btn btn-default"
									value="作成"> <input type="button"
									class="btn btn-default" value="戻る" onclick="goUrl('board.jsp')">
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</c:if>
</body>
</html>