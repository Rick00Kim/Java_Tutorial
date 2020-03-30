<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<title>Insert title here</title>
	
	<script type="text/javascript" src="/siren/script/member.js"></script>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="/siren/main/project/css/style.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
	 .btn {
	      padding: 5px 20px;
	      background-color: #333;
	      color: #f1f1f1;
	      border-radius: 0;
	      transition: .2s;
	  }
	  .btn:hover, .btn:focus {
	      border: 1px solid #333;
	      background-color: #fff;
	      color: #000;
	  }
	  .header{
	      background-color: #333;
	      color: #fff !important;
	      text-align: center;
	      font-size: 30px;
	  }
	  h4{
	    font-size: 40px;
	  }
	  .header, .body {
	      padding: 30px 50px;
	  }
	 
	 .aaa{
	 width:500px; height:500px; border:5px ; position:absolute; top:0; right:0; bottom:0; left:0; margin:auto;}
	 #join,id{
	 width: 43%;
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

	          <form action="/siren/join.do" method="post" name="frm">
            <div class="aaa">
              <h4>JOIN</h4>
              *ID重複チェックを必ずしてください。<br><br>
              NAME<input type="text" class="form-control" name="name" id="join"><br>
              <label>
              *ID<input type="text" class="form-control" name="id" id="id"></label>
              
              <input type = "hidden" name = "reid" size ="20">
              <input type ="button" class="btn btn-default btn-sm"  value = "重複チェック" onclick="idCheck()"><br>
              <br>
              
              PW<input type="password" class="form-control" name="pw" id="join"><br>
              
              
              BIRTH<input type="text" class="form-control" name="birth" placeholder="ex)19XX-01-01" id="join">&nbsp;
             
              EMAIL<input type="text" class="form-control" name="email" id="join"><br>
              
             
              PHONE<input type="text" class="form-control" name="phone" id="join" placeholder="-なし">
              
             <br>
              <button type="submit" class="btn "onclick="return joinCheck()">登録
                <span class="glyphicon glyphicon-ok"></span>
              </button>
            </div>
          </form>
</body>
</html>