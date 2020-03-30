package com.siren.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siren.bean.MemberBean;
import com.siren.bean.OrderBean;
import com.siren.dao.OrderDAO;
@WebServlet("/orderadd.do")
public class OrderAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		HttpSession hs=req.getSession();
		MemberBean user=(MemberBean)hs.getAttribute("user");
		OrderDAO odao=OrderDAO.getInstance();
		OrderBean newOrder=new OrderBean(0,
										 user.getId(),
										 req.getParameter("usermenu"),
										 req.getParameter("userkinds"),
										 Integer.parseInt(req.getParameter("userprice")),
										 req.getParameter("option1"),
										 req.getParameter("option2"),
										 req.getParameter("option3"),
										 req.getParameter("option4"),
										 req.getParameter("option5"),
										 req.getParameter("memo"),
										 new Date()
										 );
		odao.insertOrder(newOrder);
		resp.sendRedirect("orderlist.do");
	}
}