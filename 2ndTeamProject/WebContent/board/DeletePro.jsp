<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/earlyaccess/roundedmplus1c.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
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
				
				
				
				String sql = "delete from board where num=?";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection(url, user, password);
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
				
				pstmt.executeQuery();
				

				
				pstmt.close();
				conn.close();
				response.sendRedirect("listForm.jsp");
			%>
			
			

</body>
</html>