package com.siren.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.CafeMenuBean;
import com.siren.dao.MenuDAO;
@WebServlet("/menumodify.do")
public class MenuModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		CafeMenuBean temp=new CafeMenuBean(req.getParameter("modKinds"),
										req.getParameter("modMenu"),
									Integer.parseInt(req.getParameter("modPrice"))
									
									);
		MenuDAO mdao=MenuDAO.getInstance();
		mdao.modifyMenu(temp);
		
		resp.sendRedirect("/siren/menulist.do");
	}

}
