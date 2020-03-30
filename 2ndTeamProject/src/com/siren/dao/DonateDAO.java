package com.siren.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.siren.db.JdbcUtils.*;

public class DonateDAO {
	private DonateDAO(){}
	private static DonateDAO instance=new DonateDAO();
	
	public static DonateDAO getInstance(){
		return instance;
	}
	//기부금 추가하기
	public void donatePut(int donate){
		String sql="update donate set do_money=do_money+? where name='cuder'";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, donate);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	//기부금 가져오기
	public int donateGet(){
		String sql="select * from donate where name='cuder'";
		int do_total=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				do_total=rs.getInt("do_money");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)close(rs);
				if(pstmt!=null)close(pstmt);
				if(conn!=null)close(conn);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return do_total;
	}
	
}
