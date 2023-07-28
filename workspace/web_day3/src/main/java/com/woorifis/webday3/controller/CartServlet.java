package com.woorifis.webday3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 파라미터 처리
		request.setCharacterEncoding("utf-8");
		String product = request.getParameter("product");
		
		
		//2. 비즈니스 로직 처리
		
		//3. 화면 연결(프레젠테이션 로직 처리)
		// 기존 cart를 먼저 찾아봐야함
		HttpSession session = request.getSession();
		Object objCart = session.getAttribute("cart");
		if(objCart==null) {
			List<String> cart = new ArrayList<>();
			cart.add(product);
			session.setAttribute("cart", cart);
		}else {
			if(objCart instanceof List) {
				List<String> cart = (List)objCart;
				cart.add(product); //기존 session에서 가져온 아이라서 set은 안해줘도 알아서 세션에 담김
			}
		}
		
		RequestDispatcher disp = request.getRequestDispatcher("/user/loginresult.jsp");
		disp.forward(request, response);
	}
}
