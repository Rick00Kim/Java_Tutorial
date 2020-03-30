package com.siren.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.siren.bean.MemberBean;

import static com.siren.db.JdbcUtils.*;

public class MemberDAO {
	private MemberDAO() {
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	// Get All Member
	public ArrayList<MemberBean> selectAllMember() {
		String sql = "select * from member";
		ArrayList<MemberBean> temp = new ArrayList<MemberBean>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberBean member = new MemberBean(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("phone"), rs.getString("email"), rs.getDate("birth"), rs.getString("grade"));
				temp.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				close(rs);
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
		return temp;
	}

	// insert Member
	public int insertMember(MemberBean newMem) {
		String sql = "insert into member(id,password,name,phone,email,birth) values(?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newMem.getId());
			pstmt.setString(2, newMem.getPassword());
			pstmt.setString(3, newMem.getName());
			pstmt.setString(4, newMem.getPhone());
			pstmt.setString(5, newMem.getEmail());
			pstmt.setDate(6, newMem.getBirth());
			pstmt.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
		return result;
	}

	// get one member
	public MemberBean getOneMember(String id) {
		String sql = "select * from member where id=?";
		MemberBean mem = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mem = new MemberBean(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("phone"), rs.getString("email"), rs.getDate("birth"), rs.getString("grade"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				close(rs);
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);

		}
		return mem;
	}

	// delete member
	public void deleteMember(String id) {
		String sql = "delete from member where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
	}

	// update member
	public void modifyMember(MemberBean temp) {
		String sql = "update member set name=?,password=?,phone=?,email=? where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, temp.getName());
			pstmt.setString(2, temp.getPassword());
			pstmt.setString(3, temp.getPhone());
			pstmt.setString(4, temp.getEmail());
			pstmt.setString(5, temp.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
	}

	// check id
	public int checkID(String id) {
		int result = -1;
		String sql = "select id from member where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	// login check
	public int userCheck(String id, String pass) {
		String sql = "select password from member where id=?";
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString("password").equals(pass)) {
					result = 1;
				} else {
					result = 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				close(rs);
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
		return result;
	}

	// check nickname
	public boolean checkNickname(String userNickname) {
		String sql = "select name from member where nickname=?";
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userNickname);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				close(rs);
			if (pstmt != null)
				close(pstmt);
			if (conn != null)
				close(conn);
		}
		return result;
	}
}
