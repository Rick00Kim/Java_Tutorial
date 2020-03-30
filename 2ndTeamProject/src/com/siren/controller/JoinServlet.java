package com.siren.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siren.bean.MemberBean;
import com.siren.dao.MemberDAO;

@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/siren/member/join.jsp");
		dispatcher.forward(request, response);
	}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name= request.getParameter("name");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		Date birth=Date.valueOf(request.getParameter("birth"));
		
		MemberBean mVo=new MemberBean();
		mVo.setName(name);
		mVo.setId(id);
		mVo.setPassword(pw);
		mVo.setEmail(email);
		mVo.setPhone(phone);
		mVo.setBirth(birth);
		mVo.setGrade("client");
		
		MemberDAO mDao=MemberDAO.getInstance();
		int result=mDao.insertMember(mVo);
		
		HttpSession session=request.getSession();
		
		if(result==1){
			session.setAttribute("user", mVo);
			request.setAttribute("message", "회원가입에 성공했습니다.");
		}else{
			request.setAttribute("message", "회원가입에 실패했습니다.");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("/main/main.jsp");
		dispatcher.forward(request, response);
	}
}