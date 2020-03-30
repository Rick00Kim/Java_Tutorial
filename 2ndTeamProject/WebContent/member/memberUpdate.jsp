<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会員管理</title>
<script type="text/javascript" scr="/siren/script/member.js">
</script>
<script type="text/javascript">
function deleteMessage(userid){
	if(confirm("会員情報を削除しますか？？")==true){
		location.href="/siren/memberdelete.do?id="+userid;
	}else{
	}
}
</script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/siren/main/project/css/style.css">

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
 width:500px; height:500px; border:5px ; position:absolute; top:0; right:0; bottom:0; left:0; margin:auto;

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

	<div class="aaa" align="center">
	<form action="/siren/memberUpdate.do" method="post" name="frm">
              <h4>会員修正</h4>
              <label align="left"><span class="glyphicon glyphicon-heart"></span>
              NAME<input type="text" class="form-control" name="name" value="${user.name}" readonly></label><br>
              
              <label align="left"><span class="glyphicon glyphicon-user"></span>
              ID<input type="text" class="form-control" name="id" id="id"value="${user.id}" readonly></label>
              
              <input type = "hidden" name = "reid" size ="20"><br>
              
              <label align="left"><span class="glyphicon glyphicon-lock"></span> 
              PW<input type="password" class="form-control" name="pw"></label><br>
              
              <label align="left"><span class="glyphicon glyphicon-heart"></span>
              BIRTH<input type="text" class="form-control" name="birth" value="${user.birth}" ></label><br>
              
              <label align="left"><span class="glyphicon glyphicon-heart"></span>
              EMAIL<input type="email" class="form-control" name="email"value="${user.email}" ></label><br>
              
              <label align="left"><span class="glyphicon glyphicon-phone"></span>
              PHONE<input type="tel" class="form-control" name="phone" value="${user.phone}" ></label>
              
             <br>
              <button type="submit" class="btn "onclick="return joinCheck();">修正
                <span class="glyphicon glyphicon-ok"></span>
              </button>
              <button type="button" class="btn "onclick="return deleteMessage('${user.id}');">削除
                <span class="glyphicon glyphicon-remove"></span>
              </button>
</form>
            </div>
</body>
</html>