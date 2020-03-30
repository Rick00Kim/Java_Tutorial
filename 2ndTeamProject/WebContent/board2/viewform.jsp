<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.siren.bean.MemberBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%!int num = 0;
	String title = null;
	String email = null;
	String content = null;
	int hit = 0;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1, minium-scale=1,
          maxium-scale=1,user-scalable=no">
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
	<link rel=stylesheet
	href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css>
<script
	src=https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
<script
	src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js></script>

<script>
	$(function() {
		$("#content").ejRTE({
			width : "98%"
		});

		$("#Btn").ejButton({
			width : "100px",
			height : "40px"
		});

	});
</script>
<title></title>


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

.blank2 {
	width: 1140px;
	height: 30px;
}

.form-group {
	text-align: right;
	padding-right: 150px;
}

.accent {
	font-size: 20px;
	color: red;
	font-weight: bold;
}

.blank {
	width: 1140px;
	height: 30px;
}

.content {
	margin: 0 auto;
	width: 50%;
	height: 300px;
}

.no {
	font-size: 12px;
}

.content2 {
	padding: 20px;
}
</style>
<script type="text/javascript">
	function goUrl(url) {
		location.href = url;
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
		<%
			//1. 한글처리
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset = utf-8");

				//3. 비즈니스 로직
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "siren";
				String password = "1234";

				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;

				String sql = "select * from board2 where num2 = ?";
				String sqlUpdate = "update board2 set hit=hit+1 where num2=?";

				Class.forName("oracle.jdbc.driver.OracleDriver");

				conn = DriverManager.getConnection(url, user, password);

				pstmt = conn.prepareStatement(sqlUpdate);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num2")));

				pstmt.executeUpdate();

				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num2")));

				rs = pstmt.executeQuery();

				if (rs.next()) {

					title = rs.getString("title");
					email = rs.getString("email");
					content = rs.getString("content");
					int hit = rs.getInt("hit");
				}
				rs.close();
				pstmt.close();
				conn.close();
		%>

		<form action="UpdatePro.jsp" method="post">
			<marquee behavior="alternate" scrolldelay="200" direction="right">
				<span class="accent">-------------管理者専用ページです。-------------</span>
			</marquee>
			<div class="container">
				<h2>
					<img src="/siren/images/opinion.jpg">
				</h2>
				<div class="b">
					<div class="blank2"></div>

					<div class="blank"></div>
				</div>
				<div class="col-lg-12" id="Comments">
					<div class="form-horizontal" style="padding-top: 25px;">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NO</label>
							<div class="col-sm-10">
								${param.num2}<input type="hidden" class="form-control"
									name="num2" value="${param.num2}">
							</div>
						</div>

						<div class="form-group">
							<label for="emailID" class="col-sm-2 control-label">TITLE</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="title" name="title"
									placeholder="title" value="<%=title%>">
							</div>
						</div>


						<div class="form-group">
							<label for="emailID" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="email"
									placeholder="email" name="email" value="<%=email%>">
							</div>
						</div>


						<div class="form-group">
							<label for="comments" class="col-sm-2 control-label">CONTENT</label>
							<div class="col-sm-10">
								<textarea type="text" class="form-control" id="content"
									name="content"><%=content%></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">

								<input type="submit" class="btn btn-default" value="修正">
								<input type="button" class="btn btn-default" value="削除"
									onclick="location.href='DeletePro.jsp?num2=${param.num2}'">


								<input type="button" class="btn btn-default" value="リスト"
									onclick="goUrl('board.jsp')">
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
		<%-- <footer class="text-center" >
	<jsp:include page="footer.jsp"></jsp:include>
</footer> --%>
		<marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span>
		</marquee>
	</c:if>

	<c:if test="${user.grade ne 'admin'}">


		<%
			//1. 한글처리
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset = utf-8");

				//3. 비즈니스 로직
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "siren";
				String password = "1234";

				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				String userid = null;
				String sessionId = null;
				MemberBean userr = (MemberBean) session.getAttribute("user");
				if (userr != null) {
					sessionId = userr.getId();
				}

				String sql = "select * from board2 where num2 = ?";
				String sqlUpdate = "update board2 set hit=hit+1 where num2=?";

				Class.forName("oracle.jdbc.driver.OracleDriver");

				conn = DriverManager.getConnection(url, user, password);

				pstmt = conn.prepareStatement(sqlUpdate);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num2")));

				pstmt.executeUpdate();

				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num2")));

				rs = pstmt.executeQuery();

				if (rs.next()) {
					num = rs.getInt("num2");
					title = rs.getString("title");
					userid = rs.getString("userid");
					content = rs.getString("content");
					int hit = rs.getInt("hit");

				}

				rs.close();
				pstmt.close();
				conn.close();
		%>
		<div class="b">
			<div id="container">

				<h2>
					<img src="/siren/images/opinion.jpg">
				</h2>
				<div class="blank2"></div>
				<!-- <div class="blank"></div> -->

				<!-- <form action="UpdatePro.jsp" method="post"> -->


				<div class="col-sm-offset-2 col-sm-10">
					<h3 class="no">
						NO.
						<%=num%></h3>
					<h2 class="title"><%=title%>-<%=userid%></h2>
					<img src="/siren/images/line2.jpg">

					<div class="content2">
						<%=content%>
					</div>
					<img src="/siren/images/line2.jpg">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<%
						if (userid.equals(sessionId)) {
					%>
					<input type="submit" class="btn btn-default" value="修正"> 
					<input	type="button" class="btn btn-default" value="削除"
						onclick="location.href='DeletePro.jsp?num2=${param.num2}'">
					<%
						}%>
					<input type="button" class="btn btn-default" value="リスト"
						onclick="javascript:history.go(-1)">
				</div>
			</div>
		</div>
	</c:if>
</body>
</html>