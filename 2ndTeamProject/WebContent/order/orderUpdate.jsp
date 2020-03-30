<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/siren/script/order.js"></script>
	<style>
	.container{
	margin:10px;
	}
	</style>
	</head>
<body>
	<c:if test="${chk eq 1 }">
		<script>updateOX();</script>
	</c:if>
	<div class="container">
		<legend>注文修正</legend>
		<div class="col-sm-4">
			<img alt="${getOrder.menu }"
				src="/siren/images/menuImages/${getOrder.menu }.jpg">
		</div>
		<div class="col-sm-8">
			<form class="well form-horizontal" action="/siren/ordermodify.do" method="post">
				<fieldset>
					<input name="order_num" value="${getOrder.order_num }"
						class="form-control" type="hidden">
					<div class="form-group">
						<label class="col-md-4 control-label">メニュー名</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-hand-right"></i></span> <input name="menu"
									value="${getOrder.menu }" class="form-control" type="text"
									readonly>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">金額</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-usd"></i></span> <input name="price"
									value="${getOrder.price }" class="form-control" type="text"
									readonly>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">オプション１</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-chevron-right"></i></span> <input
									name="option1" placeholder="オプション１"
									value="${getOrder.option1 }" class="form-control" type="text">
							</div>
						</div>
					</div>

					<!-- Text input-->

					<div class="form-group">
						<label class="col-md-4 control-label">オプション２</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-chevron-right"></i></span> <input
									name="option2" placeholder="オプション２"
									value="${getOrder.option2 }" class="form-control" type="text">
							</div>
						</div>
					</div>

					<!-- Text input-->

					<div class="form-group">
						<label class="col-md-4 control-label">オプション３</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-chevron-right"></i></span> <input
									name="option3" placeholder="オプション３"
									value="${getOrder.option3 }" class="form-control" type="text">
							</div>
						</div>
					</div>



					<!-- Text input-->

					<div class="form-group">
						<label class="col-md-4 control-label">オプション４</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-chevron-right"></i></span> <input
									name="option4" placeholder="オプション４"
									value="${getOrder.option4 }" class="form-control" type="text">
							</div>
						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label">オプション５</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-chevron-right"></i></span> <input
									name="option5" placeholder="オプション５"
									value="${getOrder.option5 }" class="form-control" type="text">
							</div>
						</div>
					</div>

					<!-- radio checks -->


					<!-- Text area -->

					<div class="form-group">
						<label class="col-md-4 control-label">メモー</label>
						<div class="col-md-4 inputGroupContainer">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-pencil"></i></span>
								<textarea class="form-control" name="memo" placeholder="メモー">${getOrder.memo }</textarea>
							</div>
						</div>
					</div>


					<!-- Button -->
					<div class="form-group">
						<label class="col-md-4 control-label"></label>
						<div class="col-md-4">
							<button type="submit" class="btn btn-warning" >
								修正 <span class="glyphicon glyphicon-ok"></span>
							</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>