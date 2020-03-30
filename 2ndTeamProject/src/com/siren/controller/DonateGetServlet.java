package com.siren.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.dao.DonateDAO;
@WebServlet("/donateget.do")
public class DonateGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		int donate=0;
		DonateDAO ddao=DonateDAO.getInstance();
		donate=ddao.donateGet();
		req.setAttribute("donate", donate);
		RequestDispatcher rdp=req.getRequestDispatcher("donate/take.jsp");
		rdp.forward(req, resp);
	}
}