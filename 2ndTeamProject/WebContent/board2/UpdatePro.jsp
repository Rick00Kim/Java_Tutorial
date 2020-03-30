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
			//1. 한글처리
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset = utf-8");
				
				MemberBean userr=(MemberBean)session.getAttribute("user");
				String writer= userr.getName();
				String title = request.getParameter("title");
				String email = request.getParameter("email");
				String content = request.getParameter("content");

				//3. 비즈니스 로직
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "siren";
				String password = "1234";

				Connection conn = null;
				PreparedStatement pstmt = null;
				String sql = "update board2 set title=?,content=? where num2=?";

				try{
					// 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					// DB 연동 
					conn = DriverManager.getConnection(url, user, password);
					
					// 쿼리실행
					pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, title);
				pstmt.setString(2, content);
				pstmt.setInt(3, Integer.parseInt(request.getParameter("num2")));
				
				pstmt.executeUpdate(); // 무조건 성공 가정..
				
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