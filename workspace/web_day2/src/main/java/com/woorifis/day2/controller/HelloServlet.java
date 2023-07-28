package com.woorifis.day2.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(urlPatterns =  { "/HelloServlet", "/Hi" }) // 사용자한테 이 서블릿 어떻게 부를지 url 지정

@Slf4j

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("rawtypes")
	List list;
	

	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	@Deprecated(since = "2022")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.debug("서블릿 호출됨: {}", request.getServletPath());
		response.getWriter().append("Served at: ").append(new Date().toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
