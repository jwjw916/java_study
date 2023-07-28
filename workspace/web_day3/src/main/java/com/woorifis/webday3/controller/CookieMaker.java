package com.woorifis.webday3.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieMaker
 */
@WebServlet("/CookieMaker")
public class CookieMaker extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
				
		Cookie c1 = new Cookie("name","홍길동");
		c1.setMaxAge(60);
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("add",URLEncoder.encode("서울특별시 마포구 상암동", "utf-8"));
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		Cookie c3 = new Cookie("phone","1234");
		c3.setMaxAge(0);
		response.addCookie(c3);
		
		String path = "/cookie/cookieconsumer.jsp";
		if("forward".equals(type)) {
			RequestDispatcher disp = request.getRequestDispatcher(path);
			disp.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath()+path);
		}
		
	}

}
