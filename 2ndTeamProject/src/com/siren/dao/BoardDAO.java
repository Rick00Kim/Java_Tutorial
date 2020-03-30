package com.siren.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.siren.bean.BoardBean;

import static com.siren.db.JdbcUtils.*;

public class BoardDAO {
	private BoardDAO(){}
	private BoardDAO instance=new BoardDAO();
	public BoardDAO getInstance(){
		return instance;
	}
	//Get All Board(Admin)
	public ArrayList<BoardBean> getAllBoardForPurpose(String purpose){
		ArrayList<BoardBean> list=new ArrayList<BoardBean>();
		String sql="select * from board where purpose=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, purpose);
			rs=pstmt.executeQuery();
			while(rs.next()){
				BoardBean temp=new BoardBean(rs.getInt("index_num"),
											rs.getString("kinds"),
											rs.getString("id"),
											rs.getString("title"),
											rs.getString("content"),
											rs.getInt("hit"),
											rs.getDate("writeday")
										);
				list.add(temp);
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
	//list for Kinds(Client)
	public ArrayList<BoardBean> listBoardForKinds(String kinds){
		String sql="select * from board group by kinds=? order by id desc";
		ArrayList<BoardBean> list=new ArrayList<BoardBean>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,kinds);
			rs=pstmt.executeQuery();
			while(rs.next()){
				BoardBean temp=new BoardBean(rs.getInt("index_num"),
											rs.getString("kinds"),
											rs.getString("id"),
											rs.getString("title"),
											rs.getString("content"),
											rs.getInt("hit"),
											rs.getDate("writeday")
											);
				list.add(temp);
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
	//insert Board
	public void insertBoard(BoardBean newBoard){
		String sql="insert into board values(NULL,?,?,?,?,NULL,curdate())";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, newBoard.getKinds());
			pstmt.setString(2,newBoard.getId());
			pstmt.setString(3, newBoard.getTitle());
			pstmt.setString(4, newBoard.getContent());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	//Delete Board
	public void deleteBoard(String index){
		String sql="delete from board where index_num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, index);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	//Modify Board
	public void modifyBoard(BoardBean newBoard){
		String sql="update board set title=?,content=? where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, newBoard.getTitle());
			pstmt.setString(2, newBoard.getContent());
			pstmt.setString(3, newBoard.getId());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	//get One Board
	public BoardBean getOneBoard(int index_num, String id, String kinds){
		String sql="select * from board where index_num=? and id=? and kinds=?";
		BoardBean temp=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, index_num);
			pstmt.setString(2, id);
			pstmt.setString(3, kinds);
			rs=pstmt.executeQuery();
			if(rs.next()){
				temp=new BoardBean(index_num,
									kinds,
									id,
									rs.getString("title"),
									rs.getString("content"),
									rs.getInt("hit"),
									rs.getDate("writeday")
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
	//Add Hit
	public void increaseHit(int index_num){
		String sql="update board set hit=hit+1 where index_num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, index_num);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
}
