<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import="com.siren.bean.MemberBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//한글처리
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			String writer = null;
			String userid = null;
			String email = null;
			
			//요청처리
			MemberBean userr=(MemberBean)session.getAttribute("user");
			if(userr!=null){
				
				writer= userr.getName();
				userid=userr.getId();
				email = userr.getEmail();
			
			}else{
				
				writer=request.getParameter("writer");
				userid="client";
				email=request.getParameter("email");
				
			}
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "siren";
			String password = "1234";
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = "insert into board2 values(num2_seq.nextval, ?, ?, ?, ?, 0, sysdate, ?)";
			
			try{
				// 드라이버 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// DB 연동 
				conn = DriverManager.getConnection(url, user, password);
				
				// 쿼리실행
				pstmt = conn.prepareStatement(sql);
				
			   pstmt.setString(1,writer);
				pstmt.setString(2, title);
				pstmt.setString(3, content);
				pstmt.setString(4, userid);
				pstmt.setString(5, email);
				
				pstmt.executeUpdate();
				
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
			response.sendRedirect("board.jsp");
		%>
	</body>
</html>