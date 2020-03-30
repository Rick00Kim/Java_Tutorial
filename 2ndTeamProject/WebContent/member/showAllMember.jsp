<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/siren/main/project/css/style.css">
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

	<div class="container">
	  <h2>加入されている会員のインフォメーション</h2>
	  <p>修正、削除</p>            
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>パスワード</th>
	        <th>名前</th>
	        <th>携帯</th>
	        <th>メール</th>
	        <th>生年月日</th>
	        <th>グレード</th>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach var="temp" items="${list}">
					<tr>
						<td>${temp.id }</td>
						<td>${temp.password }</td>
						<td>${temp.name }</td>
						<td>${temp.phone }</td>
						<td>${temp.email }</td>
						<td>${temp.birth }</td>
						<td>${temp.grade }</td>
					</tr>
				</c:forEach>
	    </tbody>
	  </table>
	</div>

</body>
</html>