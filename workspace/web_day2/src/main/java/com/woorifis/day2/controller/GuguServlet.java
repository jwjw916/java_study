package com.woorifis.day2.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/gugu")
@Slf4j

public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.debug("메서드 호출: {}", request.getServletPath());
		String strDan = request.getParameter("dan");
		
		// 구구단 5단 - business logic 이라고 하는데, 이부분은 보통 분리한다
		
		// primitive < -- > primitive
		// reference < -- > reference
		// 문자열 < -- > 기본형 : Wrapper class 활용
		
		int dan = Integer.parseInt(strDan);
		
		// Makegugu 클래스의 static 메소드getInstatnce에서 gugu 객체를 불러오는데
		// gugu 객체는 getGugu에 dan=5를 넣어라
		// 결과를 return 받는 List gugu 생성
		List<Integer> gugu = MakeGugu.getInstance().getGugu(dan);
		
		
		log.debug("메서드 호출 결과: {}", gugu);
		
		StringBuilder builder = new StringBuilder("<!DOCTYPE html>");
		builder.append("<html>").append("<head>").append("<meta charset=\"UTF-8\">")
		.append("<title>gugudan</title>")
		.append("</head>")
		.append("<body>")
		.append("<table border='1'><tr><th>dan</th><th>i</th><th>result</th></tr>");
		
		for(int i=0; i<gugu.size(); i++) {
			builder.append("<tr><td>")
			.append(dan)
			.append("</td><td>")
			.append(i+1)
			.append("</td><td>")
			.append(gugu.get(i))
			.append("</td></tr>");
		}
		
		builder.append("</body>")
		.append("</html>");
		
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(builder.toString());

	}

}
