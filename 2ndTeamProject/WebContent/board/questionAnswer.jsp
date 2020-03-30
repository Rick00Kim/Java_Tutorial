<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Q&A</title>

<link rel="stylesheet" href="/siren/main/project/css/style.css">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script

	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script

	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<style type="text/css">

#aa {

				margin-top: 100px;

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

	

	<div style="width: auto; height: 60px;"></div>



	<div class="container" id="aa">

	<h1>Q&A</h1>

	<p>今までお客様がお気になったことについて簡単にご説明いたします。</p>

	<div class="panel-group" id="accordion">

		<div class="panel panel-default">

			<div class="panel-heading">

				<h4 class="panel-title">

					<a data-toggle="collapse" data-parent="#accordion"

						href="#collapse1">Q1. cuderの使い方を教えてください。</a>

				</h4>

			</div>

			<div id="collapse1" class="panel-collapse collapse in">

				<div class="panel-body">まず, cuderアプリケーションをスマートフォンにダウンロードしてください。そして cuderを

					利用している店に行けば自動的に店のメニュー見るボタンが現れます。そのあとには店で お客様が欲しいことに注文しましたら

					いいです。</div>

			</div>

		</div>

		<div class="panel panel-default">

			<div class="panel-heading">

				<h4 class="panel-title">

					<a data-toggle="collapse" data-parent="#accordion"

						href="#collapse2">Q2. cuder利用中に潤いは?</a>

				</h4>

			</div>

			<div id="collapse2" class="panel-collapse collapse">

				<div class="panel-body">cuderを使用しているすべての店のお知らせと割引クーポンを

					いっぺんに確認できるし, ポイントをいっぺんに集めて使用できます。</div>

			</div>

		</div>

		<div class="panel panel-default">

			<div class="panel-heading">

				<h4 class="panel-title">

					<a data-toggle="collapse" data-parent="#accordion"

						href="#collapse3">Q3. 現在 cuderで利用できる店を教えてください。</a>

				</h4>

			</div>

			<div id="collapse3" class="panel-collapse collapse">

				<div class="panel-body">ハリス, エンジェルリノス, サーティーワン, ダンキンドーナツがあります。</div>

			</div>

		</div>

		<div class="panel panel-default">

			<div class="panel-heading">

				<h4 class="panel-title">

					<a data-toggle="collapse" data-parent="#accordion"

						href="#collapse4">Q4. cuderで注文リストを全て確認できますか? </a>

				</h4>

			</div>

			<div id="collapse4" class="panel-collapse collapse">

				<div class="panel-body">はい。最大一年間内のリストを確認できます。</div>

			</div>

		</div>

	</div>

	

</div>

</body>



</html>