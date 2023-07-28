package com.woorifis.day2.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
@Slf4j

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		log.debug("생성자 호출됨");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		log.debug("init 호출 - 서블릿에서 필요한 리소스를 초기화한다");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		log.debug("destroy - init에서 초기화한 리소스를 닫는다");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// id와 password를 받게 - 콘솔 출력

		// Request
		log.debug("메서드 호출: {}", request.getServletPath());
		String ID = request.getParameter("id");
		String PW = request.getParameter("pass");
		HashMap<String, String> login = new HashMap<>();

		// 어쩌구 DB랑 확인도 해봐야겠죠 - 그다음할거
		login.put(ID, PW);

		// 콘솔에 찍기
		log.debug("get id: {}, pw: {} - 생성된 리소스 활용", ID, PW);

		// Response
		StringBuilder builder = new StringBuilder("<!DOCTYPE html>");
		builder.append("<html>").append("<head>").append("<meta charset=\"UTF-8\">").append("<title>login</title>")
				.append("</head>").append("<body>").append("메롱").append("</body>").append("</html>");

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(builder.toString());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Request
		log.debug("메서드 호출: {}", request.getServletPath());
		// 명시적 처리 필요함
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter("id");
		String PW = request.getParameter("pass");
		HashMap<String, String> login = new HashMap<>();

		// 어쩌구 DB랑 확인도 해봐야겠죠 - 그다음할거
		login.put(ID, PW);

		// 콘솔에 찍기
		log.debug("post id: {}, pw: {}", ID, PW);

		// Response
		StringBuilder builder = new StringBuilder("<!DOCTYPE html>");
		builder.append("<html>").append("<head>").append("<meta charset=\"UTF-8\">"	).append("<title>login</title>")
				.append("</head>").append("<body>").append("메롱").append("</body>").append("</html>");

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(builder.toString());
	}

}
