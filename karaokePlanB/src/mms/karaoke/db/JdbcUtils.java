package mms.karaoke.db;

import java.sql.*;

public class JdbcUtils {
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "my_karaoke";
		String password = "1234";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("DB 연동 실패");
			e.printStackTrace();
		}		
		return conn;
	}
	
	public static void close(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt){
		try {
			stmt.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt){
		try {
			pstmt.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs){
		try {
			rs.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	public static void commit(Connection conn){
		try {
			conn.commit();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn){
		try {
			conn.rollback();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}
