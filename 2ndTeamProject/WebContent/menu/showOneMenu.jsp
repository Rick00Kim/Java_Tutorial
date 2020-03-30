<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<script type="text/javascript" src="/script/member.js"></script>
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

	<%
		CafeMenuBean menuTemp=(CafeMenuBean)request.getAttribute("temp");
	%>
	<div style="width: auto; height: 60px;"></div>
	<!-- Admin -->
	<c:if test="${user.grade eq 'admin' }">
		<h2 align="center">管理者にログインされています。</h2>
		<form action="/siren/menumodify.do" method="post" align="center">
			<p align="center">
				<img src="/siren/images/menuImages/<%=menuTemp.getMenu() %>.jpg"
					alt="${temp.menu }picture"
					style="width: 304px; height: 228px;">
			</p>
			<p align="center">
				Menu Name : 
				<input type="text" name="modMenu" value="<%=menuTemp.getMenu() %>" readonly >
			</p>
			<p align="center">
				Kinds : 
				<input type="text" name="modKinds" value="<%=menuTemp.getKinds() %>"　readonly>
			</p>
			<p align="center">
				Price : 
				<input type="text" name="modPrice" value="<%=menuTemp.getPrice() %>">
			</p>
			
			<p align="center">
			<input type="submit" value="<%=menuTemp.getMenu() %> 再設定">&nbsp;&nbsp;&nbsp;
			<input	type="button" value="Delete"
				onclick="location.href='/siren/menuDelete.do?tem=<%=menuTemp.getMenu() %>'">
				</p>
		</form>
	</c:if>
	<!-- Client -->
	<c:if test="${user.grade ne 'admin' }">
		<h3 align="center"><%=menuTemp.getKinds() %>を注文してください。</h3>
		<form action="/siren/orderadd.do" method="post" name="frm">
		<div class = "container">
		<div class="col-sm-1"></div>
		<div class="col-sm-5">
			<p align="center">
				<img src="/siren/images/menuImages/<%=menuTemp.getMenu() %>.jpg"
					alt="<%=menuTemp.getMenu() %>picture"
					class="img-circle" style="width: auto; height: auto;">
			</p>
			</div>
			<div class="col-sm-5">
			<h3 align="left"class="glyphicon glyphicon-hand-right">
				
				<input type="text" name="usermenu" value="<%=menuTemp.getMenu() %>" readonly
				 style="border:none;"></h3>
				 <hr>
				 
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-th-list"></span></div>
				 <div class="col-sm-3">
			<p align="left" >
				Kind  </p></div>
				 <div class="col-sm-6">
				<input type="text" name="userkinds" value="<%=menuTemp.getKinds() %>" readonly
				class="form-control" placeholder="<%=menuTemp.getKinds() %>" >
				</div></div>
				<br>
			
				 
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-usd"></span></div>
				 <div class="col-sm-3">
				<p align="left">
				Price </p></div>
				 <div class="col-sm-6">
				<input type="text" name="userprice" value="<%=menuTemp.getPrice() %>" readonly
				class="form-control" placeholder="<%=menuTemp.getPrice() %>">
				</div></div>
				
			<c:if test="${temp.kinds eq 'Coffee' }">
			   <br>
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-object-align-left">
				 </span></div>
				 <div class="col-sm-3">
				<p align="left">
					Size</p></div>
					 <div class="col-sm-6">
					 <select name="option1"class="form-control">
					 
							<option value="Size = Tall" selected="selected">Tall</option>
							<option value="Size = Grande">Grande</option>
							<option value="Size = Venti">Venti</option>
							</select>	</div></div>
			
				
				 <br>
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-glass">
				 </span></div>
				 <div class="col-sm-3">
				<p align="left">
					Shot</p></div>
					 <div class="col-sm-6">
					 <select name="option2" class="form-control">
								<option value="Shot = 1" selected="selected">1</option>
								<option value="Shot = 2">2</option>
								<option value="Shot = 3">3(MAX)</option>
							</select></div></div>
				
				 <br>
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-apple">
				 </span></div>
				 <div class="col-sm-3">
				<p align="left">
					Syrup</p></div>
					 <div class="col-sm-6">
					 <input type="radio" name="option3" value="Syrup = なし" checked>なし&nbsp;&nbsp;
							<input type="radio" name="option3" value="Syrup = Vanilla" >Vanilla&nbsp;
							<input type="radio" name="option3" value="Syrup = Caramel">Caramel&nbsp;&nbsp;&nbsp;
							<input type="radio" name="option3" value="Syrup = Hazlnet">Hazlnet&nbsp;
							<input type="radio" name="option3" value="Syrup = Maple"  >Maple&nbsp; 
				</select></div></div>
				
				
				
				 <br>
				 <div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-heart">
				 </span></div>
				 <div class="col-sm-3">
				<p align="left">
					Whipping</p></div>
					 <div class="col-sm-6">
					 <select name="option4"class="form-control">
							<option value="whipping = N" selected="selected">なし</option>
							<option value="whipping = Y">あり</option>
							</select>
							</div></div>
			
				<input type="hidden" name="option5" value="n">
			</c:if>
			<c:if test="${temp.kinds eq 'Juice' }">
			<br>
				<div class="row">
				 <div class="col-sm-3"><span class="glyphicon glyphicon-object-align-left">
				 </span></div>
				 <div class="col-sm-3">
				<p align="left">
					Size</p></div>
					 <div class="col-sm-6">
					 <select name="option1"class="form-control">
					 
							<option value="Size = Tall" selected="selected">Tall</option>
							<option value="Size = Grande">Grande</option>
							<option value="Size = Venti">Venti</option>
							</select>	</div></div>
				
				<input type="hidden" name="option2" value="n">
				<input type="hidden" name="option3" value="n">
				<input type="hidden" name="option4" value="n">
				<input type="hidden" name="option5" value="n">
			</c:if>
			
			<c:if test="${temp.kinds eq 'Sandwich' }">
				<input type="hidden" name="option1" value="n">
				<input type="hidden" name="option2" value="n">
				<input type="hidden" name="option3" value="n">
				<input type="hidden" name="option4" value="n">
				<input type="hidden" name="option5" value="n">
			</c:if>
			<c:if test="${temp.kinds eq 'Cake' }">
				<input type="hidden" name="option1" value="n">
				<input type="hidden" name="option2" value="n">
				<input type="hidden" name="option3" value="n">
				<input type="hidden" name="option4" value="n">
				<input type="hidden" name="option5" value="n">
			</c:if>
			<c:if test="${temp.kinds eq 'Affogato' }">
				<input type="hidden" name="option1" value="n">
				<input type="hidden" name="option2" value="n">
				<input type="hidden" name="option3" value="n">
				<input type="hidden" name="option4" value="n">
				<input type="hidden" name="option5" value="n">
			</c:if>
			 <br>
				 <div class="row">
				 <div class="col-sm-3"><span class="	glyphicon glyphicon-envelope">
				 </span></div>
				 <div class="col-sm-3">
			<p align="left">
					メモ</p></div>
					 <div class="col-sm-6">
					<input type="text"  name = "memo" width="200" height="500"class="form-control">
				<br><br></div></div>
				<p align="center">
					<c:if test="${!empty user}">
					<input type="submit" value="オーダー" class="btn btn-warning">&nbsp;&nbsp;
					</c:if>
					<input type="button" value="戻る" onclick="javascript:history.go(-1)"class="btn btn-warning">
				</p>
				</div>
				<div class="col-sm-1"></div>
				</div>
		</form>
	</c:if>
</body>
</html>