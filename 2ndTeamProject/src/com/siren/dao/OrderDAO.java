package com.siren.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.siren.bean.OrderBean;
 import static com.siren.db.JdbcUtils.*;
public class OrderDAO {
	private OrderDAO(){}
	private static OrderDAO instance=new OrderDAO();
	public static OrderDAO getInstance(){
		return instance;
	}
	//Admin Show All Order
	public ArrayList<OrderBean>  getAllOrder(){
		ArrayList<OrderBean> list=new ArrayList<OrderBean>();
		String sql="select * from ordertable order by order_num desc";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				OrderBean temp=new OrderBean(rs.getInt("order_num"),
											rs.getString("id"),
											rs.getString("menu"),
											rs.getString("kinds"),
											rs.getInt("price"),
											rs.getString("option1"),
											rs.getString("option2"),
											rs.getString("option3"),
											rs.getString("option4"),
											rs.getString("option5"),
											rs.getString("memo"),
											rs.getDate("orderdate")
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
	public OrderBean getOneOrder(int order_num) {
		String sql="select * from ordertable where order_num=?";
		OrderBean temp=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, order_num);
			rs=pstmt.executeQuery();
			if(rs.next()){
				temp=new OrderBean(rs.getInt("order_num"),
											rs.getString("id"),
											rs.getString("menu"),
											rs.getString("kinds"),
											rs.getInt("price"),
											rs.getString("option1"),
											rs.getString("option2"),
											rs.getString("option3"),
											rs.getString("option4"),
											rs.getString("option5"),
											rs.getString("memo"),
											rs.getDate("orderdate")
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
	//ID에 따른 주문서 호출
	public ArrayList<OrderBean> listOrderForID(String id){
		ArrayList<OrderBean> list = new ArrayList<OrderBean>();
		String sql="select * from ordertable where id=? and TO_CHAR(orderdate,'dd')=TO_CHAR(sysdate,'dd')";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()){
				OrderBean temp=new OrderBean(rs.getInt("order_num"),
												rs.getString("id"),
												rs.getString("menu"),
												rs.getString("kinds"),
												rs.getInt("price"),
												rs.getString("option1"),
												rs.getString("option2"),
												rs.getString("option3"),
												rs.getString("option4"),
												rs.getString("option5"),
												rs.getString("memo"),
												rs.getDate("orderdate")
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
	public int insertOrder(OrderBean temp){
		int rst=0;
		String sql="insert into ordertable values(order_num_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,sysdate)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, temp.getId());
			pstmt.setString(2, temp.getMenu());
			pstmt.setString(3, temp.getKinds());
			pstmt.setInt(4, temp.getPrice());
			pstmt.setString(5, temp.getOption1());
			pstmt.setString(6, temp.getOption2());
			pstmt.setString(7, temp.getOption3());
			pstmt.setString(8, temp.getOption4());
			pstmt.setString(9, temp.getOption5());
			pstmt.setString(10, temp.getMemo());
			pstmt.executeUpdate();
			rst=1;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
		return rst;
	}
	//Delete order
	public void deleteOrder(int num){
		String sql="delete from ordertable where order_num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
	}
	public int updateOrder(OrderBean temp){
		String sql="update ordertable set option1=?,option2=?,option3=?,option4=?,option5=?,memo=? where order_num=?";
		int chk=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, temp.getOption1());
			pstmt.setString(2, temp.getOption2());
			pstmt.setString(3, temp.getOption3());
			pstmt.setString(4, temp.getOption4());
			pstmt.setString(5, temp.getOption5());
			pstmt.setString(6, temp.getMemo());
			pstmt.setInt(7, temp.getOrder_num());
			pstmt.executeUpdate();
			chk=1;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null)close(pstmt);
			if(conn!=null)close(conn);
		}
		return chk;
	}
}
