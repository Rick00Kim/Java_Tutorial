package com.siren.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.CafeMenuBean;
import com.siren.dao.MenuDAO;
@WebServlet("/menudetail.do")
public class MenuDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		String menuName=req.getParameter("tem");
		MenuDAO mdao=MenuDAO.getInstance();
		
		CafeMenuBean temp=mdao.getOneMenu(menuName);
		req.setAttribute("temp", temp);
		
		RequestDispatcher rdp=req.getRequestDispatcher("menu/showOneMenu.jsp");
		rdp.forward(req, resp);
	}
}
