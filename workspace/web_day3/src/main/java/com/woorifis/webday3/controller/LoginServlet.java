package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.woorifis.webday3.model.MyCakeService;
import com.woorifis.webday3.model.MyLoginSerivce;
import com.woorifis.webday3.model.MyLoginService;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
@Slf4j
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 파라미터 분석

		String ID =  request.getParameter("id"); // 파라미터 전달
		String PW =  request.getParameter("pass");
		log.debug("id : {}, pass: {} ", ID, PW);
		
		// 2. 모델
		boolean result = MyLoginService.getService().login(ID, PW);
		log.debug("result: {}", result);

		
		// 3. 화면 전문가(view) 연결
		String path = "/index.jsp";
		if(result) {
		path = "/user/loginresult.jsp";
//		request.setAttribute("result", result);  
		HttpSession session= request.getSession();
		session.setAttribute("loginID", ID);
		}
			RequestDispatcher disp = request.getRequestDispatcher(path);
			disp.forward(request, response);
		

		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
