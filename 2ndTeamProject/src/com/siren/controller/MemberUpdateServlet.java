package com.siren.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.siren.bean.MemberBean;
import com.siren.dao.MemberDAO;

@WebServlet("/memberUpdate.do")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO mDao = MemberDAO.getInstance();
		
		MemberBean mVo = mDao.getOneMember(id);
		request.setAttribute("mVo", mVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/memberUpdate.jsp");
		dispatcher.forward(request, response);
	}

// 회원 정보 수정 처리 서블릿..
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Date birth = Date.valueOf(request.getParameter("birth"));
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		// 회원 정보를 저장할 객체
		
		MemberBean mVo= new MemberBean();
		mVo.setName(name);
		mVo.setId(id);
		mVo.setPassword(pw);
		mVo.setBirth(birth);
		mVo.setEmail(email);
		mVo.setPhone(phone);
		MemberDAO mDao = MemberDAO.getInstance();
		
		mDao.modifyMember(mVo);
		response.sendRedirect("main/main.jsp");
		
	}

}
