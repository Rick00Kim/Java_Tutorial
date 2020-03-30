package com.siren.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.CafeMenuBean;
import com.siren.dao.MenuDAO;
@WebServlet("/menulist.do")
public class MenuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		MenuDAO mdao=MenuDAO.getInstance();
		String[] category={"Coffee","Juice","Sandwich","Cake","Affogato"};
		ArrayList<CafeMenuBean> listCoffee=mdao.showMenuForCategory(category[0]);
		ArrayList<CafeMenuBean> listJuice=mdao.showMenuForCategory(category[1]);
		ArrayList<CafeMenuBean> listSandwich=mdao.showMenuForCategory(category[2]);
		ArrayList<CafeMenuBean> listCake=mdao.showMenuForCategory(category[3]);
		ArrayList<CafeMenuBean> listAffogato=mdao.showMenuForCategory(category[4]);
		req.setAttribute("category", category);
		req.setAttribute("listCoffee", listCoffee);
		req.setAttribute("listJuice", listJuice);
		req.setAttribute("listSandwich", listSandwich);
		req.setAttribute("listCake", listCake);
		req.setAttribute("listAffogato", listAffogato);
		
		RequestDispatcher rdp=req.getRequestDispatcher("menu/menuList.jsp");
		rdp.forward(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}