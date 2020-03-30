package com.siren.dao;

import static com.siren.db.JdbcUtils.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.siren.bean.CafeMenuBean;
public class MenuDAO {
	private MenuDAO(){}
	private static MenuDAO instance=new MenuDAO();
	public static MenuDAO getInstance(){
		return instance;
	}
	//All list Menu
	public ArrayList<CafeMenuBean> showAllMenu(){
		ArrayList<CafeMenuBean> list=new ArrayList<CafeMenuBean>();
		String sql="select * from cafemenu";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				CafeMenuBean menu=new CafeMenuBean(rs.getString("kinds"),
													rs.getString("menu"),
													rs.getInt("price")
													);
				list.add(menu);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs!=null)close(rs);
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
		return list;
	}
	//show Menu for Category
	public ArrayList<CafeMenuBean> showMenuForCategory(String category){
		ArrayList<CafeMenuBean> temp=new ArrayList<CafeMenuBean>();
		String sql="select * from cafemenu where kinds=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, category);
			rs=pstmt.executeQuery();
			while(rs.next()){
				CafeMenuBean menu=new CafeMenuBean(rs.getString("kinds"),
											rs.getString("menu"),
											rs.getInt("price")
											);
				temp.add(menu);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs!=null)close(rs);
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
		return temp;
	}
	//getOneMenu
	public CafeMenuBean getOneMenu(String menu){
		CafeMenuBean temp=null;
		String sql="select * from cafemenu where menu=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, menu);
			rs=pstmt.executeQuery();
			while(rs.next()){
				temp=new CafeMenuBean(rs.getString("kinds"),
										rs.getString("menu"),
										rs.getInt("price")
										);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs!=null)close(rs);
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
		return temp;
	}
	
	//insert Menu
	public void insertMenu(CafeMenuBean newMenu){
		String sql="insert into cafemenu values(?,?,?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, newMenu.getKinds());
			pstmt.setString(2, newMenu.getMenu());
			pstmt.setInt(3, newMenu.getPrice());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs!=null)close(rs);
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	//delete Menu
	public void deleteMenu(String menuName){
		String sql="delete from cafemenu where menu=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, menuName);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	//modify Menu
	public void modifyMenu(CafeMenuBean tempMenu){
		String sql="update cafemenu set kinds=?, price=? where menu=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, tempMenu.getKinds());
			pstmt.setInt(2, tempMenu.getPrice());
			pstmt.setString(3, tempMenu.getMenu());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
}