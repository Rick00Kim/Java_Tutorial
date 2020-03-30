<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style media="screen">
  body {
    font: 400 15px/1.8 Lato, sans-serif;

    }
    #top{
      margin-top: 150px;
    }
    #box{
      margin:  0 auto;
    }
  </style>
<title>Insert title here</title>
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
		int total = Integer.parseInt(request.getParameter("order_total"));
		int donate = total/10;
	%>
  <center>
    <div class="row">
      <div class="col-sm-12" id = "top">
      <h3>ドネーションした金額はクーダを利用しているお客様の中でいつでも自由にコーヒーを利用するように提供します。</h3>
    </div>
  </div>
</center>
    <div class="row" id = "box">
           <div class="col-sm-2" ></div>
           <div class="col-sm-2" ><h5>注文金額</h5></div>
           <div class="col-sm-2" ><h5><%=total %></h5>
           </div>

       <div class="col-sm-2" >
         <p>* 10% = </p>
       </div>
       <div class="col-sm-2" >
         <p><%=donate %>ウォン</p></div>

        <div class="col-sm-2" >
          </div>
      </div>
      <center>
        <div class = "container">
        <button type="button" class="btn btn-primary" onclick="location.href='/siren/donateput.do?donate=<%=donate%>'">基部する</button>
        <button type="button" class="btn btn-primary active">キャンセル</button>
          </div>
      <div class="row">
        <div class="col-sm-12" id = "">
      <img src="/siren/images/givedouble.gif" alt=""  class="img-responsive" >
      </div>
    </div>
  </center>

</body>
</html>