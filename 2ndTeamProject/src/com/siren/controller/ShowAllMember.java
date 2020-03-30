package com.siren.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.MemberBean;
import com.siren.dao.MemberDAO;
@WebServlet("/showallmember.do")
public class ShowAllMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		MemberDAO mdao=MemberDAO.getInstance();
		ArrayList<MemberBean> list=mdao.selectAllMember();
		
		req.setAttribute("list", list);
		RequestDispatcher rdp=req.getRequestDispatcher("member/showAllMember.jsp");
		rdp.forward(req, resp);
	}
}
