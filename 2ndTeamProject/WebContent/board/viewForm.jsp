<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
	String writer = null;
	String title = null;
	String content = null;
	int hit=0;
	Date writeday=null;
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name=viewport content="width=device-width, initial-scale=1">
		<link rel=stylesheet
			href=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css>
		<script
			src=https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js></script>
		<script
			src=https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js></script>
		<link href="https://fonts.googleapis.com/earlyaccess/roundedmplus1c.css"
			rel="stylesheet" />
		<link
			href="http://cdn.syncfusion.com/15.1.0.41/js/web/bootstrap-theme/ej.web.all.min.css"
			rel="stylesheet" />
		<link href="https://fonts.googleapis.com/earlyaccess/roundedmplus1c.css"
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
	        $("#content").ejRTE({ width: "100%" });
	        $("#Btn").ejButton({ width: "100px", height: "40px" });
	    });
	    
	    function goUrl(url){
	    	location.href=url;
	    }
    </script>
		<title>Insert title here</title>
		<style type="text/css">
		
		body{
			.wf-roundedmplus1c { font-family: "Rounded Mplus 1c"; }
			}
	
		.button{
		text-align:right;
		}
		.btn.btn-default {
		color: #ffffff;
		background-color: #c8c8c8;
		background-image: linear-gradient(to bottom, #c8c8c8, #c8c8c8);
		border-color: #c8c8c8 #c8c8c8 #c8c8c8;
		}
			
		 .b{
		margin:10px;
		width:1140px;
		height:30px;
		margin-top:60px;
		} 
		
		.blank2 {
		width: 1140px;
		height: 20px;
		}

		.form-group {
			text-align: right;
			padding-right: 150px;
		}
		
		.blank {
			width: 1140px;
			height: 20px;
		}
	
		
	    .accent {
	      font-size:20px;
	      color:red;
	      font-weight:bold;
	     }      
		.c{
		    width: 1140px;
			height: 75px;
			background-color: #E9E4FF;
			padding: 25px;
		}
		.date{
		font-size : 14px;
		}
		
		.content{
		padding:20px;
		height:auto;
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
		
		conn = DriverManager.getConnection(url, user, password);
				String sql = "select * from board where num = ?";
				String sqlUpdate="update board set hit=hit+1 where num=?";
	%>
		<c:if test="${user.grade eq 'admin'}">
			<%
				pstmt= conn.prepareStatement(sqlUpdate);
				pstmt.setInt(1,Integer.parseInt(request.getParameter("num")));
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
				
				rs = pstmt.executeQuery();
				
				if(rs.next()){
					writer = rs.getString("writer");
					title = rs.getString("title");
					content = rs.getString("content");
					int hit=rs.getInt("hit");
				}
				rs.close();
				pstmt.close();
				conn.close();
			%>
		<form action = "UpdatePro.jsp" method = "post">
		     <marquee behavior="alternate" scrolldelay="200" direction="right">
			<span class="accent">-------------管理者専用ページです。-------------</span></marquee>
			<div class="container" style="width:auto;">
			<img src="/siren/images/notice.jpg" style="margin-left:10%;">
			<div class="blank2"></div>
			<div class="blank"></div>
				<div class="col-lg-12" id="Comments">
					<div class="form-horizontal" style="padding-top: 25px;">
					<div class="form-group">
							<label for="name" class="col-sm-2 control-label">NO</label>
						<div class="col-sm-10">
						${param.num}<input type = "hidden" class="form-control" name = "num" value = "${param.num}">
							</div>
					</div>
					<div class="form-group">
						<label for="emailID" class="col-sm-2 control-label">TITLE</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="title" name="title"
								placeholder="title" value="<%=title %>">
						</div>
					</div>
					<div class="form-group">
						<label for="comments" class="col-sm-2 control-label">CONTENT</label>
						<div class="col-sm-10">
							<textarea type="text" class="form-control" id="content" name="content"
							><%=content %></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
															
								<input type="submit" class="btn btn-default" value="修正">
								<input type = "button" class="btn btn-default" value = "削除" onclick="location.href='DeletePro.jsp?num=${param.num}'">
														
								<input type="reset" class="btn btn-default" value="消す">
								 <input type="button" class="btn btn-default" value="リスト"
								onclick="goUrl('listForm.jsp')">
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
		<c:if test="${user.grade ne 'admin' }">
		<%
				pstmt= conn.prepareStatement(sqlUpdate);
				pstmt.setInt(1,Integer.parseInt(request.getParameter("num")));
				pstmt.executeUpdate();
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));

				rs = pstmt.executeQuery();
				if(rs.next()){
					writer = rs.getString("writer");
					title = rs.getString("title");
					content = rs.getString("content");
				    writeday=rs.getDate("writeday");
					int hit=rs.getInt("hit");
				}
				rs.close();
				pstmt.close();
				conn.close();
			%>
			<div class="container">
				<h2><img src="/siren/images/notice.jpg"></h2>
					<div class="blank2"></div>
					<div class="balnk"></div>
					<h3 class="date"><%=writeday %></h3>
					<img src="/siren/images/line.jpg">
					<h2><%=title %></h2>
					<img src="/siren/images/line.jpg">
					<div class="content"><%=content %></div>
					<img src="/siren/images/line.jpg">
			<div align=right
				style="position: absolute; y-index: 3; right: 5%; margin-left: 0px; margin-top: 0px; border: 0px;">
				<input type="button" class="btn btn-default" value="リスト"
					onclick="goUrl('listForm.jsp')">
			</div>
		</div>
		</c:if>
	</body>
</html>