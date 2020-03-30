package com.siren.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.OrderBean;
import com.siren.dao.OrderDAO;
@WebServlet("/ordermodify.do")
public class OrderModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		OrderBean temp=new OrderBean();
			temp.setOrder_num(Integer.parseInt(req.getParameter("order_num")));
			temp.setOption1(req.getParameter("option1"));
			temp.setOption2(req.getParameter("option2"));
			temp.setOption3(req.getParameter("option3"));
			temp.setOption4(req.getParameter("option4"));
			temp.setOption5(req.getParameter("option5"));
			temp.setMemo(req.getParameter("memo"));
		OrderDAO odao=OrderDAO.getInstance();
			int chk=odao.updateOrder(temp);
			req.setAttribute("chk", chk);
			RequestDispatcher rdp=req.getRequestDispatcher("/order/orderUpdate.jsp");
			rdp.forward(req, resp);
	}

}
