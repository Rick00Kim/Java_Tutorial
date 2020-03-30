<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cuder</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="/main/project/css/style.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

			<a class="navbar-brand" href="/main/main.jsp"> <img
				src="/main/project/img/logo.png" alt="" class="img-responsive">
			</a>
		</div>

		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">

				<li><a href="/board/listForm.jsp">お知らせ</a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> メニュー紹介</a>
					<ul class="dropdown-menu">
						<li><a href="/menulist.do">注文する</a></li>
						<li><a href="/orderlist.do">注文照会</a></li>
					</ul>
				</li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> 顧客ページ</a>
					<ul class="dropdown-menu">
						<li><a href="/board/questionAnswer.jsp">Q&A</a></li>
						<li><a href="/board2/board.jsp">お客様の声</a></li>
					</ul>
				</li>
				<c:if test="${user.grade eq 'admin' }">
					<li><a href="/showallmember.do">お客様管理</a></li>
				</c:if>
				<c:if test="${user.grade eq 'client'}">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="/member/memberUpdate.jsp"> マイページ</a>
						<ul class="dropdown-menu">
							<li><a href="/member/memberUpdate.jsp">私の情報管理(修正・脱退)</a></li>
						</ul>
					</li>
				</c:if>
				
				<li><c:if test="${empty user}">
						<li><a href="/member/login.jsp">ログイン</a></li>
					</c:if></li>
				<li><c:if test="${!empty user}">
						<li><a href="/logout.do">ログアウト</a></li>
					</c:if>
				</li>
			</ul>
		</div>
	</div>
	</nav>
	<div style="width: auto; height: 60px;"></div>
 	<!-- Container (The Band Section) -->
	<div id="preview" class="container-fluid text-center">
		<div class="embed-responsive embed-responsive-16by9">
			<iframe width="560" height="315"
				src="https://www.youtube.com/embed/4gK_tZgVrlQ?&amp;autoplay=1&amp;loop=1;playlist=4gK_tZgVrlQ&amp&rel=0&controls=0&showinfo=0ps=blogger;"
				frameborder="0" allowfullscreen></iframe>
		</div>
	</div>
	<div class="container text-center" id="main">
		<br>
		<h1>WE'RE CUDER</h1>
		<br>
		<p>
			<em>コーヒーの楽しさを作る ‘cuder’ </em>
		</p>
		<p>
			<em>cuderは平凡にして軽い日常の中で選択をして喜んで収容する健康で豊かな人生を志向します。</em>
		</p>
		<p>
			<em>あなたにはいつでも訪ねて休むことができるplaceがありますか。</em>
		</p>
		<p>
			<em>忙しい日常の中に疲れたお客様たちに休んで対話を分かち合い、新たなことができたリラックスして良い味と空間を提供する</em>
		</p>
		<p>
			<em>注文サービスブランドです。</em>
		</p>
		<p>
			<em>cuderは、誰でもいつでも自由に日常の楽しさを感じながら時間を送れるように地道な開発と管理を通じて </em>
		</p>
		<p>
			<em>顧客の持続的な満足を向けて努力しています。</em>
		</p>
		<br> <br> <br>
	</div>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="2" class="active"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="/main/project/img/main1.png" alt="New York" width="1200"
					height="700">
				<div class="carousel-caption">
					<h3>もう全てのメニューをクーダーで!</h3>
					<p>
						<a href="/menulist.do">メニューを見る</a>
					</p>
				</div>
			</div>

			<div class="item">
				<img src="/main/project/img/5.jpg" alt="Chicago" width="1200"
					height="700">
				<div class="carousel-caption">
					<h3>私の手の中の簡便なカフェ</h3>
					<p>
						<a href="/menulist.do">注文する</a>
					</p>
				</div>
			</div>

			<div class="item">
				<img src="/main/project/img/3.jpg" alt="Los Angeles" width="1200"
					height="700">
				<div class="carousel-caption">
					<br>
					<h3>まだ会員はありませんか。</h3>
					<p>
						もっと多くの恩恵を享受してください!<a href="/member/join.jsp">会員加入する</a>
					</p>
					<br>
				</div>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span class="sr-only">Next</span>
		</a>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-3" id="intro">
				<div class="thumbnail">
					<img src="/main/project/img/icon1.png" alt=""
						style="width: 50%">
					<div class="caption">
						<p>クーダーの飲料を確認して私だけの飲料を作ることができます。</p>
					</div>
					<a href=“#”></a>
				</div>
			</div>

			<div class="col-md-3" id="intro">
				<div class="thumbnail">
					<img src="/main/project/img/icon2.png" alt=""
						style="width: 50%">
					<div class="caption">
						<p>注文書を管理してクーダーカードで決済をすることができます。</p>
					</div>
					<a href="" target="_blank"></a>
				</div>
			</div>
			<div class="col-md-3" id="intro">
				<div class="thumbnail">
					<img src="/main/project/img/icon3.png" alt=""
						style="width: 50%">

					<div class="caption">
						<p>
							保存された私だけの飲料を確認して手軽に注文することができます。 <a href="#" target="_blank"></a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-3" id="intro">
				<div class="thumbnail">
					<img src="/main/project/img/icon4.png" alt=""
						style="width: 50%">
					<div class="caption">
						<p>注文を配信しての決済や送信内訳を確認することができます。</p>
					</div>
					<a href="" target="_blank"></a>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<a href="/member/join.jsp"><img src="/main/project/img/ima.jpg" alt=""
					class="img-responsive"></a>
			</div>
			<div class="col-md-6">
				<a href="/donateget.do"><img src="/main/project/img/kibu.jpg" alt=""
					class="img-responsive"></a>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<a href="/board/viewForm.jsp?num=1"><img src="/main/project/img/sagas.jpg" alt=""
					class="img-responsive"></a>
			</div>
			<div class="col-md-6">
				<a href="/menulist.do"><img src="/main/project/img/cafe.jpg" alt=""
					class="img-responsive"></a>
			</div>
		</div>
	</div>

	<!-- Container (Contact Section) -->
	<div id="contact" class="container">
		<h3 class="text-center">連絡</h3>
		<p class="text-center">
			<em>私たちは連絡を待ちます。</em>
		</p>
		<div class="row">
			<div class="col-md-4">
				<p>大田(テジョン),フィヤングビル</p>
				<p>Phone: +82 966-9666</p>
				<p>
					Email: <a href="#">cuder@cuder.com</a>
				</p>
			</div>
			<div class="col-md-8">
				<div class="row">
					<div class="col-sm-6 form-group">
						<input class="form-control" id="name" name="name"
							placeholder="Name" type="text" required>
					</div>
					<div class="col-sm-6 form-group">
						<input class="form-control" id="email" name="email"
							placeholder="Email" type="email" required>
					</div>
				</div>
				<textarea class="form-control" id="comments" name="comments"
					placeholder="Comment" rows="5"></textarea>
				<br>
				<div class="row">
					<div class="col-md-12 form-group">
						<button class="btn pull-right" type="submit">Send</button>
					</div>
				</div>
			</div>
			</div>
		<br>
		<h3 class="text-center">社員紹介</h3>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">社長</a></li>
			<li><a data-toggle="tab" href="#menu1">エンジニア</a></li>
			<li><a data-toggle="tab" href="#menu2">翻訳家</a></li>
			<li><a data-toggle="tab" href="#menu3">フロントデザイナー</a></li>
			<li><a data-toggle="tab" href="#menu4">サービスコーダー</a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<div class="row">
					<div class="col-sm-4 form-group">
						<img src="/main/project/img/yeon.jpg" alt=""
							class="img-responsive" style="margin-top: 15px">
					</div>
					<div class="col-sm-8 form-group">
						<center style="margin-top: 50px">
							<h2>社長</h2>
							<p>私はイアヒョンです。</p>
							<p>私はチームで会員加入、開発書を担当しているキム・ウィヨンと申します。</p>
						</center>
					</div>
				</div>
			</div>
			<div id="menu1" class="tab-pane fade">
				<div class="row">
					<div class="col-sm-4 form-group">
						<img src="/main/project/img/cu.jpg" alt=""
							class="img-responsive" style="margin-top: 15px">
					</div>
					<div class="col-sm-8 form-group">
						<center style="margin-top: 30px">
							<h2>エンジニア</h2>
							<p>私はクーダーで開発者を担当しています。</p>
							<p>私のすべての考えは羅勲児を通じて出ています。私は羅勲児が好きです。</p>
							<p>
								気になるのでしたらここをクリックしてください。<a href="https://youtu.be/IJM8kRMrUVI">click</a>
							</p>
							<p>私は世の中を変えたいです。</p>
						</center>
					</div>
				</div>
			</div>
			<div id="menu2" class="tab-pane fade">
				<div class="row">
					<div class="col-sm-4 form-group">
						<img src="/main/project/img/minji.jpg" alt=""
							class="img-responsive" style="margin-top: 15px">
					</div>
					<div class="col-sm-8 form-group">
						<center style="margin-top: 50px">
							<h2>翻訳家</h2>
							<p>私はキムミンジです。</p>
							<p>私はチームで日本語の翻訳とご意見、</p>
							<p>ご要望の掲示板を担当しているキムミンジと申します。</p>
						</center>
					</div>
				</div>
			</div>
			<div id="menu3" class="tab-pane fade">
				<div class="row">
					<div class="col-sm-4 form-group">
						<img src="/main/project/img/ahhyun.jpg" alt=""
							class="img-responsive" style="margin-top: 15px">
					</div>
					<div class="col-sm-8 form-group">
						<center style="margin-top: 50px">
							<h2>フロントデザイナー</h2>
							<p>私はイアヒョンです。</p>
							<p>cuderでマーケティングおよびデザイン部分に対する全体的な業務を担当しています。</p>
						</center>
					</div>
				</div>
			</div>
			<div id="menu4" class="tab-pane fade">
				<div class="row">
					<div class="col-sm-4 form-group">
						<img src="/main/project/img/kibum.jpg" alt=""
							class="img-responsive" style="margin-top: 10px">
					</div>
					<div class="col-sm-8 form-group">
						<h2>サービスコーダー</h2>
						<p> 私はチョンキボムと申します。</p>
						<p>私はcuderで掲示板の管理を担当しています。</p>
					</div>
				</div>

			</div>
		</div>

		<!-- Footer -->
		<footer class="text-center"> <a class="up-arrow"
			href="#myPage" data-toggle="tooltip" title="TO TOP">
			<p>click to top</p>
		</a> <br>
		<br>
		<p>
			Made By 우리친하조 <a href="/main/main.jsp" data-toggle="tooltip"
				title="Visit website">www.cuder.com</a>
		</p>
		<p>© Copyright cuder 2017 All rights reserved.Website by Plato
			Creative Terms and Conditions and Privacy Policy</p>
		</footer>
</body>
</html>
