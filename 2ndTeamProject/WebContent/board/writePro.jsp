<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "com.siren.bean.MemberBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="https://fonts.googleapis.com/earlyaccess/roundedmplus1c.css" rel="stylesheet" />
		<link href="https://fonts.googleapis.com/earlyaccess/roundedmplus1c.css" rel="stylesheet" />
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
	
		<style>
		body{
		.wf-roundedmplus1c { font-family: "Rounded Mplus 1c"; }
		}
		</style>
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//한글처리
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			//요청처리
			MemberBean userr = (MemberBean)session.getAttribute("user");
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String userid=userr.getId();
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "siren";
			String password = "1234";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = "insert into board values(num_seq.nextval, ?, ?, ?,?, 0, sysdate)";
			
			try{
				// 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// DB 연동 
				conn = DriverManager.getConnection(url, user, password);
				
				// 쿼리실행
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, writer);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				pstmt.setString(4, userid);
				pstmt.executeUpdate(); // 무조건 성공 가정..
				
				response.sendRedirect("listForm.jsp");
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(pstmt !=null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				
			}
			
		%>
	</body>
</html>