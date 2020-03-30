package com.siren.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siren.bean.MemberBean;
import com.siren.bean.OrderBean;
import com.siren.dao.OrderDAO;

@WebServlet("/orderlist.do")
public class OrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		OrderDAO odao=OrderDAO.getInstance();
		ArrayList<OrderBean> list=null;
		int total=0;
		HttpSession hs=req.getSession();
		MemberBean user=(MemberBean)hs.getAttribute("user");
		if(user!=null) {
			String grade=user.getGrade();
			if(grade.equals("admin")) {
				list=odao.getAllOrder();
				for(int i=0;i<list.size();i++) {
					OrderBean temp=list.get(i);
					total+=temp.getPrice();
				}
				req.setAttribute("list", list);
				req.setAttribute("total", total);
			}else if(grade.equals("client")){
				list=odao.listOrderForID(user.getId());
				for(int i=0;i<list.size();i++) {
					OrderBean temp=list.get(i);
					total+=temp.getPrice();
				}
				req.setAttribute("list", list);
				req.setAttribute("total", total);
			}
		}else {
			req.setAttribute("message", "まず、ログインしてください。");
		}
		RequestDispatcher rdp=req.getRequestDispatcher("order/orderList.jsp");
		rdp.forward(req, resp);
	}
}
