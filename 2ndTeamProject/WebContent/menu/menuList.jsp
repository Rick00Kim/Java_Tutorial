<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.siren.bean.CafeMenuBean"%>
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
	<link rel="stylesheet" type="text/css" href="/siren/cscs/css/set2.css?ver=3" />

	<link rel="stylesheet" type="text/css" href="/siren/cscs/css/normalize.css?ver=3" />
<style media="screen">
#main {
				background-image: url(/siren/main/project/img/2.png);
				background-size: 60%;
				background-position: center;
				background-attachment: fixed;
				background-repeat: no-repeat;
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
	<%
			ArrayList<CafeMenuBean> listCoffee=(ArrayList<CafeMenuBean>)request.getAttribute("listCoffee");
			ArrayList<CafeMenuBean> listJuice=(ArrayList<CafeMenuBean>)request.getAttribute("listJuice");
			ArrayList<CafeMenuBean> listSandwich=(ArrayList<CafeMenuBean>)request.getAttribute("listSandwich");
			ArrayList<CafeMenuBean> listCake=(ArrayList<CafeMenuBean>)request.getAttribute("listCake");
			ArrayList<CafeMenuBean> listAffogato=(ArrayList<CafeMenuBean>)request.getAttribute("listAffogato");
			String[] category=(String[])request.getAttribute("category");
	%>
<div class="container" >
		<h2><%=category[0]%></h2>
		<%
			for (int i = 0; i < listCoffee.size(); i++) {
				CafeMenuBean temp = listCoffee.get(i);
		%>
		<a href="/siren/menudetail.do?tem=<%=temp.getMenu()%>">
		<div class="col-sm-4">
		<div class="grid" >
		<figure class="effect-julia">
			<center><img src="/siren/images/menuImages/<%=temp.getMenu()%>.jpg"
				style="width: 250px; height:250px; margin-top:15px;" class="img-circle"></center>
				<br><br>
				
			<p align="center">
				<%=temp.getMenu()%></p>
			<p align="center">
				
				<%=temp.getPrice()%></p>
				</figure>
		</div></div></a>
		<%
			}
		%>
	</div>
	
	<div class="container">
		<h2><%=category[1]%></h2>
		<%
			for (int i = 0; i < listJuice.size(); i++) {
				CafeMenuBean temp = listJuice.get(i);
		%>
		<a href="/siren/menudetail.do?tem=<%=temp.getMenu()%>">
		<div class="col-sm-4">
		<div class="grid" >
		<figure class="effect-julia">
			<center><img src="/siren/images/menuImages/<%=temp.getMenu()%>.jpg"
			style="width: 250px; height:250px; margin-top:15px; margin-bottom:27px;" class="img-circle"></center>
			<p align="center">
				
				<%=temp.getMenu()%></p>
			<p align="center">
				
				<%=temp.getPrice()%></p>
				</figure>
		</div></div></a>
		<%
			}
		%>
	</div>
	<div class="container">
		<h2><%=category[2]%></h2>
		<%
			for (int i = 0; i < listSandwich.size(); i++) {
				CafeMenuBean temp = listSandwich.get(i);
		%>
		<a href="/siren/menudetail.do?tem=<%=temp.getMenu()%>">
		<div class="col-sm-4">
		<div class="grid" >
		<figure class="effect-julia">
			<center><img src="/siren/images/menuImages/<%=temp.getMenu()%>.jpg"
			style="width: 250px; height:250px; margin-top:15px; margin-bottom:27px;" class="img-circle"></center>
			<p align="center">
				
				<%=temp.getMenu()%></p>
			<p align="center">
				
				<%=temp.getPrice()%></p>
				</figure>
		</div></div></a>
		<%
			}
		%>
	</div>
	<div class="container">
		<h2><%=category[3]%></h2>
		<%
			for (int i = 0; i < listCake.size(); i++) {
				CafeMenuBean temp = listCake.get(i);
		%>
		<a href="/siren/menudetail.do?tem=<%=temp.getMenu()%>">
		<div class="col-sm-4">
		<div class="grid" >
		<figure class="effect-julia">
			<center><img src="/siren/images/menuImages/<%=temp.getMenu()%>.jpg"
			style="width: 250px; height:250px; margin-top:15px; margin-bottom:27px;" class="img-circle"></center>
			<p align="center">
				
				<%=temp.getMenu()%></p>
			<p align="center">
				
				<%=temp.getPrice()%></p>
				</figure>
		</div></div></a>
		<%
			}
		%>
	</div>
	<div class="container">
		<h2><%=category[4]%></h2>
		<%
			for (int i = 0; i < listAffogato.size(); i++) {
				CafeMenuBean temp = listAffogato.get(i);
		%>
		<a href="/siren/menudetail.do?tem=<%=temp.getMenu()%>">
		<div class="col-sm-4">
		<div class="grid" >
		<figure class="effect-julia">
			<center><img src="/siren/images/menuImages/<%=temp.getMenu()%>.jpg"
			style="width: 250px; height:250px; margin-top:15px; margin-bottom:27px;" class="img-circle"></center>
			<p align="center">
				
				<%=temp.getMenu()%></p>
			<p align="center">
				
				<%=temp.getPrice()%></p>
				</figure>
		</div></div></a>
		
		<%
			}
		%>
	</div>
			<script>
			// For Demo purposes only (show hover effect on mobile devices)
			[].slice.call( document.querySelectorAll('a[href="#"') ).forEach( function(el) {
				el.addEventListener( 'click', function(ev) { ev.preventDefault(); } );
			} );
		</script>

	<footer class="text-center"> <a class="up-arrow"
		href="#myPage" data-toggle="tooltip" title="TO TOP">
		<p>click to top</p>
	</a>
	<br>
	<br>
	<p>
		Made By 우리친하조 <a href="main.html" data-toggle="tooltip"
			title="Visit website">www.cuder.com</a>
	</p>
	<p>© Copyright cuder 2017 All rights reserved.Website by Plato
		Creative Terms and Conditions and Privacy Policy</p>
	</footer>
</body>
</html>