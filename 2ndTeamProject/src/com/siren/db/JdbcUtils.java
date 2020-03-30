package com.siren.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class JdbcUtils {
	public static Connection getConnection(){
		Connection conn=null;
		try{
			Context init =new InitialContext();
			Context env = (Context)init.lookup("java:/comp/env");
			DataSource ds=(DataSource)env.lookup("jdbc/sirenDB");
			conn=ds.getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn){
		try{
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt){
		try{
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstmt){
		try{
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs){
		try{
			rs.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void commit(Connection conn){
		try{
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void rollback(Connection conn){
		try{
			conn.rollback();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
