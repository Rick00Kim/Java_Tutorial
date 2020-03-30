<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import ="com.siren.db.JdbcUtils.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%>
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
<title>Insert title here</title>
<style>
.pagination {
	display: block;
	text-align: center;
}

.pagination>li>a {
	float: none;
}

.search {
	width: 1140px;
	height: 75px;
	background-color: #FDF5E6;
	padding: 25px;
}

.search a {
	display: block;
}

.btn.btn-default {
	color: #ffffff;
	background-color: #c8c8c8;
	background-image: linear-gradient(to bottom, #c8c8c8, #c8c8c8);
	border-color: #c8c8c8 #c8c8c8 #c8c8c8;
}

th {
	text-align: center;
}

td {
	text-align: center;
}

.button {
	text-align: right;
}

.blank {
	width: 1140px;
	height: 30px;
}

.blank2 {
	width: 1140px;
	height: 20px;
}

.accent {
	font-size: 20px;
	color: red;
	font-weight: bold;
}


p{
text-align:center;
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

	<c:if test="${user.grade eq 'admin' }">

		<marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span>
		</marquee>

		<span class="notranslate" onmouseover="_tipon(this)" onmouseout="_tipoff()">
			<div class="container">
				<h2><img src="/siren/images/opinion.jpg"></h2>
				<div class="blank2"></div>
				<div align="right">
					<div class="search">
						<input type="text" name="search" id="search"
							placeholder="検索語を入力してください。" size="50" align="right">
						<button type="button" class="btn btn-default">検索</button>
					</div>

				</div>
				<div class="blank"></div>
				<table class="table table-hover">
					<tr>
						<th>番号</th>
						<th>作成者</th>
                        <th>タイトル</th>    
						<th>メール</th>
						<th>作成日</th>
					</tr>
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
							boolean check = false;

							String sql = "select * from board2 order by num2 desc";

							Class.forName("oracle.jdbc.driver.OracleDriver");

							conn = DriverManager.getConnection(url, user, password);

							pstmt = conn.prepareStatement(sql);
							rs = pstmt.executeQuery();

							while (rs.next()) {
								check = true;
					%>
					<tr>
						<td><%=rs.getInt("num2")%></td>
						<td><%=rs.getString("writer")%></td>
                         <td width="400"><a
							href="viewform.jsp?num2=<%=rs.getInt("num2")%>"><%=rs.getString("title")%></a></td>
						<td><%=rs.getString("email")%></td>
						<td><%=rs.getDate("writeday")%></td>
					</tr>
					<%
						}
							if (!check) {
					%>
					<tr>
						<td colspan="5">リストがないです。</td>
					</tr>
					<%
						}
							rs.close();
							pstmt.close();
							conn.close();
					%>
				</table>
				<div class="button">
						<input	type="button" class="btn btn-default" value="作成"
						onclick="goUrl('boardWriteForm.jsp')" />
				</div>
			</div>
		</span>

		<marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span>
		</marquee>
		<p>
			<img src="/siren/images/blue.jpg" style="opacity: 0.35"
				onmouseover="this.style.opacity='0.35'" weight="400" height="400" />
		</p>
	</c:if>
	
	<c:if test="${user.grade ne 'admin' }">
		<span class="notranslate" onmouseover="_tipon(this)"
			onmouseout="_tipoff()">
			<div class="container">
				<h2><img src="/siren/images/opinion.jpg"></h2>
				<div class="blank2"></div>
				<div align="right">
					<div class="search">
						<input type="text" name="search" id="search"
							placeholder="検索語を入力してください。" size="50" align="right">
						<button type="button" class="btn btn-default">検索</button>
					</div>
				</div>
				<div class="blank"></div>
				<table class="table table-hover">
					<tr>
						<th>番号</th>
						<th>作成者</th>
				        <th>タイトル</th>
				        <th>メール</th>
						<th>作成日</th>
					</tr>

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
							boolean check = false;

							String sql = "select * from board2 order by num2 desc";

							Class.forName("oracle.jdbc.driver.OracleDriver");

							conn = DriverManager.getConnection(url, user, password);
							pstmt = conn.prepareStatement(sql);
							rs = pstmt.executeQuery();

							while (rs.next()) {
								check = true;
					%>
					<tr>
						<td><%=rs.getInt("num2")%></td>
						<td><%=rs.getString("writer")%></td>
                  <td width="400"><a
							href="viewform.jsp?num2=<%=rs.getInt("num2")%>"><%=rs.getString("title")%></a></td>
						<td><%=rs.getString("email")%></td>
						<td><%=rs.getDate("writeday")%></td>
					</tr>
					<%
						}
							if (!check) {
					%>
					<tr>
						<td colspan="5">リストがないです。</td>
					</tr>
					<%
						}
							rs.close();
							pstmt.close();
							conn.close();
					%>
				</table>
				<div class="button">
						<input type="button" class="btn btn-default" value="作成"
						onclick="goUrl('boardWriteForm.jsp')" />
				</div>
			</div>
		</span>
		</c:if>
	</body>
</html>

