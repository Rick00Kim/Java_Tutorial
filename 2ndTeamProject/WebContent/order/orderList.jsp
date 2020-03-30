<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script type="text/javascript" src="/siren/script/order.js"></script>
	<style>
		table, th{
			font-size:16px;
		}
		td{
			font-size : 14px;
		}
	</style>
	<script type="text/javascript">
	function deleteCofirm(menu,order_num){
		if(confirm(menu+"の注文を削除しますか。")==true){
			location.href="./orderdelete.do?num="+order_num;
		}else{
			false;
		}
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
		<c:if test="${!empty user }">
			<h2>${user.name }様の注文照会</h2>
		</c:if>
		<p>ちゃんと確認して最終ご注文ください。</p>
		<table class="table table-condensed">
			<thead>
				<tr>
					<th>注文番号</th>
					<th>ID</th>
					<th>メニュー名</th>
					<th>金額</th>
					<th>オプション1</th>
					<th>オプション2</th>
					<th>オプション3</th>
					<th>オプション4</th>
					<th>オプション5</th>
					<th>メモー</th>
					<th>種類</th>
					<th>注文時間</th>
					<th>修正・削除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="temp" items="${list}">
					
					<tr>
						<td>${temp.order_num }</td>
						<td>${temp.id }</td>
						<td>${temp.menu }</td>
						<td>${temp.price }</td>
						<td>${temp.option1 }</td>
						<td>${temp.option2 }</td>
						<td>${temp.option3 }</td>
						<td>${temp.option4 }</td>
						<td>${temp.option5 }</td>
						<td>${temp.memo }</td>
						<td>${temp.kinds }</td>
						<td>${temp.orderdate }</td>
						<td>
							<button type="button" class = "btn btn-info" onclick="return orderModify('${temp.order_num}');">修正</button>
							<button type="button" class = "btn btn-danger" onclick="return deleteCofirm('${temp.menu}','${temp.order_num }');">削除</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<h2 align="center">トータル : ${total }</h2><br>
		<c:if test="${!empty user }">
		<div align="center">
			<button type="button" class="btn btn-success" onclick="location.href='/siren/donate/give.jsp?order_total=${total}'">オーダー</button>
		</div>
		</c:if>
		<c:if test="${empty user }">
		<div align="center">
			<h2>顧客様の注文オーダーページです。</h2>
			<h2>${message }</h2>
			<a href="/siren/member/join.jsp">会員加入すればもっといい潤いがあります。</a>
		</div>
		</c:if>
	</div>
</body>
</html>