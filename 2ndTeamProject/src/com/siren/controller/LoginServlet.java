package com.siren.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siren.bean.MemberBean;
import com.siren.dao.MemberDAO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/login.jsp");
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;

		String id = request.getParameter("userid");
		String pw = request.getParameter("userpw");

		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(id, pw);

		if (result == 1) {
			MemberBean mVo = mDao.getOneMember(id);
			HttpSession session = request.getSession();
			session.setAttribute("user", mVo);
			url = "main/main.jsp";

		} else if (result == 0) {
			request.setAttribute("message", "パスワードチェック");
			url = "member/login.jsp";
		} else if (result == -1) {
			request.setAttribute("message", "情報がないです。");
			url = "member/login.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
